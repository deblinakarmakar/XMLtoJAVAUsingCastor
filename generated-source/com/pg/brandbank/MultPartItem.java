/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package com.pg.brandbank;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class MultPartItem.
 * 
 * @version $Revision$ $Date$
 */
public class MultPartItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _partName
     */
    private java.lang.String _partName;

    /**
     * Field _partNo
     */
    private java.lang.String _partNo;

    /**
     * Field _multPartItemIngredients
     */
    private com.pg.brandbank.MultPartItemIngredients _multPartItemIngredients;

    /**
     * Field _multPartItemNutrition
     */
    private com.pg.brandbank.MultPartItemNutrition _multPartItemNutrition;


      //----------------/
     //- Constructors -/
    //----------------/

    public MultPartItem() 
     {
        super();
    } //-- com.pg.brandbank.MultPartItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'multPartItemIngredients'.
     * 
     * @return MultPartItemIngredients
     * @return the value of field 'multPartItemIngredients'.
     */
    public com.pg.brandbank.MultPartItemIngredients getMultPartItemIngredients()
    {
        return this._multPartItemIngredients;
    } //-- com.pg.brandbank.MultPartItemIngredients getMultPartItemIngredients() 

    /**
     * Returns the value of field 'multPartItemNutrition'.
     * 
     * @return MultPartItemNutrition
     * @return the value of field 'multPartItemNutrition'.
     */
    public com.pg.brandbank.MultPartItemNutrition getMultPartItemNutrition()
    {
        return this._multPartItemNutrition;
    } //-- com.pg.brandbank.MultPartItemNutrition getMultPartItemNutrition() 

    /**
     * Returns the value of field 'partName'.
     * 
     * @return String
     * @return the value of field 'partName'.
     */
    public java.lang.String getPartName()
    {
        return this._partName;
    } //-- java.lang.String getPartName() 

    /**
     * Returns the value of field 'partNo'.
     * 
     * @return String
     * @return the value of field 'partNo'.
     */
    public java.lang.String getPartNo()
    {
        return this._partNo;
    } //-- java.lang.String getPartNo() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'multPartItemIngredients'.
     * 
     * @param multPartItemIngredients the value of field
     * 'multPartItemIngredients'.
     */
    public void setMultPartItemIngredients(com.pg.brandbank.MultPartItemIngredients multPartItemIngredients)
    {
        this._multPartItemIngredients = multPartItemIngredients;
    } //-- void setMultPartItemIngredients(com.pg.brandbank.MultPartItemIngredients) 

    /**
     * Sets the value of field 'multPartItemNutrition'.
     * 
     * @param multPartItemNutrition the value of field
     * 'multPartItemNutrition'.
     */
    public void setMultPartItemNutrition(com.pg.brandbank.MultPartItemNutrition multPartItemNutrition)
    {
        this._multPartItemNutrition = multPartItemNutrition;
    } //-- void setMultPartItemNutrition(com.pg.brandbank.MultPartItemNutrition) 

    /**
     * Sets the value of field 'partName'.
     * 
     * @param partName the value of field 'partName'.
     */
    public void setPartName(java.lang.String partName)
    {
        this._partName = partName;
    } //-- void setPartName(java.lang.String) 

    /**
     * Sets the value of field 'partNo'.
     * 
     * @param partNo the value of field 'partNo'.
     */
    public void setPartNo(java.lang.String partNo)
    {
        this._partNo = partNo;
    } //-- void setPartNo(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MultPartItem
     */
    public static com.pg.brandbank.MultPartItem unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.MultPartItem) Unmarshaller.unmarshal(com.pg.brandbank.MultPartItem.class, reader);
    } //-- com.pg.brandbank.MultPartItem unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
