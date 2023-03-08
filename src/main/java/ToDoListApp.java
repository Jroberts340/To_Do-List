
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
    public boolean isRunning = true;
    public Scanner scan = new Scanner(System.in);
    public ToDoList list;

    public ToDoListApp(ToDoList list) {
        this.list = list;
    }

    public void start() {
        printIntro();
        while (isRunning) {
            printListOfOptions();
            int optionNum = readAction();
            execute(optionNum);
        }
    }

    public void execute(int num) {
        switch (num) {
            case 1:
                list.addIntro();
                while (true) {
                    String input = list.readInput();
                    if(!input.equals("0"))
                        list.addToList(input);
                    else
                        break;
                }
                break;

            case 2:
                list.deleteIntro();
                String index = list.readInput();
                if(!index.equals("0"))
                    list.deleteItem(Integer.parseInt(index));
                break;

            case 3:
                list.viewToDoList();
                break;

            case 4:
                isRunning = false;
                break;
        }
    }

    public void printIntro() {
        System.out.println("To Do List Application");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("What Would You Like To Do Today?");
    }

    public void printListOfOptions() {
        System.out.println("");
        System.out.println("1. Add To List");
        System.out.println("2. Delete From List");
        System.out.println("3. View List");
        System.out.println("4. Exit");
    }

    public int readAction() {
        List<Integer> options = Arrays.asList(1, 2, 3, 4);
        while (true) {
            try {
                System.out.print("(Number Only) Enter Option: ");
                int action = scan.nextInt();
                if (options.contains(action)) {
                    return action;
                } else {
                    System.out.println("Please enter a valid number option from the list");
                }
            } catch (Exception e) {
                System.out.println("Option must be a number");

            }
        }
    }
}
