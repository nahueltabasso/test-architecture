package com.test.architecture.app.controllers;

import com.test.architecture.app.models.dto.TestDTO;
import com.test.architecture.app.models.dto.TestFilterDTO;
import com.test.architecture.app.services.TestEntityService;
import nrt.common.microservice.controllers.CommonController;
import nrt.common.microservice.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestEntityController extends CommonController<TestFilterDTO, TestDTO> {

    @Autowired
    private TestEntityService testEntityService;

    @Override
    protected CommonService getCommonService() {
        return this.testEntityService;
    }

}
