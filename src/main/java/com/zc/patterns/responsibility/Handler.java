package com.zc.patterns.responsibility;

/**
 * @author zengchuan
 * @version 1.0
 * @date 2023/12/8 11:11
 * @description Handler
 *
 * 处理者抽象类
 */
public abstract class Handler {


    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //领导上面还有领导
    private Handler nextHandler;

    //设置请假天数范围 上不封顶
    public Handler(int numStart) {
        this.numStart = numStart;
    }

    //设置请假天数范围
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //提交请假条
    public final void sumbit(LeaveRequest leaveRequest) {

        //领导进行审批
        this.handleLeave(leaveRequest);
        //若超过范围则提交至下一个处理
        if (this.nextHandler != null && leaveRequest.getNum() > numEnd) {
            this.nextHandler.sumbit(leaveRequest);
        } else {
            System.out.println("流程结束");
        }


    }

    //各级领导处理请假条方法
    protected abstract void handleLeave(LeaveRequest leave);



}
