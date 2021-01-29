--@실습문제 : INNER JOIN & OUTER JOIN
--1. 학번, 학생명, 학과명을 출력
select student_no 학번,
        student_name 학생명,
        department_name 학과명
from tb_student S
    join tb_department D
        using(department_no)
order by 학번;

--2. 학번, 학생명, 담당교수명을 출력하세요.
--담당교수가 없는 학생은 '없음'으로 표시
select student_no 학번,
        student_name 학생명,
        nvl(professor_name, '없음') 담당교수명
from tb_student S
    left join tb_professor P
        on S.coach_professor_no = P.professor_no
order by 학번;

--3. 학과별 교수명과 인원수를 모두 표시하세요.
select department_name 교수명,
        nvl2(professor_name, professor_name, count(*)) 인원수 --null처리를 이렇게도 되는구나..똑똑하다 갓윤수
from tb_department
    join tb_professor
        using(department_no)
group by rollup(professor_name), department_name
order by department_name;

-- 4. 이름이 [~람]인 학생의 평균학점을 구해서 학생명과 평균학점(반올림해서 소수점둘째자리까지)과 같이 출력.
-- (동명이인일 경우에 대비해서 student_name만으로 group by 할 수 없다.)
select S.student_name 학생명, 
    round(avg(point),2) 평균학점
from tb_student S, tb_grade G
where S.student_no = G.student_no and student_name like '%람'
group by S.student_no, S.student_name;

--5. 학생별 다음정보를 구하라.
/*
--------------------------------------------
학생명  학기     과목명    학점
--------------------------------------------
감현제	200401	전기생리학 	4.5
            .
            .
--------------------------------------------

*/
select student_name 학생명,
        term_no 학기,
        class_name 과목명,
        point 학점
from tb_student S, tb_grade G, tb_class C
where S.student_no = G.student_no and G.class_no = C.class_no
order by 1, 2;



