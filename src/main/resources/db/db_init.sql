DROP SCHEMA if EXISTS students_schema CASCADE;
CREATE SCHEMA students_schema;
CREATE TABLE students_schema.students(
   id SERIAL PRIMARY KEY,
   firstname varchar(50) NOT NULL,
   lastname varchar(50) NOT NULL,
   attended boolean NOT NULL,
   grade int4,
   group_s varchar(50) NOT NULL
);
