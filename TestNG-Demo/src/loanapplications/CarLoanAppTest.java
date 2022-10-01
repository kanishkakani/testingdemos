package loanapplications;

import org.testng.annotations.Test;

public class CarLoanAppTest {

	@Test(timeOut = 4000)
	public void CarLoanLoginWeb() {
		System.out.println("Car loan web login");
	}
	@Test(enabled = false)
	public void CarLoanLoginMobile() {
		System.out.println("Car loan mobile login");
	}
	@Test(dependsOnMethods = {"CarLoanLoginWeb"})
	public void CarLoanLoginApi() {
		System.out.println("Car loan api login");
	}
}
