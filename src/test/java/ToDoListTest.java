import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void addToList1() {
        ToDoList tdl = new ToDoList();
        assertTrue(tdl.addToList("Soccer Practice"));
    }

    @Test
    void addToList2() {
        ToDoList tdl = new ToDoList();
        assertTrue(tdl.addToList("Church Clothes Shopping"));
    }

    @Test
    void deleteItem1() {
        ToDoList tdl = new ToDoList();
        tdl.addToList("Soccer Practice");
        tdl.addToList("Church Clothes Shopping");
        tdl.addToList("Go To Gym");
        tdl.addToList("Pick Up Pizza");
        assertTrue(tdl.deleteItem(1));
    }

    @Test
    void deleteItem2() {
        ToDoList tdl = new ToDoList();
        tdl.addToList("Soccer Practice");
        tdl.addToList("Church Clothes Shopping");
        tdl.addToList("Go To Gym");
        tdl.addToList("Pick Up Pizza");
        assertTrue(tdl.deleteItem(2));

    }
}