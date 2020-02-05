package firstspring;

public class Student {  
private String name,department;  
private int phoneno;

public String getName() {  
    return name;  
}  

public int getphoneno()
{
	return phoneno;
}

public String getDepartment()
{
	return department;
}
  
public void setName(String name) {  
    this.name = name;  
}  
public void setDepartment(String department) {  
    this.department = department;  
}  

public void setphoneno(int phoneno) {  
    this.phoneno = phoneno;  
}  

public void displayInfo(){  
    System.out.println("Name: "+name);  
    System.out.println("PhoneNo: "+phoneno);  
    System.out.println("Department: "+department);  
}  
}  
