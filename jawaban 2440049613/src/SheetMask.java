
public class SheetMask extends Mask{
private String EssenceName;


public SheetMask(String maskName, String type, int maskPrice, int maskid, String essenceName) {
	super(maskName, type, maskPrice, maskid);
	EssenceName = essenceName;
}


public String getEssenceName() {
	return EssenceName;
}


public void setEssenceName(String essenceName) {
	EssenceName = essenceName;
}


@Override
public void print() {
	System.out.println("Mask ID : " +getMaskid() );
	System.out.println("Mask Name : " +getMaskName());
	System.out.println("Mask Price : " +getMaskPrice());
	System.out.println("Mask Type : " +getType());
	System.out.println("Mask Ingredient : " +getEssenceName());
	
}





}
