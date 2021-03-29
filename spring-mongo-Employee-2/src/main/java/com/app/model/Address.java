package com.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "address")
@ApiModel(description = "address model")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@ApiModelProperty(value = "building")
	private String building;
	
	@ApiModelProperty(value = "street")
	private String street;
	
	@ApiModelProperty(value = "zipcode")
	private String zipcode;
	
	@ApiModelProperty(value = "coord")
	private Double coord[];

}
