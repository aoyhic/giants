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
public class PlayerMapperTests {

	@Autowired
	PlayerMapper plyMapper;
	
	@Autowired
	PositionMapper posMapper;
	
	@Test
	public void test00_comfirmplyMapper(){
		System.out.println(plyMapper);
	}
	
	@Test
	public void test00_comfirmposMapper(){
		System.out.println(posMapper);
	}
	
	@Test
	public void test01_selectAll(){
		List<Player> list = plyMapper.selectAll();
		for (Player p:list)
			System.out.println(p);
	}
	@Test
	public void test01_selectAllWithPosition(){
		List<Player> ply = plyMapper.selectAllWithPosition();
		for(Player p:ply)
			System.out.println(p);
	}
	
	@Test
	public void test02_selectPage(){
		Pagination paging = new Pagination();
		paging.setTotalItem(plyMapper.selectTotalCount());
		paging.setPageNo(10);
		List<Player> list = plyMapper.selectPage(paging);
		for(Player p :list)
			System.out.println(p);
	}
	
	@Test
	public void test02_selectPageWithPosition(){
		Pagination paging = new Pagination();
		paging.setTotalItem(plyMapper.selectTotalCount());
		paging.setPageNo(1);
		List<Player> list = plyMapper.selectPageWithPosition(paging);
		for (Player p:list)
			System.out.println(p);
	}
	
	@Test
	public void test03_selectByPlayerno(){
		Player p = plyMapper.selectByPlayerno(13);
		System.out.println("선수는="+p);
	}
	
	@Test
	public void test04_selectByPlayernoWithPosition(){
		Player player = plyMapper.selectByPlayernoWithPosition(9);
		
//		if (player == null) {
//			throw new NotFoundRuntimeException("player 정보가 없습니다");
//		}
		System.out.println(player);	
	}
	@Test
	public void test04_insert(){
		Player player = new Player();
				player.setPname("PARK JIN HYUNG");
		player.setPstno(10);
	
		int pnt = plyMapper.insert(player);
		System.out.println(plyMapper.selectByPlayerno(player.getPlayerno()));
	}
	@Test
	public void test05_updateByPlayerno(){
		Player player = new Player();
		player.setPlayerno(22);
		player.setPname("KIM WON JUNG");
		player.setPstno(10);
		
		int pnt = plyMapper.insert(player);
		System.out.println(plyMapper.selectByPlayerno(player.getPlayerno()));
	}
	
	@Test
	public void test06_deleteByPlayerno(){
		int playerno = 22;
		int pnt = plyMapper.deleteByPlayerno(playerno);
		System.out.println("pnt="+pnt);
				
	}
	
}
