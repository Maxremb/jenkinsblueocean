package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Role;
import com.service.RoleService;

@RestController
@RequestMapping(value = "/rest-role")
@CrossOrigin(allowCredentials = "true", origins = "http://localhost:4200")
public class RoleController {

	@Autowired
    RoleService roleService;

    @PostMapping(value="/role")
    public Role saveRole(@RequestBody Role role) {
        return roleService.addRole(role);
    }

    @PutMapping(value="/role")
    public Role updateRole(@RequestBody Role role) {
        return roleService.addRole(role);
    }

    @DeleteMapping(value="/role/{id}")
    public void deleteRole(@PathVariable("id") Long id) {
        roleService.deleteRole(id);
    }

    @GetMapping(value="/role/{id}")
    public Role findRole(@PathVariable("id") Long id) {
        return roleService.findRoleById(id);
    }

    @GetMapping(value="/roles")
    public List<Role> findRole() {
        return roleService.findAllRole();
    }
}
