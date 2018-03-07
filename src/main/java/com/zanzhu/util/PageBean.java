package com.zanzhu.util;

public class PageBean {

	int currentPage;
	int totalRecord;
	int totalPage;
	int currentRecord;
	public int getNextPage(){
		if(currentPage+1>totalPage){
			return currentPage;
		}
		return currentPage+1;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public int getCurrentRecord() {
		return currentRecord;
	}
	public void setCurrentRecord(int currentRecord) {
		this.currentRecord = currentRecord;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
}
