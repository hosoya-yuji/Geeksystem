package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
