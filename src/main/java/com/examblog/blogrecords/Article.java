/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examblog.blogrecords;

import java.util.List;

/**
 *
 * @author artem
 */
public class Article {

    private String id;
    private String title;
    private String content;
    private List<Commentary> commentarys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Commentary> getCommentarys() {
        return commentarys;
    }

    public void setCommentarys(List<Commentary> commentarys) {
        this.commentarys = commentarys;
    }

    public int getCommentayQuantity() {
        return commentarys.size();
    }

}
