package com.jiutong.utils.area.service.impl;

import com.jiutong.utils.area.model.EntityArea;
import com.jiutong.utils.area.repository.AreaRepository;
import com.jiutong.utils.area.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 地区 service
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:09
 */
@Service
@Slf4j
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public void save(EntityArea entityArea) {
        areaRepository.save(entityArea);
    }

    @Override
    public List<EntityArea> findByLevel(int level) {
        return areaRepository.findAllByLevel(level);
    }

    @Override
    public EntityArea findByCode(Integer parentCode) {
        return areaRepository.findOneByCode(parentCode);
    }
}
