package com.kodilla3.testing3.forum;

import com.kodilla3.testing3.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testCaseUsername(){
//Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
//When
        String result = simpleUser.getUsername();
//Then
        Assert.assertEquals("theForumUser", result);
    }
}
