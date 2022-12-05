package com.app.bobedst.repository;

import com.app.bobedst.model.ApartmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentInfoRepository extends JpaRepository<ApartmentInfo, Long> {
}
