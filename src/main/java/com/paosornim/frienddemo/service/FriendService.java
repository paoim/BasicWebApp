package com.paosornim.frienddemo.service;

import org.springframework.data.repository.CrudRepository;

import com.paosornim.frienddemo.model.Friend;

public interface FriendService extends CrudRepository<Friend, Integer> {

	public Iterable<Friend> findByFirstNameAndLastName(String firstName, String lastName);
}
