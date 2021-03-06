package com.somnath.apps.java9;

public interface InterfacePrivateMethod {

    private static String staticPrivate() {
        return "static private";
    }

    private String instancePrivate() {
        return "instance private";
    }

    public default void check() {
        String result = staticPrivate();
        if (!result.equals("static private"))
            throw new AssertionError("Incorrect result for static private interface method");

        InterfacePrivateMethod pvt = new InterfacePrivateMethod() {
        };
        result = pvt.instancePrivate();
        if (!result.equals("instance private"))
            throw new AssertionError("Incorrect result for instance private interface method");
    }

}