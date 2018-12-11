/**
 * 
 */
package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author kaust
 *
 */
@Entity
@Table(name="cityvault")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CityVault {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cityid")
	private Integer cityId;
	
	@Column(name="cityname")
	private String cityName;
	
	@Column(name="citydescription")
	private String cityDescription;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityDescription() {
		return cityDescription;
	}

	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	@Override
	public String toString() {
		return "CityVault [cityId=" + cityId + ", cityName=" + cityName + ", cityDescription=" + cityDescription + "]";
	}

}
