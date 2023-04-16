DROP SCHEMA if EXISTS students_schema CASCADE;
CREATE SCHEMA students_schema;
CREATE TABLE students_schema.students(
   id SERIAL PRIMARY KEY,
   firstname varchar(50) NOT NULL,
   lastname varchar(50) NOT NULL,
   patronymic varchar(50),
   birth_date date NOT NULL,
   group_s varchar(50) NOT NULL
);
