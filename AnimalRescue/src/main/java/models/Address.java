
package models;

/**
 *
 * @author vicken
 */
public class Address {
    
    private int addressID; // primary key
    private int houseNum;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private long latitude;
    private long longitude;
    
    public Address(int addressID, int houseNum, String street, String city, String state,
            int zipCode, long latitude, long longitude){
        this.addressID = addressID;
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public boolean isMatch(String name){
        if(getAddressID() == addressID) return true;
        return false;
    }
    
    public int getAddressID(){
        return addressID;
    }
    
    public void setAddressID(int addressID){
        this.addressID = addressID;
    }
    
    public int getHouseNum() {
        return houseNum;
    }
    
    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }
    
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getLatitude() {
        return latitude;
    }
    
    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }
    
    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
