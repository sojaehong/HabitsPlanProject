package com.project.kcci.habitsplanproject.vo;

import java.util.Date;

public class HabitListVO {
    private int habitListId;
    private String userId;
    private int categoryId;
    private String title;
    private String descripotion;
    private int likeCount;
    private Date createdOn;

    public int getHabitListId() {
        return habitListId;
    }

    public void setHabitListId(int habitListId) {
        this.habitListId = habitListId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripotion() {
        return descripotion;
    }

    public void setDescripotion(String descripotion) {
        this.descripotion = descripotion;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
