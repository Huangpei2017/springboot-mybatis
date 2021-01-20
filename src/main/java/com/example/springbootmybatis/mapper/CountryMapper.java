package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {
	/**
	 * 查询全部数据
	 * 
	 * @return
	 */
	List<Country> selectAll();
}
