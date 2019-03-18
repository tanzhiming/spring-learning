package com.tzm.java.jdklog;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test02 {

    private static final Logger myLogger = Logger.getLogger("com.tzm.java.jdklog.Test02");
    public static void main(String[] args) {

        // 开启所有级别， 默认只记录前三个级别
        myLogger.setLevel(Level.ALL);
        myLogger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        myLogger.addHandler(handler);

        myLogger.info("main start");

        /*
        日志级别

        SEVERE
        WARNING
        INFO
        CONFIG
        FINE
        FINER
        FINEST
         */

        myLogger.severe("servere level message");
        myLogger.warning("warning level message");
        myLogger.info("info level message");

        myLogger.config("config level message");
        myLogger.fine("fine level message");
        myLogger.finer("finer level message");
        myLogger.finest("finest level message");

        myLogger.info("main end");







    }
}
