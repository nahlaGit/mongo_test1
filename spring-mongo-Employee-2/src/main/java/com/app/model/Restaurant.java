package com.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection = "restaurant")
@ApiModel(description = "restaurant model")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

	@Id
	@ApiModelProperty(value = "id ", accessMode = AccessMode.READ_ONLY)
	private String restaurant_id;;
	
	@ApiModelProperty(value = "borough")
	private String borough;
	
	@ApiModelProperty(value = "cuisine")
	private String cuisine;

	@ApiModelProperty(value = "name")
	private String name;
	
	@ApiModelProperty(value = "address")
	private Address address;

	@DBRef
	@ApiModelProperty(value = "grades")
	private List<Grade> grades;
}
