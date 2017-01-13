package com.andela.assessment2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Eston on 13/01/2017.
 */

public class Review {

    @SerializedName("book_review_link")
    @Expose
    private String bookReviewLink;
    @SerializedName("first_chapter_link")
    @Expose
    private String firstChapterLink;
    @SerializedName("sunday_review_link")
    @Expose
    private String sundayReviewLink;
    @SerializedName("article_chapter_link")
    @Expose
    private String articleChapterLink;

    public String getBookReviewLink() {
        return bookReviewLink;
    }

    public void setBookReviewLink(String bookReviewLink) {
        this.bookReviewLink = bookReviewLink;
    }

    public String getFirstChapterLink() {
        return firstChapterLink;
    }

    public void setFirstChapterLink(String firstChapterLink) {
        this.firstChapterLink = firstChapterLink;
    }

    public String getSundayReviewLink() {
        return sundayReviewLink;
    }

    public void setSundayReviewLink(String sundayReviewLink) {
        this.sundayReviewLink = sundayReviewLink;
    }

    public String getArticleChapterLink() {
        return articleChapterLink;
    }

    public void setArticleChapterLink(String articleChapterLink) {
        this.articleChapterLink = articleChapterLink;
    }
}
