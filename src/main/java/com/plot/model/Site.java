package com.plot.model;

public class Site {
	
	private int siteNo;
    private String isRegistered;
    private String userId;

    public Site() {

    }

    public Site(int siteNo, String isRegistered, String userId) {
        this.siteNo = siteNo;
        this.isRegistered = isRegistered;
        this.userId = userId;
    }

	public int getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(int siteNo) {
		this.siteNo = siteNo;
	}

	public String getIsRegistered() {
		return isRegistered;
	}

	public void setIsRegistered(String isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
