package kr.co.dong.board;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class ProjectServiveimpl implements ProjectService {
	
	
	@Inject
	ProjectDAO projectDAO;

	@Override
	public Map<String, Object> login(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return projectDAO.login(map);
	}

	@Override
	public int join(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return projectDAO.join(userDTO);
	}

}
