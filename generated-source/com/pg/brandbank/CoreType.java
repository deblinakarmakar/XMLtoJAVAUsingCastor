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
import java.util.ArrayList;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class CoreType.
 * 
 * @version $Revision$ $Date$
 */
public class CoreType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _productCodeList
     */
    private java.util.ArrayList _productCodeList;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _manufacturer
     */
    private com.pg.brandbank.Manufacturer _manufacturer;


      //----------------/
     //- Constructors -/
    //----------------/

    public CoreType() 
     {
        super();
        _productCodeList = new ArrayList();
    } //-- com.pg.brandbank.CoreType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addProductCode
     * 
     * 
     * 
     * @param vProductCode
     */
    public void addProductCode(com.pg.brandbank.ProductCode vProductCode)
        throws java.lang.IndexOutOfBoundsException
    {
        _productCodeList.add(vProductCode);
    } //-- void addProductCode(com.pg.brandbank.ProductCode) 

    /**
     * Method addProductCode
     * 
     * 
     * 
     * @param index
     * @param vProductCode
     */
    public void addProductCode(int index, com.pg.brandbank.ProductCode vProductCode)
        throws java.lang.IndexOutOfBoundsException
    {
        _productCodeList.add(index, vProductCode);
    } //-- void addProductCode(int, com.pg.brandbank.ProductCode) 

    /**
     * Method clearProductCode
     * 
     */
    public void clearProductCode()
    {
        _productCodeList.clear();
    } //-- void clearProductCode() 

    /**
     * Method enumerateProductCode
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateProductCode()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_productCodeList.iterator());
    } //-- java.util.Enumeration enumerateProductCode() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return String
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'manufacturer'.
     * 
     * @return Manufacturer
     * @return the value of field 'manufacturer'.
     */
    public com.pg.brandbank.Manufacturer getManufacturer()
    {
        return this._manufacturer;
    } //-- com.pg.brandbank.Manufacturer getManufacturer() 

    /**
     * Method getProductCode
     * 
     * 
     * 
     * @param index
     * @return ProductCode
     */
    public com.pg.brandbank.ProductCode getProductCode(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _productCodeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.ProductCode) _productCodeList.get(index);
    } //-- com.pg.brandbank.ProductCode getProductCode(int) 

    /**
     * Method getProductCode
     * 
     * 
     * 
     * @return ProductCode
     */
    public com.pg.brandbank.ProductCode[] getProductCode()
    {
        int size = _productCodeList.size();
        com.pg.brandbank.ProductCode[] mArray = new com.pg.brandbank.ProductCode[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.ProductCode) _productCodeList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.ProductCode[] getProductCode() 

    /**
     * Method getProductCodeCount
     * 
     * 
     * 
     * @return int
     */
    public int getProductCodeCount()
    {
        return _productCodeList.size();
    } //-- int getProductCodeCount() 

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
     * Method removeProductCode
     * 
     * 
     * 
     * @param vProductCode
     * @return boolean
     */
    public boolean removeProductCode(com.pg.brandbank.ProductCode vProductCode)
    {
        boolean removed = _productCodeList.remove(vProductCode);
        return removed;
    } //-- boolean removeProductCode(com.pg.brandbank.ProductCode) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'manufacturer'.
     * 
     * @param manufacturer the value of field 'manufacturer'.
     */
    public void setManufacturer(com.pg.brandbank.Manufacturer manufacturer)
    {
        this._manufacturer = manufacturer;
    } //-- void setManufacturer(com.pg.brandbank.Manufacturer) 

    /**
     * Method setProductCode
     * 
     * 
     * 
     * @param index
     * @param vProductCode
     */
    public void setProductCode(int index, com.pg.brandbank.ProductCode vProductCode)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _productCodeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _productCodeList.set(index, vProductCode);
    } //-- void setProductCode(int, com.pg.brandbank.ProductCode) 

    /**
     * Method setProductCode
     * 
     * 
     * 
     * @param productCodeArray
     */
    public void setProductCode(com.pg.brandbank.ProductCode[] productCodeArray)
    {
        //-- copy array
        _productCodeList.clear();
        for (int i = 0; i < productCodeArray.length; i++) {
            _productCodeList.add(productCodeArray[i]);
        }
    } //-- void setProductCode(com.pg.brandbank.ProductCode) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return CoreType
     */
    public static com.pg.brandbank.CoreType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.CoreType) Unmarshaller.unmarshal(com.pg.brandbank.CoreType.class, reader);
    } //-- com.pg.brandbank.CoreType unmarshal(java.io.Reader) 

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
