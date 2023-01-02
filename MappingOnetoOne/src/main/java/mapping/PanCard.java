package mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
     
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int panId;
	String panNumber;
	String address;
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
