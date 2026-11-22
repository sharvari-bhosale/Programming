select * from employee3;

-- Use AND operator
select * from employee3 
where age >= 40 and salary >= 50000;

-- Use OR operator
select * from employee3 
where age >= 40 or salary >= 50000;

-- Use NOT operator(exclude)
select * from employee3 
where not (department='IT');