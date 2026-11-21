CREATE DATABASE CollegeeJoinDB;
USE CollegeeJoinDB;

CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

INSERT INTO Department VALUES
(201, 'Computer Science'),
(202, 'Information Technology'),
(203, 'Commerce');

INSERT INTO Student VALUES
(1, 'Rahul', 201),
(2, 'Sneha', 202),
(3, 'Karthik', 201),
(4, 'Anu', 203);

INSERT INTO Student VALUES (5, 'Vijay', 205);

SELECT Student.student_name, Department.dept_name
FROM Student
INNER JOIN Department
ON Student.dept_id = Department.dept_id;


DELETE FROM Department
WHERE dept_id = 201;
