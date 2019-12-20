package com.venia.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComponentImpl extends LeafImpl implements Component {
    private List<Leaf> child = new ArrayList<>();

    public ComponentImpl(String tagName, String tagValue, String startTag, String endTag) {
        super(tagName, tagValue, startTag, endTag);
    }

    public void add(Leaf leaf) {
        child.add(leaf);
    }

    public void remove(Leaf leaf) {
        child.remove(leaf);
    }

    public String operation() {
        String startTag =  String.format("<%s>", super.getStartTag());
        String endTag =  String.format("<%s>", super.getEndTag());

        List<Leaf> list = Optional.ofNullable(child).orElse(new ArrayList<Leaf>());
        String subchild = list.stream().map(Leaf::operation).collect(Collectors.joining());
        subchild.concat(super.getTagValue());

        return String.format("%s%s%s", startTag, subchild, endTag);
    }

    public String getTagName() {
        return null;
    }

    public String getTagValue() {
        return null;
    }

    public String getStartTag() {
        return null;
    }

    public String getEndTag() {
        return null;
    }
}
