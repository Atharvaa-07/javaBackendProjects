package com.app.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AuthResp {
	private String tname;
	private int qty;	
	private double price;	
	private String desc;
}
