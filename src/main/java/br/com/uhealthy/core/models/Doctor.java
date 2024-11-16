package br.com.uhealthy.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "doctor")
public class Doctor {
	
	private String name;
	private String crm;
	private String email;
	private String telephone;

}
