package kr.co.dong.board;

import java.util.Map;

public interface ProjectDAO {

	//로그인 처리
	public Map<String, Object> login(Map<String,Object> map);
		
	
	public int join(BoardDTO boardDTO);
	
		


	}




