package com.test.architecture.app.services;

import com.test.architecture.app.models.dto.TestDTO;
import com.test.architecture.app.models.entity.TestEntity;
import com.test.architecture.app.models.repository.TestEntityRepository;
import nrt.common.microservice.models.repository.CommonEntityRepository;
import nrt.common.microservice.services.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestEntityServiceImpl extends CommonServiceImpl<TestDTO, TestEntity> implements TestEntityService {

    @Autowired
    private TestEntityRepository testEntityRepository;

    @Override
    protected CommonEntityRepository<TestEntity> getCommonRepository() {
        return this.testEntityRepository;
    }

    @Override
    protected TestEntity dtoToEntity(TestDTO dto) {
        TestEntity entity = new TestEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setNumber(dto.getNumber());
        return entity;
    }

    @Override
    protected TestDTO entityToDto(TestEntity entity) {
        TestDTO dto = new TestDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setNumber(entity.getNumber());
        return dto;
    }


}
