import com.automobile.twowheeler.*;
public class TestTwoWheelerVehcile {
public static void main(String args[])
{

	Hero H1=new Hero();
	H1.setModelName("Hero R-111");
	H1.setOwnerName("Ravindra111");
	H1.setRegistrationNumber("1908");
	H1.setSpeed(89);
	Honda Hd=new Honda();
	Hd.setModelName("Honda CD100");
	Hd.setOwnerName("Rahul");
	Hd.setRegistrationNumber("8978");
	Hd.setSpeed(80);
    H1.display();
    Hd.display();
}
}
