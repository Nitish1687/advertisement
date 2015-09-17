package com.nitish.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("UserAdvertisement")
public class UserAdvertisement implements Serializable{
    private int id;
    private String emailId;
    Collection<String> advertisementLists;
}
