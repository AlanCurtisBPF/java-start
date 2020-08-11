package com.alan.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Logger01 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        System.out.println("Logger01 ran");

        try {

            // This block configure the logger with handler and formatter
            fh = new FileHandler("/home/alan/Dev/Temp/MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("Here is a log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("here is another log.");
        logger.warning("another log set to warning");
    }
}

