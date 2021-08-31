package sample.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.entity.Test;
import sample.mapper.TestMapper;


@Service
public class TestService {
	@Autowired
	TestMapper testMapper;

	public Test getTest(String id) {
		
		//引数からtestテーブルを検索
		Test test = testMapper.getTest(id);
		
//		//取得したentityをJsonに変換して返却
//		ObjectMapper mapper = new ObjectMapper();
//		String testJson = null;
//    	try {
//    		testJson = mapper.writeValueAsString(test);
//    	}catch(Exception e){
//    		e.printStackTrace();
//    	}
    	
    	return test; 
		
		
	}
}
