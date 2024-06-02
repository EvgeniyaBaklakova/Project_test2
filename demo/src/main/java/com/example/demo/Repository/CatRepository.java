package com.example.demo.Repository;

import com.example.demo.Entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {

}
