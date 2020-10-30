package com.zhoushugang.springbootquick.model;

import com.loyal.safe.framework.mybatis.BaseEntity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class Floor extends BaseEntity implements Serializable {
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 楼层名称/平面图名称
     */
    @Column(name = "NAME")
    private String name;

    @Transient
    private String fullName;

    /**
     * 联网单位
     */
    @Column(name = "BUILDING_ID")
    private String buildingId;

    @Transient
    private Integer num;

    /**
     * 切片路径
     */
    @Column(name = "cut_dir")
    private String cutDir;

    @Transient
    private boolean picModify;

    @Transient
    private String num1;

    @Transient
    private String num2;

    @Transient
    private String unitId;

    @Transient
    private Building building;

    @Transient
    private SysFile sysFile;

    @Transient
    private List<String> buildingIdList;

    @Transient
    private int totalDevice;

    @Transient
    private int totalPatrolPoint;

    @Transient
    private String warnId;
    @Transient
    private String faultId;
    @Transient
    private List<String> floorIds;
}