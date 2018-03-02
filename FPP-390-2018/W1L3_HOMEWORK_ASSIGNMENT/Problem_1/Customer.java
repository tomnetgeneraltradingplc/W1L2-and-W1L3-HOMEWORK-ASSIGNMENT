package Problem_1;

public class Customer {
private String firstName;
private String lastName;
private String socSecurityNum;
private Address billingAddress;
private Address shippingAddress;
public Customer(String firstName, String lastName, String socSecurity) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.socSecurityNum = socSecurity;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSocSecurity() {
	return socSecurityNum;
}
public void setSocSecurity(String socSecurity) {
	this.socSecurityNum = socSecurity;
}
public Address getBillingAddress() {
	return billingAddress;
}
public void setBillingAddress(Address billingAddress) {
	this.billingAddress = billingAddress;
}
public Address getShippingAddress() {
	return shippingAddress;
}
public void setShippingAddress(Address shippingAddress) {
	this.shippingAddress = shippingAddress;
}
@Override
public String toString() {
	return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
}


}
