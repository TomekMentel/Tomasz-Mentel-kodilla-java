package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escoabr");
        ForumUser jessiPincman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiPincman);
        javaToolsForum.registerObserver(jessiPincman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop? ");
        javaHelpForum.addPost("Better try to use while loop in this case. ");
        javaHelpForum.addPost("Help pls, my MySQL db doesn't want to work :( ");
        javaToolsForum.addPost("Why while? It is better  ");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message ");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiPincman.getUpdateCount());
    }
}
