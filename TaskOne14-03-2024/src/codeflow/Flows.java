
package codeflow;

public class Flows {

//1.1 Lav en klasse med mindst fire metoder.
// Du kan kalde metoderne methodA, methodB, methodC og methodD eller bruge mere kreative navne.

// 1.2 Lad metoderne printe bogstaver ud. Du kan lade dig inspirere af klassen Flows.java.


    //Først printer den J ud, derefter printer den A ud efter if statement i if statement og hopper ned til MehtodB og printer V ud.
    // Også hopper den op i Method A igen og printer A ud.
        public void methodA(String input) {
            System.out.println("J");
            if (!input.equals("start")) {
                System.out.println("A");
                methodB("start");
            } else {
                System.out.println("E");
                System.out.println(methodC(input));

            }
            System.out.println("A");
        }

        //Her
        public void methodB(String start) {
            System.out.println("V");
        }

        public int methodC(String input) {
            System.out.println("E");
            methodD(input.length());
            return input.length() * 2;
        }

        public void methodD(int number) {
            System.out.println("f");
            if (number > 5) {
                System.out.println("g");
            }
            System.out.println("h");

        }


    }

