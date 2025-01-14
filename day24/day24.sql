select * from tab

DESC dept

desc emp

select empno,ename,job,mgr,hiredate,sal,comm,deptno
from emp

select * 
from emp

select empno,ename,hiredate
from emp

select empno,ename,hiredate,sal,sal*12
from emp

select empno,ename,sal,sal*12 as "연    봉",comm,sal*12+comm
from emp

select ename||'직원의 직무는'||job,'입니다' 
from emp 

select distinct deptno
from emp 

--사원의 직무 종류에 대해서 출력하는 쿼리 작성

desc emp

select empno,ename, job,hiredate
from emp

select empno,ename,hiredate,deptno
from emp  where deptno=10 -- 컬럼명 연산자 값 
 
 -- 사원 번호 사원 이름 입사날짜 급여 출력
 -- 급여 2000 이상 받는 사원만 출력
 
 select empno,ename,hiredate,sal
 from emp where sal>2000
 
 
select *
from emp where ename='FORD'

select empno,ename,hiredate
from emp where hiredate>= '1981-05-01'

select *
from emp
where ename like 'FORD'

select *
from emp where ename like 'J%'

select *
from emp where ename like '%N'

select *
from emp where ename like '%A%'

--사원이름 A가 두번째에 있는 사원만 출력
select *
from emp where ename like '_A%'

select *
from emp where deptno=10

select *
from emp where job='MANAGER'

select *
from emp where deptno=10 and job='MANAGER'

-- 사원들중 급여가 1000~2000 사이의 급여를 받는 사원만 출력
select *
from emp where sal >=1000 and sal <=2000 

select *
from emp where sal between 1000 and 2000

select *
from emp where hiredate >='1982-01-01' or job ='MANAGER'

--커미션을 300 500 1400을 받는 사원만 출력 
select *
from emp where comm =300 or comm=500 or comm=1400

select *
from emp where comm in(300,500,1400)

--select *
--from emp where deptno!=10

select *
from emp where deptno<>10

select *
from emp where sal not between 1000 and 2000

select *
from emp where comm not in(300,500,1400)

select *
from emp where comm is null

select *
from emp where comm is not null

select empno,ename,sal,deptno
from emp order by sal asc

select empno,ename,sal,deptno
from emp order by deptno asc,sal asc