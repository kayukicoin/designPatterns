package ChainOfResponsibility;

/**
 * 技术总监可以处理三天的请求
 */
public class CTO extends LeaveHandler {
    public void disposeLeave(int day) {
        if(day<=3){
            System.out.println("我是技术总监，可以处理"+day+"内的假期");
        }else{
            //如果处理不了就向上传递
            success.disposeLeave(day);
        }
    }
}
