package com.andela.assessment2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eston on 13/01/2017.
 */

public class Book {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("contributor")
    @Expose
    private String contributor;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("contributor_note")
    @Expose
    private String contributorNote;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("age_group")
    @Expose
    private String ageGroup;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("isbns")
    @Expose
    private List<Isbn> isbns = new ArrayList<>();
    @SerializedName("ranks_history")
    @Expose
    private List<RanksHistory> ranksHistory = new ArrayList<>();
    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributorNote() {
        return contributorNote;
    }

    public void setContributorNote(String contributorNote) {
        this.contributorNote = contributorNote;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Isbn> getIsbns() {
        return isbns;
    }

    public void setIsbns(List<Isbn> isbns) {
        this.isbns = isbns;
    }

    public List<RanksHistory> getRanksHistory() {
        return ranksHistory;
    }

    public void setRanksHistory(List<RanksHistory> ranksHistory) {
        this.ranksHistory = ranksHistory;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
