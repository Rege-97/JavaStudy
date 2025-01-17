select * 
from emp

select *
from dept

select * from salgrade

--사원들의 이름, 부서번호, 부서 이름을 출력하시오 

select e.ename,d.deptno,d.dname
from emp e,dept d
where e.deptno=d.deptno

--부서번호가 30번인 사람들의 이름, 직무, 부서번호, 부서위치를 출력

select  e.ename,e.job,d.deptno, d.loc
from emp e, dept d 
where e.deptno=d.deptno and d.deptno=30

--이름에 a가 들어있는 사원들의 이름과 부서 이름 출력

select  e.ename, d.dname
from emp e,dept d 
where e.deptno=d.deptno
and instr(e.ename,'A') <> 0

--커미션을 받는 사원의 이름, 커미션, 부서이름, 부서위치를 출력

select e.ename, e.comm,d.dname,d.loc
from emp e, dept d
where e.deptno=d.deptno and e.comm > 0

--DALLAS에서 근무하고 있는 사원의 이름, 직무, 부서번호, 부서이름 출력

select e.ename,e.job,d.deptno,d.dname
from emp e, dept d 
where e.deptno=d.deptno
and d.loc='DALLAS'

--사원 이름과 직무, 급여, 급여등급을 출력

select e.ename, e.job, e.sal,s.grade
from emp e,salgrade s
where e.sal>=losal and e.sal<=hisal

--사원이름, 부서번호와 해당사원과 같은 부서에서 근무하는 사원을 출력

select e1.ename,e1.deptno,e2.ename
from emp e1, emp e2
where e1.deptno=e2.deptno
order by e1.ename asc

select dname

select ename, deptno
from emp
where ename='SMITH'

select dname
from dept
where deptno=20

select dname
from emp,dept
where emp.deptno=dept.deptno
and emp.ename='SMITH'

select dname
from dept
where deptno=(select deptno
                from emp
                where ename='SMITH')


select * from 
(select empno,ename,hiredate,deptno
from emp)a, dept
where a.deptno = dept.deptno

select avg(sal)
from emp

select empno,ename,sal
from emp
where sal>=(select avg(sal)
            from emp)

--10번 부서의 평균급여보다 많은 급여를 받는 사원 정보 출력

select *
from emp
where sal>=(select avg(sal)
            from emp
            where deptno=10)
            
--where deptno=10,20
--where deptno=10 or deptno=20      두번 연산 
--where deptno in(10,20)            한번에 연산 
 
select empno,ename,deptno
from emp
where deptno in (select deptno
                from emp
                where ename = 'SMITH'
                or ename = 'WARD')

select empno,ename,job,sal
from emp
where sal>=all(select sal
                from emp
                where job='MANAGER')
                
select empno,ename,job,sal
from emp
where sal>=(select max(sal)
            from emp
            where job='MANAGER')
            
                
select empno,ename,job,sal
from emp
where sal>=any(select sal
                from emp
                where job='MANAGER')
                
select empno,ename,job,sal
from emp
where sal>=(select min(sal)
            from emp
            where job='MANAGER')
            
--SMITH의 급여와 동일하거나 더 많이 받는 사원명과 급여를 출력
select ename,sal
from emp
where sal>=(select sal
            from emp
            where ename='SMITH')

--직급이 매니저인 사원의 부서번호와 부서명 지역을 출력
select deptno,dname,loc
from dept
where deptno in (select deptno
                    from emp
                    where job='MANAGER')
                    
--이름에 T를 포함하고 있는 사원들과 같은 부서에서 근무하고 있는
--사원의 사원번호와 이름을 출력
select empno, ename
from emp
where deptno in (select deptno
                    from emp
                    where instr(ename,'T')<>0)
            
--부서 위치가 dallas인 모든 사원의 이름, 부서번호 출력 
select ename,deptno
from emp
where deptno=(select deptno
                from dept
                where loc='DALLAS')
                 
--sales부서의 모든 사원이름과 급여를 출력
select ename,sal
from emp
where deptno=(select deptno
                from dept
                where dname='SALES') 
                
--king이 담당하고 있는 모든 사원이름과 급여 출력 
select * from emp
select * from dept

select ename,sal
from emp
where mgr=(select empno
            from emp
            where ename='KING')
            
--자신의 급여가 평균 급여보다 많고 이름에 s가 들어가는 사원과
--동일한 부서에서 근무하는 모든 사원의 사원번호, 이름, 급여 출력

 select avg(sal)
 from emp 
 

 
 select empno,ename,sal
 from emp
 where deptno=(select deptno
                 from emp
                 where instr(ename,'S')<>0
                 and sal>=(select avg(sal)
                             from emp ))