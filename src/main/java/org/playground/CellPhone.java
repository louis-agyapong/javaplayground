package org.playground;

/**
 * The cell phone class holds data about a cell phone.
 */

public class CellPhone {
    // Fields
    private String manufacturer;
    private String model;
    private double retailPrice;

    /**
     * Constructor
     * @param manufacturer The phone's manufacturer.
     * @param model The phone's model.
     * @param retailPrice The phone's retail price.
     */
    public CellPhone(String manufacturer, String model, double retailPrice) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    /**
     * The setManufacturer method sets the phone's manufacturer
     * name.
     * @param manufacturer The phone's manufacturer.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * The setModel method sets the phone's model
     * number.
     * @param model The phone's model number.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The setRetailPrice sets the phone's retail
     * price.
     * @param retailPrice The phone's retail price.
     */
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
