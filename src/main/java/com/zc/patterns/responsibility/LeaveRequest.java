package com.zc.patterns.responsibility;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 11:09
 * @description LeaveRequest
 *
 *
 * 请假条
 */
public class LeaveRequest {

    //请假人
    private String name;
    //请假天数
    private int num;
    //请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
