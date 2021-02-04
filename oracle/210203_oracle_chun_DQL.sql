--chun 실습문제 2021.02.03

/*
1. 학생이름과 주소지를 표시하시오. 
단, 출력 헤더는 "학생 이름", "주소지"로 하고, 정렬은 이름으로 오름차순 표시하도록 한다.
*/
SELECT STUDENT_NAME "학생 이름",
        STUDENT_ADDRESS "주소지"
FROM TB_STUDENT
ORDER BY STUDENT_NAME;


/*
2. 휴학중인 학생들의 이름과 주민번호를 나이가 적은 순서로 화면에 출력하시오.
*/
SELECT STUDENT_NAME,
        STUDENT_SSN
FROM TB_STUDENT
WHERE ABSENCE_YN = 'Y'
ORDER BY SUBSTR(STUDENT_SSN, 1, 2) DESC;

/*
3. 주소지가 강원도나 경기도인 학생들 중 
1900 년대 학번을 가진 학생들의 이름과 학번, 주소를 이름의 오름차순으로 화면에 출력하시오. 
단, 출력헤더에는 "학생이름","학번", "거주지 주소" 가 출력되도록 한다.
*/
SELECT STUDENT_NAME 학생이름,
    STUDENT_NO 학번,
    STUDENT_ADDRESS "거주지 주소"
FROM TB_STUDENT
WHERE STUDENT_ADDRESS LIKE '강원도%'
    OR STUDENT_ADDRESS LIKE '경기도%'
    AND ENTRANCE_DATE < TO_DATE('2000/01/01', 'YYYY/MM/DD')
ORDER BY STUDENT_NAME;

/*
4. 현재 법학과 교수 중 가장 나이가 맋은 사람부터 이름을 확인핛 수 있는 SQL 문장을 작성하시오. 
(법학과의 '학과코드'는 학과 테이블(TB_DEPARTMENT)을 조회해서 찾아 내도록 하자)
*/
select professor_name
from tb_professor
where department_no = (
                        select department_no
                        from tb_department
                        where department_name = '법학과'
                        )
order by substr(professor_ssn, 1, 2) asc;

/*
5. 2004 년 2 학기에 'C3118100' 과목을 수강한 학생들의 학점을 조회하려고 한다. 
학점이 높은 학생부터 표시하고, 학점이 같으면 학번이 낮은 학생부터 표시하는 구문을 작성해보시오.
*/
select *
from tb_grade
where class_no = 'C3118100'
order by point desc, student_no desc;

/*
6. 학생 번호, 학생 이름, 학과 이름을 학생 이름으로 오름차순 정렬하여 출력하는 
SQL 문을 작성하시오.
*/
select student_no 학생번호,
        student_name 학생이름,
        department_name 학과이름
from tb_student S, tb_department D
where S.department_no = D.department_no
order by student_name;

/*
7. 춘 기술대학교의 과목 이름과 과목의 학과 이름을 출력하는 SQL 문장을 작성하시오.
*/
select class_name "과목 이름",
        department_name "학과 이름"
from tb_class join tb_department
    using (department_no);

/*
8. 과목별 교수 이름을 찾으려고 한다. 과목 이름과 교수 이름을 출력하는 SQL 문을 작성하시오.
*/
select class_name 과목명,
        professor_name 교수명
from tb_class_professor CP, tb_class C, tb_professor P
where CP.class_no = C.class_no
    and CP.professor_no = P.professor_no;

/*
9. 8 번의 결과 중 ‘인문사회’ 계열에 속한 과목의 교수 이름을 찾으려고 한다. 
이에 해당하는 과목 이름과 교수 이름을 출력하는 SQL 문을 작성하시오.
*/
select class_name 과목명,
        professor_name 교수명
from tb_class_professor CP, tb_class C, tb_professor P, tb_department D
where CP.class_no = C.class_no
    and CP.professor_no = P.professor_no
    and C.department_no = D.department_no
    and D.category = '인문사회';

/*
10. ‘음악학과’ 학생들의 평점을 구하려고 한다. 
음악학과 학생들의 "학번", "학생 이름", "전체 평점"을 출력하는 SQL 문장을 작성하시오. 
(단, 평점은 소수점 1 자리까지맊 반올림하여 표시한다.)
*/
select G.student_no 학번,
        S.student_name "학생 이름",
        trunc(avg(point), 1) "전체 평점"
from tb_grade G join (
                    select *
                    from tb_student
                    where department_no = (select department_no
                                            from tb_department
                                            where department_name = '음악학과')
                ) S
                on G.student_no = S.student_no
group by S.student_name, G.student_no;

/*
11. 학번이 A313047 인 학생이 학교에 나오고 있지 않다. 
지도 교수에게 내용을 전달하기 위한 학과 이름, 학생 이름과 지도 교수 이름이 필요하다. 
이때 사용할 SQL 문을 작성하시오. 
단, 출력헤더는 ‚학과이름‛, ‚학생이름‛, ‚지도교수이름‛으로 출력되도록 한다.
*/

select (select department_name
        from tb_department
        where department_no = S.department_no
        ) 학과이름,
        student_name 학생이름,
        (select professor_name
        from tb_professor
        where professor_no = s.coach_professor_no) 지도교수이름
from tb_student S
where student_no = 'A313047';

/*
12. 2007 년도에 '인간관계론' 과목을 수강한 학생을 찾아
학생이름과 수강학기를 표시하는 SQL 문장을 작성하시오.
*/
select (select student_name
        from tb_student
        where student_no = G.student_no) student_name,
        term_no term_name
from tb_grade G
where class_no = (
                    select class_no
                    from tb_class
                    where class_name = '인간관계론'
                    )
    and substr(term_no, 1, 4) = '2007';

/*
13. 예체능 계열 과목 중 과목 담당교수를 한 명도 배정받지 못한 과목을 찾아 
그 과목 이름과 학과 이름을 출력하는 SQL 문장을 작성하시오.
*/
select class_name "과목 이름",
        D.department_name "학과 이름"
from tb_class join tb_department D
                    using(department_no)
            left join tb_class_professor CP
                using(class_no)
where D.category = '예체능'
    and CP.professor_no is null
order by 1, 2;


/*
14. 춘 기술대학교 서반아어학과 학생들의 지도교수를 게시하고자 한다. 
학생이름과 지도교수 이름을 찾고 만일 지도 교수가 없는 학생일 경우 
"지도교수 미지정‛으로 표시하도록 하는 SQL 문을 작성하시오. 
단, 출력헤더는 ‚학생이름‛, ‚지도교수‛로 표시하며 고학번 학생이 먼저 표시되도록 한다.
*/
select S.student_name 학생이름,
    nvl(P.professor_name, '지도교수 미지정') 지도교수

from tb_student S, tb_professor P
where S.department_no = 020
        and s.coach_professor_no = P.professor_no (+)
order by S.student_no;

/*
15. 휴학생이 아닌 학생 중 평점이 4.0 이상인 학생을 찾아 
그 학생의 학번, 이름, 학과 이름, 평점을 출력하는 SQL 문을 작성하시오.
*/
select S.student_no,
    S.student_name,
    D.department_name,
    trunc(avg(G.point), 1) avg
from tb_student S, tb_department D, tb_grade G
where s.absence_yn = 'N'
    and S.department_no = D.department_no
    and S.student_no = G.student_no
group by s.student_no, s.student_name, D.department_name
having avg(G.point) >= 4.0;

/*
16. 환경조경학과 전공과목들의 과목 별 평점을 파악할 수 있는 SQL 문을 작성하시오.
*/
select C.class_no, C.class_name, trunc(avg(G.point), 8)avg
from tb_grade G, tb_class C, tb_department D
where G.class_no = C.class_no
    and C.department_no = D.department_no
    and D.department_name = '환경조경학과'
    and C.class_type like '%전공%'
group by C.class_no, C.class_name
order by 1;


/*
17. 춘 기술대학교에 다니고 있는 최경희 학생과 같은 과 학생들의 이름과 주소를 출력하는 SQL 문을 작성하시오.
*/
select student_name, nvl(student_address, '주소 미등록')
from tb_student
where department_no = (select department_no
                        from tb_student
                        where student_name = '최경희')
order by 1 desc;

/*
18. 국어국문학과에서 총 평점이 가장 높은 학생의 이름과 학번을 표시하는 SQL 문을 작성하시오.
*/
select student_no, student_name
from (
        select rownum, E.*
        from (
                select s.student_name,
                        s.student_no,
                        avg(g.point)
                from tb_student S, tb_grade G, tb_department D
                where s.student_no = g.student_no
                    and s.department_no = d.department_no
                    and d.department_name = '국어국문학과'
                group by s.student_name, s.student_no
                order by 3 desc
                )E
        where rownum =1);


select s.student_name,
        s.student_no,
        avg(g.point)
from tb_student S, tb_grade G, tb_department D
where s.student_no = g.student_no
    and s.department_no = d.department_no
    and d.department_name = '국어국문학과'
group by s.student_name, s.student_no
order by 3 desc;

--학생별 평점
select student_no, avg(point)
from tb_grade
group by student_no
order by 2 desc;

--국어국문학과
select department_no --001
from tb_department
where department_name = '국어국문학과';

/*
19. 춘 기술대학교의 "환경조경학과"가 속한 같은 계열 학과들의 
학과 별 전공과목 평점을 파악하기 위한 적절한 SQL 문을 찾아내시오. 
단, 출력헤더는 "계열 학과명", "전공평점"으로 표시되도록 하고, 
평점은 소수점 한 자리까지만 반올림하여 표시되도록 한다.
*/
select d.department_name "계열 학과명", trunc(avg(point), 1) 전공평점
from tb_grade G, tb_class C, tb_department D
where G.class_no = C.class_no
    and C.department_no = D.department_no
    and D.category = (select category
                        from tb_department
                        where department_name = '환경조경학과')
group by d.department_name
order by 1;