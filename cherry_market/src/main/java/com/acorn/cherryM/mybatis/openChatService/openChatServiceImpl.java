package com.acorn.cherryM.mybatis.openChatService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.cherryM.openChatDao.openChatDao;
import com.acorn.cherryM.openChatDto.openChatDto;

@Repository
public class openChatServiceImpl implements openChatService{

	@Autowired
	private openChatDao dao;
	
	@Override
	public void insertText(openChatDto dto) {
		dao.insert(dto);	
	}

	@Override
	public void getList(ModelAndView mView) {
		List<openChatDto> list=dao.getList();
		mView.addObject("list", list);
	}

}
