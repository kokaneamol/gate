package com.amol.wikisearcher;

public class DataModel {

    public String getName() {
        return name;
    }

    String name;

    public String getUri() {
        return uri;
    }

    String uri;

    public String getDesc() {
        return desc;
    }

    String desc;

    public DataModel(String ttl, String des, String url) {
        this.desc = des;
        this.name = ttl;
        if (url != null)
            this.uri = url;
        else
            this.uri = "android.resource://com.amol.wikisearcher/drawable/ic_launcher_background";
    }
}
