package org.company;
import org.client.*;
public class Company extends Client {
	public void companyName() {
		System.out.println("Comapny Name: "+"Datapatterns");
	}
public static void main(String[] args) {
	Company b1 = new Company();
	b1.companyName();
	b1.clientName();
}
}
