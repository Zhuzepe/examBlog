/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examblog.viewcontroller;

import com.examblog.blogrecords.Article;
import com.examblog.blogrecords.BlogRecords;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author artem
 */
@Named
@SessionScoped
public class BlogViewController implements Serializable {

    @Inject
    private BlogRecords blogRecords;
    private Article chosenArticle;

    public BlogViewController() {
    }

    public Article getChosenArticle() {
        return chosenArticle;
    }

    public void setChosenArticle(Article chosenArticle) {
        this.chosenArticle = chosenArticle;
    }

    public String chooseArticle(String id) {
        chosenArticle = blogRecords.findArticleByID(id);
        return "article";
    }

    public void addComent() {
    }
}
