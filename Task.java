package quiz;
class Task{
    String assigni_name;
    String statusOfTask;
    public String assignTo(String name){
        assigni_name = name;
        return assigni_name;
    }
    public String updateStatus(String status){
        statusOfTask = status;
        return statusOfTask; 
    }
}