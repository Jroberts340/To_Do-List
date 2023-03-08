

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public ArrayList<String> list = new ArrayList<>();
    public Scanner scan = new Scanner(System.in);

    public String readInput() {
        return scan.nextLine();
    }

    // Adding Items to the To Do List
    public void addIntro() {
        System.out.println("");
        System.out.println("Enter 0 to Return");
        System.out.print("Please Add Items To List and Press Enter: ");
    }

    public boolean addToList(String item) {
        if(list.add(item)){
            System.out.print("->: ");
            return true;
        }
        return false;
    }

    //Removing Items from the To Do List
    public void deleteIntro() {
        System.out.println("");
        System.out.println("Enter 0 to Return");
        System.out.print("Please Input the Item Number You Wish To Be Removed: ");
    }

    public boolean deleteItem(int item) {
        if(!list.isEmpty()) {
            item -= 1;
            list.remove(item);
            return true;
        }
        else {
            System.out.println("");
            System.out.println("Your list is empty, add items first!");
        }
        return false;
    }

    //Viewing the To Do List
    public void viewToDoList() {
        if(!list.isEmpty()) {
            System.out.println("------------");
            System.out.println("To Do List");
            System.out.println("------------");
            for(int index = 0; index < list.size(); index++) {
                System.out.println((index +1) + ". " + list.get(index));
            }
            System.out.println("");
        } else System.out.println("Your list is empty, add items first!");
    }

}
