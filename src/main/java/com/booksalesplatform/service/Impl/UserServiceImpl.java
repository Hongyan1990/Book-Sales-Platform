package com.booksalesplatform.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksalesplatform.dao.UserInfoMapper;
import com.booksalesplatform.po.BookInfo;
import com.booksalesplatform.po.UserInfo;
import com.booksalesplatform.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserById(int uid) {
		return userInfoMapper.selectUserById(uid);
	}
	
	public int addUser(UserInfo userInfo) {
		userInfoMapper.addUser(userInfo);
		return userInfo.getUid();
	}
	
	public void updateUser(UserInfo userInfo) {
		userInfoMapper.updateUser(userInfo);
	}

//	public BookInfo queryBookById(int id) {
//		
//		return userInfoMapper.queryBookById(id);
//	}
	
	

}
