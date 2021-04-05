package com.booksalesplatform.service;

import java.util.List;

import com.booksalesplatform.po.BaseModel;
import com.booksalesplatform.po.BookInfo;
import com.booksalesplatform.po.BookTypeInfo;
import com.booksalesplatform.po.ResBaseModel;

public interface BookService {
	
	BookInfo queryBookById(int id);
	
	ResBaseModel queryBooks(BaseModel param);
	
	int addBook(BookInfo bookInfo);
	
	int updateBook(BookInfo bookInfo);
	
	void deleteBook(int bookId);
	
	int addBookType(BookTypeInfo bookTypeInfo);
	
	List<BookTypeInfo> queryAllBookType(BookTypeInfo bookTypeInfo);
	
	int updateBookType(BookTypeInfo bookTypeInfo);
	
	void deleteBookType(int cId);
}
