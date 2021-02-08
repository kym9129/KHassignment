--@실습문제 : tb_number테이블에 난수 100개 (0~999)를 저장하는 익명블럭을 생성하세요.
--실행 시마다 생성된 모든 난수의 합을 콘솔에 출력할 것.
create table tb_number(
    id number, --pk sequence객체로부터 채번
    num number, --난수
    reg_date date default sysdate,
    constraints pk_tb_number_id primary key(id)
);

create sequence seq_tb_number_id
start with 1
increment by 1
maxvalue 100
nominvalue
nocycle
cache 20;

--drop sequence seq_tb_number_id;

declare
    rnd number;
    v_num tb_number.num%type;
    total number := 0;
begin
    for n in 1..100 loop
        rnd := trunc(dbms_random.value(0, 1000));
        total := total + rnd;

        insert into tb_number
        values(seq_tb_number_id.nextval, rnd, sysdate);
        
    end loop;
    dbms_output.put_line('total = ' || total);

end;
/

select * from tb_number;
--delete from tb_number;
select sum(num) from tb_number;