package data;
import java.awt.List;
import java.util.ArrayList;
public class studentdata {
public ArrayList data()
{
	
	ArrayList<studentpro> list = new ArrayList<>();
	
	studentpro s1=new studentpro();
	studentpro s2=new studentpro();
	studentpro s3=new studentpro();
	studentpro s4=new studentpro();
	studentpro s5=new studentpro();
     
    s1.setAge(19);
    s1.setBranch("ECE");
    s1.setGender('f');
    s1.setId(1000);
    s1.setName("sutapa");
	s1.setMob_no("78797089");
	
	
	s2.setAge(20);
    s2.setBranch("CSE");
    s2.setGender('f');
    s2.setId(1001);
    s2.setName("jayatri");
	s2.setMob_no("78797689");
	
	
	s3.setAge(19);
    s3.setBranch("IT");
    s3.setGender('m');
    s3.setId(1002);
    s3.setName("chirag");
	s3.setMob_no("78797889");
	
	
	s4.setAge(21);
    s4.setBranch("ECE");
    s4.setGender('m');
    s4.setId(1003);
    s4.setName("ujjwal");
	s4.setMob_no("78787089");
	
	s5.setAge(22);
    s5.setBranch("MECH");
    s5.setGender('f');
    s5.setId(1004);
    s5.setName("sandeep");
	s5.setMob_no("78797089");
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	return list;
}
}
