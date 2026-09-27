package com.placement.placement_management.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



	@Entity
	public class Certificate{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Integer year;
	    @ManyToOne
	    private College college;

	    public Certificate() {
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Integer getYear() {
	        return year;
	    }

	    public void setYear(Integer year) {
	        this.year = year;
	    }
	    public College getCollege() {
	        return college;
	    }
	    public void setCollege(College college) {
	        this.college = college;
	    }
	}
