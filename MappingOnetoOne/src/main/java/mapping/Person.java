package mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int personId;
	String personName;
	
	@OneToOne
	PanCard pan;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public PanCard getPan() {
		return pan;
	}

	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	
	
	
}
