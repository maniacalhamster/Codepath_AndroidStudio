package com.example.finstagram;

import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseClassName;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject{
    // Ensure that your subclass has a public default constructor

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "author";
    public static final String KEY_LIKE = "likes";
    public static final String KEY_PFP = "pfp";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

    public Number getLikes() { return getNumber(KEY_LIKE);}

    public void setLikes(int likes) { put(KEY_LIKE, likes);}

    public ParseFile getPfp(ParseUser user) { return user.getParseFile(KEY_PFP);}
}
