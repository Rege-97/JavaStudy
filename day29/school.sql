create table teacher(                   -- 반 정보 테이블 생성 
    tnum varchar2(20) primary key,
    tname varchar2(20) not null
)

create table student(                   -- 학생 정보 테이블 생성 
    snum number(4) primary key,
    sname varchar2(20) not null,
    sage number(4) not null,
    saddr varchar2(50) not null,
    stel varchar2(20) not null,
    tnum varchar2(20) not null,
    constraint fk_teacher
    foreign key(tnum)
    references teacher(tnum)
)

create table subject(                   -- 과목 테이블 생성 
    snum number(4) primary key,
    skor number(4) default 0,
    smat number(4) default 0,
    seng number(4) default 0,
    savg number(4) default 0,
    constraint fk_student
    foreign key(snum)
    references student(snum)
)

create table sign(
    id varchar2(20) primary key,
    pw varchar2(20) not null
)

create sequence sq_student_snum         -- 학사번호를 카운트할 시퀀스 생성 

drop sequence sq_student_snum           -- 시퀀스 삭제 

select * from sign                      -- 계정 조회 
 
insert into sign values('admin','1234') -- 기본 계정
select * from sign                      -- 계정 테이블 조회   
insert into sign values(?,?)            -- 계정 생성 (ID,PW) 


select * from teacher                   -- 반 정보 조회 

select * from student                   -- 학생 정보 조회 
 
select * from subject                   -- 과목 조회

insert into teacher values(?,?)         -- 반 정보 입력(TNUM,TNAME)

insert into student 
values(sq_student_snum.nextval,?,?,?,?,?)   -- 학생 정보 입력(SNAME, SAGE, SADDR, TNUM)

select * from student 
where sname=? 
order by snum                           -- 학사번호 오름차순으로 학생 이름 찾기(SNAME)

insert into subject(snum) values(?)     -- 과목 테이블 데이터 생성 (SNUM)

select t.tnum,t.tname,count(*)
from teacher t,student s
where t.tnum=s.tnum
group by s.tnum,t.tnum,t.tname
order by t.tnum                         -- 학생 수 카운트하여 반 정보출력 

update teacher set tname=? where tnum=? -- 담임 이름 변경(TNAME,TNUM)

delete from subject                     -- 과목 데이터 삭제 
delete from student                     -- 학생 데이터 삭제
delete from teacher                     -- 반 정보 데이터 삭제

 

