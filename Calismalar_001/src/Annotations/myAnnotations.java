package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // bu annotasyon s�n�f� runtime zaman�nda da cal�ss�n d�e yaz�l�r
@Target({ElementType.METHOD})// bu annotions umetod gibi g�r
public @interface myAnnotations {
	
	public enum Onem {
		LOW, MEDIUM, HIGH
	
	}

	Onem onem() default Onem.MEDIUM;

	String adi() default "yazlimci";// eger valueleri kendimiz girmez ise
									// default olrak bu degerler atan�r

	String yas() default "42";

   String amac() default "Egitim";
   
}
//
//Java Annotations
//Annotationlar javada meta data olu�turmak i�in kullan�lan ifadelerdir. Java 5 ve sonras�nda javaya dahil olmu�lard�r.�e�itleri;
//
//Compiler annotations
//Build-time annotations
//Runtime annotations
//
//
//Yaz�m�:
//En basit sekilde @ sonuna gelen attributelerle yaz�l�r.
//@Entity // en temel yaz�md�r. Bir varl�k oldugunu g�sterir.
//@Entity(tableAdi="Ara�") // de�er al�naca�� zaman bu �ekilde g�sterilir.
//@Entity(tableAdi="Ara�",no="id") //birden fazla deger alabilir
//@Entity(Value="yes")----->@Entity("yes") // tek elaman al�yorsa bu sek�lde yaz�labilir.
//
//Built-in Java Annotations
//Java compilere bilgi veren annotasyonlard�r.
//@Deprecated
//Bir kodun daha gunceli yaz�ld�g�nda veya herhangi bir nedenden dolay� o kod kullan�lmayaca�� zama kodu silmek yerine bu annotasyon ile devre d��� b�rabiliriz.
//@deprecated
///**
//@deprecated use mynewComputer
//*/
//public class MyComputer(){
////kullan�lmayan s�n�ff
//}
//@Override
//
//S�per classtaki bir metotu sub classa ekleyece�imiz zamn kulland���m�z annotationstur. Amac� bu metodun import edildi�ini g�stermektir.Kullan�lmas� zorunlu de�ildir fakat kulllanmazsak eger biri superclass�n ad�n� de�i�tirirse sub classlar�n bundan haberi olmaycakt�r ve derley�c� hata verecektir.
//@SuppressWarnings
//
//
//�al��an kodda derleyicin verdi�i hatalar� ezmeye yarayan metoddur.
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
//Kendi Java Annotationsumuzu Yaratal�m
//Javada kendi Annotationsumuzu yaratmak m�mk�nd�r.Bunun i�in annotasyonlar�m�z� interface olarak yaratabiliriz ve classta ca��rabiliriz. @interface ile yaz�p kullanabiliriz.
//public @interface myAnnotations {
// public enum Onem {
// LOW, MEDIUM, HIGH
//}
//
//Onem onem() default Onem.LOW; // eger valueleri kendimiz girmez ise default olrak bunlar atan�r
//String adi() default "yazlimci";
//String yas() default "42";
//String amac() default "Egitim";
//}
//
//public class Main {// mainde cag�rma
//
// @myAnnotations //
//
//}
//
//
//@Retention
//
//
//Tutma al�koyma anlam�na gelir.Kisisel Annotationslar�n�z runtime s�ras�nda da �al��mas�n� istiyorsan�z kullanabilirsinz.
//
//@Retention(RetentionPolicy.RUNTIME)
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//
//@Retention(RetentionPolicy.RUNTIME) // bu annotasyon s�n�f� runtime zaman�nda da cal�ss�n d�e yaz�l�r
//public @interface myAnnotations {
//String adi() default "yazlimci";// eger valueleri kendimiz girmez ise
// // default olrak bu degerler atan�r
//
//}
//
//@Target
//E�er annotationunuz t�r atamak istiyorsan�z bu metodolojiyi kullnman�z gerekir. Tas�mas�n� istiyorsan�z kullanacag�n�z yap�.
//
//Olas� annotations atributeleri;
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
//@Retention(RetentionPolicy.RUNTIME) // bu annotasyon s�n�f� runtime zaman�nda da cal�ss�n d�e yaz�l�r
//@Target({ElementType.METHOD})// bu annotionsumetod gibi g�r
//public @interface myAnnotations {
//String adi() default "yazlimci";// eger valueleri kendimiz girmez ise
// // default olrak bu degerler atan�r
//

