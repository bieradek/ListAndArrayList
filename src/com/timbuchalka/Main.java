package com.timbuchalka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0: //0 - To print choice options.
                    printInstructions();
                    break;
                case 1: //1 - To print the list of grocery items.
                    groceryList.printGroceryList();
                    break;
                case 2: //2 - To add an item to grocery list.
                    addItem();
                    break;
                case 3: //3 - To modify an item in the list
                    modifyItem();
                    break;
                case 4: //4 - To remove an item from the list.
                    removeItem();
                    break;
                case 5: //5 - To search for an item in the list
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7: //6 - To quit the application.
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid number, try again");
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of grocery items.");
        System.out.println("\n 2 - To add an item to grocery list.");
        System.out.println("\n 3 - To modify an item in the list");
        System.out.println("\n 4 - To remove an item from the list.");
        System.out.println("\n 5 - To search for an item in the list");
        System.out.println("\n 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("enter item number");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the list");
        }
    }
}
//    private static Scanner s = new Scanner(System.in);
//    private static int[] baseData = new int[10];
//
//    public static void main(String[] args) {
//        // write your code here
//        System.out.println("Enter 10 integers");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers");
//        getInput();
//        printArray(baseData);
//    }
//
//    private static void getInput() {
//        for (int i = 0; i < baseData.length; i++) {
//            baseData[i] = s.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            System.out.println();
//        }
//    }
//
//    private static void resizeArray() {
//        int[] original = baseData;
//        baseData = new int[12];
//        for (int i = 0; i < original.length; i++) {
//            baseData[i] = original[i];
//        }
//    }
