create sequence categoryjpa_categoryid_seq START WITH 1 INCREMENT BY 1;

create table categoryjpa (
	categoryid number(10,0) primary key,
	categoryname varchar2(50) not null,
	description varchar2(100) not null
);

create sequence productjpa_productid_seq START WITH 1 INCREMENT BY 1;

create table productjpa (
	productid number(10,2) primary key,
	productname varchar2(50) not null,
	category number(10,0) not null,
	brand varchar2(50),
	price double precision not null,
	foreign key (category) references categoryjpa(categoryid)
);






   
