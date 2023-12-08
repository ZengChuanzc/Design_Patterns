package com.zc.patterns.responsibility;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 11:21
 * @description Manager
 *
 * 部门经理
 */
public class Manager extends Handler{

    public Manager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
        System.out.println("==============");

    }
}
