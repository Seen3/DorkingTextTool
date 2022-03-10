package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String searchData="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book name:");
        searchData=sc.nextLine();
        searchData=searchData+" filetype:pdf site:archive.org";
        System.out.println(searchData);
	// write your code here
    }
}
