package com.colucy;

public class While {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count>100){
//                break;
//            }
//        }
//        while (count != 6);

        int count = 0;
        int n = 5;
        int finishNumber = 20;
        while(n <= finishNumber){
            if (!isEvenNumber(n)){
                n++;
                continue;
            }

            count ++;
            if (count >= 5){
                break;
            }

            System.out.println("Even number " + n);
            n++;
        }

    }

        public static boolean isEvenNumber (int n){
            if (n % 2 == 0){
                return true;
            }
            else {
                return false;
            }
        }
    }
