CREATE DATABASE EmployeeLikeDB;
USE EmployeeLikeDB;
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    salary INT
);
INSERT INTO employee VALUES
(1, 'Rahul', 23, 22000),
(2, 'Sneha', 26, 28000),
(3, 'Karthik', 29, 32000),
(4, 'Anu', 24, 26000),
(5, 'Vijay', 27, 35000);


SELECT * FROM employee WHERE name LIKE 'R%';
SELECT * FROM employee WHERE name LIKE '%a';
SELECT * FROM employee WHERE name LIKE '%i%';
SELECT * FROM employee WHERE name LIKE '____';
SELECT * FROM employee WHERE name LIKE 'S%';

SELECT * FROM employee WHERE name NOT LIKE 'R%';
SELECT * FROM employee WHERE name NOT LIKE '%a';
SELECT * FROM employee WHERE name NOT LIKE '%i%';
SELECT * FROM employee WHERE name NOT LIKE '____';
SELECT * FROM employee WHERE name NOT LIKE 'S%';
