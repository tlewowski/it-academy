package com.company;

public class Main4 {
    private static void safeSetAge(UserForm f, String age) {
        try {
            f.setAge(age);
        } catch (AgeValidationFailed ageValidationFailed) {
            System.out.println(ageValidationFailed.getMessage());
        }
        System.out.println(f.getAge());
    }

    public static void main(String[] args) {
        UserForm f = new UserForm();

        safeSetAge(f, "15");
        safeSetAge(f, "-1");
        safeSetAge(f, "1000");
        safeSetAge(f, "1.123");
        safeSetAge(f, "abc");
        safeSetAge(f, "25");
    }
}