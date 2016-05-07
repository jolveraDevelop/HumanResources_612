/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author Humberto
 */
public class Location {

    private String streetAddress;
    private int postalCode;
    private String city;
    private String stateProvince;
    private String country;

    public Location() {
    } 
    
    public Location(String streetAddress, int postalCode, String city, String stateProvince, String country) {
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.city = city;
        this.stateProvince = stateProvince;
        this.country = country;
    }    
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
