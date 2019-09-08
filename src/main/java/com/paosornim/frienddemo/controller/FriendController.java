package com.paosornim.frienddemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paosornim.frienddemo.model.Friend;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/friends")
@Api(value = "/api/v1/friends")
public class FriendController {

	@GetMapping
	@ApiOperation(value = "Get all Friends")
	public List<Friend> getFriends() {
		return Arrays.asList(new Friend("Sophal", "Mok"), new Friend("Sombo", "Sok"));
	}

	@PostMapping
	@ApiOperation(value = "Post a Friend")
	public Friend post(@RequestBody Friend friend) {
		return friend;
	}
}
