package com.codepath.grace.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8F41OS2xF8lIlCmc6t584E2cynxU9qlJDpbW2Hia")
                .clientKey("3MY54vs9udow1LGxLPotIUs4p8zo8sAGZRYeFAPV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
