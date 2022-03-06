package com.acorn.cherryM;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.cherryM.mybatis.openChatService.openChatService;
import com.acorn.cherryM.openChatDto.openChatDto;

@Controller
public class openChatController {
	
	@Autowired
	private openChatService Service;
	
	@RequestMapping("/uploadchat")
	public void uploadCaht(String mid,String occomment) {
		openChatDto dto=new openChatDto();
		dto.setMid(mid);
		dto.setOccomment(occomment);
		Service.insertText(dto);
	}
	@RequestMapping("/updateBox")
	public ModelAndView updateBox(ModelAndView mView) {
		Service.getList(mView);
		mView.setViewName("openchat/updateBox");
		return mView;
	}
	
}
