

public class MainClass {

    public static void main(String[] args) {

        ToDoList list = new ToDoList();
        ToDoListApp app = new ToDoListApp(list);
        app.start();
    }

}

