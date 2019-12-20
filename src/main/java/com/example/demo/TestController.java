package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private ConnectWebSocket connect;

	@GetMapping(path = "/test")
	public void test() {
		System.out.println(connect.getStompSession().isConnected());
	}
}
