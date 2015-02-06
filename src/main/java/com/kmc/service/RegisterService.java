package com.kmc.service;

import java.util.List;
import org.json.JSONObject;
import com.kmc.db.model.User;

public interface RegisterService {
	public void registerUser(User user);
	public List<User> getAllUsers();
}
