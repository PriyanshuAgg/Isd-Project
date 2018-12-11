import java.time.LocalDate;

public class Application {

	private int ID;
	private String Title;
	private String status;
	private String remarks;
	private int intender_id;
	private LocalDate date;
	
	public Application(int iD, String title, String status, String remarks, int intender_id,LocalDate date) {
		super();
		this.ID = iD;
		this.Title = title;
		this.status = status;
		this.remarks = remarks;
		this.intender_id = intender_id;
		this.date = date;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getIntender_id() {
		return intender_id;
	}
	public void setIntender_id(int intender_id) {
		this.intender_id = intender_id;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}


}
