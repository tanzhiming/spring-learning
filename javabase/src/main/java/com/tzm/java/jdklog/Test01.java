package com.tzm.java.jdklog;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test01 {

    public static void main(String[] args) {
        //Logger.getGlobal().setLevel(Level.OFF);

        // 全局日志记录器
        Logger.getGlobal().info("File->Open menu item selected");

    }
}
