package com.nitish.mapper;

import com.nitish.domain.UserDomain;
import com.nitish.dto.UserDTO;
import org.springframework.stereotype.Component;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Component
public class UserMapper implements Mapper<UserDTO, UserDomain> {
    @Override
    public UserDTO mapToDTO(UserDomain domain) {
        return new UserDTO()
                .builder()
                .userId(domain.getUserId())
                .name(domain.getName())
                .emailId(domain.getEmailId())
                .build();
    }

    @Override
    public UserDomain mapTODomain(UserDTO userDTO) {
            return  new UserDomain()
                    .builder()
                    .userId(userDTO.getUserId())
                    .name(userDTO.getName())
                    .emailId(userDTO.getEmailId())
                    .build();
    }
}
