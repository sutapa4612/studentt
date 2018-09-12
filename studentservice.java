package service;
import java.util.ArrayList;
import java.util.List;

import data.studentdata;
import data.studentpro;
public class studentservice {
public List check(String branch)
{
	studentdata s1=new studentdata();
	
	List<studentpro> student_list = s1.data();
	
	List<studentpro>  newlist = new ArrayList<>();
	
	
	for(studentpro sp :student_list)
	{
		if(sp.getBranch().equals(branch))
		{
			System.out.println(sp);
			newlist.add(sp);
		}
		
	}

 return newlist;
}
}
