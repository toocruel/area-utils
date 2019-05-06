package com.jiutong.utils.area.repository;

import com.jiutong.utils.area.model.EntityArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:03
 */
@Repository
public interface AreaRepository  extends JpaRepository<EntityArea, Integer>, JpaSpecificationExecutor<EntityArea> {
    List<EntityArea> findAllByLevel(int level);

    EntityArea findOneByCode(Integer parentCode);
}
