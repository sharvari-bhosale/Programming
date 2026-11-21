-- Delete table if exists
drop table if exists users;

-- Create table if does not exists
create table if not exists users(
	user_id serial primary key,
	username varchar(50) not null,
	email varchar(50) not null,
	age int,
	city varchar(50)
);

-- display all columns from table
select * from users;

-- insert 5 records into table
insert into users(username, email, age, city)
values('Rajesh', 'rajesh@gmail.com', 25, 'mumbai'),
('Priya', 'priya@gmail.com', 30, 'delhi'),
('Ankit', 'ankit@gmail.com', 28, 'banglore'),
('Sneha', 'sneha@gmail.com', 35, 'pune'),
('Vikram', 'vikram@gmail.com', 22, 'hyderabad');

-- update age
update users 
set age = 26
where username = 'Rajesh';

-- for order
SELECT * FROM USERS ORDER BY USER_ID ASC;

-- update
update users
set city = 'Chennai'
where age >= 30;

-- update
update users
set age = 31, city = 'Kolkata'
where username = 'Priya'

-- update
update users
set age = age + 1
where email like '%@gmail.c'


-- to change the username column to full_name
alter table users
rename column username to full_name;


-- to change the age column datatype from int to samllint
alter table users
alter column age type smallint;


-- to change the table name
alter table users
rename to customers;

select * from customers order by user_id asc;




