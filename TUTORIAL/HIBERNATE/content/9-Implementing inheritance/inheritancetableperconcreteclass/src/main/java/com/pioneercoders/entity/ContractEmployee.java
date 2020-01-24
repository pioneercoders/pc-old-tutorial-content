package com.pioneercoders.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="contractemployee")  
@AttributeOverrides({  
    @AttributeOverride(name="EMPLOYEE_ID", column=@Column(name="EMPLOYEE_ID")),  
    @AttributeOverride(name="EMPLOYEE_NAME", column=@Column(name="EMPLOYEE_NAME"))  
})  

public class ContractEmployee  extends Employee{
	@Column(name="PAY_PER_HOUR")  
    private float pay_per_hour;  
      
    @Column(name="CONTRACT_DURATION")  
    private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}  
    
	

}
