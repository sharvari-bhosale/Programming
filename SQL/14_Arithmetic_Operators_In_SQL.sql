select * from employee3;

--	Arithmetic Operator

-- Retrieve first_name, salary and calculate 10% bonus on the salary
select first_name, salary, (salary*0.10) as bonus
from employee3;

-- Calculate the annual salary and salary increment by 5% -show the monthly new salary as well
select first_name, last_name, salary,
		(salary*12) as annual_salary,
		(salary*0.05) as increment_salary,
		(salary + salary*0.5) as new_salary
from employee3;