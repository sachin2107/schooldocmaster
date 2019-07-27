package com.school.docmaster.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.school.docmaster.model.User;

public interface UserRepository {

	public User getUsers();
}
