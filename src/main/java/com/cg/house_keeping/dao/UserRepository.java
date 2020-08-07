package com.cg.house_keeping.dao;

import com.cg.house_keeping.model.po.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
