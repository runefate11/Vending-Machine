/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 348564469
 */
public class B3 implements Snacks{
    private String name;
    private String descripAndHealthInfo;
    private double boughtPrice;
    private double sellPrice;
    private int numOfItem;

    public B3() {
        setName("");
        setDescripAndHealthInfo("");
        setBoughtPrice(1.00);
        setSellPrice(2.00);
        setNumOfItem(4);
    }

    public double getBoughtPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSellPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescriptionAndHealthInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @param boughtPrice the boughtPrice to set
     */
    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
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
