package com.jiutong.utils.area.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:02
 */
@Entity
public class EntityArea implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code = 0;
    private Integer parentCode = 0;
    private Integer level = 0;
    private String name = "";

    public EntityArea() {
    }

    public EntityArea(Integer code, Integer parentCode, Integer level, String name) {
        this.code = code;
        this.parentCode = parentCode;
        this.level = level;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public EntityArea(String name) {
        this.name = name;
    }

    public EntityArea(Integer level, String name) {
        this.level = level;
        this.name = name;
    }

    public EntityArea(Integer parentCode, Integer level, String name) {
        this.parentCode = parentCode;
        this.level = level;
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntityArea{" +
                "code=" + code +
                ", parentCode=" + parentCode +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}
