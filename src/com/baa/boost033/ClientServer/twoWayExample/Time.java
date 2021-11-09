package com.baa.boost033.ClientServer.twoWayExample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	// public static final LocalDateTime TIME = LocalDateTime.now();
	
	public static final String FTIME = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	
}
