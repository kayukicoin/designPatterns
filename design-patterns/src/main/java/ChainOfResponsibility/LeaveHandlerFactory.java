package ChainOfResponsibility;

public class LeaveHandlerFactory {
    public static LeaveHandler createHandler(){
        LeaveHandler lead = new Leader();
        LeaveHandler cto = new CTO();
        LeaveHandler hrboss = new HRBoss();
        LeaveHandler ceo = new CEO();

        lead.setSuccess(cto);
        cto.setSuccess(hrboss);
        hrboss.setSuccess(ceo);
        return lead;
    }
}
