package com.splearn.crowx.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> reader;
}
