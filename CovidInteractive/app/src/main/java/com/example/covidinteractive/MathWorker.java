package com.example.covidinteractive;

import java.util.Random;

public class MathWorker {

    private static int tcounter;
    public static int int1;
    public static int int2;
    public static String operator;
    public static int answer;
    public static int[] arr;
    
    public void BottomPart() {

        int var1, var2;

//        String divide = "/";

        int Qcounter = 0;

        //  if quiz && math == correct  -> goto next question

        MathMethods math = new MathMethods();
        Random rand = new Random();

        if(Qcounter <= 20){

            int1 = rand.nextInt(9);
            int2 = rand.nextInt(9);
        }
        else if(Qcounter > 20 && Qcounter <= 40){

            int1 = rand.nextInt(29);
            int2 = rand.nextInt(29);
        }

        else if(Qcounter > 40 && Qcounter < 60){

            int1 = rand.nextInt(49);
            int2 = rand.nextInt(49);
        }

        int num1 = rand.nextInt(2); // 0, 1, 2

        switch(num1)
        {
            case 0:
                answer = math.add(int1, int2);
                operator = "+";
                break;

            case 1:
                answer = math.sub(int1, int2);
                operator = "-";
                break;

            case 2:
                answer = math.mul(int1, int2);
                operator = "*";
                break;
        }

        int ans1 = rand.nextInt(9) + answer;
        int ans2 = rand.nextInt(9) - answer;
        int ans3 = rand.nextInt(9) * answer;

        int opt1 = rand.nextInt(3);
        arr[opt1] = ans1;

        int opt2 = rand.nextInt(3);

        while (opt1 == opt2) {
            opt2 = rand.nextInt(3);
        }

        arr[opt2] = ans2;

        int opt3 = rand.nextInt(3);

        while ((opt3 == opt2) || (opt1 == opt3) ) {
            opt3 = rand.nextInt(3);
        }

        arr[opt3] = ans3;

        int opt4 = rand.nextInt(3);

        while ((opt4 == opt2) || (opt1 == opt4) || (opt3 == opt4) ) {
            opt4 = rand.nextInt(3);
        }

        arr[opt4] = answer;

    }

}
