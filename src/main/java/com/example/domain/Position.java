package com.example.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Position {

	private int pstno;
	private String pstname;
	private String loc;
	private Player player;

	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Position() {
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

	/**
	 * @return the pstno
	 */
	public int getPstno() {
		return pstno;
	}

	/**
	 * @param value the pstno to set
	 */
	public Position setPstno(final int value) {
		pstno = value;
		return this;
	}

	/**
	 * @return the pstname
	 */
	public String getPstname() {
		return pstname;
	}

	/**
	 * @param value the pstname to set
	 */
	public Position setPstname(final String value) {
		pstname = value;
		return this;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param value the loc to set
	 */
	public Position setLoc(final String value) {
		loc = value;
		return this;
	}

}
