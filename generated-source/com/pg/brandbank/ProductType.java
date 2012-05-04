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
import java.util.Date;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ProductType.
 * 
 * @version $Revision$ $Date$
 */
public class ProductType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _action
     */
    private int _action;

    /**
     * keeps track of state for field: _action
     */
    private boolean _has_action;

    /**
     * Field _language
     */
    private java.lang.String _language = "EN";

    /**
     * Field _country
     */
    private java.lang.String _country = "ZE";

    /**
     * Field _versionDateTime
     */
    private java.util.Date _versionDateTime;

    /**
     * Field _productStartDateTime
     */
    private java.util.Date _productStartDateTime;

    /**
     * Field _productEndDateTime
     */
    private java.util.Date _productEndDateTime;

    /**
     * Field _pack
     */
    private com.pg.brandbank.Pack _pack;

    /**
     * Field _anyObject
     */
    private java.util.ArrayList _anyObject;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProductType() 
     {
        super();
        setLanguage("EN");
        setCountry("ZE");
        _anyObject = new ArrayList();
    } //-- com.pg.brandbank.ProductType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAnyObject
     * 
     * 
     * 
     * @param vAnyObject
     */
    public void addAnyObject(java.lang.Object vAnyObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _anyObject.add(vAnyObject);
    } //-- void addAnyObject(java.lang.Object) 

    /**
     * Method addAnyObject
     * 
     * 
     * 
     * @param index
     * @param vAnyObject
     */
    public void addAnyObject(int index, java.lang.Object vAnyObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _anyObject.add(index, vAnyObject);
    } //-- void addAnyObject(int, java.lang.Object) 

    /**
     * Method clearAnyObject
     * 
     */
    public void clearAnyObject()
    {
        _anyObject.clear();
    } //-- void clearAnyObject() 

    /**
     * Method deleteAction
     * 
     */
    public void deleteAction()
    {
        this._has_action= false;
    } //-- void deleteAction() 

    /**
     * Method enumerateAnyObject
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateAnyObject()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_anyObject.iterator());
    } //-- java.util.Enumeration enumerateAnyObject() 

    /**
     * Returns the value of field 'action'.
     * 
     * @return int
     * @return the value of field 'action'.
     */
    public int getAction()
    {
        return this._action;
    } //-- int getAction() 

    /**
     * Method getAnyObject
     * 
     * 
     * 
     * @param index
     * @return Object
     */
    public java.lang.Object getAnyObject(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _anyObject.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (java.lang.Object) _anyObject.get(index);
    } //-- java.lang.Object getAnyObject(int) 

    /**
     * Method getAnyObject
     * 
     * 
     * 
     * @return Object
     */
    public java.lang.Object[] getAnyObject()
    {
        int size = _anyObject.size();
        java.lang.Object[] mArray = new java.lang.Object[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (java.lang.Object) _anyObject.get(index);
        }
        return mArray;
    } //-- java.lang.Object[] getAnyObject() 

    /**
     * Method getAnyObjectCount
     * 
     * 
     * 
     * @return int
     */
    public int getAnyObjectCount()
    {
        return _anyObject.size();
    } //-- int getAnyObjectCount() 

    /**
     * Returns the value of field 'country'.
     * 
     * @return String
     * @return the value of field 'country'.
     */
    public java.lang.String getCountry()
    {
        return this._country;
    } //-- java.lang.String getCountry() 

    /**
     * Returns the value of field 'language'.
     * 
     * @return String
     * @return the value of field 'language'.
     */
    public java.lang.String getLanguage()
    {
        return this._language;
    } //-- java.lang.String getLanguage() 

    /**
     * Returns the value of field 'pack'.
     * 
     * @return Pack
     * @return the value of field 'pack'.
     */
    public com.pg.brandbank.Pack getPack()
    {
        return this._pack;
    } //-- com.pg.brandbank.Pack getPack() 

    /**
     * Returns the value of field 'productEndDateTime'.
     * 
     * @return Date
     * @return the value of field 'productEndDateTime'.
     */
    public java.util.Date getProductEndDateTime()
    {
        return this._productEndDateTime;
    } //-- java.util.Date getProductEndDateTime() 

    /**
     * Returns the value of field 'productStartDateTime'.
     * 
     * @return Date
     * @return the value of field 'productStartDateTime'.
     */
    public java.util.Date getProductStartDateTime()
    {
        return this._productStartDateTime;
    } //-- java.util.Date getProductStartDateTime() 

    /**
     * Returns the value of field 'versionDateTime'.
     * 
     * @return Date
     * @return the value of field 'versionDateTime'.
     */
    public java.util.Date getVersionDateTime()
    {
        return this._versionDateTime;
    } //-- java.util.Date getVersionDateTime() 

    /**
     * Method hasAction
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAction()
    {
        return this._has_action;
    } //-- boolean hasAction() 

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
     * Method removeAnyObject
     * 
     * 
     * 
     * @param vAnyObject
     * @return boolean
     */
    public boolean removeAnyObject(java.lang.Object vAnyObject)
    {
        boolean removed = _anyObject.remove(vAnyObject);
        return removed;
    } //-- boolean removeAnyObject(java.lang.Object) 

    /**
     * Sets the value of field 'action'.
     * 
     * @param action the value of field 'action'.
     */
    public void setAction(int action)
    {
        this._action = action;
        this._has_action = true;
    } //-- void setAction(int) 

    /**
     * Method setAnyObject
     * 
     * 
     * 
     * @param index
     * @param vAnyObject
     */
    public void setAnyObject(int index, java.lang.Object vAnyObject)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _anyObject.size())) {
            throw new IndexOutOfBoundsException();
        }
        _anyObject.set(index, vAnyObject);
    } //-- void setAnyObject(int, java.lang.Object) 

    /**
     * Method setAnyObject
     * 
     * 
     * 
     * @param anyObjectArray
     */
    public void setAnyObject(java.lang.Object[] anyObjectArray)
    {
        //-- copy array
        _anyObject.clear();
        for (int i = 0; i < anyObjectArray.length; i++) {
            _anyObject.add(anyObjectArray[i]);
        }
    } //-- void setAnyObject(java.lang.Object) 

    /**
     * Sets the value of field 'country'.
     * 
     * @param country the value of field 'country'.
     */
    public void setCountry(java.lang.String country)
    {
        this._country = country;
    } //-- void setCountry(java.lang.String) 

    /**
     * Sets the value of field 'language'.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(java.lang.String language)
    {
        this._language = language;
    } //-- void setLanguage(java.lang.String) 

    /**
     * Sets the value of field 'pack'.
     * 
     * @param pack the value of field 'pack'.
     */
    public void setPack(com.pg.brandbank.Pack pack)
    {
        this._pack = pack;
    } //-- void setPack(com.pg.brandbank.Pack) 

    /**
     * Sets the value of field 'productEndDateTime'.
     * 
     * @param productEndDateTime the value of field
     * 'productEndDateTime'.
     */
    public void setProductEndDateTime(java.util.Date productEndDateTime)
    {
        this._productEndDateTime = productEndDateTime;
    } //-- void setProductEndDateTime(java.util.Date) 

    /**
     * Sets the value of field 'productStartDateTime'.
     * 
     * @param productStartDateTime the value of field
     * 'productStartDateTime'.
     */
    public void setProductStartDateTime(java.util.Date productStartDateTime)
    {
        this._productStartDateTime = productStartDateTime;
    } //-- void setProductStartDateTime(java.util.Date) 

    /**
     * Sets the value of field 'versionDateTime'.
     * 
     * @param versionDateTime the value of field 'versionDateTime'.
     */
    public void setVersionDateTime(java.util.Date versionDateTime)
    {
        this._versionDateTime = versionDateTime;
    } //-- void setVersionDateTime(java.util.Date) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ProductType
     */
    public static com.pg.brandbank.ProductType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ProductType) Unmarshaller.unmarshal(com.pg.brandbank.ProductType.class, reader);
    } //-- com.pg.brandbank.ProductType unmarshal(java.io.Reader) 

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
