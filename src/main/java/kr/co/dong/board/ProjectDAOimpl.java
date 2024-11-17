package kr.co.dong.board;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAOimpl implements ProjectDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace ="kr.co.dong.resources.ProjectMapper";

	@Override
	public Map<String, Object> login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(nameSpace+".login",map);
	}

	@Override
	public int join(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return sqlSession.insert(nameSpace+".join",userDTO);
	}

}
