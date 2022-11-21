public abstract class Mask {

private String MaskName;
private String Type;
private int MaskPrice;
private int Maskid;


public Mask(String maskName, String type, int maskPrice, int maskid) {
	super();
	MaskName = maskName;
	Type = type;
	MaskPrice = maskPrice;
	Maskid = maskid;
}


public String getMaskName() {
	return MaskName;
}


public void setMaskName(String maskName) {
	MaskName = maskName;
}


public String getType() {
	return Type;
}


public void setType(String type) {
	Type = type;
}


public int getMaskPrice() {
	return MaskPrice;
}


public void setMaskPrice(int maskPrice) {
	MaskPrice = maskPrice;
}


public int getMaskid() {
	return Maskid;
}


public void setMaskid(int maskid) {
	Maskid = maskid;
}


public abstract void print();
	


}
