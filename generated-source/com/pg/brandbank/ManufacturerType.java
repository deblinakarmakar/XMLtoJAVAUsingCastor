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
 * Class ManufacturerType.
 * 
 * @version $Revision$ $Date$
 */
public class ManufacturerType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _manufacturerCode
     */
    private com.pg.brandbank.ManufacturerCode _manufacturerCode;

    /**
     * Field _manufacturerTypeName
     */
    private com.pg.brandbank.ManufacturerTypeName _manufacturerTypeName;


      //----------------/
     //- Constructors -/
    //----------------/

    public ManufacturerType() 
     {
        super();
    } //-- com.pg.brandbank.ManufacturerType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'manufacturerCode'.
     * 
     * @return ManufacturerCode
     * @return the value of field 'manufacturerCode'.
     */
    public com.pg.brandbank.ManufacturerCode getManufacturerCode()
    {
        return this._manufacturerCode;
    } //-- com.pg.brandbank.ManufacturerCode getManufacturerCode() 

    /**
     * Returns the value of field 'manufacturerTypeName'.
     * 
     * @return ManufacturerTypeName
     * @return the value of field 'manufacturerTypeName'.
     */
    public com.pg.brandbank.ManufacturerTypeName getManufacturerTypeName()
    {
        return this._manufacturerTypeName;
    } //-- com.pg.brandbank.ManufacturerTypeName getManufacturerTypeName() 

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
     * Sets the value of field 'manufacturerCode'.
     * 
     * @param manufacturerCode the value of field 'manufacturerCode'
     */
    public void setManufacturerCode(com.pg.brandbank.ManufacturerCode manufacturerCode)
    {
        this._manufacturerCode = manufacturerCode;
    } //-- void setManufacturerCode(com.pg.brandbank.ManufacturerCode) 

    /**
     * Sets the value of field 'manufacturerTypeName'.
     * 
     * @param manufacturerTypeName the value of field
     * 'manufacturerTypeName'.
     */
    public void setManufacturerTypeName(com.pg.brandbank.ManufacturerTypeName manufacturerTypeName)
    {
        this._manufacturerTypeName = manufacturerTypeName;
    } //-- void setManufacturerTypeName(com.pg.brandbank.ManufacturerTypeName) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ManufacturerType
     */
    public static com.pg.brandbank.ManufacturerType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ManufacturerType) Unmarshaller.unmarshal(com.pg.brandbank.ManufacturerType.class, reader);
    } //-- com.pg.brandbank.ManufacturerType unmarshal(java.io.Reader) 

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
