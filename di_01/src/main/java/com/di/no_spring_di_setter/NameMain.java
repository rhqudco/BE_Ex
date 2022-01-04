package com.di.no_spring_di_setter;

public class NameMain {
    public static void main(String[] args) {
        NameService nameService = new NameService();
        NameController controller = new NameController();
        // Setter메소드를 통해 nameService 객체 전달
        controller.setNameService(nameService);
        controller.show("성춘향");
    }
}