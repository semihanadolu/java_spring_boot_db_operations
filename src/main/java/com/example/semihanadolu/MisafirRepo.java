package com.example.semihanadolu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MisafirRepo extends JpaRepository<Misafir, Integer> {

}
