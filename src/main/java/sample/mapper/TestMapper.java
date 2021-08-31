package sample.mapper;

import org.apache.ibatis.annotations.Mapper;

import sample.entity.Test;

@Mapper
public interface TestMapper {
	//1件検索
	Test getTest(String id);
}
