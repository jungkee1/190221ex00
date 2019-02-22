package org.zerock.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MessageVO;

@Repository
public class MessageDAOImpl implements MessageDAO{
	
	@Inject
	SqlSession sqlSession; //@Inject�� ����  ����ҷ��� root-context.xml�� ��� �ؾ��� 

	@Override
	public void create(MessageVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert("create",vo);
		
	}

	@Override
	public MessageVO readMessage(int mno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateState(int mno) {
		// TODO Auto-generated method stub
		
	}

}
