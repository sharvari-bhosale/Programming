create table employee(	
		employee_id serial primary key,
		name varchar(100) not null,
		position varchar(50),
		department varchar(50),
		hire_date date,
		salary numeric(10,2)
);

select * from employee;