import java.util.Scanner;
import java.util.*;
//construction chaining 
public class Product{

	private String productName;
	private int price;
	private boolean inStock;
	private List<String> tags;

	public Product(String pn, int p, boolean iS, List<String> item){
		if(pn == null)
		{
			this.productName = "Unknown";
		}
		else
		{
			this.productName = pn;
		}
		if(p < 0)
		{
			this.price = 0;
		}
		else 
		{
			this.price = p;
		}
		this.inStock = iS;
		if (item == null)
		{
			this.tags = new ArrayList<>();
		}
		else 
		{
			this.tags = new ArrayList<>(item);
		}
	}


	public Product()
	{
		this("Unknown",0,false, new ArrayList<>());
	}
	public Product(String pn)
	{
		this(pn,0,false, new ArrayList<>());
	}
	public Product(String pn, int p)
	{
		this(pn,p,false, new ArrayList<>());
	}
	public Product(String pn, int p, boolean iS)
	{
		this(pn, p, iS, new ArrayList<>());
	}
	public Product(String pn, int p, List<String> item)
	{
		this(pn, p, false, item);
	}



//deep copy
	public Product(Product obj)
	{
		this(obj.productName, obj.price, obj.inStock, new ArrayList<String>(obj.tags));
	}


	public List<String> getTags()
	{
		return tags;
	}
	public void addTag(String Tag)
	{
		if(Tag instanceof String == true)
		{
			tags.add(Tag);
		}
		else 
		{
			System.out.println("Error");
		}
	}


@Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", tags=" + tags +
                '}';
    }

}
