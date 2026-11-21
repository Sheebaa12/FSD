CREATE DATABASE EmployeeDB;
USE EmployeeDB;
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary INT
);
INSERT INTO employee VALUES
(101, 'Rahul', 22000),
(102, 'Sneha', 28000),
(103, 'Karthik', 32000),
(104, 'Anu', 38000);
SELECT * FROM employee;
SELECT COUNT(*) AS Employee_Count
FROM employee;
SELECT SUM(salary) AS Salary_Total
FROM employee;
SELECT AVG(salary) AS Salary_Average
FROM employee;
SELECT MAX(salary) AS Highest_Salary
FROM employee;
SELECT MIN(salary) AS Lowest_Salary
FROM employee;
