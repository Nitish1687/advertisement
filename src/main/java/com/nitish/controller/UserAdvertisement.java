package com.nitish.controller;

import com.nitish.mapper.UserMapper;
import com.nitish.service.UserAdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@RestController
public class UserAdvertisement {

    @Autowired
    private UserAdvertisementService userAdvertisementService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user/{emailId}/advertisement", method = GET)
    public com.nitish.dto.UserAdvertisement findAdvertisementFor(@PathVariable String emailId) {
        return userAdvertisementService.getAdvertisementFor(emailId);
    }
}
