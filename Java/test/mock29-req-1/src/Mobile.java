import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile {
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public Mobile() {}

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

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Reference Id: %-14s\nModel Name: %-20s\nDisplay Size: %.1f\nPrice: %.1f\nLaunched Date: %-10s\n", referenceId,modelName,displaySize,price,sdf.format(launchedDate));
	}

	@Override
	public boolean equals(Object obj) {
		Mobile arg=(Mobile) obj;
		return this.getReferenceId().equalsIgnoreCase(arg.getReferenceId()) && this.getModelName().equalsIgnoreCase(arg.getModelName());
	}
	
	
}
