package com.stefan.colic.youtube_clone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Video")
public class Video {

    @Id
    private String id;
    private String title;
    private String description;
    private String usrId;
    private Integer likes;
    private Integer disLikes;
    private Set<String> tags;
    private String videouUrl;
    private VideoStatus videoStatus;
    private Integer viewCount;
    private String thumbnailUrl;
    private List<Comment> commentList;
    private String testVar;



}
