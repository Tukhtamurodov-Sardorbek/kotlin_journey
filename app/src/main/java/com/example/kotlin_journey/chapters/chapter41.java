package com.example.kotlin_journey.chapters;

public class chapter41 {
    public static void main(String[] args) {
        KotlinInJavaExample instance = new KotlinInJavaExample();
        int number = instance.getDefaultVariable();
        instance.setDefaultVariable(5);
        int dirNumber = instance.directlyAccessableVariable;
        instance.directlyAccessableVariable = 6;

        System.out.println(number + " => " + instance.getDefaultVariable());
        System.out.println(dirNumber + " => " + instance.directlyAccessableVariable);

        KotlinUtility.printer("Message from Java");
    }
}