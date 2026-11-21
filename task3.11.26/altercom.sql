CREATE DATABASE StafffDB;
USE StafffDB;
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    age INT,
    salary INT
);
INSERT INTO employee VALUES
(101, 'Rahul', 23, 24000),
(102, 'Sneha', 26, 28000),
(103, 'Karthik', 29, 32000),
(104, 'Anu', 24, 26000),
(105, 'Vijay', 27, 35000);
ALTER TABLE employee
ADD phone VARCHAR(15);
ALTER TABLE employee
MODIFY emp_name VARCHAR(100);
ALTER TABLE employee
RENAME COLUMN age TO emp_age;
ALTER TABLE employee
DROP COLUMN phone;
ALTER TABLE employee
RENAME TO staff;
DESC staff;
SELECT * FROM staff;
