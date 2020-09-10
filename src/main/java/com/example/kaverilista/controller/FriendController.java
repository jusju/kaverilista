package com.example.kaverilista.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.kaverilista.model.Friend;

@Controller
public class FriendController {

	private List<Friend> friendList = new ArrayList<Friend>();
	
	@GetMapping("/home")
	public String friendForm(Model model) {
		model.addAttribute("friend", new Friend());
		model.addAttribute("friendList", friendList);
		return "index";
	}
	
	@GetMapping("/index")
	public String friendList(@ModelAttribute Friend friend, Model model) {
		friendList.add(friend);
		model.addAttribute("friend", new Friend());
		model.addAttribute("friendList", friendList);
		return "index";
	}
	
	
}
