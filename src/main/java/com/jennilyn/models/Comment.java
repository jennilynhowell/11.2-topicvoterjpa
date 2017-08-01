package com.jennilyn.models;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String commenterName;
    private String message;
    private Topic topic;
    
}
