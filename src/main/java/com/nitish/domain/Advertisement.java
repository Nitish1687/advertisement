package com.nitish.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Advertisement {
    private int ID;
    private String emailId;
    private Collection<String> products = new ArrayList<>();
}
