select * from employee3;

-- 1) Retrieve employees whose salary is between 40,000 and 60,000. - Use BETWEEN Operator.

select * 
from employee3 
where salary between 40000 and 60000;

-- 2) Find employees whose email addresses end with gmail.com - Use LIKE Operator

select * 
from employee3 
where email like '%@gmail.com';

-- 3) Retrieve employees who belong to either the 'Operations' or 'HR' departments - Use IN Operator

select * 
from employee3 
where department in ('Operations','HR');