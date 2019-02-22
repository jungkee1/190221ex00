package org.zerock.service;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class PointDAOImpl implements PointDAO{
	
	@Inject
	SqlSession sqlSession;

	@Override
	public void updatePoint(String userid, int point) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<>(); //HashMap�� Map�� ��ӹ��� ������ ������ �̷��� ��� �ص� �ȴ� ^��^&
		map.put("userid",userid);
		map.put("point",point);
		System.out.println("map:" + map);
		sqlSession.update("updatePoint",map);
	}

}
