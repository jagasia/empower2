import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile implements Comparable<Mobile>
{
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public Mobile() {
		
	}

	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getLaunchedDate()
	{
		return launchedDate;
	}
	
	public String getLaunchedDate1() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(launchedDate);
	}
	

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	static Mobile createMobile(String detail)
	{
//		#MT 52 PLY-017,G6 Play,5.7,11999,02-01-2016
		String[] arr = detail.split(",");		//regex is pending.
		Mobile mobile=new Mobile();
		mobile.setReferenceId(arr[0]);
		mobile.setModelName(arr[1]);
		mobile.setDisplaySize(Double.parseDouble(arr[2]));
		mobile.setPrice(Double.valueOf(arr[3]));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date launchedDate=null;
		try {
			launchedDate=sdf.parse(arr[4]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mobile.setLaunchedDate(launchedDate);
		return mobile;
	}

	@Override
	public int compareTo(Mobile o) {
		return this.getPrice().compareTo(o.getPrice());
	}
}
