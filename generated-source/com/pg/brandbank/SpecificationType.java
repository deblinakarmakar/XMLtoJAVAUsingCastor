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
 * Class SpecificationType.
 * 
 * @version $Revision$ $Date$
 */
public class SpecificationType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _timeZone
     */
    private java.lang.String _timeZone;

    /**
     * Field _dataVersion
     */
    private com.pg.brandbank.DataVersion _dataVersion;

    /**
     * Field _message
     */
    private com.pg.brandbank.Message _message;

    /**
     * Field _productList
     */
    private java.util.ArrayList _productList;

    /**
     * Field _extractStatus
     */
    private com.pg.brandbank.ExtractStatus _extractStatus;


      //----------------/
     //- Constructors -/
    //----------------/

    public SpecificationType() 
     {
        super();
        _productList = new ArrayList();
    } //-- com.pg.brandbank.SpecificationType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addProduct
     * 
     * 
     * 
     * @param vProduct
     */
    public void addProduct(com.pg.brandbank.Product vProduct)
        throws java.lang.IndexOutOfBoundsException
    {
        _productList.add(vProduct);
    } //-- void addProduct(com.pg.brandbank.Product) 

    /**
     * Method addProduct
     * 
     * 
     * 
     * @param index
     * @param vProduct
     */
    public void addProduct(int index, com.pg.brandbank.Product vProduct)
        throws java.lang.IndexOutOfBoundsException
    {
        _productList.add(index, vProduct);
    } //-- void addProduct(int, com.pg.brandbank.Product) 

    /**
     * Method clearProduct
     * 
     */
    public void clearProduct()
    {
        _productList.clear();
    } //-- void clearProduct() 

    /**
     * Method enumerateProduct
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateProduct()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_productList.iterator());
    } //-- java.util.Enumeration enumerateProduct() 

    /**
     * Returns the value of field 'dataVersion'.
     * 
     * @return DataVersion
     * @return the value of field 'dataVersion'.
     */
    public com.pg.brandbank.DataVersion getDataVersion()
    {
        return this._dataVersion;
    } //-- com.pg.brandbank.DataVersion getDataVersion() 

    /**
     * Returns the value of field 'extractStatus'.
     * 
     * @return ExtractStatus
     * @return the value of field 'extractStatus'.
     */
    public com.pg.brandbank.ExtractStatus getExtractStatus()
    {
        return this._extractStatus;
    } //-- com.pg.brandbank.ExtractStatus getExtractStatus() 

    /**
     * Returns the value of field 'message'.
     * 
     * @return Message
     * @return the value of field 'message'.
     */
    public com.pg.brandbank.Message getMessage()
    {
        return this._message;
    } //-- com.pg.brandbank.Message getMessage() 

    /**
     * Method getProduct
     * 
     * 
     * 
     * @param index
     * @return Product
     */
    public com.pg.brandbank.Product getProduct(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _productList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Product) _productList.get(index);
    } //-- com.pg.brandbank.Product getProduct(int) 

    /**
     * Method getProduct
     * 
     * 
     * 
     * @return Product
     */
    public com.pg.brandbank.Product[] getProduct()
    {
        int size = _productList.size();
        com.pg.brandbank.Product[] mArray = new com.pg.brandbank.Product[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Product) _productList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Product[] getProduct() 

    /**
     * Method getProductCount
     * 
     * 
     * 
     * @return int
     */
    public int getProductCount()
    {
        return _productList.size();
    } //-- int getProductCount() 

    /**
     * Returns the value of field 'timeZone'.
     * 
     * @return String
     * @return the value of field 'timeZone'.
     */
    public java.lang.String getTimeZone()
    {
        return this._timeZone;
    } //-- java.lang.String getTimeZone() 

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
     * Method removeProduct
     * 
     * 
     * 
     * @param vProduct
     * @return boolean
     */
    public boolean removeProduct(com.pg.brandbank.Product vProduct)
    {
        boolean removed = _productList.remove(vProduct);
        return removed;
    } //-- boolean removeProduct(com.pg.brandbank.Product) 

    /**
     * Sets the value of field 'dataVersion'.
     * 
     * @param dataVersion the value of field 'dataVersion'.
     */
    public void setDataVersion(com.pg.brandbank.DataVersion dataVersion)
    {
        this._dataVersion = dataVersion;
    } //-- void setDataVersion(com.pg.brandbank.DataVersion) 

    /**
     * Sets the value of field 'extractStatus'.
     * 
     * @param extractStatus the value of field 'extractStatus'.
     */
    public void setExtractStatus(com.pg.brandbank.ExtractStatus extractStatus)
    {
        this._extractStatus = extractStatus;
    } //-- void setExtractStatus(com.pg.brandbank.ExtractStatus) 

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(com.pg.brandbank.Message message)
    {
        this._message = message;
    } //-- void setMessage(com.pg.brandbank.Message) 

    /**
     * Method setProduct
     * 
     * 
     * 
     * @param index
     * @param vProduct
     */
    public void setProduct(int index, com.pg.brandbank.Product vProduct)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _productList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _productList.set(index, vProduct);
    } //-- void setProduct(int, com.pg.brandbank.Product) 

    /**
     * Method setProduct
     * 
     * 
     * 
     * @param productArray
     */
    public void setProduct(com.pg.brandbank.Product[] productArray)
    {
        //-- copy array
        _productList.clear();
        for (int i = 0; i < productArray.length; i++) {
            _productList.add(productArray[i]);
        }
    } //-- void setProduct(com.pg.brandbank.Product) 

    /**
     * Sets the value of field 'timeZone'.
     * 
     * @param timeZone the value of field 'timeZone'.
     */
    public void setTimeZone(java.lang.String timeZone)
    {
        this._timeZone = timeZone;
    } //-- void setTimeZone(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return SpecificationType
     */
    public static com.pg.brandbank.SpecificationType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.SpecificationType) Unmarshaller.unmarshal(com.pg.brandbank.SpecificationType.class, reader);
    } //-- com.pg.brandbank.SpecificationType unmarshal(java.io.Reader) 

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
