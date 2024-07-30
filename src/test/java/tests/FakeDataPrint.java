package tests;

import com.github.javafaker.Faker;

public class FakeDataPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker fakeData = new Faker();
		String fName = fakeData.name().firstName();
		String lName = fakeData.name().lastName();
		String regEmail = fakeData.internet().emailAddress();
		String password = fakeData.number().digits(8).toString();
		
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(regEmail);
		System.out.println(password);
		
	}

}
