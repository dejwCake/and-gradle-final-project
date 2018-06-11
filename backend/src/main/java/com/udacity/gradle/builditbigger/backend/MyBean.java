package com.udacity.gradle.builditbigger.backend;

import sk.dejw.android.jokelib.TellAJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return (new TellAJoke()).getJoke();
    }

    public void setData(String data) {
        myData = data;
    }
}