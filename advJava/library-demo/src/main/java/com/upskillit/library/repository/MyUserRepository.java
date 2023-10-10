package com.upskillit.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskillit.library.entity.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String>
{

}
