select * from dept

select empno,ename,deptno,
    case
        when deptno = 10 then 'ACCOUNTING'
        when deptno = 20 then 'RESERCH'
        when deptno = 30 then 'SALES'
        when deptno = 40 then 'OPERATIONS'
    end as dname
from emp

--매니저는 15%, 세일즈는 5% 인상된 급여를 출력

select empno,ename,job,sal,
    case
        when job='MANAGER' then sal*1.15
        when job='SALES' then sal*1.05
       end as NEWSAL
from emp 

select count(sal) from emp

select sum(sal) from emp

select avg(sal) from emp

select min(sal) from emp

select max(sal) from emp

select max(sal),ename from emp

select max(sal),min(sal) from emp

select max(sal),min(sal),max(hiredate),min(hiredate)
from emp

select sum(comm) from emp

select count(sal) from emp

select count(comm) from emp

select count(*) from emp

select count(*) from emp
where deptno=10

--사원의 직무 종류 수를 출력해보기

select count(distinct job) from emp 

select count(*) as total,
        sum(decode(substr(hiredate,1,4),1980,1,0)) as "1980",
        count(decode(to_char(hiredate,'yyyy'),1981,1,null)) as "1981",
        sum(
            case
                when substr(hiredate,1,4)=1982 then 1
            else 0
            end) as "1982"
from emp


select avg(sal)
from emp where deptno=10

select avg(sal)
from emp where deptno=20

select avg(sal)
from emp where deptno=30

select deptno,avg(sal)
from emp
group by deptno
order by deptno

-- 각 부서별 근무 인원수를 출력
select deptno,count(*)
from emp
group by deptno 

--각 부서별 최대급여와 최소 급여를 출력
select deptno,max(sal),min(sal)
from emp
group by deptno 
order by deptno

-- 각 부서별 평균 급여를 출력(단 2000이상만)
select deptno, avg(sal)
from emp
group by deptno
having avg(sal)>2000

--1000 이상의 급여를 가지고 있는 사람들에 대해서만
--부서별로 평균을 구한 후 구해진 부서별 평균 급여가 2000이상인 부서 번호와 부서별 평균 급여를 출력하라

select deptno,avg(sal) 
from emp
where sal>=1000
group by deptno
having avg(sal)>2000
order by deptno

select *
from emp
where ename='SMITH'

select *
from dept
where deptno=20

select * from emp,dept

select * from emp,dept where emp.deptno=dept.deptno

select empno,ename,deptno,dname from emp,dept where emp.deptno=dept.deptno

select e.empno,e.ename,d.deptno,d.dname
from emp e,dept d
where e.deptno=d.deptno

select e.empno,e.ename,d.deptno,d.dname
from emp e,dept d
where e.deptno=d.deptno
and e.name='SMITH'

select * from tab

desc salgrade

select * from salgrade

select empno,ename,sal,grade
from emp,salgrade
where emp.sal>=salgrade.losal and emp.sal<=salgrade.hisal
--where emp.sal between salgrade.losal and salgrade.hisal

--사원의 이름 부서명 급여 급여등급을 출력하는 쿼리 작성

select e.ename,d.dname,e.sal,s.grade
from emp e,salgrade s,dept d
where e.deptno=d.deptno and e.sal>=s.losal and e.sal<=s.hisal 

select e1.empno,e1.ename,e1.mgr,e2.ename
from emp e1,emp e2
where e1.mgr = e2.empno

select e1.empno,e1.ename,e1.mgr,e2.ename
from emp e1,emp e2
where e1.mgr=e2.empno(+)
