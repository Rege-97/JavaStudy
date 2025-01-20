select * from tab

create table student(

    name    varchar2(20)    not null,
    age     number(3),
    addr    varchar2(50),
    tel     varchar2(20)   not null

)

desc student

select * from emp

create table emp2
as (select * from emp)

desc emp2

select * from emp2

select empno,ename,hiredate,sal
from emp

create table emp3
as (select empno,ename,hiredate,sal from emp)

select * from emp3

create table emp4
as (select * from emp where 1=0)

desc emp4

select * from emp4

alter table emp3 
add(email number(4))

desc emp3

alter table emp3
modify(email varchar2(50))

alter table emp3
drop column email

drop table emp3

purge recyclebin

select * from student

insert into student(name,age,addr,tel)
values('홍길동',20,'서울','02-1234-5678')

insert into student
values('둘리',25,'부천','032-2222-2222') 

insert into student(name,tel)
values('하니','032-1234-5555') 

insert into student
values('또치',20,null,'02-5555-6666') 

select * from emp4

insert into emp4 (select * from emp)

select * from student

update student
set tel='02-1234-5678'
where name='홍길동' 

-- emp4의 모든 사원의 급여를 5% 인상
select * from emp4

update emp4
set sal=sal*1.05 

-- sales 부서의 직원만 5% 인상

update emp4
set sal=sal*1.05
where deptno=(select deptno 
                from dept 
                where dname='SALES') 

delete from student
where name='하니' 

--sales부서만 퇴사처리
delete from emp4
where deptno=(select deptno 
                from dept 
                where dname='SALES') 