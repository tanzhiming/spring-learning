package com.tzm.java.innerclass;

/*

内部内的特殊语法规则

a. 内部类有一个外围类的引用, 表达式OuterClass.this
b. 创建内部类对象： outerObject.new InnerClass(construction parameters)
c. 外围作用域之外，引用内部类 OuterClass.InnerClass



内部类中声明的所有静态域都必须是final。
内部类不能有static方法。


 */


public class Test01 {

    private String a;

    public Test01(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01("Outer");
        Inner inner = test01.new Inner();
        inner.print();
    }

    class Inner {

        private String a = "Inner";
        public void print() {
            System.out.println(Test01.this.a);
            System.out.println(a);
        }

    }

}
