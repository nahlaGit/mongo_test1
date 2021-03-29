package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Restaurant;
import com.app.service.IRestaurantService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/restaurant")
@Api( description="API pour es opérations CRUD sur les restaurants.")
public class RestaurantController {

	@Autowired
	IRestaurantService restaurantService;

	@RequestMapping(value ="/listeRestaurant", method= RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Récupèrer liste de tout les restaurants")
	public List<Restaurant> recupererListeRestaurants() {
		return restaurantService.recupererListRestaurant();
	}
	
	
	@RequestMapping(value ="/restaurant/{Id}", method= RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Récupèrer un restaurant par son ID ")
	public  ResponseEntity <Restaurant>  recupererRestaurantParID( @PathVariable(value="Id") String Id)  throws ResourceNotFoundException {
		
		Restaurant restaurant = restaurantService.recupererRestaurantParId(Id) ;
		return ResponseEntity.ok().body(restaurant) ;
	}
}
