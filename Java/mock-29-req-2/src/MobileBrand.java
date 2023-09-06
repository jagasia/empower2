import java.util.Iterator;
import java.util.List;

public class MobileBrand {
	private String name;
	private List<Mobile> mobileList;
	
	public MobileBrand() {}

	public MobileBrand(String name, List<Mobile> mobileList) {
		super();
		this.name = name;
		this.mobileList = mobileList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mobile> getMobileList() {
		return mobileList;
	}

	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
	public void addMobileToMobileBrand(Mobile mobile)
	{
		this.mobileList.add(mobile);
	}
	public Boolean removeMobileFromMobileBrand(String referenceId)
	{
		Iterator<Mobile> it = mobileList.iterator();
		while(it.hasNext())
		{
			Mobile m = it.next();
			if(m.getReferenceId().equals(referenceId))
			{
				it.remove();
				return true;
			}
		}
		return false;
	}
	public void displayMobiles()
	{
		if(this.mobileList.size()==0)
		{
			System.out.println("No mobiles to show");
			return;
		}
		System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price","Launched Date");
		for(Mobile m:mobileList)
		{
			System.out.format("%-15s %-15s %-12s %-8s %s\n",m.getReferenceId(),m.getModelName(),m.getDisplaySize(), m.getPrice(),m.getLaunchedDate());
		}
	}

}
