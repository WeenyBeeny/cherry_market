package com.acorn.cherryM.openChatDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.cherryM.openChatDto.openChatDto;

@Repository
public class openChatDaoImpl implements openChatDao{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<openChatDto> getList() {
		List<openChatDto> list = session.selectList("openChat.selectList");
		return list;
	}

	@Override
	public void insert(openChatDto dto) {
		session.insert("openChat.insert",dto);		
	}
	
}
