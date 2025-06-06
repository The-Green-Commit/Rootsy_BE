package com.rootsy.Rootsy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rootsy.Rootsy.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
