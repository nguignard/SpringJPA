package com.spring.app.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.app.model.Category;

@Repository
@Transactional
public interface OrderDao extends GenericDAO<Category, Long> {

}
