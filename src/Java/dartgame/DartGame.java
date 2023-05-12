package Java.dartgame;

import java.util.Scanner;

public class DartGame {
    public static void main(String[] args) {

        System.out.println("Welcome to DART GAME :) ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of darts to be thrown:");
        int num = scan.nextInt();
        int Region_A = 0;
        int Region_B = 0;
        int Region_C = 0;
        int Region_D = 0;
        int Region_E = 0;
        int Region_F = 0;
        int Region_G = 0;
        int Undecided = 0;
        int totalDart = 0;

        while (num != 0) {
            int k = totalDart + 1;
            System.out.println("\n" + "Dart " + k + ":");
            double a = ((Math.random() * 10 - 5));
            double x = (int) (a * 10) / 10.0;
            double b = ((Math.random() * 10 - 5));
            double y = (int) (b * 10) / 10.0;
            if (x == -5.0 || x == 0.0 || x == 5.0 || y == -5 || y == 0.0 || y == 5.0) {
                System.out.println("Coordinates : (" + x + ", " + y + ")");
                System.out.println("Undecided");
                Undecided = Undecided + 1;
                totalDart+=1;
            }else if (x>0 && y >0){
                if (x+y>5){
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Region is : B");
                    Region_B++;
                    totalDart++;
                } else if (x+y<5) {
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Region is : A");
                    Region_A++;
                    totalDart++;

                }else{
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Undecided");
                    Undecided = Undecided + 1;
                    totalDart++;



                }
            }else if(x<0 && y>0){
                if (Math.sqrt(Math.pow(x+3,2) + Math.pow(y-3,2))==1){
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Undecided");
                    Undecided = Undecided + 1;
                    totalDart++;


                }else if (Math.sqrt(Math.pow(x+3,2) + Math.pow(y-3,2))>1){
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Region is : G");
                    Region_G++;
                    totalDart++;
                }else{
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Region is : C");
                    Region_C++;
                    totalDart++;
                }
            }else if(x<0 && y<0){
                if(x<y){
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Region is : D");
                    Region_D++;
                    totalDart++;

                }else if (x>y){
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Region is : E");
                    Region_E++;
                    totalDart++;

                }else {
                    System.out.println("Coordinates : (" + x + ", " + y + ")");
                    System.out.println("Undecided");
                    Undecided++;
                    totalDart++;

                }
            }else{
                System.out.println("Coordinates : (" + x + ", " + y + ")");
                System.out.println("Region is : F");
                Region_F++;
                totalDart++;

            }


            num--;
        }


        System.out.println("\nRegion Statistics : ");
        double a1 = ((double) Region_A / totalDart) * 100;
        double a2 = (int) (a1*10)/10.0;
        double b1 = ((double) Region_B / totalDart) * 100;
        double b2 = (int) (b1*10)/10.0;
        double c1 = ((double) Region_C / totalDart) * 100;
        double c2 = (int) (c1*10)/10.0;
        double d1 = ((double) Region_D / totalDart) * 100;
        double d2 = (int) (d1*10)/10.0;
        double e1 = ((double) Region_E / totalDart) * 100;
        double e2 = (int) (e1*10)/10.0;
        double f1 = ((double) Region_F / totalDart) * 100;
        double f2 = (int) (f1*10)/10.0;
        double g1 = ((double) Region_G / totalDart) * 100;
        double g2 = (int) (g1*10)/10.0;
        double undecideds = ((double) Undecided /totalDart) * 100;
        double undecideds2=(int)(undecideds*10)/10.0;
        System.out.println("A: " + Region_A + " dart (" + (double) a2 + "%)");
        System.out.println("B: " + Region_B + " dart (" + (double) b2 + "%)");
        System.out.println("C: " + Region_C + " dart (" + (double) c2 + "%)");
        System.out.println("D: " + Region_D + " dart (" + (double) d2 + "%)");
        System.out.println("E: " + Region_E + " dart (" + (double) e2 + "%)");
        System.out.println("F: " + Region_F + " dart (" + (double) f2 + "%)");
        System.out.println("G: " + Region_G + " dart (" + (double) g2 + "%)");
        System.out.println("Undecideds: " + Undecided + " dart (" + (double) undecideds2 + "%)");


    }
}

