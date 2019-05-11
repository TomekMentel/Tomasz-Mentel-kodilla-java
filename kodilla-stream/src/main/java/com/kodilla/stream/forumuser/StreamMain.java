package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theUsersDirectory = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUsers = theUsersDirectory.getList().stream()
                .filter((forumUser -> forumUser.getSex() == 'M'))
                .filter(forumUser -> forumUser.getNumberOfPost() >= 1)
                .filter((forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears() >= 20))
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println(theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}