select * from dept

--case end절  when = if 
select empno,ename,deptno,
    case
        when deptno=10 then 'ACCOUNTING'
        when deptno=20 then 'RESEARCH'
        when deptno=30 then 'SALES'
        when deptno=40 then 'OPERATIONS'
        end as dname 
from emp

--매니저는 15% 세일즈 5% 인상된 급여를 출력--
--case함수-- 
select empno,ename,sal,
    case 
        when job='MANAGER' then sal*1.15
        when job='SALESMAN' then sal*1.05
        else sal 
        end as sal2
from emp

--decode함수-- 

select empno,ename,job,sal,
    decode(job,'MANAGER',sal*1.15,
                'SALESMAN',sal*1.05,sal) as sal2
from emp


--급여 모두 모음를 하고 싶은 곳 앞에다가 그룹함수끄면 됨 
 select sum(sal)
 from emp
 
 -- 총급여의 평균
 select avg(sal)
 from emp 
 --급여 최대값 
 select max(sal) ,ean
 from emp--사원테이블기준으로 
  --급여 최소값 
 select min(sal)
 from emp 
 --급여에 대한 최소치 최대치 같이 나열
 select max(sal),min(sal)
 from emp
 --전혀다른 의미를 가진 데이터들을 그룹으로 해서 같이 나열할 수 있음 
 select max(sal),min(sal),max(hiredate),min(hiredate)
 from emp
 
 --sum을 통해 커미션을 갖고 있는 급여의 총액 구함
 select sum(comm)--널에 대한 데이터있어도 결과가 나옴 그룹함수 특징 2 
 from emp
--count라는 그룹함수로 감쌈 sal기준으로 카운트 새면 
select count(sal)
from emp

--카운트 갯수셀건데 comm
select count(comm)
from emp 

--특정컬럼이 아닌 한라인을 기준으로 12개 출력됨 
select count(*)
from emp 
--10번 부서에 몇명이 근무하는지 알고 싶음
-- 근데 여기서 count세면 12명 나옴 그래서 이걸 해결하려면
--depno제시하거나 empno 개수를 출력할 수 있도록 함 - 사원수만 출력되도록
--아니면 모든 컬럼 하도로 * 사용

--10번 부서에 일하는 사람들만 조회할거임
select *
from emp
where deptno=10 
--10번 부서에 일하는 사람들의 수  조회할거임
select count(*)
from emp 
where deptno=10 

--사원의 직무종류의 수 출력 매니저 점원 ,, 이렇게 직무종류
select count(job)
from emp
--이렇게 하면 저장되어있는 12명의 사원들이 나오는 것 

--disinct 중복 제거한 후 카운트를 세면 됨 
select count(distinct job) 
from emp-- 이 결과가 사원의 직무종류 수



--사원들의 년도별 입사인원을 출력하는 쿼리
--출력결과 는 
-- 컬럼명 :      total 1980 1981 1982
-- 입사인원 결과 :12   1    10   1  (데이터) 

select count(hiredate) as total,   
        sum(decode(substr(hiredate,1,4),1980,1,0)) as "1980",
        count(decode(to_char(hiredate,'yyyy'),1981,1,null)) as "1981",
        sum(
            case
                when substr(hiredate,1,4)=1982 then 1
                else 0
        end) as "1982"
from emp


--case end절 
select sum(
        case
            when substr(hiredate,1,4)=1982 then 1
            else 0
        end) as "1982"
from emp

--형변환 함수 + decode 
select count(decode(to_char(hiredate,'yyyy'),1981,1,null))as "1981"
from emp 

--decode함수
select sum(decode(substr(hiredate,1,4),1980,1,0)) as "1980"
from emp

--사원들의 평균급여 (모든 사원 기준)  
select avg(sal)
from emp 
--10번부서 사원들의 평균급여  
select avg(sal)
from emp
where deptno=10
--통계관련 작업은 각 부서별 통계작업하기 
 select avg(sal)
from emp
where deptno=10
select avg(sal)
from emp
where deptno=20
select avg(sal)
from emp
where deptno=30 
 --- 각 쿼리를 3번 적어야됨  
 --부서별 평균급여를 한번에 처리하는 법 = group by절  
 --정렬하기 위한 것은 orderby절 이건 항상 마지막   
 -- 이 모든 걸 묶을 때 group by절이라고함 
  
--부서별 평균급여 == 모두 구하기
select avg(sal)
from emp
group by deptno --10,20,30번 부서들 가져올 수 있음  
--단점 어떤 부서에 대한 평균부서인지 알 수 없음  
--그룹바이를 묶은 순간부터 depbno는 절이되면서 위로 올릴 수 있음  
--그룹바이절에 기입된 정보는 그룹절이됨   
 
select deptno,avg(sal)
from emp
group by deptno
order by deptno 

--각 부서별 근무인원수 10번부서 몇명 ...  --그룹절에 명시하는 순간붙터 count(*)가 모든 데이터에서 부서별 모든 데이터가 됨 
select count(*)
from emp
group by deptno

--각 부서별 최대급여와 최소급여 출력
select deptno,min(sal),max(sal)
from emp
group by deptno 

--각 부서에 대한 번호와 함께 평균급여  
select deptno,avg(sal)
from emp
group by deptno


--select from where -일반

--그룹화 후 이후의 조건을 줄려면 having 절 사용 
--where 일반컬럼의 조건 having은 그룹컬럼의 조건 

 --평균 급여가 2000이상인 그룹컬럼 
select deptno,avg(sal)
from emp 
group by deptno
having avg(sal)>=2000

--select절은 총 6개 

--select 절 순서- 읽는 순서는 다름 
--부서별 평균급여 + 1000이상 받는 사람들만 평균급여 구하라는 것
select deptno,avg(sal)
from emp
where sal>=1000 --여기서부터 평균값 오름 (12명 avg->1000 avg로 바뀜) 
group by deptno
having avg(sal)>=2000
order by deptno
--부서 순서대로 order by 
order by 


--sms라는 사원이 어느부서에서 일하는지 궁금할떄
--스미스의 정보를 얻어오는게 첫 시작
select *
from emp
where ename ='SMITH'


--부서의 모든정보를 가져올게  dept라는 테이블로부터
select *
from dept
where deptno=20 --20이라는 부서번호를 통한 스미스의 정보
--원래 표를 나눠서 2개로 나눴기 때문에 2번의 쿼리를 작성했는데
--이 2개를 나눔(정보를 가공하기 위해)
--효율적인 정보를 갇기 위해 가공된 정보를 모아놓은 것 = 이게 표 ( 가공된정보)
 
 select *
 from emp --from이라는 부부넹서 하나만 쓸 수 있는 것이 아님
 
 --가져오고 싶은 표들을 다 가져올 수 잇음
 select *
 from emp,dept 
 --원래 하나의 표였던 것이였따가 중복된 데이터가 있어서 이걸 해결학위해 2개노 나눔
 --해당 테이블에 대한 low가 연결된 것
 --총 한명이 4개가 연결돼서 12*4= 48개
 
 --emp테이블 *  dept 테이블의 연결고리는 부서번호
 
 
 select *
 from emp, dept
 where emp.deptno=dept.deptno --나emp에 있는 deptno가져올건데 dept의 deptno같은 걸로 가져와줘 
 --중복되는 데이터가 생기니까 공간을 아끼기위해 공간을 나누났을 뿐 2개였던 것 그래서
 --같은 데이터들끼리 묶는 것을 이퀄주인(equi join)= 내가 원하는 것만 가져옴
 
--모든 컬럼 가져오진 안혹
select empno,ename,deptno,dname
from emp,dept
where emp.deptno=dept.deptno
--디트테이블이 가지고있는 dept넘버와 emp테이블이 가지고 있는  deptno가져올게 
--디트도 가져이ㅣㅆ고 emp도 갖고 있네 = 컬럼명에 대한 모호성
--컬럼명 앞에 어떤 테이블을 가지고올지 명시해야됨 그래서 위는 오류냠 

select emp.empno,emp.ename,emp.deptno,dept.dname --대신 너무 긺 
from emp,dept
where emp.deptno=dept.deptno

select e.empno,e.ename,d.deptno,d.dname
from emp e,dept d
where e.deptno=d.deptno --emp 띄어쓰면 별칭을 줄 수 있음  
and e.ename='SMITH'
--e테이블을 가지고 있는 스미스라는 이름을 가진 사람의 것
--어떤 상황에서 워크테이블이 만들어지느냐 가 중요


select ename, dname 
from emp,dept
order by ename --총 48개
--총이름으로 내림차순해버리면 4개씩 연결하고하는 상대방과 교집합해야됨
--연결고리 없으면 조인은 안됨 
--연결고리 생기는 이유도 어떤 기준으로 나눈ㄹ지 생각

select ename, dname 
from emp,dept
where emp.deptno=dept.deptno
order by ename 

select * from tab


desc salgrade

select * from salgrade --급여의 등급표 
--하위급여 상위급여 grade


select empno,ename,sal,grade
from emp,salgrade  --1600은1400과 2000사이니까 3등급 
where emp.sal>=salgrade.losal and emp.sal<salgrade.hisal--범위에 의한 조인을 수행한 것  


--between과 동일  
select empno,ename,sal,grade 
from emp,salgrade 
where emp.sal between salgrade.losal and salgrade.hisal

--사원의 이름. 부서명, 급여, 급여등급을 출력하는 쿼리작성 ( 사원이름 부서명 급여를  3개로 조인한 것)
select ename,dname,sal,grade
from emp,dept,salgrade
where emp.deptno=dept.deptno
and emp.sal between salgrade.losal and salgrade.hisal

select empno,ename,mgr
from emp  --스미스의 상사는ford  7566 옆에 상사의 이름을 쓰고 싶음
--사원정보를 가지고 있는 표가 2개라면 mgr을 연결하면 이름을 가져올 수 있음
--gom emp를 쓰면 그냥 물리테이블이 되는 것
--emp와 e2는 다른 테이블 이름만 같은


select e1.empno,e1.ename,e1.mgr,e2.ename
from emp e1, emp e2 
where e1.mgr = e2.empno
-- 셀프 조인 
--이렇게만 보면 이퀄조인

--내가 나를 복사해서 쓰이므로 이름만 셀프조인인데 사실 이퀄조인
 
--굳이 사원번호를 찾지않아도 상사의 이름이 표시됨 
 
select e1.empno,e1.ename,e1.mgr,e2.ename
from emp e1, emp e2 
where e1.mgr = e2.empno(+)
--데이터가 없어도 공백을 표시함
--이게 아우터조인 

select * 
from dept

select *
from emp

 select *
 from emp, dept
 where emp.deptno=dept.deptno 
 
 select ename,instr(ename,'R') --R이 몇번째 있냐 
 from emp
 
 select ename
 from emp  -- r이 3번째부터 시작해서 이 기준으로 첫번째 r이 몇번째 있냐 
 where instr(ename,'R',3,1) 
 
 select hiredate
 from emp --마지막 4는 전체에서 몇번짼지 
 where instr(hiredate,'0',4,1)=4  
 
 
 
