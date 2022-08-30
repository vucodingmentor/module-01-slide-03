package com.vu.enumtype;

enum PageInfo {
	PAGE_001("PAGE_001", "Login", "/login"),
	PAGE_002("PAGE_002", "Add new user", "/add-user"),
	PAGE_003("PAGE_003", "List user", "/users");
	
	private String pageId;
	private String pageTitle;
	private String pageUrl;
	
	private PageInfo(String pageId, String pageTitle, String pageUrl) {
		this.pageId = pageId;
		this.pageTitle = pageTitle;
		this.pageUrl = pageUrl;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
}

public class SetEnumValue02 {

	public static void main(String[] args) {
		System.out.println("PageId: " + PageInfo.PAGE_001.getPageId());
		System.out.println("PageIitle: " + PageInfo.PAGE_001.getPageTitle());
		System.out.println("PageUrl: " + PageInfo.PAGE_001.getPageUrl());
	}
}
