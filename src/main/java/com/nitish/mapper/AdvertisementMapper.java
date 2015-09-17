package com.nitish.mapper;

import com.nitish.domain.Advertisement;
import com.nitish.dto.UserAdvertisement;
import org.springframework.stereotype.Component;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Component
public class AdvertisementMapper implements Mapper<UserAdvertisement, Advertisement> {
    @Override
    public UserAdvertisement mapToDTO(Advertisement domain) {
        return new UserAdvertisement()
                .builder()
                .id(domain.getID())
                .emailId(domain.getEmailId())
                .advertisementLists(domain.getProducts())
                .build();
    }

    @Override
    public Advertisement mapTODomain(UserAdvertisement userAdvertisement) {
        return new Advertisement()
                .builder()
                .ID(userAdvertisement.getId())
                .emailId(userAdvertisement.getEmailId())
                .products(userAdvertisement.getAdvertisementLists())
                .build();
    }
}
