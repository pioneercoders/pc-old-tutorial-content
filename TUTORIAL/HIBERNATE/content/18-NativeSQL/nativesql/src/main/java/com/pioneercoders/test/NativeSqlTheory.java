package com.pioneercoders.test;

public class NativeSqlTheory {
	
	
	/*  Hibernate also provides feature to write sql queries according to database which are database dependent 
	 *  we can write sql queries using createSqlQuery()
	 *  
	 *  public SQLQuery createSQLQuery(String sqlString) throws HibernateException 
	 *  
	 *   After you pass a string containing the SQL query to the createSQLQuery() method, you can associate the SQL result with either an existing Hibernate entity, a join, or a scalar result using addEntity(), addJoin(), and addScalar() methods respectively.

         Scalar queries:
         The most basic SQL query is to get a list of scalars (values) from one or more tables. Following is the syntax for using native SQL for scalar values:

         String sql = "SELECT first_name, salary FROM EMPLOYEE";
         SQLQuery query = session.createSQLQuery(sql);
         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
         List results = query.list();
         Entity queries:
        The above queries were all about returning scalar values, basically returning the "raw" values from the resultset. The following is the syntax to get entity objects as a whole from a native sql query via addEntity().

        String sql = "SELECT * FROM EMPLOYEE";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Employee.class);
        List results = query.list();
        
        
        after writing sqlqueries  if we want to get list of data we have two approaches 
        
         1) using Scalar Query
         2) using Entity Query 
         
         
         
       
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
