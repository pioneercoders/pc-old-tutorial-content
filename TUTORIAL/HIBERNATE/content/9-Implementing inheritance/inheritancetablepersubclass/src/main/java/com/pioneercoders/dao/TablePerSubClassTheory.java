package com.pioneercoders.dao;

public class TablePerSubClassTheory {
	/*
	 * in case of table per subclass strategy, tables are created as per
	 * persistent classes but they are related using primary and foreign key. So
	 * there will not be duplicate columns in the relation.
	 * 
	 * 
	 * To do table per subclass we have to follow the strategy
	 * 
	 * We need to specify @Inheritance(strategy=InheritanceType.JOINED) in the
	 * parent class and @PrimaryKeyJoinColumn annotation in the subclasses.
	 * 
	 * 
	 * Note : With this approach we have some pros and cons
	 * 
	 * With Joined Strategy It's highly normalized but performance is not good.
	 * Advantage: Tables are normalized. 
	 * Able to define NOT NULL constraint.
	 * 
	 * Disadvantage: Does not perform as well as SINGLE_TABLE strategy
	 */

}
