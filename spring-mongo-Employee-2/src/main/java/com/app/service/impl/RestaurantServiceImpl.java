package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Restaurant;
import com.app.repository.RestaurantRepository;
import com.app.service.IRestaurantService;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Service
public class RestaurantServiceImpl implements IRestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Override
	public List<Restaurant> recupererListRestaurant() {
		 
		return restaurantRepository.recupererListeRestaurant();
	}
	
	@Override
	public Restaurant recupererRestaurantParId(String Id) {
		return restaurantRepository.recupererRestaurantParId(Id);
	}

}
