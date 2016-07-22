package com.rise.grk.patentapp.Entities;

import android.os.Bundle;

/**
 * Created by GrK_Rise on 12.01.2016.
 */
public class PatentInfo {
    protected String title;
    protected String preview;
    protected String full_text;
    protected String number;
    protected String authors;
    protected String owner;

    public String getTitle() {
        return this.title;
    }

    public String getPreview() {
        return preview;
    }

    public static String getTitlePrefix() {
        return TITLE_PREFIX;
    }

    public static String getPreviewRefix() {
        return PREVIEW_REFIX;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public String getNumber() {
        return number;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Bundle toBunlde(){
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("number", number);
        bundle.putString("authors", authors);
        bundle.putString("preview", preview);
        bundle.putString("full_text", full_text);
        bundle.putString("owner", owner);
        return bundle;
    }

    public static PatentInfo fromBundle(Bundle bundle){
        PatentInfo patentInfo = new PatentInfo();
        patentInfo.setTitle(bundle.getString("title"));
        patentInfo.setNumber(bundle.getString("number"));
        patentInfo.setAuthors(bundle.getString("authors"));
        patentInfo.setPreview(bundle.getString("preview"));
        patentInfo.setFull_text(bundle.getString("full_text"));
        patentInfo.setOwner(bundle.getString("owner"));
        return patentInfo;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static String getFullTextPrefix() {
        return FULL_TEXT_PREFIX;
    }

    protected static final String TITLE_PREFIX = "Title_";
    protected static final String PREVIEW_REFIX = "Preview: Hello World!";
    protected static final String FULL_TEXT_PREFIX = "Hello World! Hello World!Hello World! Hello World!Hello World! Hello World!Hello World!";
}
