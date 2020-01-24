package com.pioneercoders.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="regularemployee")
public class Regular_Employee  extends Employee {
	@Column(name="SALARY")
	private float salary;
	@Column(name="BONUS")
	private int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	/*  Note :Table per hierarchy this approach will have some advantages and disadvantages i'm discussing below 
	 * 
	 *   Single Table Strategy
         In Single table per subclass, the union of all the properties from the inheritance hierarchy is mapped to one table. As all the data goes in one table, a discriminator is used to differentiate between different type of data.
         Advantages of Single Table per class hierarchy

         Simplest to implement.
         Only one table to deal with.
         Performance wise better than all strategies because no joins or sub-selects need to be performed.
         Single Insert is needed to insert data 

         Disadvantages:
         Most of the column of table are nullable so the NOT NULL constraint cannot be applied.
         Tables are not normalized.
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
