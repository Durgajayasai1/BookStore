package com.klef.jfsd.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.entity.MyBookList;
import com.klef.jfsd.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	MyBookRepository mybookrepo;
	
	public void saveMyBook(MyBookList mybook) {
		mybookrepo.save(mybook);
	}
	
	public List<MyBookList> getAllBooks(){
		return mybookrepo.findAll();
	}
	
	public void deleteById(int id) {
		mybookrepo.deleteById(id);
	}
}
