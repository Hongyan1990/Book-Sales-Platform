package com.booksalesplatform.service;

import com.booksalesplatform.po.BookInfo;
import com.booksalesplatform.po.UserInfo;

public interface UserService {
	UserInfo getUserById(int uid);
	int addUser(UserInfo userInfo);
	void updateUser(UserInfo userInfo);
//	BookInfo queryBookById(int id);
}
