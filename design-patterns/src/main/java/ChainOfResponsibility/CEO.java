package ChainOfResponsibility;

/**
 * CEO只要同意就可以无限期休假
 */
public class CEO extends LeaveHandler {
    public void disposeLeave(int day) {
        System.out.println("我是公司CEO，可以处理任意假期");
    }
}
