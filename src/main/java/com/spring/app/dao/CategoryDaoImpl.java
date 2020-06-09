package com.spring.app.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.app.model.Category;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Category> findAll() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Category findOne(Category t) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Category findById(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void update(Category entity) {
	// TODO Auto-generated method stub

    }

    @Override
    public void delete(Category entity) {
	// TODO Auto-generated method stub

    }

    @Override
    public void deleteByKey(Long id) {
	// TODO Auto-generated method stub

    }

    @Override
    public void create(Category entity) {
	// TODO Auto-generated method stub

    }

}
