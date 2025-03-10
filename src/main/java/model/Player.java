package model;

public class Player {
    String name;
    int number;
    String position;
    boolean isFielded = false;

    public Player(String name, int number, String position, boolean isFielded) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.isFielded = isFielded;
    }

    public void getStateAsString() {
        System.out.println("Name: " + name + "\nNumber: " + number + "\nPosition: " + position + "\nisFielded: " + isFielded + "\n\n");

    }
}
