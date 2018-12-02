/**
 * @author Aishwarya
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city_vault")
public class City_Vault {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CityVault_id;
	private String CityName;
	private String Description;
	
	public Integer getCityVault_id() {
		return CityVault_id;
	}
	public void setCityVault_id(Integer cityVault_id) {
		CityVault_id = cityVault_id;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	@Override
	public String toString() {
		return "CityVault [CityVault_id=" + CityVault_id + ", CityName=" + CityName + ", Description=" + Description
				+ "]";
	}
	
}
