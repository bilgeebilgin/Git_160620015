package Annotations;

public class MyComputer extends MyOffice {
@myAnnotations(yas="23")
	
	@Override
	public void workEclipse() {
		System.out.println("Eclipse Working");

	}

	@Deprecated
	public void workEclipseLast() {
		System.out.println("Eclipse Working last week with @Deprecated ");

	}


}
