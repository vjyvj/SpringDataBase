/*
create table person (
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
*/

insert into person(id,name,location,birth_date) values(1,'Suresh', 'Chennai', sysdate());

insert into person(id,name,location,birth_date) values(2,'Raghav', 'Chennai', sysdate());

insert into person(id,name,location,birth_date) values(3,'Vijay', 'Chennai', sysdate());
insert into person(id,name,location,birth_date) values(4,'Raj', 'Chennai', sysdate());

