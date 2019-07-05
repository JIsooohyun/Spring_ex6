select qna_seq.nextval from dual
select * from qna;
select M.id, M.name, F.*fname
from member M inner join MEMBERFILE F
on (M.id=F.id)
where M.id='aaa' and M.pw='aaa'

drop table qna;
select N.*, F.*
from notice N inner join files F
on (N.num=F.num)
where N.num=


select * from notice where title like '%i%';

create table notice(
	num number(8),
	title varchar2(400),
	writer varchar2(400),
	contents blob,
	reg_date date,
	hit number(8),
	constraint notice_num_pk primary key (num)
);

select * from qna;

create sequence memberfile_seq
start with 1
increment by 1
nomaxvalue
nocycle
nocache;

select * from files;
create table files(
	fnum number(8) constraint files_fnum_pk primary key,
	num number(8) not null,
	fname varchar2(2000),
	oname varchar2(2000)	
);

create table memberfile(
	num number(8) constraint memberfile_num_pk primary key,
	id varchar2(100),
	fname varchar2(2000),
	oname varchar2(2000)
);
create table member(
	id varchar2(100),
	pw varchar2(100),
	name varchar2(100),
	email varchar2(400),
	grade number(1),
	constraint member_id_pk primary key (id)
);
select * from memberfile;
select * from member;

