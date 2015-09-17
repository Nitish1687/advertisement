package com.nitish.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by nsm1211 on 17-09-2015.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("User")
public class UserDTO  implements Serializable{
    private int userId;
    private String name;
    private String emailId;
}
