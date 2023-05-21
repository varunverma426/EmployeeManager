package ID_Generation;

public class IDGenerator {

    public long generateID() {
        long uniqueId = System.currentTimeMillis() / 1000;
        return uniqueId;
    }

   /* public String generateEmployeeId(){
        return "EMP"+generateID();
    }
    public String generateDeskNo(){
        return "DSK"+generateID();
    }*/

}
