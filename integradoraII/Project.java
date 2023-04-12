import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Project {

    private String nameProject;
    private String nameClient; 
    private String nameManag; 
    private String cellPhoneManag; 
    private Double wallet; 
    private String plannedStartDate; 
    private String plannedEndDate; 

    public Project(String nameProject, String nameClient, String nameManag, String cellPhoneManag, Double wallet, String plannedStartDate, String plannedEndDate){
        this.nameProject = nameProject;
        this.nameClient = nameClient; 
        this.nameManag = nameManag;
        this.cellPhoneManag = cellPhoneManag;
        this.wallet = wallet; 
        this.plannedStartDate = plannedStartDate; 
        this.plannedEndDate = plannedEndDate; 

    }

    public String getNameProject(){ 
        return nameProject;
    }

    public void setNameProject(String nameProject){
        this.nameProject = nameProject;
    }

    public String getNameClient(){
        return nameClient;
    }

    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }

    public String getNameManag(){
        return nameManag;
    }

    public void setNameManag(String nameManag){
        this.nameManag = nameManag;
    }

    public String getCellPhoneManag(){
        return cellPhoneManag;
    }

    public void setCellPhoneManag(String cellPhoneManag){
        this.cellPhoneManag = cellPhoneManag;
    }

    public Double getWallet(){
        return wallet;
    }

    public void setWallet(Double wallet){
        this.wallet = wallet;
    }

    public String getPlannedStartDate(){
        return plannedStartDate;
    }

    public void setPlannedStartDate(String plannedStartDate){
        this.plannedStartDate = plannedStartDate;
    }

    public String getPlannedEndDate(){
        return plannedEndDate;
    }

    public void setPlannedEndDate(String plannedEndDate){
        this.plannedEndDate = plannedEndDate;
    }

    public String toString(){
        return "The name of the project: ["+ nameProject+"] "
               +"Name client: ["+nameClient+"] "
               +"Name manager: ["+nameManag+"] "
               +"Cell phone manager: ["+cellPhoneManag+"] "
               +"Wallet: ["+wallet+"] "
               +"Planned start date: ["+plannedStartDate+"] "
               +"Planned end date: ["+plannedEndDate+"] ";

    } 

}
