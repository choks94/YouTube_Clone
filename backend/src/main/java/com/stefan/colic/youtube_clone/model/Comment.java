package com.stefan.colic.youtube_clone.model;

import org.springframework.data.annotation.Id;

public class Comment {

    @Id
    private String id;
    private String text;
    private String authorId;
    private Integer likeCount;
    private Integer disLikeCount;
}
