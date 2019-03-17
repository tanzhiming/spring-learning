package com.tzm.java.base;

public class ObjFinalize02 {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Obj obj = new Obj();
            Thread.sleep(100);
        }
    }
   static class Obj {

        int[] a = new int[1024 * 100];

        public Obj() {
            //System.out.println("obj init");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("obj finalize");
        }
    }

}


