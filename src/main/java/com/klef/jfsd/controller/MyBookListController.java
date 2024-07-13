package com.klef.jfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.klef.jfsd.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	MyBookListService myblist;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		myblist.deleteById(id);
		return "redirect:/my_books";
	}
}
