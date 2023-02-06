package com.test.architecture.app.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nrt.common.microservice.models.dto.CommonDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestDTO extends CommonDTO {

    private String name;
    private String email;
    private Integer number;

}
