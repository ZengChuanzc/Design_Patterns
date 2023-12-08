package com.zc.patterns.responsibility;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 11:19
 * @description GroupLeader
 */
public class GroupLeader extends Handler{


    public GroupLeader() {
        super(0, NUM_ONE);
    }


    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
        System.out.println("==============");

    }
}
