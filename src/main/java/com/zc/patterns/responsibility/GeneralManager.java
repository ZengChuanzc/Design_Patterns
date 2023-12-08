package com.zc.patterns.responsibility;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 11:22
 * @description GeneralManager
 */
public class GeneralManager extends Handler{


    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
        System.out.println("==============");
    }
}
