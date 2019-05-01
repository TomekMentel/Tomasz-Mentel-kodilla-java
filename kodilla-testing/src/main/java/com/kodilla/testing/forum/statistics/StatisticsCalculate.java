package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculate {
    double usersNr = 0;
    double postNr = 0;
    double commentNr = 0;
    double postPerUser = 0;
    double commentPerUser = 0;
    double commentPerPost = 0;

    public double getUsersNr() {
        return usersNr;
    }

    public double getPostNr() {
        return postNr;
    }

    public double getCommentNr() {
        return commentNr;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> theUsers = statistics.usersNames();
        usersNr = theUsers.size();
        postNr = statistics.postsCount();
        commentNr = statistics.commentsCount();

        if (usersNr != 0) {
            postPerUser = postNr / usersNr;
        } else {
            postPerUser = 0;
        }
        if (usersNr != 0) {
            commentPerUser = commentNr / usersNr;
        } else {
            commentPerUser = 0;
        }
        if (postNr != 0) {
            commentPerPost = commentNr / postNr;
        } else {
            commentPerPost = 0;
        }
    }
}
