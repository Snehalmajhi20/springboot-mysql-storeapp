package com.onlinestore.db_demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.onlinestore.db_demo.entity.StoreInformation;

public interface StoreInformationRepository extends CrudRepository<StoreInformation, Integer> {
    List<StoreInformation> findByStoreName(String storeName);
    List<StoreInformation> findByStorePhoneNumber(String storePhoneNumber);
    List<StoreInformation> findByStoreDetail(String storeDetail);
}

