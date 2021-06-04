package Bai_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Apllication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        ArrayList news = new ArrayList();

        do {
            System.out.println("------------ Menu -----------------");
            System.out.println("---- 1. Insert news   --");
            System.out.println("---- 2. View list news   --");
            System.out.println("---- 3. Average rate   --");
            System.out.println("---- 4. Exit           --");
            System.out.println("------------ End Menu -----------------");
            System.out.println(" Enter yours choice");
            News _new = new News();
            choice = scanner.nextInt();
            switch(choice){
                case 1:{
                    scanner.nextLine();
                    System.out.println("Enter Information New");
                    _new.input();
                    System.out.println(" enter three value to rate for New");
                    _new.inputRate();
                    _new.Calculate(_new.RateList);
                    news.add(_new);
                    break;
                }
                case 2:{
                    for(Object n : news){
                        News __new = (News)n;
                        __new.Display();

                    }
                    break;
                }
                case 3:{
                    for(Object n : news){
                        News __new = (News)n;
                        __new.Display();
                        System.out.println("AverageRate: "+__new.getAverageRate());
                    }
                    break;
                }
                case 4:{
                    System.out.println(" Exit done");
                    break;
                }
                default:{
                    System.out.println("yours choice not value, choice again");
                    break;
                }
            }
        } while (choice != 4);
    }

}
