package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "Mikael", 'M',
                1999, 3, 12, 1));
        theForumList.add(new ForumUser(2, "Ammeli", 'F',
                2003, 3, 12, 1));
        theForumList.add(new ForumUser(3, "Sabrin", 'F',
                2000, 1, 1, 2));
        theForumList.add(new ForumUser(4, "John", 'M',
                2001, 2, 20, 3));
        theForumList.add(new ForumUser(5, "Alice", 'F',
                1998, 5, 10, 1));
        theForumList.add(new ForumUser(6, "Frank", 'M',
                1999, 12, 30, 4));
        theForumList.add(new ForumUser(7, "Olaf", 'M',
                2002, 9, 29, 1));
        theForumList.add(new ForumUser(8, "Margarita", 'F',
                1985, 10, 26, 5));
        theForumList.add(new ForumUser(9, "Agnes", 'F',
                2005, 12, 22, 4));
        theForumList.add(new ForumUser(10, "Kat", 'F',
                1999, 11, 30, 3));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumList);
    }
}
