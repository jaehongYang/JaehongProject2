package com.jaehong.coin.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//@Repository
public class CustomSettingDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public String getTest() {
		return null;
//		 return sqlSession.selectOne("jaehong.test", null);
	}
	
	
}
