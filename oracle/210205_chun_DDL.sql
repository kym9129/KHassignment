--실습문제 2021.02.25

/*
1. 계열 정보를 저장할 카테고리 테이블을 만들려고 한다. 다음과 같은 테이블을 작성하시오.

테이블 이름
    TB_CATEGORY
컬럼
    NAME, VARCHAR2(10)
    USE_YN, CHAR(1), 기본값은 Y 가 들어가도록
*/

create table tb_category(
    name varchar2(10),
    use_yn char(1) default 'Y'
);

select * from tb_category;

/*
2. 과목 구분을 저장핛 테이블을 맊들려고 핚다. 다음과 같은 테이블을 작성하시오.

테이블이름
    TB_CLASS_TYPE
컬럼
    NO, VARCHAR2(5), PRIMARY KEY 
    NAME , VARCHAR2(10)
*/
create table tb_class_type(
    no varchar2(5),
    name varchar2(10),
    constraint pk_no_tb_class_type primary key(no)
);

/*
3. TB_CATAGORY 테이블의 NAME 컬럼에 PRIMARY KEY 를 생성하시오.
(KEY 이름을 생성하지 않아도 무방함. 맊일 KEY 이를 지정하고자 핚다면 이름은 본인이
알아서 적당핚 이름을 사용핚다.)
*/
alter table tb_category
add constraint pk_tb_category_name primary key(name);

/*
4. TB_CLASS_TYPE 테이블의 NAME 컬럼에 NULL 값이 들어가지 않도록 속성을 변경하시오.
*/

alter table tb_class_type
modify name varchar2(5) not null;


select constraint_name, 
        uc.table_name,
        ucc.column_name,
        uc.constraint_type,
        uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_CLASS_TYPE';

/*
5. 두 테이블에서 컬럼 명이 NO 인 것은 기존 타입을 유지하면서 크기는 10 으로, 
컬럼명이 NAME 인 것은 마찪가지로 기존 타입을 유지하면서 크기 20 으로 변경하시오.
*/

alter table tb_category
modify name varchar2(20);

alter table tb_class_type
modify no varchar2(10)
modify name varchar2(20);

/*
6. 두 테이블의 NO 컬럼과 NAME 컬럼의 이름을 각 각 
TB_ 를 제외핚 테이블 이름이 앞에 붙은 형태로 변경핚다.
(ex. CATEGORY_NAME)
*/

alter table tb_category
rename column name to category_name;

alter table tb_class_type
rename column name to class_type_name;


/*
7. TB_CATAGORY 테이블과 TB_CLASS_TYPE 테이블의 PRIMARY KEY 이름을 
다음과 같이 변경하시오.
Primary Key 의 이름은 ‚PK_ + 컬럼이름‛으로 지정하시오. 
(ex. PK_CATEGORY_NAME )
*/
alter table tb_category
rename constraint PK_TB_CATEGORY_NAME to pk_category_name;

alter table tb_class_type
rename constraint pk_no_tb_class_type to pk_class_type_name;

--8. 다음과 같은 INSERT 문을 수행핚다.
INSERT INTO TB_CATEGORY VALUES ('공학','Y'); 
INSERT INTO TB_CATEGORY VALUES ('자연과학','Y'); 
INSERT INTO TB_CATEGORY VALUES ('의학','Y'); 
INSERT INTO TB_CATEGORY VALUES ('예체능','Y'); 
INSERT INTO TB_CATEGORY VALUES ('인문사회','Y'); 
COMMIT;

/*
9.TB_DEPARTMENT 의 CATEGORY 컬럼이 TB_CATEGORY 테이블의 CATEGORY_NAME 컬럼을 
부모 값으로 참조하도록 FOREIGN KEY 를 지정하시오. 
이 때 KEY 이름은 FK_테이블이름_컬럼이름으로 지정핚다. 
(ex. FK_DEPARTMENT_CATEGORY )
*/
alter table tb_department
add constraint fk_department_category foreign key(category)
references tb_category(category_name);

--확인
select constraint_name, 
        uc.table_name,
        ucc.column_name,
        uc.constraint_type,
        uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_DEPARTMENT';

/*
10. 춘 기술대학교 학생들의 정보만이 포함되어 있는 학생일반정보 VIEW 를 맊들고자 핚다. 
아래 내용을 참고하여 적젃핚 SQL 문을 작성하시오.

뷰 이름
    VW_학생일반정보
컬럼
    학번 학생이름 주소
*/
--system관리자 권한으로 chun의 뷰 생성 권한 부여
grant create view to chun;

create view "VM_학생일반정보"
as 
select student_no 학번,
    student_name 학생,
    student_address 주소
from tb_student;

/*
11. 춘 기술대학교는 1 년에 두 번씩 학과별로 학생과 지도교수가 지도 면담을 진행한다. 
이를 위해 사용할 학생이름, 학과이름, 담당교수이름 으로 구성되어 있는 VIEW 를 만드시오. 
이때 지도 교수가 없는 학생이 있을 수 있음을 고려하시오 
(단, 이 VIEW 는 단순 SELECT 만을 할 경우 학과별로 정렬되어 화면에 보여지게 만드시오.)

뷰 이름
    VW_지도면담
컬럼
     학생이름
     학과이름
     지도교수이름
*/

--view 생성
create view "VM_지도면담"
as
select S.student_name 학생이름,
        d.department_name 학과이름,
        p.professor_name 지도교수이름
from tb_student S, tb_department D, tb_professor P
where S.department_no = D.department_no
    and S.coach_professor_no = P.professor_no
order by 2;

--view확인
select * from VM_지도면담;

/*
12. 모든 학과의 학과별 학생 수를 확인핛 수 있도록 적젃핚 VIEW 를 작성해 보자.

뷰 이름
    VW_학과별학생수
컬럼
    DEPARTMENT_NAME STUDENT_COUNT
*/
create view VM_학과별학생수
as
select d.department_name,
        count(*) student_count
from tb_student S, tb_department D
where s.department_no = d.department_no
group by D.department_name
order by 1;

select * from VM_학과별학생수;

/*
13. 위에서 생성핚 학생일반정보 View 를 통해서 
학번이 A213046 인 학생의 이름을 본인 이름으로 변경하는 SQL 문을 작성하시오.
*/
--조회
select *
from VM_학생일반정보
where 학번 = 'A213046';

--변경
update VM_학생일반정보
set 학생 = '김영미'
where 학번 = 'A213046';

/*
14. 13번에서와 같이 VIEW를 통해서 데이터가 변경될 수 있는 상황을 막으려면 
VIEW를 어떻게 생성해야 하는지 작성하시오.

view를 생성/갱신할 때 with read only옵션을 추가한다.
*/

/*
15. 춘 기술대학교는 매년 수강신청 기간만 되면 
특정 인기 과목들에 수강 신청이 몰려 문제가 되고 있다. 
최근 3 년을 기준으로 수강인원이 가장 많았던 3 과목을 찾는 구문을 작성해보시오.
*/

select E.*
from (
    select E.*
    from(
        --최근 3년 =  between (lastest_year-2)200700 and (latest_year)200903
        select class_no 과목번호, 
                class_name 과목명,
            count(*) "누적수강생수(명)"
        from tb_grade join tb_class
            using(class_no)
        where term_no between (
                    ((select to_number(substr(to_char(max(term_no)),1, 4)) latest_year
                     from tb_grade
                     )-2)*100)        
                and ((
                    (select to_number(substr(to_char(max(term_no)),1, 4)) latest_year
                     from tb_grade
                     )*100)+3)
        
        group by class_no, class_name
        order by count(*) desc
        )E
    )E
where rownum <=3;
--왜 pdf랑 수강 인원수가 다를꼬?

--최근 년도 도출 -> 2009
select to_number(substr(to_char(max(term_no)),1, 4)) latest_year
from tb_grade;
