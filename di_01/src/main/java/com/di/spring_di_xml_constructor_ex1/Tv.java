package com.di.spring_di_xml_constructor_ex1;

public class Tv {
    Speaker speaker;

    public Tv (Speaker speaker) {
        this.speaker = speaker;
    }
    public void Up() {
        speaker.volumeUp();
    }
    public void Down() {
        speaker.volumeDown();
    }
}