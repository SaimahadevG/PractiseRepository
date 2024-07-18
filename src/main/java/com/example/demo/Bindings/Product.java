package com.example.demo.Bindings;

public class Product
{
    private int productid;
    
    public Product(int productid, String productName, String productAddress) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productAddress = productAddress;
	}

	private String productName;
    
    private String productAddress;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductAddress() {
		return productAddress;
	}

	public void setProductAddress(String productAddress) {
		this.productAddress = productAddress;
	}
}
