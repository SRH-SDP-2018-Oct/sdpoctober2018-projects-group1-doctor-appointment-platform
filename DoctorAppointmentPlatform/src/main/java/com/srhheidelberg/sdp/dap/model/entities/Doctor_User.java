/**
 * @author Sunny
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor_User")
public class Doctor_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="DoctorUser_Id")
	private Integer doctorUserId;
	
	@Column(name="LastName")
	private String lastName;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="AddressLine1")
	private String addressLine1;

	@Column(name="AddressLine2")
	private String addressLine2;

	@Column(name="PostalCode")
	private Integer postalCode;

	@Column(name="Contact")
	private Integer contact;
	
	@OneToOne
    @JoinColumn(name = "doctorTypeId")
	@Column(name="DoctorType_Id")
	private Integer doctorTypeId;
	
	@Column(name="Experience")
	private String experience;
	
	@Column(name="Fees")
	private Integer fees;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="OverallRating")
	private Integer overallRating;
	
	@Column(name="Sunday")
	private Boolean sunday;
	
	@Column(name="Monday")
	private Boolean monday;
	
	@Column(name="Tuesday")
	private Boolean tuesday ;
	
	@Column(name="Wednesday")
	private Boolean wednesday;
	
	@Column(name="thursday")
	private Boolean Thursday ;
	
	@Column(name="Friday")
	private Boolean friday;

	@Column(name="Saturday")
	private Boolean saturday;
	
	@Override
	public String toString() {
		return "DoctorUser [DoctorUser_Id=" + doctorUserId + ", LastName=" + lastName + ", FirstName=" + firstName
				+ ", AddressLine1=" + addressLine1 + ", AddressLine2=" + addressLine2 + ", PostalCode=" + postalCode
				+ ", Contact=" + contact + ", DoctorType_Id=" + doctorTypeId + ", Experience=" + experience + ", Fees="
				+ fees + ", Gender=" + gender + ", Password=" + password + ", OverallRating=" + overallRating
				+ ", Sunday=" + sunday + ", Monday=" + monday + ", Tuesday=" + tuesday + ", Wednesday=" + wednesday
				+ ", Thursday=" + Thursday + ", Friday=" + friday + ", Saturday=" + saturday + "]";
	}
	
}
