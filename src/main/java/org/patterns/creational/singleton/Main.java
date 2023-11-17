package org.patterns.creational.singleton;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();
        System.out.println(spooler);
        PrintSpooler spooler2 = PrintSpooler.getInstance();
        System.out.println(spooler2);


        List<PrintSpooler> spoolers = Collections.singletonList(spooler);
        try{
            spoolers.add(spooler2);
        }catch (UnsupportedOperationException e){
            System.out.println("Can't add ");
        }

        spoolers.stream().forEach(System.out::println);
    }
}
