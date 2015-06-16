package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // bu annotasyon sýnýfý runtime zamanýnda da calýssýn dýe yazýlýr
@Target({ElementType.METHOD})// bu annotions umetod gibi gör
public @interface myAnnotations {
	
	public enum Onem {
		LOW, MEDIUM, HIGH
	
	}

	Onem onem() default Onem.MEDIUM;

	String adi() default "yazlimci";// eger valueleri kendimiz girmez ise
									// default olrak bu degerler atanýr

	String yas() default "42";

   String amac() default "Egitim";
   
}
//
//Java Annotations
//Annotationlar javada meta data oluþturmak için kullanýlan ifadelerdir. Java 5 ve sonrasýnda javaya dahil olmuþlardýr.Çeþitleri;
//
//Compiler annotations
//Build-time annotations
//Runtime annotations
//
//
//Yazýmý:
//En basit sekilde @ sonuna gelen attributelerle yazýlýr.
//@Entity // en temel yazýmdýr. Bir varlýk oldugunu gösterir.
//@Entity(tableAdi="Araç") // deðer alýnacaðý zaman bu þekilde gösterilir.
//@Entity(tableAdi="Araç",no="id") //birden fazla deger alabilir
//@Entity(Value="yes")----->@Entity("yes") // tek elaman alýyorsa bu sekýlde yazýlabilir.
//
//Built-in Java Annotations
//Java compilere bilgi veren annotasyonlardýr.
//@Deprecated
//Bir kodun daha gunceli yazýldýgýnda veya herhangi bir nedenden dolayý o kod kullanýlmayacaðý zama kodu silmek yerine bu annotasyon ile devre dýþý býrabiliriz.
//@deprecated
///**
//@deprecated use mynewComputer
//*/
//public class MyComputer(){
////kullanýlmayan sýnýff
//}
//@Override
//
//Süper classtaki bir metotu sub classa ekleyeceðimiz zamn kullandýðýmýz annotationstur. Amacý bu metodun import edildiðini göstermektir.Kullanýlmasý zorunlu deðildir fakat kulllanmazsak eger biri superclassýn adýný deðiþtirirse sub classlarýn bundan haberi olmaycaktýr ve derleyýcý hata verecektir.
//@SuppressWarnings
//
//
//Çalýþan kodda derleyicin verdiði hatalarý ezmeye yarayan metoddur.
//
//public class MyOffice {
//@SuppressWarnings(value = { "unused" })
//
////Supper Class
// public void workEclipse() {
// // TODO Auto-generated method stub
//System.out.println("Eclipse Working in Office");
//int null;
//}
//}
//
//
//public class MyComputer extends MyOffice {
//
// @Override
// public void workEclipse() {
//System.out.println("Eclipse Working");
// }
//Kendi Java Annotationsumuzu Yaratalým
//Javada kendi Annotationsumuzu yaratmak mümkündür.Bunun için annotasyonlarýmýzý interface olarak yaratabiliriz ve classta caðýrabiliriz. @interface ile yazýp kullanabiliriz.
//public @interface myAnnotations {
// public enum Onem {
// LOW, MEDIUM, HIGH
//}
//
//Onem onem() default Onem.LOW; // eger valueleri kendimiz girmez ise default olrak bunlar atanýr
//String adi() default "yazlimci";
//String yas() default "42";
//String amac() default "Egitim";
//}
//
//public class Main {// mainde cagýrma
//
// @myAnnotations //
//
//}
//
//
//@Retention
//
//
//Tutma alýkoyma anlamýna gelir.Kisisel Annotationslarýnýz runtime sýrasýnda da çalýþmasýný istiyorsanýz kullanabilirsinz.
//
//@Retention(RetentionPolicy.RUNTIME)
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//
//@Retention(RetentionPolicy.RUNTIME) // bu annotasyon sýnýfý runtime zamanýnda da calýssýn dýe yazýlýr
//public @interface myAnnotations {
//String adi() default "yazlimci";// eger valueleri kendimiz girmez ise
// // default olrak bu degerler atanýr
//
//}
//
//@Target
//Eðer annotationunuz tür atamak istiyorsanýz bu metodolojiyi kullnmanýz gerekir. Tasýmasýný istiyorsanýz kullanacagýnýz yapý.
//
//Olasý annotations atributeleri;
//
//ElementType.ANNOTATION_TYPE
//ElementType.CONSTRUCTOR
//ElementType.FIELD
//ElementType.LOCAL_VARIABLE
//ElementType.METHOD
//ElementType.PACKAGE
//ElementType.PARAMETER
//ElementType.TYPE
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Retention(RetentionPolicy.RUNTIME) // bu annotasyon sýnýfý runtime zamanýnda da calýssýn dýe yazýlýr
//@Target({ElementType.METHOD})// bu annotionsumetod gibi gör
//public @interface myAnnotations {
//String adi() default "yazlimci";// eger valueleri kendimiz girmez ise
// // default olrak bu degerler atanýr
//

