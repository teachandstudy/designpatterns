package com.venia.example;

public class LeafImpl implements Leaf {
    private String tagName;
    private String tagValue;
    private String startTag;
    private String endTag;

    public LeafImpl(String tagName, String tagValue, String startTag, String endTag) {
        this.startTag = startTag;
        this.endTag = endTag;
        this.tagName = tagName;
        this.tagValue = tagValue;
    }

    public String getTagName() {
        return tagName;
    }

    public String getTagValue() {
        return tagValue;
    }

    public String getStartTag() {
        return startTag;
    }

    public String getEndTag() {
        return endTag;
    }

    public String operation() {
        return String.format("<%s>%s<%s>", startTag, tagValue, endTag);
    }
}
