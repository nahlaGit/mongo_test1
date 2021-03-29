package com.app.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Restaurant;

@Repository
public class RestaurantRepository   {
	
	@Autowired
    private MongoTemplate mongoTemplate;

    public List<Restaurant> recupererListeRestaurant() {
        return mongoTemplate.findAll(Restaurant.class);
    }
    
    public Restaurant recupererRestaurantParId(String Id) {
    	 return mongoTemplate.findOne(Query.query(Criteria.where("_id").is(Id)), Restaurant.class, Id);
    }
}
