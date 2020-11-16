package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Role;
import com.repository.RoleRepository;
import com.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository rRepo;

	@Override
	public Role addRole(Role role) {
		return rRepo.save(role);
	}

	@Override
	public void deleteRole(Long id) {
		rRepo.deleteById(id);
	}

	@Override
	public Role findRoleById(Long id) {
		return rRepo.findById(id).get();
	}

	@Override
	public List<Role> findAllRole() {
		return rRepo.findAll();
	}
}
