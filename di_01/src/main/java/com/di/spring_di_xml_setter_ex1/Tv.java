package com.di.spring_di_xml_setter_ex1;

public class Tv {
    Speaker speaker;

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
    public void Up() {
        speaker.volumeUp();
    }
    public void Down() {
        speaker.volumeDown();
    }
}