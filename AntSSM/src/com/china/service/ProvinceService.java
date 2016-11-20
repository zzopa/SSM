package com.china.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.dao.ProvinceMapper;
import com.china.entity.Province;

@Service
public class ProvinceService {
  @Autowired
	private ProvinceMapper provincedao;

public ProvinceMapper getProvincedao() {
	return provincedao;
}

public void setProvincedao(ProvinceMapper provincedao) {
	this.provincedao = provincedao;
}
public Province findById(int id){
	return provincedao.selectByPrimaryKey(id);
}
}
