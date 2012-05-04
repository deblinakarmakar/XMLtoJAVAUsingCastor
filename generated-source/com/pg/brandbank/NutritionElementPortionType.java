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
 * Class NutritionElementPortionType.
 * 
 * @version $Revision$ $Date$
 */
public class NutritionElementPortionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _size
     */
    private java.lang.String _size;

    /**
     * Field _amount
     */
    private java.lang.String _amount;


      //----------------/
     //- Constructors -/
    //----------------/

    public NutritionElementPortionType() 
     {
        super();
    } //-- com.pg.brandbank.NutritionElementPortionType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'amount'.
     * 
     * @return String
     * @return the value of field 'amount'.
     */
    public java.lang.String getAmount()
    {
        return this._amount;
    } //-- java.lang.String getAmount() 

    /**
     * Returns the value of field 'size'.
     * 
     * @return String
     * @return the value of field 'size'.
     */
    public java.lang.String getSize()
    {
        return this._size;
    } //-- java.lang.String getSize() 

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
     * Sets the value of field 'amount'.
     * 
     * @param amount the value of field 'amount'.
     */
    public void setAmount(java.lang.String amount)
    {
        this._amount = amount;
    } //-- void setAmount(java.lang.String) 

    /**
     * Sets the value of field 'size'.
     * 
     * @param size the value of field 'size'.
     */
    public void setSize(java.lang.String size)
    {
        this._size = size;
    } //-- void setSize(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return NutritionElementPortionType
     */
    public static com.pg.brandbank.NutritionElementPortionType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.NutritionElementPortionType) Unmarshaller.unmarshal(com.pg.brandbank.NutritionElementPortionType.class, reader);
    } //-- com.pg.brandbank.NutritionElementPortionType unmarshal(java.io.Reader) 

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
