package org.patterns.behaviroal.observer;

public class Main {

    public static void main(String[] args) {
        Connection sally = new Connection();
        Connection bob = new Connection();
        SocialMediaFeed feed = new SocialMediaFeed();

        sally.addPropertyChangeListener(feed);
        bob.addPropertyChangeListener(feed);

        sally.setStatus("aaa");
        bob.setStatus("bbb");


        feed.printStatuses();
    }
}
