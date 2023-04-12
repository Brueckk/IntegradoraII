import java.util.Calendar;
public class Stage {

    private String name; 
    private boolean approval; 
    private Calendar plannedStartDate; 
    private Calendar plannedEndDate; 
    private Calendar realStartDate; 
    private Calendar realEndDate;

    public Stage(String name, Calendar plannedStartDate, Calendar plannedEndDate, Calendar realStartDate, Calendar realEndDate, boolean approval){
        this.name = name; 
        this.approval = approval;
        this.plannedStartDate = plannedStartDate; 
        this.plannedEndDate = plannedEndDate;
        this.realStartDate = realStartDate; 
        this.realEndDate = realEndDate; 
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Calendar getPlannedStartDate(){
        return plannedStartDate;
    }

    public void setPlannedStartDate(Calendar plannedStartDate){
        this.plannedStartDate = plannedStartDate; 
    }

    public Calendar getPlannedEndDate(){
        return plannedEndDate;
    }

    public void setPlannedEndDate(Calendar plannedEndDate){
        this.plannedEndDate = plannedEndDate;
    }

    public Calendar getRealStartDate(){
        return realStartDate;
    }

    public void setRealStartDate(Calendar realStartDate){
        this.realStartDate = realStartDate;
    }

    public Calendar getRealEndDate(){
        return realEndDate; 
    }

    public void setRealEndDate(Calendar realEndDate){
        this.realEndDate = realEndDate;
    }

    public void setApproval(boolean approval){
        this.approval = approval;
    }

    public String toString(){
        return "The Stage name: "+ name+" ,The planned start date: "+plannedStartDate+" ,The planned end date: "+plannedEndDate+" ,The real start date: "+realStartDate+" ,The real end date: "+realEndDate;

    }
    
}
