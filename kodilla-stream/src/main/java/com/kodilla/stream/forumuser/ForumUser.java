package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser{
    private final int id;
    private final String userName;
    private final char sex;
    private final int numberOfPost;
    private final LocalDate birthDate;
    LocalDate today=LocalDate.now();
    //static Period period=Period.between(today,getBirthDate());
 //   Period p = Period.between(getBirthDate(), today);




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

 public Period period(){
        Period period = Period.between(today,getBirthDate());
     return  period;
 }

}
