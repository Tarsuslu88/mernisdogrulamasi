package com.dersler.kahvedunyasi.repository;

import com.dersler.kahvedunyasi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
