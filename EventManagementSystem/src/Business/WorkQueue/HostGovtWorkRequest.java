/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
/**
 *
 * @author Saivignesh Sridhar
 */
public class HostGovtWorkRequest extends WorkRequest {
    private String requestID;
    private String eventName;
    private String evenCat;
    private int attendance;
    private Date plannedDate;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEvenCat() {
        return evenCat;
    }

    public void setEvenCat(String evenCat) {
        this.evenCat = evenCat;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public Date getPlannedDate() {
        return plannedDate;
    }

    public void setPlannedDate(Date plannedDate) {
        this.plannedDate = plannedDate;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID() {
       int randomNum = (int) (Math.random() * (100 - 500 + 1) + 100);
        this.requestID = "Request " + randomNum;
    }
    
}
