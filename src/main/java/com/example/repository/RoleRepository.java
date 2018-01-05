package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pojo.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
