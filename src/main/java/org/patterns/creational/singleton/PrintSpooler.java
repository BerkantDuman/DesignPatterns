package org.patterns.creational.singleton;

public class PrintSpooler {

    private static final PrintSpooler spooler = new PrintSpooler();

    public PrintSpooler() {}

    public static PrintSpooler getInstance(){
        if(spooler != null)
            return spooler;

        return spooler;
    }
}
