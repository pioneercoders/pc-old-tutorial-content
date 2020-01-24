package com.pioneercoders.entity;

public class InheritanceMappingTheory {

	/*   In hibernate we can map inheritance relationships also 
	 * 
	 * 
	 *  We know inheritance functionality 
	 *  
	 *  if we need features are functionality  that already present in base class or parent simply we can inherit that class on top of that we can add additional features 
	 * 
	 *  ex: In employee class 
	 *   public class {
	 *   int empId;
	 *   String empname ;
	 *   
	 *   it is common for every employee if we want we can inherit and  add other functionality
	 *   
	 *   ContractEmployee extends Employee     RegularEmployee extends Employee 
	 *   float pay_per_hour                           float salary 
	 *   int contract_period                          int bonus 
	 *   
	 *   
	 *   
	 *   for contract employee empId ,empname same but salary may be different from regular employee  for this   Scenario we are applying Inheritance mapping 
	 *   
	 *   we can map inheritance mapping in three strategies 
	 *   
	 *       Table Per Hierarchy
             Table Per Concrete class
             Table Per Subclass
             
             
	 *      In Table Per Hierarchy we need only single table to map the whole hierarchy to identify the data belongs to which class in single table we are adding additional column Discriminator column 
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
