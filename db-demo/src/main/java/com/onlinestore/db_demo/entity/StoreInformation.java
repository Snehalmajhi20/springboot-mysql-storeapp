package com.onlinestore.db_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer storeId;
	private String  storeName;
	private String  storeDetail;
	private String storePhoneNumber;
	
	public StoreInformation() {
//		super();
	}

	public StoreInformation(String storeName, String storeDetail, String storePhoneNumber) {
//		super();
//		this.storeIdInteger = storeIdInteger;
		this.storeName = storeName;
		this.storeDetail = storeDetail;
		this.storePhoneNumber = storePhoneNumber;
	}
	@Override
    public String toString() {
        return "StoreInformation{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeDetail='" + storeDetail + '\'' +
                ", storePhoneNumber='"+ storePhoneNumber + '\'' +
                '}';
    }

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreDetail() {
		return storeDetail;
	}

	public void setStoreDetail(String storeDetail) {
		this.storeDetail = storeDetail;
	}

	public String getStorePhoneNumber() {
		return storePhoneNumber;
	}

	public void setStorePhoneNumber(String storePhoneNumber) {
		this.storePhoneNumber = storePhoneNumber;
	}

}
