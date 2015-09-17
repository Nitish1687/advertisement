package com.nitish.service;

import com.nitish.domain.Advertisement;
import com.nitish.dto.UserAdvertisement;
import com.nitish.mapper.AdvertisementMapper;
import com.nitish.repository.UserAdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Service
public class UserAdvertisementService {

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Autowired
    private UserAdvertisementRepository userAdvertisementRepository;

    public UserAdvertisement getAdvertisementFor(String emailId) {
        Advertisement advertisementByEmailId = userAdvertisementRepository.getAdvertisementByEmailId(emailId);
       return advertisementMapper.mapToDTO(advertisementByEmailId);
    }
}
