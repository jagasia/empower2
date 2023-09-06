import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class University {
	private String name;
	private List<College> collegeList=new ArrayList<>();
	
	public University() {
//		collegeList=new ArrayList<College>();
	}

	public University(String name, List<College> collegeList) {
		super();
		this.name = name;
		this.collegeList = collegeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	

	
	
	public void addCollegeToUniversity(College college) {
		collegeList.add(college);
//		System.out.println("College successfully added");
	}
	public Boolean removeCollege(String name) {
		Iterator<College> it = collegeList.iterator();
		while(it.hasNext())
		{
			College c=it.next();
			if(c.getName().equals(name))
			{
				it.remove();
//				System.out.println("College successfully deleted");
				return true;
			}
		}
//		System.out.println("College not found in the University");
		return false;		
	}
	public void displayColleges() {
		
		if(collegeList.isEmpty())
		{
			System.out.println("No colleges to show");
			return;
		}
		System.out.println("Colleges in "+getName());
		System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		for(College c:collegeList)
		{
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
		}
		
//		for(int i=0;i<collegeList.size();i++)
//		{
//			System.out.println(collegeList.get(i));
//		}
		
//		ListIterator<College> it = collegeList.listIterator(collegeList.size());
//		while(it.hasNext())
//		{
////			College c = it.next();
////			System.out.println(c);
////		}
//		
//		while(it.hasPrevious())
//		{
//			College c = it.previous();
//			System.out.println(c);
//		}
	}

}
