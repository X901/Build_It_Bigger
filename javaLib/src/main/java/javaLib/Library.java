/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaLib;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    private static String[] jokes = {"Time is money. Therefore, ATMs are time machines.","What do you call it when computer science majors make fun of each other?\n" +
            "Cyber boolean\n","My iPod is in Titanic mode right now. It is syncing.","I bought a universal remote control today. I’m kind of afraid of myself now…"};
    private static int index = 0;

    public static String getJoke(){
        if(index >= jokes.length) {

        }
        return jokes[index++];
    }
}