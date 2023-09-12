package com.springboot.webapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileRepository extends JpaRepository<FileEntity,Long> {

    Optional<List<FileEntity>> findAllByUserId(Long userId);

}