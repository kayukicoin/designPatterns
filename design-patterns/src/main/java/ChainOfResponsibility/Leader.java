package ChainOfResponsibility;

/**
 * 项目经理只能批准一天的假期
 */
public class Leader extends LeaveHandler {
    public void disposeLeave(int day) {
        if(day<=1){
            System.out.println("我是组长，可以处理"+day+"内的假期");
        }else{
            //如果处理不了就向上传递
            success.disposeLeave(day);
        }
    }
}
