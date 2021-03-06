package com.pioneercoders.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="regularemployee_sub_tbl")  
@PrimaryKeyJoinColumn(name="ID")  
public class RegularEmployee extends Employee{  
      
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

}

  