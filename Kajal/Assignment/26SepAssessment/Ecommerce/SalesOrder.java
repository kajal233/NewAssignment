package com.databaseschema;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SalesOrder")
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer salesOrder_id;

	public Integer getSalesOrder_id() {
		return salesOrder_id;
	}

	public void setSalesOrder_id(Integer salesOrder_id) {
		this.salesOrder_id = salesOrder_id;
	}
}
