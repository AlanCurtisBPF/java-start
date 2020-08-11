package com.alan.loggers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class AppendToLog {
    public static void usingBufferedWritter() throws IOException
    {
        System.out.println("AppendToLog ran: usingBufferedWritter() ");
        String textToAppend = "Happy Learning !!";

        //Set true for append mode
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/home/alan/Dev/Temp/MyLogFile.log", true));

        writer.write(textToAppend);
        writer.close();
    }


//    public static void usingBufferedWritter() throws IOException {
//        System.out.println("AppendToLog Ran");
//        Logger logger = Logger.getLogger("MyLog");
//
//        String textToAppend = "Happy Learning !!";
//
//        //Set true for append mode
//        BufferedWriter writer = new BufferedWriter(
//                new FileWriter("/home/alan/Dev/Temp/MyLogFile.log", true));
//
////        String message = ;
//        writer.write(textToAppend);
//        writer.close();
//    }
}
