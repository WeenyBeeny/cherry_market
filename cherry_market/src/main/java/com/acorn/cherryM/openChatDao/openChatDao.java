package com.acorn.cherryM.openChatDao;

import java.util.List;

import com.acorn.cherryM.openChatDto.openChatDto;

public interface openChatDao {
	public List<openChatDto> getList();
	public void insert(openChatDto dto);
}
