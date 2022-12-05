package com.app.bobedst.service;

import com.app.bobedst.model.ApartmentInfo;
import com.app.bobedst.repository.ApartmentInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class ApartmentInfoService implements IApartmentInfoService {

    private ApartmentInfoRepository apartmentInfoRepository;

    @Override
    public Set<ApartmentInfo> findAll() {
        return null;
    }

    @Override
    public ApartmentInfo save(ApartmentInfo info) {
        apartmentInfoRepository.save(info);
        return info;
    }

    @Override
    public Optional<ApartmentInfo> findById(Long id) {
        return apartmentInfoRepository.findById(id);
    }

    @Override
    public void delete(ApartmentInfo object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public ApartmentInfo update(ApartmentInfo object) {
        return null;
    }
}
