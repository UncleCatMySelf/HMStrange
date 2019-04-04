package com.noseparte.dao;

import com.noseparte.logic.StageTreeShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StageTreeDao {

    @Autowired
    protected MongoTemplate mongoTemplate;

    public List<StageTreeShop> findTreeStages(int storyType, int pageSize, int pageNumber) {
        Query query = new Query();
        query.addCriteria(Criteria.where("isShow").is(1));      //标识未下架的
        if(storyType > 0){
            query.addCriteria(Criteria.where("storyType").is(storyType));      //标识未下架的
        }
        query.skip((pageNumber - 1) * pageSize).limit(pageSize);        // 分页
        return mongoTemplate.find(query, StageTreeShop.class);
    }

    public long countByChannel(int storyType) {
        Query query = new Query();
        query.addCriteria(Criteria.where("isShow").is(1));      //标识未下架的
        if(storyType > 0){
            query.addCriteria(Criteria.where("storyType").is(storyType));      //标识未下架的
        }
        return mongoTemplate.count(query, StageTreeShop.class);
    }
}
