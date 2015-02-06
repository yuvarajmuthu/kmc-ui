package com.kmc.service;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.kmc.db.model.User;

@Service
public class RegisterServiceImpl implements RegisterService {
	private static List<User> userList = new ArrayList<User>();

	
   public List<User> getAllUsers() {
      return userList;
  }


	public void registerUser(User user) {
		userList.add(user);		
	}

}
