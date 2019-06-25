package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="patient_tab")
public class Mirth {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SNO")
	@JsonIgnore
	@ApiModelProperty(hidden=true)
	private Integer serialNo;

	@Column(name="PID")
	private String patientId;

	@Column(name="PNAME")
	private String patientName;



	public Mirth() {
		super();
	}

	public Mirth( String patientId, String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "Mirth [serialNo=" + serialNo + ", patientId=" + patientId + ", patientName=" + patientName + "]";
	}
}
