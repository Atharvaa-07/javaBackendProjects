package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ApiResponse {
	private String msg;
	private LocalDateTime timeStamp;
		public ApiResponse(String mesg) {
			super();
			this.msg=mesg;
			this.timeStamp=LocalDateTime.now();
		}
}
