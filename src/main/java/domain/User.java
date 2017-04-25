package domain;

public class User {
	private Long id;
	private String name; 
	private	String description; 
	private	Long telefon;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the telefon
	 */
	public Long getTelefon() {
		return telefon;
	}
	/**
	 * @param telefon the telefon to set
	 */
	public void setTelefon(Long telefon) {
		this.telefon = telefon;
	} 
}
