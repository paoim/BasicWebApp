package com.paosornim.frienddemo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(FriendController.class)
public class FriendControllerUnitTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getAllFriends() throws Exception {
		mockMvc.perform(get("/api/v1/friends"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(content().json("[{\"id\":0,\"firstName\":\"Sophal\",\"lastName\":\"Mok\"},{\"id\":0,\"firstName\":\"Sombo\",\"lastName\":\"Sok\"}]"));
	}
}
