package net.person.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserInfos")
public class Users {
	private List<User> users = new ArrayList<User>();
	private User[] userArr;
	private HashMap<String, User> maps = new HashMap<String, User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User[] getUserArr() {
		return userArr;
	}

	public void setUserArr(User[] userArr) {
		this.userArr = userArr;
	}

	public HashMap<String, User> getMaps() {
		return maps;
	}

	public void setMaps(HashMap<String, User> maps) {
		this.maps = maps;
	}

}
