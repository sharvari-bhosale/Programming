drop table if exists students_2023;

create table students_2023(
	student_id int primary key,
	student_name varchar(100),
	course varchar(50)
);

insert into students_2023(student_id, student_name, course) values
(1, 'Aarav Sharma', 'Computer Science'),
(2, 'Ishita Verma', 'Mechanical Engineering'),
(3, 'Kabir Patel', 'Electronics'),
(4, 'Ananya Desai', 'Civil Engineering'),
(5, 'Rahul Gupta', 'Computer Science');

select * from students_2023;



drop table if exists students_2024;

create table students_2024(
	student_id int primary key,
	student_name varchar(100),
	course varchar(50)
);

insert into students_2024(student_id, student_name, course) values
(3, 'Kabir Patel', 'Electronics'),
(4, 'Ananya Desai', 'Civil Engineering'),
(6, 'Meera Rao', 'Computer Science'),
(7, 'Vikram Singh', 'Mathematics'),
(8, 'Sanya Kapoor', 'Physics');

select * from students_2024;


-- UNION (Combines result, removes duplicates)

Select student_name, course From students_2023
Union
Select student_name, course From students_2024;


-- UNION ALL (Combines result, keeps duplicates)

Select student_name, course From students_2023
Union all
Select student_name, course From students_2024;

-- INTERSECT (Returns common results from both tables)

Select student_name, course From students_2023
Intersect
Select student_name, course From students_2024;

-- EXCEPT (Returns results in the first table but not in the second)

Select student_name, course From students_2023
except
Select student_name, course From students_2024;
