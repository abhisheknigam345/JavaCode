package com;

public class SqlContent {
	
	create table EMPLOYEE(
			EMPLOYEE_ID int primary key,
			EMPLOYEE_NAME varchar2(256),
			GENDER varchar2(256),
			DESIGNATION varchar2(256),
			EMAIL varchar2(256)
			);
			insert into EMPLOYEE(EMPLOYEE_ID,EMPLOYEE_NAME,GENDER,DESIGNATION,EMAIL)values(1,'ABC','MALE','ASE','acc@gmail.com');
			select * from EMPLOYEE;
			create table emp(
			id int primary key,
			age int
			);
			drop table emp;
			insert into emp(id,age)values(1,10);
			select * from emp;

}
