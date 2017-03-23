package com.example.player.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Player;
import com.example.mapper.PlayerMapper;
import com.example.util.Pagination;

@Service
public class PlayerSearchService {

	static Log log = LogFactory.getLog(PlayerSearchService.class);
	
	@Autowired
	PlayerMapper plyMapper;
	
	public List<Player> getListAll(){
		
		log.info("getListAll()");
		return getListAll(false);
	}
	
	public List<Player> getListAll(boolean withPosition){
		log.info("getListAll("+withPosition+")");
		List<Player> ply = null;
		if(withPosition)
			ply = plyMapper.selectAllWithPosition();
		else
			ply = plyMapper.selectAll();
		return ply;
	}
	
	public Map<String, Object> getPage(int pageNo) {
		return getPage(pageNo, false);
	}
	
	public Map<String, Object> getPage(int pageNo, boolean withPosition){
		Pagination paging = new Pagination();
		paging.setTotalItem(plyMapper.selectTotalCount());
		paging.setPageNo(pageNo);
		
		List<Player> ply = null;
		
		if(withPosition)
			ply = plyMapper.selectPageWithPosition(paging);
		else
			ply = plyMapper.selectPage(paging);
		
		Map<String, Object> map = new HashMap<>();
		map.put("position", ply);
		map.put("paging", paging);
		
		return map;
	}
	
	
}
