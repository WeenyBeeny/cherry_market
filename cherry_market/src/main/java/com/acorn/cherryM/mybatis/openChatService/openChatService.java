package com.acorn.cherryM.mybatis.openChatService;

import org.springframework.web.servlet.ModelAndView;

import com.acorn.cherryM.openChatDto.openChatDto;

public interface openChatService {
	public void insertText(openChatDto dto);
	public void getList(ModelAndView mView);
}
