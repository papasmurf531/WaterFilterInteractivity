/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WaterFilterPackage;

/**
 * Creates all filter items for a water filter. Establishes name, image,
 * pore size, and a simplified pore size value.
 * 
 * @author Tyler Hertenstein, Matt Bishop, Alyson Wolford, Charles Sauerland
 * @Version 1.0.0 - 24 April 2014
 */
public class FilterItem {
    
    public double poreSize;
    public String poreSizeString;
    public String imageFileName;
    public String itemName;
    public static final int NUMBER_OF_STAGES = 5;
    public double[] pointValue;

    
    
    /**
     * Constructs a FilterItem based on passed parameters.
     * @param name Name of object to be constructed.
     * @param image Image file name of this object
     * @param pore Pore size of this object, in microns.
     */
    public FilterItem(String name, String image, String simple, double pore) {
               
        itemName = name;
        imageFileName = image;
        poreSizeString = simple;
        poreSize = pore;
        this.pointValue = new double[NUMBER_OF_STAGES];
        setPointValue();
        
    }
    
    /**
     * Override Method of constructing a Filter Item, if no parameters are immediately known.
     */
    public FilterItem() {
        this.pointValue = new double[NUMBER_OF_STAGES];
    }
    

    
    // * * * * * * * * ACCESSORS * * * * * * * * \\
    
    
    /**
     * Get name of this filter item.
     * @return String of name of item
     */
    public String getItemName() {
        return itemName;
    }
    
    /**
     * Get the name of the file that the filter item's image is saved in.
     * @return String of the image's file name.
     */
    public String getImageFileName() {
        return imageFileName;
    }
    
    /**
     * Get the point value for using this filter item at that stage in the filter.
     * @param stage Stage this filter item is located in on this filter.
     * @return point value of the item at that position.
     */
    public double getPointValue(int stage) {
        return pointValue[stage];
    }
    
    /**
     * Get the size of the pores for comparisons to other items.
     * @return Size of pores in microns.
     */
    public double getPoreSize() {
        return poreSize;
    }   
    
    /**
     * Get the size of the pores in a simple format.
     * @return Size of pores as small, medium, or large.
     */
    public String getPoreSizeString() {
        return poreSizeString;
    }
    
    
    // * * * * * * * * MUTATORS * * * * * * * * \\
    
    /**
     * initializes this object's image file name.
     * @param x value to set the image file name to.
     */
    public void setImageFileName(String x) {
        imageFileName = x;
    }
    
    
    /**
     * initializes this object's item name.
     * @param x value to set the item name to.
     */
    public void setItemName(String x) {
        itemName = x;
    }

    /**
     * Sets point value for each position. 
     * The point value comes depending on the object's pore size.
     */
    public final void setPointValue() {
           
        // set values for small pore point values
        if (poreSizeString.equals("Small")){ 
            pointValue[4] = 5;
            pointValue[3] = 4;
            pointValue[2] = 3;
            pointValue[1] = 2;
            pointValue[0] = 1;         
        }
        
        // set values for medium pore point values
        if(poreSizeString.equals("Medium")){
            pointValue[0] = 1;
            pointValue[1] = 3;
            pointValue[2] = 5;
            pointValue[3] = 3;
            pointValue[4] = 1;
        }
        
        // set values for large pore point values
        if(poreSizeString.equals("Large")){
            pointValue[0] = 5;
            pointValue[1] = 4;
            pointValue[2] = 3;
            pointValue[3] = 2;
            pointValue[4] = 1;
        }
    } 
    
    /**
     * initializes this object's pore size.
     * @param x value to set poreSize to.
     */
    public void setPoreSize(double x) {
        poreSize = x;
        
    }   
    
    /**
     * initializes this object's pore size in a simple format.
     * @param x value to set poreSize to as small, medium, or large.
     */
    public void setPoreSizeString(String x) {
        poreSizeString = x;
        
    }
}
