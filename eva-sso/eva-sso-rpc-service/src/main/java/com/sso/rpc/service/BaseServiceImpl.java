package com.sso.rpc.service;

import com.eva.sso.dao.repository.BaseRepository;
import com.eva.sso.rpc.api.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

	private final BaseRepository<T, ID> baseRepository;

	@Autowired
	public BaseServiceImpl(BaseRepository<T, ID> baseRepository) {
		this.baseRepository = baseRepository;
	}

	@Override
	public T save(T t) {
		return baseRepository.save(t);
	}

	@Override
	public T saveAndFlush(T t) {
		return baseRepository.saveAndFlush(t);
	}

	@Override
	public T getOne(ID id) {
		return baseRepository.getOne(id);
	}

	@Override
	public void deleteById(ID id) {
		baseRepository.deleteById(id);
	}

	@Override
	public void delete(T t) {
		baseRepository.delete(t);
	}

	@Override
	public boolean existsById(ID id) {
		return baseRepository.existsById(id);
	}

	@Override
	public long count() {
		return baseRepository.count();
	}

	@Override
	public List<T> findAll() {
		return baseRepository.findAll();
	}

	@Override
	public List<T> findAll(Sort sort) {
		return baseRepository.findAll(sort);
	}

	@Override
	public List<T> findAll(Specification<T> specification) {
		return baseRepository.findAll(specification);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return baseRepository.findAll(pageable);
	}

	@Override
	public Page<T> findAll(Specification<T> specification, Pageable pageable) {
		return baseRepository.findAll(specification, pageable);
	}
}
