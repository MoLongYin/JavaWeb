package com.ssh.controller;

import com.ssh.entity.Students;
import com.ssh.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
	@Autowired
	private StudentsService studentsService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	@ResponseBody
	public List<Students> stu(){
		return studentsService.getALll();
	}
}
