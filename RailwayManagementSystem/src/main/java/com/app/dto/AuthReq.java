package com.app.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AuthReq {
		
		@NotBlank(message = "Train Name should not be empty!!!")
		private String tname;
		
}
