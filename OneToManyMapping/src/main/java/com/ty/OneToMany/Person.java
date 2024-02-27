package com.ty.OneToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int pId;
	private String pName;
	private long pContact;
	
	@OneToMany(mappedBy = "p")
	private List<Vehicle> listVehicle=new ArrayList<Vehicle>();

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public long getpContact() {
		return pContact;
	}

	public void setpContact(long pContact) {
		this.pContact = pContact;
	}

	public List<Vehicle> getListVehicle() {
		return listVehicle;
	}

	public void setListVehicle(List<Vehicle> listVehicle) {
		this.listVehicle = listVehicle;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + ", listVehicle=" + listVehicle
				+ "]";
	}
	
	
	
}
