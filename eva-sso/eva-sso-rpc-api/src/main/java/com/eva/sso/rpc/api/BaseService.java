package com.eva.sso.rpc.api;

import com.eva.sso.dao.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable, B extends BaseRepository<T, ID>> {

	B getRepository();

	T save(T t);

	T saveAndFlush(T t);

	T getOne(ID id);

	void deleteById(ID id);

	void delete(T t);

	boolean existsById(ID id);

	long count();

	List<T> findAll();

	List<T> findAll(Sort sort);

	List<T> findAll(Specification<T> specification);

	Page<T> findAll(Pageable pageable);

	Page<T> findAll(Specification<T> specification, Pageable pageable);

}
