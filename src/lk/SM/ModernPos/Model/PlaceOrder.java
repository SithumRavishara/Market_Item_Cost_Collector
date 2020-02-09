/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.SM.ModernPos.Model;

/**
 *
 * @author Sithum Ravishara
 */
public class PlaceOrder {

   

    
    private String description;
    private double unitPrice;
    private int qtyOnHand;
    private String ID;
    private String Name;
    private String id;
    private String address;
    private double salary;
    private String code;
    private int qty;
    private double Total;
    private String Orderid;
    private String date;
    private String cusid;
    
    public PlaceOrder(){
    
    }
    
    
    public PlaceOrder(String description,double unitPrice,int qtyOnHand){
    
    this.description=description;
    this.unitPrice=unitPrice;
    this.qtyOnHand=qtyOnHand;
    }
    public PlaceOrder(String Name){
    
    this.Name=Name;
    
    }
     public PlaceOrder(String Orderid,String code,int qty,double unitPrice){
    
    this.Orderid=Orderid;
    this.code=code;
    this.qty=qty;
    this.unitPrice=unitPrice;
    
    
    }
    public PlaceOrder(int qty){
    
    qtyOnHand=(this.qtyOnHand-qty);
    
    }
    public PlaceOrder(String Orderid,String date,String cusid){
    this.Orderid=Orderid;
    this.date=date;
    this.cusid=cusid;
    
    
    }
    public PlaceOrder(String code,String description,int qty,double unitPrice,double Total){
    
    this.description=description;
    this.unitPrice=unitPrice;
    this.qty=qty;
    this.unitPrice=unitPrice;
    this.Total=Total;
    
    }
    
    /**
    *@return the description;
    */
    
    public  String getdescription(){
         return description;
    }
    /**
     * @param description the description to set
     */
    public void setdescription(String description) {
        this.description = description;
    }
    /**
    *@return the code;
    */
    
    public  String getcode(){
         return code;
    }
    /**
     * @param code the code to set
     */
    public void setcode(String code) {
        this.code = code;
    }
    /**
    *@return the Name;
    */
    
    public  String getName(){
         return Name;
    }
    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    /**
    *@return the unitPrice;
    */
    public  double  getunitPrice(){
        return unitPrice;
    }
    /**
     * @param unitPrice the unitPrice to set
     */
    public void setunitprice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    /**
    *@return the qtyOnHand;
    */
    public int getqtyOnHand(){
       return qtyOnHand;
    }
    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setqtyonhand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
     public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
    *@return the qty;
    */
    
    public  int getqty(){
         return qty;
    }
    /**
     * @param qty the qty to set
     */
    public void setqty(int qty) {
        this.qty = qty;
    }
    
    /**
    *@return the Total;
    */
    
    public  double getTotal(){
         return Total;
    }
    /**
     * @param Total the Total to set
     */
    public void setqty(double Total) {
        this.Total = Total;
    }
    /**
    *@return the Orderid;
    */
    
    public  String getOrderid(){
         return Orderid;
    }
    /**
     * @param Orderid the Orderid to set
     */
    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }
    
    /**
    *@return the date;
    */
    
    public  String getdate(){
         return date;
    }
    /**
     * @param date the date to set
     */
    public void setdate(String date) {
        this.date = date;
    }
    
    /**
    *@return the cusid;
    */
    
    public  String getcusid(){
         return cusid;
    }
    /**
     * @param cusid the cusid to set
     */
    public void setcusid(String cusid) {
        this.cusid = cusid;
    }
    
    
    
    
    
    
}
