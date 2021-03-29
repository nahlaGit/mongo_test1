package com.app.service;

import java.util.List;

import com.app.model.Restaurant;

public interface IRestaurantService {
	
	/* récupérer liste des restaurants disponibles*/
	List<Restaurant> recupererListRestaurant();
	
	Restaurant recupererRestaurantParId(String Id);
}
