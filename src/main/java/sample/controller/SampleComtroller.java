package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.entity.Test;
import sample.service.TestService;

@RestController
public class SampleComtroller {
	@Autowired
    TestService testService;

	Test test;
	@GetMapping("/user")
    public Test getTest(@RequestParam(value = "id", defaultValue = "10")String id){
		test = testService.getTest(id);
		return test;
    }
    
}
