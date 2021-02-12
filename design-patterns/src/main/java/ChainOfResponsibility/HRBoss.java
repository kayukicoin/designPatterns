package ChainOfResponsibility;

public class HRBoss extends LeaveHandler {
    public void disposeLeave(int day) {
        if(day<=5){
            System.out.println("我是HR领导，可以处理"+day+"内的假期");
        }else{
            success.disposeLeave(day);
        }
    }
}
