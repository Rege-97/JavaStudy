create table teacher(
    tnum varchar2(20) primary key,
    tname varchar2(10) not null
)

create table student(
    snum number(4) primary key,
    sname varchar2(10) not null,
    sage number(4) not null,
    saddr varchar2(20) not null,
    stel varchar2(20) not null,
    tnum varchar2(20) not null,
    constraint fk_teacher
    foreign key(tnum)
    references teacher(tnum)
)

create table subject(
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

desc teacher
desc student

drop table student

delete from student where sname='±èÃ¤Çö' 

purge recyclebin

create sequence sq_student_snum
drop sequence sq_student_snum

select * from teacher
select * from student
select * from subject

insert into subject values((select snum from student where sname='±èÃ¤Çö'),0,0,0,0)

commit

select * from 
student,subject,teacher 
where student.snum=subject.snum and student.tnum=teacher.tnum order by savg desc

select * from 
student st,subject sb,teacher t
 where st.snum=sb.snum and st.tnum=t.tnum and st.tnum='A Class' order by savg desc
 
 select * from 
 student st,subject sb,teacher t 
 where st.snum=sb.snum and st.tnum=t.tnum and st.sname='±èÃ¤Çö' order by savg desc
 
update subject set skor=10,smat=20,seng=30, savg = 30 where snum= 1

delete from subject
delete from student
commit

