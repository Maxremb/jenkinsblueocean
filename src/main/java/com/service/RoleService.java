package com.service;

import java.util.List;

import com.entities.Role;

public interface RoleService {

	public Role addRole(Role role);
	
	public void deleteRole(Long id);
	
	public Role findRoleById(Long id);
	
	public List<Role> findAllRole();
}
