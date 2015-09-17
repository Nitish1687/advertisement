package com.nitish.mapper;

/**
 * Created by nsm1211 on 17-09-2015.
 */
public interface Mapper<DTO, Domain> {
   DTO mapToDTO(Domain domain);
   Domain mapTODomain(DTO dto);
}
