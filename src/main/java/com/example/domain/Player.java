package com.example.domain;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Player {

	private int playerno;
	private String pname;
	private String job;
	private int join;
	private int heights;
	private int uniformNumber;
	private int pstno;
	private Position position;

	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String str= null;
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			str = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return str;
	}
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getJoin() {
		return join;
	}
	public void setJoin(int join) {
		this.join = join;
	}
	public int getHeights() {
		return heights;
	}
	public void setHeights(int heights) {
		this.heights = heights;
	}
	public int getUniformNumber() {
		return uniformNumber;
	}
	public void setUniformNumber(int uniformNumber) {
		this.uniformNumber = uniformNumber;
	}
	public int getPstno() {
		return pstno;
	}
	public void setPstno(int pstno) {
		this.pstno = pstno;
	}

}