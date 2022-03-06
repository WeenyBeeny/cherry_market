package com.acorn.cherryM;

import javax.servlet.http.HttpServletRequest;

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
	public String uploadCaht(String data) {
		String[] datas=data.split("!!!seperate!!!");
		String mid=datas[0];
		String occomment=datas[1];
		openChatDto dto=new openChatDto();
		dto.setMid(mid);
		dto.setOccomment(occomment);
		Service.insertText(dto);
		return "openchat/n";
	}
	@RequestMapping("/updateBox")
	public ModelAndView updateBox(ModelAndView mView) {
		Service.getList(mView);
		mView.setViewName("openchat/updateBox");
		return mView;
	}
	
}
