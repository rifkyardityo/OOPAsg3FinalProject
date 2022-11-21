
public class OrganicMask extends Mask{
private String Variant;


public OrganicMask(String maskName, String type, int maskPrice, int maskid, String variant) {
	super(maskName, type, maskPrice, maskid);
	Variant = variant;
}


public String getVariant() {
	return Variant;
}


public void setVariant(String variant) {
	Variant = variant;
}


@Override
public void print() {
	System.out.println("Mask ID : " +getMaskid() );
	System.out.println("Mask Name : " +getMaskName());
	System.out.println("Mask Price : " +getMaskPrice());
	System.out.println("Mask Type : " +getType());
	System.out.println("Mask Ingredient : " +getVariant());
	
}



}
