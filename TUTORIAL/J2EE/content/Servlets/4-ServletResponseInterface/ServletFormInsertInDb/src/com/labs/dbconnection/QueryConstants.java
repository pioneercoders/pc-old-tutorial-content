package com.labs.dbconnection;

public class QueryConstants {
	/*
	 * CREATE TABLE  `jdbc`.`employee_mst_tbl` (
      `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
       `emp_name` varchar(45) NOT NULL,
      `dob` varchar(45) NOT NULL,
      `mail_id` varchar(45) NOT NULL,
      `phoneno` int(20) unsigned NOT NULL,
       PRIMARY KEY (`id`)
       ) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
	 */
	public static final String EMPLOYEE_INSERT = "insert into employee_mst_tbl(id,emp_name,dob,mail_id,phoneno) values(?,?,?,?,?)";

}
