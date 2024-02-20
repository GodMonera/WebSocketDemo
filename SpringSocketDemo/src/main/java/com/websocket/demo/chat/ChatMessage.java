package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    public static int Num;
    private int n;



    public void setNum(int Num){
        this.n = Num;
    }

    public static int increase(){
        Num++;
        return Num;
    }

    public static int decrease(){
        Num--;
        return Num;
    }

}


