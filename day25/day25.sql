SELECT * FROM EMP

3+5

select 3+5
from emp

desc dual

select *
from dual

select 45.293, round(45.293,1), round(45.293,0), round(45.293,-1)
from dual

select 45.293, trunc(45.239,2), trunc(45.239,1), trunc(45.293,0), trunc(45.293,-1)
from dual

select 13/3, mod(13,3)
from dual

select empno,ename,sal,mod(sal,100)
from emp

--사원번호 사원이름 입사날짜와 급여를 출력하되
--홀수 번호의 사원번호의 사원만 출력

select empno,ename,hiredate,sal
from emp 
where mod(empno,2)=1

select lower('Welcome to Java')
from dual

select ename,upper(ename),lower(ename),initcap(ename)
from emp

select 'welcome to java',initcap('welcome to java')
from dual

select 'welcome to java',length('welcome to java')
from dual

--사원의 이름과 이름의 글자수를 출력하는 쿼리 작성
select ename,length(ename)
from emp 

select 'Welcome to java',instr('welcome to java','o',3,2)
from dual

--사원의 이름을 출력하고 사원이름에 A가 포함되어 있다면 몇번째 있는지 확인
select ename,instr(ename,'A')
from emp

select 'welcome to java',substr('welcome to java',4,3)
from dual

select empno,ename,substr(hiredate,1,4) as "YEAR"
from emp

select 'java!!',lpad('java!!',20,'#'),rpad('java!!',20,'#')
from dual

select 'bbbbbjavabbbbb!!',ltrim('bbbbbjavabbbbb!!','b'),rtrim('bbbbbjavabbbbb','b')
from dual

--사용자가 소문자로 smith를 입력했다라는 전제 하에
--스미스의 정보가 출력되는 쿼리 작성

select *
from emp 
where UPPER('smith')=ename

--사원번호, 사원이름, 급여, 입사날짜를 출력하되
--사원의 이름에 세번째가 R인 사원만 출력

select empno,ename,sal,hiredate
from emp 
where substr(ename,3,1)='R' 

select empno,ename,sal,hiredate
from emp 
where instr(ename,'R',3,1)=3

--사원의 모든 정보를 출력하시오
--단 이름이 N으로 끝나는 사원의 정보만

select *
from emp
where substr(ename,length(ename),1)='N'

select *
from emp
where substr(ename,-1,1)='N'

--82년도에 입사한 사원만 검색

select *
from emp
where substr(hiredate,3,2)='82' 

--SYSDATE 현재시간을 돌려주는 함수

select sysdate,sysdate+2,sysdate-2
from dual

select sysdate+100
from dual

select empno,ename,hiredate,trunc(sysdate-hiredate,0)
from emp

select empno,ename,hiredate,trunc(months_between(sysdate,hiredate),0)
from emp

select sysdate+120
from dual

select add_months(sysdate,6)
from dual

select sysdate,next_day(sysdate,3)
from dual

select sysdate,last_day(sysdate)
from dual

--사원번호, 사원이름, 입사날짜, 입사달에 마지막 일자

select empno,ename,hiredate,last_day(hiredate)
from emp 

select sysdate-to_date('1982-01-01','yyyy-mm-dd')
from dual

select sysdate,to_char(sysdate,'mm/dd/yy')
from dual

select empno,ename,sal,sal*120,comm,sal*12+nvl(comm,0)
from emp

select empno,ename,nvl(to_char(mgr),'CEO')
from emp

select empno,ename,deptno,
decode(deptno,10,'ACCOUNTING',20,'RESERCH',30,'SALES',40,'OPERATIONS') as dname
from emp

select * from tab

select * from dept

--사원번호, 사원이름, 직무, 급여, 급여2 출력
--사원의 직무가 매니저일 경우 15% 급여 인상
--직무가 세일즈일 경우 5% 급여 인상

select empno,ename,job,sal
from emp 

select empno,ename,job,sal,
decode(job,'MANAGER',sal*1.15,'SALESMAN',sal*1.05,sal) as sal2
from emp 
