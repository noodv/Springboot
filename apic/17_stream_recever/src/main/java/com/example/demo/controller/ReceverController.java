package com.example.demo.controller;

import javafx.scene.control.Skin;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class ReceverController {

    @StreamListener(Sink.INPUT)
    public void recever(Object payload)
    {
        System.out.println(payload);
    }

}
