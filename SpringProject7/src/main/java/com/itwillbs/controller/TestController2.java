package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController2 {

	@RequestMapping(value = "/test2")
	public void test2() {
		// ��� �Ϸ�
	}
	@RequestMapping(value = "/test3")
	public void test3() {
		// ��� �Ϸ�
	}
	@RequestMapping(value = "/test4")
	public void test4() {
		// ��� �Ϸ�
	}

	@RequestMapping(value = "/test5")
	public void test5_home() {
		// ������ ��� �����Ϸ�
	}

}
