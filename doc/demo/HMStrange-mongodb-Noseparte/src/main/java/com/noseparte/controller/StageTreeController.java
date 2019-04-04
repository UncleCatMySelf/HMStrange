package com.noseparte.controller;

import com.alibaba.fastjson.JSONObject;
import com.noseparte.api.web.bean.EMsgCode;
import com.noseparte.api.web.bean.ResponseResult;
import com.noseparte.logic.StageTreeShop;
import com.noseparte.service.StageTreeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("/api/tree")
public class StageTreeController extends AbstractController {

    @Autowired
    private StageTreeService stageTreeService;

    @PostMapping("/covers")
    public ResponseResult getStageTreeCovers(
            @RequestParam("pageSize") int pageSize,
            @RequestParam("pageNumber") int pageNumber,
            @RequestParam("storyType") int storyType
    ) {
        if (Objects.isNull(storyType) && storyType < 0) {
            return errorJson(EMsgCode.error);
        }

        List<StageTreeShop> stageTreeShops = stageTreeService.findTreeStages(storyType, pageSize, pageNumber);
        long count = stageTreeService.countByChannel(storyType);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("datas", stageTreeShops);
        jsonObject.put("total", count);
        return successJson(jsonObject);
    }

}
