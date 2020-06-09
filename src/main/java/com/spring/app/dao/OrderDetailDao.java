package com.spring.app.dao;

import org.springframework.stereotype.Repository;

import com.spring.app.model.Category;

@Repository
public interface OrderDetailDao extends GenericDAO<Category, Long> {

}
