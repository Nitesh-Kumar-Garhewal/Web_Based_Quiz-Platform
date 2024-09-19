package com.project.repository;

	import com.project.models.Role;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface RoleRepository extends JpaRepository<Role, String> {
	}