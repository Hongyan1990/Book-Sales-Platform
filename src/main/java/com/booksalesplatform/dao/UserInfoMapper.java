package com.booksalesplatform.dao;

import com.booksalesplatform.po.BookInfo;
import com.booksalesplatform.po.UserInfo;

public interface UserInfoMapper {
	UserInfo selectUserById(int uid);
	int addUser(UserInfo userInfo);
	void updateUser(UserInfo userInfo);
//	BookInfo queryBookById(int id);
}
