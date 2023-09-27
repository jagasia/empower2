package com.empower.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.ecom.entity.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String>
{

}
