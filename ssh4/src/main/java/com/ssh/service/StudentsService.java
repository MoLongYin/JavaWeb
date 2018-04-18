package com.ssh.service;

import com.ssh.dao.StudentsDao;
import com.ssh.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

	@Autowired
	private StudentsDao studentsDao;

	public List<Students> getALll(){
		return studentsDao.getStu();
	}

}
