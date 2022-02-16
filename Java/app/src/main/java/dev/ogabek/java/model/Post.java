package dev.ogabek.java.model;

public class Post {

    private final int post1, post2, profile;
    private final String fullName;

    public Post( int profile, String fullName, int post1, int post2) {
        this.post1 = post1;
        this.post2 = post2;
        this.profile = profile;
        this.fullName = fullName;
    }

    public int getPost1() {
        return post1;
    }

    public int getPost2() {
        return post2;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }
}
