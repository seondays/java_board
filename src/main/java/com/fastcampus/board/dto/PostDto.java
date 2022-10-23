package com.fastcampus.board.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long postId;
    private String nickName;
    private String title;
    private String content;
}
