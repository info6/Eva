package com.eva.sso.rpc.service;

import com.eva.sso.dao.repository.BaseRepository;
import com.eva.sso.rpc.api.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T, ID extends Serializable, B extends BaseRepository<T, ID>> implements BaseService<T, ID, B> {

	@Override
	public T save(T t) {
		return getRepository().save(t);
	}

	@Override
	public T saveAndFlush(T t) {
		return getRepository().saveAndFlush(t);
	}

	@Override
	public T getOne(ID id) {
		return getRepository().getOne(id);
	}

	@Override
	public void deleteById(ID id) {
		getRepository().deleteById(id);
	}

	@Override
	public void delete(T t) {
		getRepository().delete(t);
	}

	@Override
	public boolean existsById(ID id) {
		return getRepository().existsById(id);
	}

	@Override
	public long count() {
		return getRepository().count();
	}

	@Override
	public List<T> findAll() {
		return getRepository().findAll();
	}

	@Override
	public List<T> findAll(Sort sort) {
		return getRepository().findAll(sort);
	}

	@Override
	public List<T> findAll(Specification<T> specification) {
		return getRepository().findAll(specification);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	@Override
	public Page<T> findAll(Specification<T> specification, Pageable pageable) {
		return getRepository().findAll(specification, pageable);
	}

}
