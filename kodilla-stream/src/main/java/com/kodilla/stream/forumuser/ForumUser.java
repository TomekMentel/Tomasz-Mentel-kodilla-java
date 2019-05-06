package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPost;

    public ForumUser(final int  id, final String userName,final char sex,
                     final int yearOfBirth,final int monthOfBirth,final int dayOfBirth,final int numberOfPost) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.numberOfPost = numberOfPost;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth,dayOfBirth);
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
