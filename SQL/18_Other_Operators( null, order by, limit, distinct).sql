select * from employee3;

-- Find employees where the email column is NULL (if applicable)
select * from employee3 
where email is null;

-- List employees sorted by salary in DESCENDING order (ORDER BY)
select first_name, last_name, salary from employee3 
order by salary desc;

-- Retrieve the first 3 highest-paid employees (LIMIT)
select first_name, last_name, salary from employee3
order by salary desc
limit 3;

-- Retrieve a list of unique departments (DISTINCT)

select distinct department
from employee3;

select count (distinct department) as dept_distinct_count
from employee3;