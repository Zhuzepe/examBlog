/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examblog.blogrecords;

/**
 *
 * @author artem
 */
public class Commentary {

    private String userName;
    private String comment;
    private Commentary quote;

    public String getUserName() {
        if (null == userName) {
            return "Anonymous";
        }
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Commentary getQuote() {
        return quote;
    }

    public void setQuote(Commentary quote) {
        this.quote = quote;
    }

}
