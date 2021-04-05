package com.booksalesplatform.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksalesplatform.dao.BatchMapper;
import com.booksalesplatform.dao.CarMapper;
import com.booksalesplatform.po.BatchInfo;
import com.booksalesplatform.po.CarModel;
import com.booksalesplatform.service.BatchService;

@Service("batchService")
public class BatchServiceImpl implements BatchService {
	@Autowired
	private BatchMapper batchMapper;
	@Autowired
	private CarMapper carMapper;
	
	public List<Map<String, Object>> queryBtachBook(int carId) {
		return batchMapper.queryBtachBook(carId);
	}

	public int addBatch(BatchInfo batchInfo) {
		return batchMapper.addBatch(batchInfo);
	}

	public int updateBatch(BatchInfo batchInfo) {
		return batchMapper.updateBatch(batchInfo);
	}

	public void deleteBatch(int batchId) {
		batchMapper.deleteBatch(batchId);
	}

	public CarModel queryDoCar(int uId) {
		CarModel car = null;
		car = carMapper.queryDoCar(uId);

		if(car == null) {
			car = new CarModel();
			car.setuId(uId);
			car.setState(0);
			car.setTotal(0);
			carMapper.addCar(car);
		}
		
		return car;
	}

}
