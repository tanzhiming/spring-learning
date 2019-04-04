package com.tzm.asm.test02;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Test01 {

    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT  + Opcodes.ACC_INTERFACE,
                "pkg/Comparable", null, "java/lang/Object", new String[] {"pkg/Mesurable"});
        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "LESS", "I",
                null, new Integer(-1)).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "EQUAL", "I",
                null, new Integer(0)).visitEnd();
        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "GREATER", "I",
                null, new Integer(1)).visitEnd();
        cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT, "compareTo", "(Ljava/lang/Object)I",
                null, null).visitEnd();
        cw.visitEnd();
        byte[] b = cw.toByteArray();
        Class c = new MyClassLoader().defineClass("pkg.Comparable", b);
        System.out.println(c);
    }
}
