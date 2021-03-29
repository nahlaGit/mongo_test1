package com.app.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "grades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
	@DBRef
	private String grade[];
	@DBRef
	private Integer score[];

}
