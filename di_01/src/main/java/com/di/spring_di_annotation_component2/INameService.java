package com.di.spring_di_annotation_component2;

// 인터페이스 : 규격을 정해 놓은 것
// 이 인터페이스를 구현할 클래스에서 반드시 포함시켜야 할 메소드를 규격으로 지정해 놓은 것임
public interface INameService {
    // INameService 인터페이스를 구현할 클래스에서
    // 반드시 오버라이드 시켜야할 추상 메소드
    public String showName(String name);
}