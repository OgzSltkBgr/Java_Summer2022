package practice;

import java.util.Scanner;

public class C74_WhileLoop {
    public static void main(String[] args) {

        char  ilkHarf='f';
        char sonHarf='t';

        char temp =ilkHarf;
        String buyult="";

        while (temp<=sonHarf){

            buyult=(temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp+=1;

        }


    }

}
