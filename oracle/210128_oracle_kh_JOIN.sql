--@실습문제

--1. 2020년 12월 25일이 무슨 요일인지 조회하시오.
select to_char(to_date('2020/12/25'), 'yyyy/mm/dd day') christmas
from dual;

--2. 주민번호가 70년대 생이면서 성별이 여자이고, 성이 전씨인 직원들의 
--사원명, 주민번호, 부서명, 직급명을 조회하시오.
select emp_name 사원명,
        emp_no 주민번호,
        dept_title 부서명,
        job_name 직급명
from employee E
    left join department D
         on E.dept_code = D.dept_id
    left join job J
        using(job_code)
where substr(emp_no, 1, 2) between 70 and 79
    and substr(emp_no, 8, 1) in ('2', '4')
    and emp_name like '전%';


--3. 가장 나이가 적은 직원의 사번, 사원명, 나이, 부서명, 직급명을 조회하시오.
select emp_id 사번,
        emp_name 사원명,
        extract(year from sysdate)-extract(year from to_date(case
            when substr(emp_no, 8, 1) in ('1', '2') then '19'||substr(emp_no, 1, 6)
            when substr(emp_no, 8, 1) in ('3', '4') then '20'||substr(emp_no, 1, 6)
        end))+1 나이,
        dept_title 부서명,
        job_name 직급명
from employee E
    left join department D
        on E.dept_code = D.dept_id
    left join job J
        using(job_code)
where extract(year from sysdate)-extract(year from to_date(case
            when substr(E.emp_no, 8, 1) in ('1', '2') then '19'||substr(E.emp_no, 1, 6)
            when substr(E.emp_no, 8, 1) in ('3', '4') then '20'||substr(E.emp_no, 1, 6)
        end))+1 = (select min(
        extract(year from sysdate)-extract(year from to_date(case
            when substr(emp_no, 8, 1) in ('1', '2') then '19'||substr(emp_no, 1, 6)
            when substr(emp_no, 8, 1) in ('3', '4') then '20'||substr(emp_no, 1, 6)
        end))+1)
        from employee E
        ); --나이 컬럼의 데이터가 최소값과 같은 경우


--4. 이름에 '형'자가 들어가는 직원들의 사번, 사원명, 부서명을 조회하시오.
select emp_id 사번,
        emp_name 사원명,
        dept_title 부서명
from employee E, department D
where E.dept_code = D.dept_id(+) and emp_name like '%형%';


--5. 해외영업팀에 근무하는 사원명, 직급명, 부서코드, 부서명을 조회하시오.
select emp_name 사원명,
        job_name 직급명,
        dept_code 부서코드,
        dept_title 부서명
from employee E
    join job J
        using(job_code)
    join department D
        on E.dept_code = D.dept_id
where dept_title like '%해외영업%';

--6. 보너스포인트를 받는 직원들의 사원명, 보너스포인트, 부서명, 근무지역명을 조회하시오.
select emp_name 사원명,
        bonus 보너스포인트,
        nvl(dept_title, '인턴') 부서명,
        local_name 근무지역명
from employee E, department D, location L
where E.dept_code = D.dept_id
    and D.location_id = L.local_code
    and bonus is not null;

--7. 부서코드가 D2인 직원들의 사원명, 직급명, 부서명, 근무지역명을 조회하시오.
select emp_name 사원명,
        job_name 직급명,
        dept_title 부서명,
        local_name 근무지역명
from employee E
    join job J
        using(job_code)
    join department D
        on E.dept_code = D.dept_id
    join location L
        on D.location_id = L.local_code
where dept_code = 'D2'
order by 사원명;

--8. 급여등급테이블의 등급별 최대급여(MAX_SAL)보다 많이 받는 직원들의 사원명, 직급명, 급여, 연봉을 조회하시오.
--(사원테이블과 급여등급테이블을 SAL_LEVEL컬럼기준으로 동등 조인할 것)
select emp_name 사원명,
        job_name 직급명,
        salary 급여,
        salary + (salary * nvl(bonus, 0)) * 12 연봉
from sal_grade S 
    join employee E
       on S.sal_level = E.sal_level
    join job J
        on E.job_code = J.job_code
where salary > s.max_sal;

--9. 한국(KO)과 일본(JP)에 근무하는 직원들의 
--사원명, 부서명, 지역명, 국가명을 조회하시오.
select emp_name 사원명,
        dept_title 부서명,
        local_name 지역명,
        national_name 국가명
from employee E
    join department D
        on E.dept_code = D.dept_id
    join location L
        on D.location_id = L.local_code
    join nation N
        using (national_code)
where national_name in ('한국', '일본');

--10. 같은 부서에 근무하는 직원들의 사원명, 부서코드, 동료이름을 조회하시오.
--self join 사용
select E1.emp_name 사원명, 
        E1.dept_code 부서코드, 
        E2.emp_name 동료이름
from employee E1 join employee E2
    on E1.dept_code = E2.dept_code
where E1.emp_name != E2.emp_name
order by 1, 3;

--11. 보너스포인트가 없는 직원들 중에서 직급이 차장과 사원인 직원들의 사원명, 직급명, 급여를 조회하시오.
select emp_name 사원명,
        job_name 직급명,
        to_char(salary, 'fmL9,999,999') 급여
from employee join job
    using(job_code)
where bonus is null and job_code in ('J4', 'J7')
order by 2;

--12. 재직중인 직원과 퇴사한 직원의 수를 조회하시오.
select sum(nvl2(quit_date, 0, 1)) "재직자 수",
        sum(nvl2(quit_date, 1, 0)) "퇴사자 수"
from employee;