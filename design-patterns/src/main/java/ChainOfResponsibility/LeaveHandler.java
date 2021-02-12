package ChainOfResponsibility;

/**
 *  处理人负责处理请假请求
 */
public abstract class LeaveHandler {
    protected LeaveHandler success;

    public void setSuccess(LeaveHandler success){
        this.success = success;
    }

    public abstract void disposeLeave(int day);
}
