--=============
--CHUN 계정
--=============

--학과테이블
select * from tb_department;

--학생테이블
select * from tb_student;

--과목테이블
select * from tb_class;

--교수 테이블
select * from tb_professor;

--교수 과목 테이블
select * from tb_class_professor;

--점수 등급 테이블
select * from tb_grade;


/*
1. 춘 기술대학교의 학과 이름과 계열을 표시하시오. 단, 출력 헤더는 "학과 명", "계열"
으로 표시하도록 핚다.
    학과 명                계열
-------------------- --------------------
    국어국문학과            인문사회
    영어영문학과            인문사회
    사학과                 인문사회
    철학과                 인문사회
    법학과                 인문사회
    행정학과               인문사회
…
…
    체육학과               예체능
    
63 rows selected
*/
select department_name "학과 명",
        category 계열
from tb_department;

--2. 학과의 학과 정원을 다음과 같은 형태로 화면에 출력한다.
/*
학과별 정원 
------------------------------------------------ 
국어국문학과의 정원은 20 명 입니다. 
영어영문학과의 정원은 36 명 입니다. 
사학과의 정원은 28 명 입니다. 
철학과의 정원은 28 명 입니다. 
... ... 
63 rows selected
*/
select distinct department_name ||'의 정원은 '||capacity ||'명 입니다.'
from tb_department;

/*
3. "국어국문학과" 에 다니는 여학생 중 현재 휴학중인 여학생을 찾아달라는 요청이
들어왔다. 누구인가? (국문학과의 '학과코드'는 학과 테이블(TB_DEPARTMENT)을 조회해서
찾아 내도록 하자)
STUDENT_NAME
--------------------
한수현
*/
select student_name
from tb_student
where absence_yn = 'Y' and department_no = 001 and substr(student_ssn, 8, 1) = 2;

/*
4. 도서관에서 대출 도서 장기 연체자 들을 찾아 이름을 게시하고자 한다. 그 대상자들의
학번이 다음과 같을 때 대상자들을 찾는 적절한 SQL 구문을 작성하시오.
A513079, A513090, A513091, A513110, A513119
STUDENT_NAME
--------------------
홍경희
최경희
정경훈
정경환
이경환
*/
select student_name
from tb_student
where student_no in ('A513079', 'A513090', 'A513091', 'A513110', 'A513119');


/*
5. 입학정원이 20 명 이상 30 명 이하인 학과들의 학과 이름과 계열을 출력하시오.
DEPARTMENT_NAME CATEGORY
-------------------- --------------------
국어국문학과 인문사회
사학과 인문사회
철학과 인문사회
…
…
미술학과 예체능
산업디자인학과 예체능
체육학과 예체능
24 rows selected
*/
select department_name
from tb_department
where capacity between 20 and 30;


/*
6. 춘 기술대학교는 총장을 제외하고 모든 교수들이 소속 학과를 가지고 있다. 그럼 춘
기술대학교 총장의 이름을 알아낼 수 있는 SQL 문장을 작성하시오.
PROFESSOR_NAME
--------------------
임해정
*/
select professor_name
from tb_professor
where department_no is null;

/*
7. 혹시 전산상의 착오로 학과가 지정되어 있지 않은 학생이 있는지 확인하고자 한다.
어떠한 SQL 문장을 사용하면 될 것인지 작성하시오.
*/
select *
from tb_student
where department_no is null;

/*
8. 수강신청을 하려고 핚다. 선수과목 여부를 확인해야 하는데, 선수과목이 존재하는
과목들은 어떤 과목인지 과목번호를 조회해보시오.
CLASS_NO
----------
C0405500
C0409000
C3745400
C0432500
C3051900
C3221500
6 rows selected
*/
select class_no
from tb_class
where preattending_class_no is not null;

/*
9. 춘 대학에는 어떤 계열(CATEGORY)들이 있는지 조회해보시오.
CATEGORY
--------------------
공학
예체능
의학
인문사회
자연과학
*/
select distinct category
from tb_department;

/*
10. 02 학번 전주 거주자들의 모임을 만들려고 한다. 휴학한 사람들은 제외한 재학중인
학생들의 학번, 이름, 주민번호를 출력하는 구문을 작성하시오.
STUDENT_NO STUDENT_NAME STUDENT_SSN
---------- -------------------- --------------
A217005 고수현 821119-2122202
…
…
A211375 최허현 841102-1154425
11 rows selected
*/
select student_no, student_name, student_ssn
from tb_student
where extract(year from entrance_date) = 2002 
        and absence_yn = 'N' 
        and instr(student_address, '전주') = 1;
        
--실습문제 2021.01.27---------------------

--1. 학과테이블에서 계열별 정원의 평균을 조회(정원 내림차순 정렬)
select category,
        trunc(avg(capacity))||'명' 정원평균
from tb_department
group by category
order by 2 desc;

--2. 휴학생을 제외하고, 학과별로 학생수를 조회(학과별 인원수 내림차순)
select department_no,
        count(*)
from tb_student
where absence_yn = 'N'
group by department_no
order by 2 desc;

--3. 과목별 지정된 교수가 2명이상이 과목번호와 교수인원수를 조회
select class_no,
        count(*) 교수인원수
from tb_class_professor
group by class_no
having count(*) >= 2
order by 2;


--4. 학과별로 과목을 구분했을때, 
--과목구분이 "전공선택"에 한하여 
--과목수가 10개 이상인 행의 학과번호, 과목구분(class_type), 과목수를 조회(전공선택만 조회)
select department_no,
        class_type,
        count(*)
from tb_class
where class_type = '전공선택'
group by department_no, class_type
having count(*) >= 10
order by 3;

-----------------------
--2021.01.27 실습문제2

--1. 영어영문학과(학과코드 002) 학생들의 학번과 이름, 입학 년도를 
--입학 년도가 빠른 순으로 표시하는 SQL 문장을 작성하시오.
--( 단, 헤더는 "학번", "이름", "입학년도" 가 표시되도록 한다.)
select student_no 학번,
        student_name 이름,
        to_char(entrance_date, 'yyyy-mm-dd') 입학년도
from tb_student
where department_no = 002
order by 3;

/*
2. 춘 기술대학교의 교수 중 이름이 세 글자가 아닌 교수가 한 명 있다고 한다. 
그 교수의 이름과 주민번호를 화면에 출력하는 SQL 문장을 작성해 보자. 
(* 이때 올바르게 작성핚 SQL 문장의 결과 값이 예상과 다르게 나올 수 있다. 
원인이 무엇일지 생각해볼 것)
*/
select professor_name, professor_ssn
from tb_professor
where length(professor_name) != 3;

/*
3. 춘 기술대학교의 남자 교수들의 이름과 나이를 출력하는 SQL 문장을 작성하시오. 
단 이때 나이가 적은 사람에서 많은 사람 순서로 화면에 출력되도록 만드시오. 
(단, 교수 중 2000 년 이후 출생자는 없으며 출력 헤더는 "교수이름", "나이"로 한다. 
나이는 ‘만’으로 계산핚다.)
*/
select professor_name 교수이름,
    trunc(trunc(sysdate - (case
        when substr(professor_ssn, 8, 1) in ('1', '2') then to_date(19||substr(professor_ssn, 1, 6))
        end))/365) 나이 --민번뒷자리 1, 2면 민번 앞에 19를 붙인다.
from tb_professor
where substr(professor_ssn, 8, 1) in ('1', '3'); --남자

/*
4. 교수들의 이름 중 성을 제외한 이름만 출력하는 SQL 문장을 작성하시오. 
출력 헤더는 "이름" 이 찍히도록 한다. 
(성이 2 자인 경우는 교수는 없다고 가정하시오)
*/
select substr(professor_name, 2) 이름
from tb_professor;

/*
5. 춘 기술대학교의 재수생 입학자를 구하려고 한다. 
어떻게 찾아낼 것인가? 
이때, 19 살에 입학하면 재수를 하지 않은 것으로 간주핚다.
*/
select student_no,
        student_name
from tb_student
where (extract (year from entrance_date)) 
    - (extract (year from to_date(substr(student_ssn, 1, 6)))) > 19;

--6. 2020 년 크리스마스는 무슨 요일인가?
select '2020년 크리스마스는 '|| to_char(to_date('2020/12/25', 'yyyy/mm/dd'), 'day') || ' 입니다.' christmas
from dual;

/*
7. TO_DATE('99/10/11','YY/MM/DD'), TO_DATE('49/10/11','YY/MM/DD') 은 
각각 몇 년 몇 월 몇 일을 의미핛까? 
또 TO_DATE('99/10/11','RR/MM/DD'), TO_DATE('49/10/11','RR/MM/DD') 은 
각각 몇 년 몇 월 몇 일을 의미핛까?
*/
select extract(year from (TO_DATE('99/10/11','YY/MM/DD'))) "99/10/11 YY", --2099
        extract(year from (TO_DATE('49/10/11','YY/MM/DD'))) "49/10/11 YY", --2049
        extract(year from (TO_DATE('99/10/11','RR/MM/DD'))) "99/10/11 RR", --1999
        extract(year from (TO_DATE('49/10/11','RR/MM/DD'))) "49/10/11 RR" --2049
from dual;

/*
8. 춘 기술대학교의 2000 년도 이후 입학자들은 학번이 A 로 시작하게 되어있다. 
2000 년도 이전 학번을 받은 학생들의 학번과 이름을 보여주는 SQL 문장을 작성하시오.
*/
select student_no,
        student_name
from tb_student
where extract(year from entrance_date) < 2000;

/*
9. 학번이 A517178 인 한아름 학생의 학점 총 평점을 구하는 SQL 문을 작성하시오. 
단, 이때 출력 화면의 헤더는 "평점" 이라고 찍히게 하고, 
점수는 반올림하여 소수점 이하 한 자리까지만 표시한다.
*/
select round(avg(point), 1) 평점
from tb_grade
where student_no = 'A517178';

/*
10. 학과별 학생수를 구하여 "학과번호", "학생수(명)" 의 형태로 헤더를 만들어 
결과값이 출력되도록 하시오.
*/
select department_no 학과번호,
        count(*) "학생수(명)"
from tb_student
group by department_no
order by 1;

/*
11. 지도 교수를 배정받지 못핚 학생의 수는 몇 명 정도 되는 알아내는 SQL 문을 작성하시오.
*/
select count(*)
from tb_student
where coach_professor_no is null;

/*
12. 학번이 A112113 인 김고운 학생의 년도 별 평점을 구하는 SQL 문을 작성하시오. 
단, 이때 출력 화면의 헤더는 "년도", "년도 별 평점" 이라고 찍히게 하고, 
점수는 반올림하여 소수점 이하 한 자리까지만 표시한다.
*/
select substr(term_no, 1, 4) "년도",
        round(avg(point), 1) "년도 별 평점"
from tb_grade
group by substr(term_no, 1, 4), student_no
having student_no = 'A112113'
order by 1;

/*
13. 학과 별 휴학생 수를 파악하고자 한다. 
학과 번호와 휴학생 수를 표시하는 SQL 문장을 작성하시오.
*/
select department_no 학과코드명,
        count(decode(absence_yn, 'Y', 1)) "휴학생 수"
from tb_student
group by department_no
order by 1;

/*
14. 춘 대학교에 다니는 동명이인(同名異人) 학생들의 이름을 찾고자 한다. 
어떤 SQL 문장을 사용하면 가능하겠는가?
*/
select student_name,
        count(*)
from tb_student
group by student_name
having count(*) > 1
order by 2;

/*
15. 학번이 A112113 인 김고운 학생의 
년도, 학기 별 평점과 년도 별 누적 평점 , 총 평점을 구하는 SQL 문을 작성하시오. 
(단, 평점은 소수점 1 자리까지맊 반올림하여 표시한다.)
*/
--decode를 빈칸으로 하니까 순서가 위로 올라와버림
--스페이스바 공백 말고 '　'(특수문자?)로 넣으니까 순서가 뒤로 밀렸음! ㅠㅠㅠ뭐냐진짜아 엉엉
select decode(grouping(substr(term_no, 1, 4)), 0, nvl(substr(term_no, 1, 4), '　'), '　') 년도,
       decode(grouping(substr(term_no, 5, 2)), 0, nvl(substr(term_no, 5, 2), '　'), '　') 학기,
       round(avg(point), 1) 평점
from tb_grade
where student_no = 'A112113'
group by rollup(substr(term_no, 1, 4), substr(term_no, 5, 2))
order by 1,2;
