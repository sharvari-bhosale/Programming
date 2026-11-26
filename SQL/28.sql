CREATE TABLE employee4(
	employee_id SERIAL PRIMARY KEY,
	first_name varchar(50),
	last_name varchar(50),
	department_id int
);

INSERT INTO employee4(first_name, last_name, department_id) VALUES
('Rahul','Sharma',101),
('Priya','Mehta',102),
('Ankit','Verma',103),
('Simran','Kaur',NULL),
('Aman','Singh',101);

SELECT * FROM employee4;





CREATE TABLE Departments(
	department_id int PRIMARY KEY,
	department_name varchar(50)
);

INSERT INTO Departments(department_id, department_name) VALUES
(101,'Sales'),
(102,'Marketing'),
(103,'IT'),
(104,'HR');

SELECT * FROM Departments;



-- Inner joins

SELECT 












