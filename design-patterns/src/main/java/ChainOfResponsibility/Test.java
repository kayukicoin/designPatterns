package ChainOfResponsibility;

public class Test {
    private LeaveHandler leaveHandler;
    public LeaveHandler getLeaveHandler(){
        return leaveHandler;
    }
    public void setLeaveHandler(LeaveHandler leaveHandler){
        this.leaveHandler = leaveHandler;
    }
    public void requestDiscount(int day){
        leaveHandler.disposeLeave(day);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.setLeaveHandler(LeaveHandlerFactory.createHandler());
        test.requestDiscount(4);
    }
}
