import java.io.Serializable;
import java.time.LocalDate;

public class Persons implements Serializable {
	public enum Gender {
		ERKEK, KADIN
	}
	
	 private String name;
	 private LocalDate dateOfBirth;
	 private String email;
	 private Gender gender;
	 
	 public Persons() {
		 
	 }
	  
	 public Persons(String name, LocalDate dateOfBirth, String email, Gender gender) {
		 this.name = name;
		 this.dateOfBirth = dateOfBirth;
		 this.email = email;
		 this.gender = gender;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName (String name) {
		 this.name= name;
	 }
	 
	 public LocalDate getDateOfBirth() {
		 return dateOfBirth;
	 }
	 
	 public void setDateOfBirth(LocalDate dateOfBirth) {
		 this.dateOfBirth = dateOfBirth;
	 }
	 
	 public String getEmail() {
		 return email;
	 }
	 
	 public void setEmail( String email) {
		 this.email = email;
	 }
	 
	 public Gender getGender() {
		 return gender;
	 }
	 
	 public void setGender( Gender gender) {
		 this.gender = gender;
	 }
	 
	 public int getYas() {
		 return LocalDate.now().getYear() - dateOfBirth.getYear();
	 }
	 
	 @Override
	 public int hashCode() {
		 return email.hashCode();
	 }
	 
	 @Override 
	 public boolean equals (Object o) {
		 Persons person=(Persons)o;
		 return this.email.equals(person.email);
	 }
	 @Override 
	 public String toString() {
		 return "AD: " + name + "\tDOĞUM TARİHİ: " + dateOfBirth +  "\tEMAİL: " + email + "\tCİNSİYET: " + gender + "\tYAŞ: " +getYas();
	 }
	 

}
