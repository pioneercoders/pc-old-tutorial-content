package com.pioneercoders.test;

public class NamedQueriesTheory {
	/*
	 * 
	 * Named Queries are useful to know the purpose of the query ex:
	 * @NamedQuery( name = "findEmployeeByName", (the user can understand this
	 * query is getting information of names) query =
	 * "from Employee e where e.name = :name"
	 * 
	 * The hibernate named query is way to use any query by some meaningful
	 * name. It is like using alias names. The Hibernate framework provides the
	 * concept of named queries so that application programmer need not to
	 * scatter queries to all the java code.
	 * 
	 * There are two ways to define the named query in hibernate:
	 * 
	 * by annotation by mapping file.
	 * 
	 * 
	 * Hibernate Named Query by annotation
	 * 
	 * If you want to use named query in hibernate, you need to have knowledge
	 * of @NamedQueries and @NamedQuery annotations.
	 * 
	 * @NameQueries annotation is used to define the multiple named queries.
	 * 
	 * @NameQuery annotation is used to define the single named query.
	 * 
	 * Let's see the example of using the named queries:
	 * 
	 * @NamedQueries( {
	 * 
	 * @NamedQuery( name = "findEmployeeByName", query =
	 * "from Course c where c.coursename = :name" ) } )
	 */

}
