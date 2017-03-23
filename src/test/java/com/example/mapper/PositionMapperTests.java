package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Player;
import com.example.domain.Position;
import com.example.util.Pagination;


@SpringBootTest
@RunWith(SpringRunner.class)
public class PositionMapperTests {

	@Autowired
	PlayerMapper plyMapper;
	
	@Autowired
	PositionMapper posMapper;
	
	@Test
	public void test00_comfirmplyMapper(){
		System.out.println(plyMapper);
	}
	
	@Test
	public void test00_comfirmPosMapper(){
		System.out.println(posMapper);
	}
	
	@Test
	public void test00_comfirmTotalCount(){
		System.out.println(posMapper.selectTotalCount());
	}
	@Test
	public void test01_selectAll(){
		List<Position> pp = posMapper.selectAll();
		for(Position p : pp)
		System.out.println(p);
				
	}
	@Test
	public void test02_selectPage(){
		Pagination paging = new Pagination();
		paging.setTotalItem(posMapper.selectTotalCount());
		paging.setPageNo(1);
		
		List<Position> pp = posMapper.selectPage(paging);
		for(Position p:pp)
			System.out.println(p);
		
	}
	
	@Test
	public void test03_selectByPstno(){
		Position pos = posMapper.selectByPstno(50);
		System.out.println("position="+pos);
	}
	

	
}
