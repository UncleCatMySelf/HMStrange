package com.noseparte.logic;

import com.noseparte.constant.MongoDBConstant;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = MongoDBConstant.StageTreeShop)
public class StageTreeShop {

    private String _id;
    private Long treeId;
    private String name;
    private String textureUrl;
    private String dec;
    private String voiceUrl;
    private Long voiceTime;
    private Boolean isCanCreateBattle;
    private Integer maxEnergy;
    private Integer pce;
    private Integer eri;
    private Integer shareGetEnergy;
    private Integer buyEnergyCost;
    private Integer buyEnergyCostType;
    private Boolean isEnergyRecoveryInterval;
    private Boolean isShareGetEnergy;
    private Integer storyType;
    private Boolean isConditionLimit;
    private Integer conditionType;
    private Integer conditionValue;
    private Boolean isElementLimit1;
    private Boolean isElementLimit2;
    private Integer serial;
    private Long headNodeId;
    private Long createTick;
    private Long submitTick;
    private Long updateTick;
    private Integer isShow;
    private Integer praise;
    private Integer propGetType;
    private Integer isShowStage;
    private Boolean isUsePropLimit;
    private List<Object> Props;




}
