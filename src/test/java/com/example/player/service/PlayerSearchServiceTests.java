package com.example.player.service;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Player;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerSearchServiceTests {

	@Autowired
	PlayerSearchService service;
	
	@Test
	public void test00_comfirmService(){
		System.out.println("service="+service);
	}
	
	@Test
	public void test01_getListAll(){
		List<Player> ply = service.getListAll();
		for (Player p:ply)
			System.out.println(p);
	}
	
	@Test
	public void test01_getListAll_withPosition(){
		List<Player> ply = service.getListAll(true);
		for (Player p:ply)
			System.out.println(p);
	}
	@Test
	public void test02_getPage(){
		Map<String,Object> ply = service.getPage(1);
		System.out.println("position");
		System.out.println("paging");
		
	}
	
	
}
