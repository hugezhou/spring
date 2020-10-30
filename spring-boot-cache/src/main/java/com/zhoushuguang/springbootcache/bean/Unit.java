package com.zhoushuguang.springbootcache.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class Unit{

    @Id
    @Column(name = "ID")
    private String id;

    @Transient
    private String notId;

    /**
     * 联网单位名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 单位编号（合同号）
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 客户类型 0普通 1VIP 2SVIP
     */
    @Column(name = "CUS_TYPE")
    private Integer cusType;

    @Transient
    private String cusTypeKey;

    /**
     * 联系电话
     */
    @Column(name = "LINK_PHONE")
    private String linkPhone;

    /**
     * 联网状态 0未联网 1联网
     */
    @Column(name = "NET_STATE")
    private Integer netState;



    @Transient
    private String netStateStr;

    /**
     * 联网状态 0未联网 1联网
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 纬度
     */
    @Column(name = "LAT")
    private Double lat;

    /**
     * 经度
     */
    @Column(name = "LNG")
    private Double lng;

    /**
     * 区域id
     */
    @Column(name = "REGION_ID")
    private String regionId;

    /**
     * 详细地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 父节点,上级联网单位
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 监管等级
     */
    @Column(name = "SUPERVISE_LEVEL")
    private Integer superviseLevel;

    /**
     * 安全等级
     */
    @Column(name = "SAFE_LEVEL")
    private Integer safeLevel;

    @Transient
    private List<Integer> safeLevelList;

    @Transient
    private String safeLevelKey;

    /**
     * 火灾危险等级
     */
    @Column(name = "FIRE_DANGER_LEVEL")
    private Integer fireDangerLevel;

    /**
     * 法人代表
     */
    @Column(name = "LEGAL_PERSON")
    private String legalPerson;

    /**
     * 法人代表身份证
     */
    @Column(name = "LEGAL_CARD_ID")
    private String legalCardId;

    /**
     * 法人代表电话号码
     */
    @Column(name = "LEGAL_PHONE")
    private String legalPhone;

    /**
     * 消防安全责任人
     */
    @Column(name = "FIRE_SAFE_RESP")
    private String fireSafeResp;

    /**
     * 消防安全责任人身份证号码
     */
    @Column(name = "FIRE_SAFE_RESP_CARD_ID")
    private String fireSafeRespCardId;

    /**
     * 消防安全责任人电话号码
     */
    @Column(name = "FIRE_SAFE_RESP_PHONE")
    private String fireSafeRespPhone;

    /**
     * 消防安全管理人
     */
    @Column(name = "FIRE_SAFE_ADMIN")
    private String fireSafeAdmin;

    /**
     * 消防安全管理人身份证
     */
    @Column(name = "FIRE_SAFE_ADMIN_CARD_ID")
    private String fireSafeAdminCardId;

    /**
     * 消防安全管理人电话号码
     */
    @Column(name = "FIRE_SAFE_ADMIN_PHONE")
    private String fireSafeAdminPhone;

    /**
     * 建筑使用性质
     */
    @Column(name = "BUILD_FEATURE")
    private String buildFeature;

    /**
     * 是否十小场所
     */
    @Column(name = "IS_TEN")
    private Integer isTen;

    /**
     * 统一社会信用代码
     */
    @Column(name = "CREDIT_CODE")
    private String creditCode;

    /**
     * 企业类型 1国企 2私营 3外资
     */
    @Column(name = "ENTERPRISE_TYPE")
    private Integer enterpriseType;

    @Transient
    private String enterpriseTypekey;

    /**
     * 单位成立时间
     */
    @Column(name = "UNIT_CREATE_DATE")
    private Date unitCreateDate;

    /**
     * 职工人数
     */
    @Column(name = "EMPLOYEES")
    private Integer employees;

    /**
     * 固定资产
     */
    @Column(name = "FIXED_ASSETS")
    private Integer fixedAssets;

    /**
     * 备注信息
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 接警时间1立刻接警 2 3分钟 3 5分钟 4 10分钟
     */
    @Column(name = "RECEPTION_TIME")
    private Integer receptionTime;

    /**
     * 合约开始时间
     */
    @Column(name = "CONTRACT_START_DATE")
    private Date contractStartDate;

    /**
     * 合约结束时间
     */
    @Column(name = "CONTRACT_END_DATE")
    private Date contractEndDate;

    /**
     * 付费到期时间
     */
    @Column(name = "PAY_EXPIRE_DATE")
    private Date payExpireDate;

    /**
     * 监控中心
     */
    @Column(name = "CTRL_CENTER_ID")
    private String ctrlCenterId;

    @Transient
    private List<String> ctrlCenterIdList;

    /**
     * 监控中心商务人员
     */
    @Column(name = "CTRL_CENTER_BUSY_ID")
    private String ctrlCenterBusyId;

    /**
     * 备用商务人员信息
     */
    @Column(name = "CTRL_CENTER_BACK_BUSY_ID")
    private String ctrlCenterBackBusyId;

    /**
     * 监控中心技术人员
     */
    @Column(name = "CTRL_CENTER_TECH_ID")
    private String ctrlCenterTechId;

    /**
     * 灭火介质
     */
    @Column(name = "OUTFIRE_MEDIUM")
    private String outfireMedium;

    /**
     * 重点保护区域
     */
    @Column(name = "POINT_AREA")
    private String pointArea;

    /**
     * 危险品
     */
    @Column(name = "DANGER_GOODS")
    private String dangerGoods;

    /**
     * 物业类型
     */
    @Column(name = "PROPERTY_TYPE")
    private Integer propertyType;

    @Transient
    private String propertyTypeKey;

    /**
     * 是否推送给佰慕
     */
    @Column(name = "SEND_BAIMU")
    private Integer sendBaimu;

    /**
     * 最近编辑者
     */
    @Column(name = "LAST_OPERATOR_ID")
    private String lastOperatorId;

    /**
     * 1特种状态 2危化品 3 粉尘涉爆 4浊气监测 5 消防系统 6 电气报警系统 7安监系统 8 环保系统 9 综合治理
     */
    @Column(name = "SPEC_STATUS")
    private Integer specStatus;

    /**
     * 在域人员
     */
    @Column(name = "FILED_COUNT")
    private Integer filedCount;

    /**
     * 常驻人员
     */
    @Column(name = "PERMANENT_COUNT")
    private Integer permanentCount;

    /**
     * 设备数
     */
    @Column(name = "DEVICE_COUNT")
    private Integer deviceCount;

    /**
     * 重点人员管控数
     */
    @Column(name = "POINT_CTRLS")
    private Integer pointCtrls;

    /**
     * 评分
     */
    @Column(name = "SCORE")
    private Integer score;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 是否有平面图 0没有 1有
     */
    @Column(name = "HAS_FLOOR")
    private Integer hasFloor;

    /**
     * 是否有消控室 0没有 1有
     */
    @Column(name = "HAS_FIRE_ROOM")
    private Integer hasFireRoom;

    /**
     * 消防安全责任制
     */
    @Column(name = "FIRE_SAFE_RESP_INFO")
    private String fireSafeRespInfo;

    /**
     * 消防安全管理制度
     */
    @Column(name = "FIRE_SAFE_ADMIN_INFO")
    private String fireSafeAdminInfo;

    /**
     * 消防管理工作和投入
     */
    @Column(name = "FIRE_SAFE_WORK_PUT")
    private String fireSafeWorkPut;

    /**
     * 消防安全责任书
     */
    @Column(name = "FIRE_SAFE_RESP_CERT")
    private String fireSafeRespCert;

    /**
     * 消防安全操作流程
     */
    @Column(name = "FIRE_SAFE_OPER_FLOW")
    private String fireSafeOperFlow;

    /**
     * 年度消防工作计划
     */
    @Column(name = "FIRE_SAFE_YEAR_WORK_PLAN")
    private String fireSafeYearWorkPlan;

    /**
     * 工作会议部署
     */
    @Column(name = "WORK_CONF_DEPLOY")
    private String workConfDeploy;

    /**
     * 总结工作会议
     */
    @Column(name = "WORK_CONF_SUMUP")
    private String workConfSumup;

    /**
     * 消防安全经费投入
     */
    @Column(name = "FIRE_SAFE_FUNDS_PUT")
    private String fireSafeFundsPut;

    /**
     * 人员奖惩
     */
    @Column(name = "EMPLOYEE_RP")
    private String employeeRp;

    /**
     * 岗前培训和定期培训
     */
    @Column(name = "PREJOB_FIX_TRAIN")
    private String prejobFixTrain;

    /**
     * 消防应急预案
     */
    @Column(name = "FIRE_PLAN")
    private String firePlan;

    /**
     * 消防演练
     */
    @Column(name = "FIRE_DRILL")
    private String fireDrill;

    /**
     * 消防设备
     */
    @Column(name = "BUILD_FIRE_DEVICE")
    private String buildFireDevice;

    /**
     * 消防器材台账
     */
    @Column(name = "BUILD_FIRE_DEVICE_BOOK")
    private String buildFireDeviceBook;

    /**
     * 消防检测记录
     */
    @Column(name = "FIRE_DETECTION_RECORD")
    private String fireDetectionRecord;

    @Column(name = "repair_unit_id")
    private String repairUnitId;

    @Column(name = "check_unit_id")
    private String checkUnitId;

    @Transient
    private List<Unit> unitList;

    @Transient
    private List<String> unitIdList;

    @Transient
    private boolean parent;

    @Transient
    private String nameUnit;

    /*********************************/

    /**
     * 维保单位id
     */
    @Column(name = "WEIBAO_ID")
    private String weiBaoId;

    /**
     * 检测单位id
     */
    @Column(name = "JIANCHE_ID")
    private String jianCheId;

    /**
     * 技术人员
     */
    @Transient
    private String  ctrlCentertechStr;

    /**
     * 监控中心
     */
    @Transient
    private String  ctrlCenterStr;
    /**
     * 商务人员
     */
    @Transient
    private String  ctrlCenterBusyStr;
    /**
     * 备用商务人员
     */
    @Transient
    private String  ctrlCenterBackBusyStr;

    /**
     * 上级单位
     */
    @Transient
    private String parentUnitStr;

    /**
     *火灾安全等级
     */
    @Transient
    private String fireDangerLevelStr;

    /**
     * 用户id
     */
    @Transient
    private String userId;

    /**
     * 网关离线数据
     */
    @Transient
    private int gatewayNum;

    /**
     * 当前故障数
     */
    @Transient
    private Integer faultNum;

    /**
     * 所属区域
     */
    @Transient
    private String regionName;

    /**
     * 监管等级key
     */
    @Transient
    private String superviseLevelKey;

    /**
     * 火灾危险等级key
     */
    @Transient
    private String fireDangerLevelKey;

    /**
     * 查询类型 1 法人 2 消防管理员 3消防责任人
     */
    @Transient
    private Integer searchType;

    @Transient
    private String cooperId;

    @Transient
    private String ctrlCenterBusy;

    @Transient
    private String ctrlCenterTech;

    @Transient
    private List<String> ctrlCenterByPid;


    @Transient
    private List<String> selCtrlIdList;

    @Transient
    private Integer onlineCount;


    //************************************ 新增字段 ***************************************//

    /**
     * 房东姓名
     */
    @Column(name = "owner_name")
    private String ownerName;
    /**
     * 房东联系电话
     */
    @Column(name = "owner_phone")
    private String ownerPhone;

    /**
     * 负责人姓名（九小场所）
     */
    @Column(name = "household_name")
    private String householdName;

    /**
     * 负责人电话（九小场所）
     */
    @Column(name = "household_phone")
    private String householdPhone;


    ////////////////////////////  1.常住人口  2.未登记人口  3.重点监护人员 4.流动人口 //////////////////////////////////////

    /**
     * 住户姓名
     */
    @Column(name = "household_name1")
    private String householdName1;
    /**
     * 住户户籍所在地
     */
    @Column(name = "household_location1")
    private String householdLocation1;
    /**
     * 住户身份证号
     */
    @Column(name = "household_ID1")
    private String householdID1;
    /**
     * 住户联系方式
     */
    @Column(name = "household_phone1")
    private String householdPhone1;

    /**
     * 住户与房东的关系
     */
    @Column(name = "relationship1")
    private String relationship1;

    /**
     * 住户姓名
     */
    @Column(name = "household_name2")
    private String householdName2;
    /**
     * 住户户籍所在地
     */
    @Column(name = "household_location2")
    private String householdLocation2;
    /**
     * 住户身份证号
     */
    @Column(name = "household_ID2")
    private String householdID2;
    /**
     * 住户联系方式
     */
    @Column(name = "household_phone2")
    private String householdPhone2;

    /**
     * 住户与房东的关系
     */
    @Column(name = "relationship2")
    private String relationship2;

    /**
     * 住户姓名
     */
    @Column(name = "household_name3")
    private String householdName3;
    /**
     * 住户户籍所在地
     */
    @Column(name = "household_location3")
    private String householdLocation3;
    /**
     * 住户身份证号
     */
    @Column(name = "household_ID3")
    private String householdID3;
    /**
     * 住户联系方式
     */
    @Column(name = "household_phone3")
    private String householdPhone3;

    /**
     * 住户与房东的关系
     */
    @Column(name = "relationship3")
    private String relationship3;

    /**
     * 住户姓名
     */
    @Column(name = "household_name4")
    private String householdName4;
    /**
     * 住户户籍所在地
     */
    @Column(name = "household_location4")
    private String householdLocation4;
    /**
     * 住户身份证号
     */
    @Column(name = "household_ID4")
    private String householdID4;
    /**
     * 住户联系方式
     */
    @Column(name = "household_phone4")
    private String householdPhone4;

    /**
     * 入住时间
     */
    @Column(name = "check_in_time")
    private String checkInTime;
    /**
     * 工作单位
     */
    @Column(name = "work_unit")
    private String workUnit;
    /**
     * 出租房号
     */
    @Column(name = "room_number")
    private String roomNumber;
    /**
     * 所属区域
     */
    @Column(name = "respective_region")
    private String respectiveRegion;
    /**
     * 房产证号
     */
    @Column(name = "house_card_number")
    private String houseCardNumber;
    /**
     * 租房数量
     */
    @Column(name = "house_number")
    private String houseNumber;

    /**
     * 员工人数
     */
    @Column(name = "worker_number")
    private Integer workerNumber;
    /**
     * 持证人数
     */
    @Column(name = "holders_number")
    private Integer holdersNumber;
    /**
     * 可容纳人数
     */
    @Column(name = "accommodating_population")
    private Integer accommodatingPopulation;
    /**
     * 所在建筑物层数
     */
    @Column(name = "floor_number")
    private Integer floorNumber;
    /**
     * 行业类型
     */
    @Column(name = "place_type")
    private Integer placeType;
    /**
     * 所处层数
     */
    @Column(name = "floor")
    private Integer floor;
    /**
     * 建筑面积
     */
    @Column(name = "area")
    private String area;
    /**
     * 所在建筑物高度
     */
    @Column(name = "height")
    private String height;


    ////////////////////////////  单位基本信息补充 //////////////////////////////////////

    /**
     * 注册号
     */
    @Column(name = "registered")
    private String registered;

    /**
     * 经营期限
     */
    @Column(name = "business_period")
    private String businessPeriod;

    /**
     * 经营范围
     */
    @Column(name = "scope_business")
    private String scopeBusiness;

    /**
     * 经营地址
     */
    @Column(name = "registered_address")
    private String registeredAddress;

    /**
     * 占地面积
     */
    @Column(name = "covers_area")
    private String coversArea;

    /**
     * 企业状况
     */
    @Column(name = "business_conditions")
    private String businessConditions;

    /**
     * 登记机关
     */
    @Column(name = "registration_authority")
    private String registrationAuthority;


    /**
     * 经营状况
     */
    @Column(name = "operating_conditions")
    private String operatingConditions;

    /**
     * 单位核心人员信息
     */
    @Column(name = "personnel_information")
    private String personnelInformation;

    /**
     * 发展前景
     */
    @Column(name = "development")
    private String development;

    /**
     * 单位类型
     */
    @Column(name = "unit_type")
    private String unitType;

    /**
     * 邮政编码
     */
    @Column(name = "postal_code")
    private String postalCode;

    /**
     * 消控室电话
     */
    @Column(name = "room_phone")
    private String roomPhone;

    /**
     * 经济所有制
     */
    @Column(name = "economic_ownership")
    private String economicOwnership;

    /**
     * 入网时间
     */
    @Column(name = "net_time")
    private String netTime;

    /**
     * 专兼职消防管理人
     */
    @Column(name = "mtcsol_safe_admin")
    private String mtcsolSafeAdmin;

    /**
     * 专兼职消防管理人身份证
     */
    @Column(name = "mtcsol_safe_admin_card")
    private String mtcsolSafeAdminCard;

    /**
     * 专兼职消防管理人电话
     */
    @Column(name = "mtcsol_safe_admin_phone")
    private String mtcsolSafeAdminPhone;

    /**
     * 重点消防部位
     */
    @Column(name = "key_parts")
    private String keyParts;

    /**
     * 组织机构代码
     */
    @Column(name = "organization_code")
    private String organizationCode;

    /**
     * 接警时间
     */
    @Column(name = "get_alarm_time")
    private String getAlarmTime;

    @Transient
    private String getAlarmTimeStr;

    @Transient
    private String tableName;


    @Column(name = "tech_phone")
    private String techPhone;

    @Column(name = "buss_phone")
    private String bussPhone;

    @Transient
    private List<Integer> gatewayModelList;


}

