package com.di.spring_di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class NameController {
    // 인터페이스 타입으로 선언
    // @Autowired 어노테이션 사용해서 nameService 빈을 자동으로 주입
    // 해당 타입의 빈을 찾아서 필드(변수)에 할당
    //@Autowired
    //@Qualifier("anotherNameService")
    //@Qualifier("bnameService")
    //@Resource(name="anotherNameService")
    @Resource()
    INameService nameService;

    // 생성자 없음
    // Setter 메소드를 통해 외부에서 주입 받음
    public void setNameService(INameService nameService) {
        this.nameService = nameService;
    }

    public void show(String name) {
        System.out.println("NameController : " + nameService.showName(name));
    }
}