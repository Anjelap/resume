package com.example.resume.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="resume")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;

    private int age;

    private Long phone;
	
	private String email;
	
	private String department;

    private String city;

    private String areaofinterest;

    private int cgpa;
    
}
