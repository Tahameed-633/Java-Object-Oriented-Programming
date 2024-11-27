package package1;

public class Icecream {
private String IcecreamType;
private String IcecreamCompany;
private double IcecreamPrice;
public Icecream(String Type,String Company,double Price)
{
	IcecreamType=Type;
	IcecreamCompany=Company;
	IcecreamPrice=Price;
}
public void SetIcecreamPrice(double newPrice)
{
	if(newPrice<=this.IcecreamPrice*1.1)
	{
		this.IcecreamPrice=newPrice;
	}
	else
	{
		System.out.println("The increased price is more than 10%,so rejected.The price will remain:"+this.IcecreamPrice);
	}
}
public double GetIcecreamPrice()
{
	return IcecreamPrice;
}
public int Compare(Icecream i) {
    if (this.IcecreamPrice > i.IcecreamPrice) {
        return 1;
    } else if (this.IcecreamPrice == i.IcecreamPrice) {
        return 0;
    } else {
        return -1;
    }
}
public String toString() {
    return "\nIcecream Type: " + IcecreamType +
           "\nIcecream Company: " + IcecreamCompany +
           "\nIcecream Price: " + IcecreamPrice;
}

}
