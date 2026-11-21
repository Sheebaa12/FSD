CREATE DATABASE EmployeeDropDB;
USE EmployeeDropDB;
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    salary INT
);

INSERT INTO employee VALUES
(101, 'Rahul', 23, 22000),
(102, 'Sneha', 26, 28000),
(103, 'Karthik', 29, 32000),
(104, 'Anu', 24, 26000),
(105, 'Vijay', 27, 35000);

ALTER TABLE employee DROP COLUMN age;

ALTER TABLE employee DROP COLUMN salary;

ALTER TABLE employee DROP PRIMARY KEY;

DROP TABLE employee;

DROP DATABASE EmployeeDropDB;
