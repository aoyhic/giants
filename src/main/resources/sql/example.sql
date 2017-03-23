select * from player;

select * from player where uniform_number = 10;

select count(*) from player;

select * from position;

select 	p1.playerno 		as player_playerno,
		p1.pname			as player_pname,
		p1.job				as player_job,
		p1.join				as player_join,
		p1.heights			as player_heights,
		p1.uniform_number 	as player_uniform_number,
		p1.pstno			as player_pstno,
		p2.pstno			as position_pstno,
		p2.pstname			as position_pstname,
		p2.loc				as position_loc
	from player p1 left outer join position p2
	  on p1.pstno = p2.pstno;  
	  
	   select p1.playerno 		as player_playerno,
		p1.pname			as player_pname,
		p1.job				as player_job,
		p1.join				as player_join,
		p1.heights			as player_heights,
		p1.uniform_number 	as player_uniform_number,
		p1.pstno			as player_pstno,
		p2.pstno			as position_pstno,
		p2.pstname			as position_pstname,
		p2.loc				as position_loc
	from player p1 left outer join position p2
	  on p1.pstno = p2.pstno
   where p1.playerno = #{player_playerno};