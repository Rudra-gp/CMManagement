package cmManagement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EM {
	@Id
	private String id;
	private String name;
	private String department;
	private String party;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}

}
