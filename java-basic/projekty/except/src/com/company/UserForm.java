package com.company;

public class UserForm {
    int age;
    public void setAge(String age) throws AgeValidationFailed {
        int tempAge;
        try {
            // open file
            // ...
            tempAge = Integer.parseInt(age);
        } catch(NumberFormatException e) {
            throw new AgeValidationFailed("Parsing failed: " + e.getMessage());
        } finally {
            // close file
            System.out.println("FINALLY!");
        }

        if((tempAge < 150 && tempAge > 0) || tempAge > 1000) {
            this.age = tempAge;
        } else {
            throw new AgeValidationFailed(String.format("Out of range: %d", tempAge));
        }

    }
    public int getAge() {
        return age;
    }
}
