package com.pioneercoders.test;

public class HQLTheory {

	/*
	 * HQL (Hibernate Query Language)
	 * 
	 * 
	 * Hibernate Query Language (HQL) is an object-oriented query language,
	 * similar to SQL, but instead of operating on tables and columns, HQL works
	 * with persistent objects and their properties. HQL queries are translated
	 * by Hibernate into conventional SQL queries which in turns perform action
	 * on database.
	 * 
	 * Although you can use SQL statements directly with Hibernate using Native
	 * SQL but we would recommend to use HQL .we directly operate on entity
	 * class variables it internally generates sql queries
	 * 
	 * Advantage of HQL
	 * 
	 * There are many advantages of HQL. They are as follows:
	 * 
	 * database independent 
	 * supports polymorphic queries 
	 * easy to learn for Java Programmer 
	 * 
	 * 
	
	 *
	 *   Ex: If we want to select data from database 
	 *   in sql select * from table_name;
	 *   select * from course_mst_tbl
	 *   it retruns all the data from database 
	 *   
	 *   in hql 
	 *   
	 *   from Entityclassname  ;
	 *   from Course 
	 *   it returns all the data from database 
	 *   
	 *   
	 *    Query Interface

         It is an object oriented representation of Hibernate Query. The object of Query can be obtained by calling the createQuery() method Session interface.

         The query interface provides many methods. There is given commonly used methods:

          public int executeUpdate() is used to execute the update or delete query.
          public List list() returns the result of the ralation as a list.
          public Query setFirstResult(int rowno) specifies the row number from where record will be retrieved.
          public Query setMaxResult(int rowno) specifies the no. of records to be retrieved from the relation (table).
          public Query setParameter(int position, Object value) it sets the value to the JDBC style query parameter.
          public Query setParameter(String name, Object value) it sets the value to a named query parameter.
	 *   
	 *   
	 */

}
