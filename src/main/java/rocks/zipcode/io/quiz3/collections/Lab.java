package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    public String labName;
    public LabStatus status;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public Lab(String labName, LabStatus status) {
        this.labName = labName;
        this.status = status;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.status = labStatus;
    }

    public LabStatus getStatus() {
        return status;
    }
}
