package com.paosornim.frienddemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paosornim.frienddemo.model.Friend;
import com.paosornim.frienddemo.service.FriendService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/friends")
@Api(value = "/api/v1/friends")
public class FriendController {

	@Autowired
	private FriendService friendService;

	@GetMapping
	@ApiOperation(value = "Get all Friends")
	public List<Friend> getFriends() {
		List<Friend> friends = new ArrayList<>();
		friendService.findAll().forEach(friends::add);
		return friends;
	}

	@PostMapping
	@ApiOperation(value = "Create a Friend")
	public Friend create(@RequestBody Friend friend) {
		return friendService.save(friend);
	}

	@PutMapping
	@ApiOperation(value = "Update a Friend")
	public Friend update(@RequestBody Friend friend) {
		return friendService.save(friend);
	}

	@DeleteMapping("{id}")
	@ApiOperation(value = "Delete a Friend")
	public void delete(@PathVariable Integer id) {
		friendService.deleteById(id);
	}
}
