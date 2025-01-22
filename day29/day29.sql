select * from student

create table test1(
    col1 varchar2(10),
    col2 varchar2(10) not null, -- 인라인 표기법 
    col3 varchar2(10) default 'test' 
)

desc test1

select * from test1

insert into test1
values('하하','호호','히히') 

insert into test1
values(null,'마마','냐냐') 

insert into test1
values('코코',null,'바바') 

insert into test1(col1,col2)
values('코코','자자') 

create table test2(
        col1 varchar2(10) unique,
        col2 varchar2(10) unique not null,
        col3 varchar2(10) not null,
        col4 varchar2(10) not null,
        constraint uni_item_uk unique(col3) -- 아웃라인 표기법 
)

insert into test2
values('111','ddd','ddd','ddd')

select * from test2 

create table emp10(
    empno number(4) primary key,
    ename varchar2(20),
    deptno number(4)
)

select * from emp10

insert into emp10
values(1,'홍길동',10) 

insert into emp10(ename,deptno) 
values('둘리',10) 

insert into emp10
values(1,'둘리',10) 

create table dept10(
    deptno number(4) primary key,
    dname varchar2(20),
    daddr varchar2(50)
)

insert into dept10
values(10,'영업부','강남') 

insert into dept10
values(20,'기획부','강북') 

insert into dept10
values(30,'R&D','인천') 

select * from tab

drop table emp10

purge recyclebin

create table emp10(
    empno number(4) primary key,
    dname varchar2(20),
    deptno number(4),
    constraint fk_deptno10
    foreign key(deptno)
    references dept10(deptno)
)


select * from emp10
select * from dept10

insert into emp10
values(2,'홍길동',50) 

create sequence sq_emp10_empno

select sq_emp10_empno.nextval*10 from dual

drop sequence sq_emp10_empno

insert into emp10
values(sq_emp10_empno.nextval,'홍길동',10) 

 