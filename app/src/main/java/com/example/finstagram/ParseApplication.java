package com.example.finstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hSbbJh9JDV8ZwCBIvzzTuU0RNmTvT1CtX2Au92lq")
                .clientKey("CdsgyjripCas60DbQi9qPPbatmvdc6kwLN0PPmUh")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
