package com.booksalesplatform.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksalesplatform.dao.BookMapper;
import com.booksalesplatform.po.BaseModel;
import com.booksalesplatform.po.BookInfo;
import com.booksalesplatform.po.BookTypeInfo;
import com.booksalesplatform.po.ResBaseModel;
import com.booksalesplatform.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;

	public BookInfo queryBookById(int id) {
		return bookMapper.queryBookById(id);
	}

	public ResBaseModel queryBooks(BaseModel param) {
		param.setStartNum(param.getPageNo()>0 ? (param.getPageNo()-1)*param.getPageSize() : 0);
		ResBaseModel res = new ResBaseModel();
		Map<String, Object> page = new HashMap<String, Object>();
		
		List<Map<String, Object>> list = bookMapper.queryBooks(param);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("list", list);
		long count = bookMapper.queryBookCount(param);
		page.put("pageNo", param.getPageNo());
		page.put("total", count);
		res.setData(data);
		res.setState("SUCCESS");
		res.setPageination(page);
		return res;
	}

	public int addBook(BookInfo bookInfo) {
		bookMapper.addBook(bookInfo);
		return bookInfo.getBookId();
	}

	public int updateBook(BookInfo bookInfo) {
		bookMapper.updateBook(bookInfo);
		return bookInfo.getBookId();
	}

	public void deleteBook(int bookId) {
		bookMapper.deleteBook(bookId);
	}

	public int addBookType(BookTypeInfo bookTypeInfo) {
		bookMapper.addBookType(bookTypeInfo);
		return bookTypeInfo.getcId();
	}

	public List<BookTypeInfo> queryAllBookType(BookTypeInfo bookTypeInfo) {
		return bookMapper.queryAllBookType(bookTypeInfo);
	}

	public int updateBookType(BookTypeInfo bookTypeInfo) {
		return bookMapper.updateBookType(bookTypeInfo);
	}

	public void deleteBookType(int cId) {
		bookMapper.deleteBookType(cId);
	}

}
