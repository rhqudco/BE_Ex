package com.di.no_spring_no_di;

public class NameMain {
    public static void main(String[] args) {
        NameController nameController = new NameController();
        nameController.show("홍길동");
    }
}