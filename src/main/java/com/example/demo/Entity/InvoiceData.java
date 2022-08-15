package com.example.demo.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerData")

public class InvoiceData {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="Business_Name")
	private String businessname;
	@Column(name="Customer_Address")
	private String address;
	@Column(name="Customer_Name")
	private String contactperson;
	@Column(name="Email_Address")
	private String emailaddress;
	@Column(name="Tel.Number")
	private String telnumber;
	@Column(name="Fax")
	private String fax;
	@Column(name="MobileNumberFor_SMSNotification")
	private String mobnumforsms;
	@Column(name="SpecificTAx")
	private String specifictax;
	@Column(name="Discount")
	private String discount;
	@Column(name="CusyomerCategory")
	private String category;
	@Column(name="CustomerType")
	private String type;
	@Column(name="ShipTOName")
	private String shiptoname;
	@Column(name="ShipToAddress")
	private String shiptoaddress;
	@Column(name="City")
	private String city;
	@Column(name="Country")
	private String country;
	@Column(name="Notes")
	private String notes;
	
	
	public InvoiceData()
	{
		
	}
	
	public InvoiceData(String businessname, String address, String contactperson, String emailaddress,
			String telnumber, String fax, String mobnumforsms, String taxexcempt, String specifictax, String discount,
			String category, String type, String shiptoname, String shiptoaddress, String city, String country,
			String notes) {
		super();
		this.businessname = businessname;
		this.address = address;
		this.contactperson = contactperson;
		this.emailaddress = emailaddress;
		this.telnumber = telnumber;
		this.fax = fax;
		this.mobnumforsms = mobnumforsms;
		this.specifictax = specifictax;
		this.discount = discount;
		this.category = category;
		this.type = type;
		this.shiptoname = shiptoname;
		this.shiptoaddress = shiptoaddress;
		this.city = city;
		this.country = country;
		this.notes = notes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBusinessname() {
		return businessname;
	}
	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactperson() {
		return contactperson;
	}
	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMobnumforsms() {
		return mobnumforsms;
	}
	public void setMobnumforsms(String mobnumforsms) {
		this.mobnumforsms = mobnumforsms;
	}
	public String getSpecifictax() {
		return specifictax;
	}
	public void setSpecifictax(String specifictax) {
		this.specifictax = specifictax;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getShiptoname() {
		return shiptoname;
	}
	public void setShiptoname(String shiptoname) {
		this.shiptoname = shiptoname;
	}
	public String getShiptoaddress() {
		return shiptoaddress;
	}
	public void setShiptoaddress(String shiptoaddress) {
		this.shiptoaddress = shiptoaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
}
