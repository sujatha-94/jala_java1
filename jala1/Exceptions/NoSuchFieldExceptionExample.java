package Exceptions;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = String.class;
            Field field = cls.getField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Caught NoSuchFieldException");
        }
    }
}

