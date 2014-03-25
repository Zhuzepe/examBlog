/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examblog.blogrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author artem
 */
@Named
@ApplicationScoped
public class BlogRecords {

    private List<Article> articles;

    public BlogRecords() {
        articles = new ArrayList<>();
        generateSomeArticles();
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Article findArticleByID(String id) {
        Article article = null;
        for (Article a : articles) {
            if (id.equals(a.getId())) {
                article = a;
            }
        }
        return article;
    }

    private void generateSomeArticles() {
        articles.add(getFirstArticle());
        articles.add(getSecondArticle());
        articles.add(getThirdArticle());
    }

    private Article getFirstArticle() {
        Article article = new Article();
        article.setId(UUID.randomUUID().toString());
        article.setTitle("First Mega Article");
        article.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Morbi in leo vitae mi consectetur euismod. Morbi a enim a eros malesuada ullamcorper sit amet nec leo. "
                + "Duis et ligula nulla. Proin nisl mauris, varius ultricies mollis sit amet, varius eu orci."
                + "Mauris vitae facilisis justo. Etiam tempor eleifend venenatis. Donec. ");
        List<Commentary> commentarys = new ArrayList<>();
        Commentary commentary = new Commentary();
        commentary.setComment("Shut up!");
        commentarys.add(commentary);
        Commentary commentary2 = new Commentary();
        commentary2.setComment("No, you shut up!");
        commentary2.setQuote(commentary);
        commentarys.add(commentary2);
        article.setCommentarys(commentarys);
        return article;
    }

    private Article getSecondArticle() {
        Article article = new Article();
        article.setId(UUID.randomUUID().toString());
        article.setTitle("Second Prime Article");
        article.setContent("Curabitur dapibus porta risus, nec molestie orci luctus gravida. "
                + "Morbi nec ante enim. Vestibulum ac turpis sollicitudin, laoreet arcu id, pharetra justo. "
                + "Integer nisl erat, adipiscing a augue vel, gravida adipiscing nunc. "
                + "Maecenas a sollicitudin nisl, sed pharetra nibh. "
                + "Morbi erat odio, malesuada et faucibus a, elementum nec purus. Duis. ");
        article.setCommentarys(new ArrayList<Commentary>());
        return article;
    }

    private Article getThirdArticle() {
        Article article = new Article();
        article.setId(UUID.randomUUID().toString());
        article.setTitle("Third Super Article");
        article.setContent("Nullam erat lectus, blandit eget molestie quis, hendrerit vitae orci. "
                + "Donec interdum elit eget eros interdum aliquam. "
                + "Praesent massa massa, suscipit id tortor at, faucibus luctus justo."
                + "Morbi fringilla vitae arcu ut suscipit. "
                + "Fusce eget augue pulvinar sem dignissim varius at ut lectus. "
                + "Suspendisse enim neque, iaculis vel erat nec. ");
        List<Commentary> commentarys = new ArrayList<>();
        Commentary commentary = new Commentary();
        commentary.setComment("Verry bad article!");
        commentarys.add(commentary);
        article.setCommentarys(commentarys);
        return article;
    }

}
