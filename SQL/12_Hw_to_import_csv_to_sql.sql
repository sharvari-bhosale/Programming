drop table if exists employee3;

create table employee3(	
		employee_id int primary key,
		first_name varchar(100) not null,
		last_name varchar(100) not null,
		email varchar(50),
		department varchar(50),
		salary numeric(10,2),
		joining_date date,
		age int
);

select * from employee3;

set datestyle to 'ISO, DMY';
