package com.company;

public class Main {

    public static void main(String[] args) {
        {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
        }
        System.out.println();
        {
            double[] doubleArr = {1.57, 7.654, 9.986};
            for (int i = 0; i < doubleArr.length; i++) {
                if (i == doubleArr.length - 1) {
                    System.out.print(doubleArr[i]);
                } else {
                    System.out.print(doubleArr[i] + ", ");
                }
            }
        }
        System.out.println();
        {
            int[] days = new int[7];
            days[0] = 1;
            days[1] = 2;
            days[2] = 3;
            days[3] = 4;
            days[4] = 5;
            days[5] = 6;
            days[6] = 7;
            for (int i = 0; i < days.length; i++) {
                if (i == days.length - 1) {
                    System.out.print(days[i]);
                } else {
                    System.out.print(days[i] + ", ");
                }
            }
        }
        System.out.println();
        {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(arr[i] + ", ");
                } else {
                    System.out.print(arr[i]);
                }
            }
        }
        {
            System.out.println();
        }
        {
            double[] doubleArr = {1.57, 7.654, 9.986};
            for (int i = doubleArr.length - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(doubleArr[i] + ", ");
                } else {
                    System.out.print(doubleArr[i]);
                }
            }
        }
        System.out.println();
        {
            int[] days = new int[7];
            days[0] = 1;
            days[1] = 2;
            days[2] = 3;
            days[3] = 4;
            days[4] = 5;
            days[5] = 6;
            days[6] = 7;
            for (int i = days.length - 1; i >= 0; i--) {
                if (i > 0) {
                    System.out.print(days[i] + ", ");
                } else {
                    System.out.print(days[i]);

                }
            }
        }
        System.out.println();
        {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2!=0) {
                arr[i]=arr[i]+1;
                }
                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");

                }
            }
        }
    }
}






