package com.plot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

@Repository
@Document(collection = "sites")
public class SiteModel {
	
	private int siteNo;
	
    private Boolean isRegistered;
    
    @Id
    private String userId;
    
    private Double contactNo;
    
    private String name;

	public SiteModel() {

    }

    public SiteModel(int siteNo, Boolean isRegistered, String userId, Double contactNo, String name) {
        this.siteNo = siteNo;
        this.isRegistered = isRegistered;
        this.userId = userId;
        this.contactNo = contactNo;
        this.name = name;
    }

	public int getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(int siteNo) {
		this.siteNo = siteNo;
	}

	public Boolean getIsRegistered() {
		return isRegistered;
	}

	public void setIsRegistered(Boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Double getContactNo() {
		return contactNo;
	}

	public void setContactNo(Double contactNo) {
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
