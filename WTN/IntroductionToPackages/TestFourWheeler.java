import com.automobile.fourwheeler.*;
public class TestFourWheeler {
public static void main(String args[]) {
	Logan L1=new Logan();
	L1.setModelName("Hero R-111");
	L1.setOwnerName("Ravindra111");
	L1.setRegistrationNumber("1908");
	L1.setSpeed(89);
	L1.display();
	Ford F1=new Ford();
	F1.setModelName("Honda CD100");
	F1.setOwnerName("Rahul");
	F1.setRegistrationNumber("8978");
	F1.setSpeed(80);
    F1.display();
   }
}
