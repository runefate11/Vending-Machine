package vendingmachine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 348564469
 */
public class Snack {

    private String name;
    private String descripAndHealthInfo;
    private double boughtPrice;
    private double sellPrice;
    private int numOfItem;

    public Snack(String name, String descripAndHealthInfo, double boughtPrice, double sellPrice, int numOfItem) {
        setName(name);
        setDescripAndHealthInfo(descripAndHealthInfo);
        setBoughtPrice(boughtPrice);
        setSellPrice(sellPrice);
        setNumOfItem(numOfItem);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the descripAndHealthInfo
     */
    public String getDescripAndHealthInfo() {
        return descripAndHealthInfo;
    }

    /**
     * @param descripAndHealthInfo the descripAndHealthInfo to set
     */
    public void setDescripAndHealthInfo(String descripAndHealthInfo) {
        this.descripAndHealthInfo = descripAndHealthInfo;
    }

    /**
     * @return the boughtPrice
     */
    public double getBoughtPrice() {
        return boughtPrice;
    }

    /**
     * @param boughtPrice the boughtPrice to set
     */
    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    /**
     * @return the sellPrice
     */
    public double getSellPrice() {
        return sellPrice;
    }

    /**
     * @param sellPrice the sellPrice to set
     */
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * @return the numOfItem
     */
    public int getNumOfItem() {
        return numOfItem;
    }

    /**
     * @param numOfItem the numOfItem to set
     */
    public void setNumOfItem(int numOfItem) {
        this.numOfItem = numOfItem;
    }

}
