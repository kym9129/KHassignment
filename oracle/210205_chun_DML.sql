--실습문제 2021.02.05  chun DML

/*
1. 과목유형 테이블(TB_CLASS_TYPE)에 아래와 같은 데이터를 입력하시오.

번호, 유형이름 
------------ 
01, 전공필수 
02, 전공선택 
03, 교양필수 
04, 교양선택 
05. 논문지도 
*/

select * from tb_class_type;

insert into tb_class_type values(01, '전공필수');
insert into tb_class_type values(02, '전공선택');
insert into tb_class_type values(03, '교양필수');
insert into tb_class_type values(04, '교양선택');
insert into tb_class_type values(05, '논문지도');

/*
2. 춘 기술대학교 학생들의 정보가 포함되어 있는 학생일반정보 테이블을 만들고자 한다. 
아래 내용을 참고하여 적절한 SQL 문을 작성하시오. (서브쿼리를 이용하시오)

테이블이름
    TB_학생일반정보
컬럼
    학번
    학생이름
    주소
*/
create table TB_학생일반정보(
    학번 number,
    학생이름 varchar2(20),
    주소 varchar2(500)
);

/*
3. 국어국문학과 학생들의 정보맊이 포함되어 있는 학과정보 테이블을 맊들고자 한다. 
아래 내용을 참고하여 적젃핚 SQL 문을 작성하시오. (힌트 : 방법은 다양함, 소신껏 작성하시오)

테이블이름
    TB_국어국문학과
컬럼
    학번
    학생이름
    출생년도 <= 네자리 년도로 표기 
    교수이름
*/
create table TB_국어국문학과(
    학번 number,
    학생이름 varchar2(20),
    출생년도 number,
    교수이름 varchar2(20)
);

/*
4. 현 학과들의 정원을 10% 증가시키게 되었다. 
이에 사용할 SQL 문을 작성하시오. 
(단, 반올림을 사용하여 소수점 자릿수는 생기지 않도록 한다)
*/
update tb_department
set capacity = round(capacity * 1.1);


/*
5. 학번 A413042 인 박건우 학생의 주소가 
"서울시 종로구 숭인동 181-21 "로 변경되었다고 한다. 
주소지를 정정하기 위해 사용핛 SQL 문을 작성하시오.
*/
update tb_student
set student_address = '서울시 종로구 숭인동 181-21'
where student_no = 'A413042';

select * from tb_student where student_no = 'A413042';

/*
6. 주민등록번호 보호법에 따라 학생정보 테이블에서 주민번호 뒷자리를 저장하지 않기로 결정하였다. 
이 내용을 반영할 적절한 SQL 문장을 작성하시오.
*/
update tb_student
set student_ssn = substr(student_ssn, 1, 6);

select * from tb_student;

/*

7. 의학과 김명훈 학생은 2005 년 1 학기에 자신이 수강한 '피부생리학' 점수가 
잘못되었다는 것을 발견하고는 정정을 요청하였다. 
담당 교수의 확인 받은 결과 해당 과목의 학점을 3.5 로 변경키로 결정되었다. 
적절한 SQL 문을 작성하시오.
*/
update tb_grade
set point = 3.5
where term_no = 200501
    and student_no = (select student_no
                        from tb_student 
                        where student_name = '김명훈' 
                        and department_no = (select department_no
                                            from tb_department 
                                            where department_name = '의학과'))
   and class_no = (select class_no 
                    from tb_class 
                    where class_name = '피부생리학');

/*
8. 성적 테이블(TB_GRADE) 에서 휴학생들의 성적항목을 제거하시오.
*/
delete from tb_grade
where student_no in (select student_no 
                        from tb_student 
                        where absence_yn = 'Y');