package com.kodilla3.testing3.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }
    public void addComment(ForumPost thePost, String author, String commentBody){
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }
    public int getPostsQuantity(){
// return 100 temporarily/poprawiono na posts.size()
        return posts.size();
    }
    public int getCommentsQuantity(){
// return 100 temporarily/poprawione na comments.size()
        return comments.size();
    }
    public ForumPost getPost(int postNumber){
// returning null means that the operation was unsuccessful/poprawiono na:
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }
    public ForumComment getComment(int commentNumber){
// returning null means that the operation was unsuccessful/poprawiono na:
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }
    public boolean removePost(ForumPost thePost){
// return true temporarily/poprawiono na:
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
        return result;
    }
    public boolean removeComment(ForumComment theComment){
// return true temporarily/poprawiono na:
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }
    public String getName() {
        return name;
    }
    public String getRealName() {
        return realName;
    }

}
