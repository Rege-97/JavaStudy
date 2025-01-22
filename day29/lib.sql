


create table lib(
    bcode number(20) primary key,
    bname varchar2(20) ,
    writer varchar2(20),
    price number(20),
    pcode number(20),
    constraint fk_pub
    foreign key(pcode)
    references pub(pcode)
)

create table pub(
    pcode number(20) primary key,
    pname varchar2(20),
    ptel varchar2(20),
    paddr varchar2(50)
)

drop table lib
drop table pub

purge recyclebin

select * from lib

create sequence sq_lib_bcode
create sequence sq_pub_pcode

drop sequence sq_lib_bcode
drop sequence sq_pub_pcode

insert into pub(pcode)
values(10)

delete from pub
where pcode=10

delete from lib
where pcode =10
