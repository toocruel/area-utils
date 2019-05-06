package com.jiutong.utils.area.service;

import com.jiutong.utils.area.model.EntityArea;

import java.util.List;

/**
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:09
 */
public interface AreaService {
    void save(EntityArea entityArea);

    List<EntityArea> findByLevel(int i);

    EntityArea findByCode(Integer parentCode);
}
