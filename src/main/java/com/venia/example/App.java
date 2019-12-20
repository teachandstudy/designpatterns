package com.venia.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Started!..." );
        Component main = new ComponentImpl("html", "", "html", "/html");

        Component head = new ComponentImpl("head", "<meta some='value1' another='value2'>", "head", "/head");
        Component body = new ComponentImpl("body", "", "body", "/body");
        main.add(head);
        main.add(body);

        Component h1main = new ComponentImpl("h1", "1111", "h1", "/h1");
        Leaf h1maindiv = new LeafImpl("div", "Header title", "div", "/div");
        h1main.add(h1maindiv);

        body.add(h1main);
        Leaf h1maindivFirst = new LeafImpl("div", "First div", "div", "/div");
        Leaf h1maindivSecond = new LeafImpl("div", "Second div", "div", "/div");
        Leaf h1maindivThird = new LeafImpl("div", "Third div", "div", "/div");

        body.add(h1maindivFirst);
        body.add(h1maindivSecond);
        body.add(h1maindivThird);


        System.out.println("=========================");
        System.out.println(main.operation());
        System.out.println("=========================");
    }
}
