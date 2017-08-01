package com.jennilyn.interfaces;

import com.jennilyn.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long>{}
