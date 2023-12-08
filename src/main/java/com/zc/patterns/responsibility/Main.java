package com.zc.patterns.responsibility;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 11:24
 * @description Main
 */
public class Main {
    public static void main(String[] args) {

        LeaveRequest leaveRequest = new LeaveRequest("CK", 8, "不想干");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);


        groupLeader.sumbit(leaveRequest);
    }
}
