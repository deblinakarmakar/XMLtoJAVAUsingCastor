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
 * Class ResourceType.
 * 
 * @version $Revision$ $Date$
 */
public class ResourceType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _usageId
     */
    private short _usageId;

    /**
     * keeps track of state for field: _usageId
     */
    private boolean _has_usageId;

    /**
     * Field _usage
     */
    private java.lang.String _usage;

    /**
     * Field _mimeType
     */
    private java.lang.String _mimeType;

    /**
     * Field _anyObject
     */
    private java.util.ArrayList _anyObject;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceType() 
     {
        super();
        _anyObject = new ArrayList();
    } //-- com.pg.brandbank.ResourceType()


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
     * Method deleteUsageId
     * 
     */
    public void deleteUsageId()
    {
        this._has_usageId= false;
    } //-- void deleteUsageId() 

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
     * Returns the value of field 'mimeType'.
     * 
     * @return String
     * @return the value of field 'mimeType'.
     */
    public java.lang.String getMimeType()
    {
        return this._mimeType;
    } //-- java.lang.String getMimeType() 

    /**
     * Returns the value of field 'usage'.
     * 
     * @return String
     * @return the value of field 'usage'.
     */
    public java.lang.String getUsage()
    {
        return this._usage;
    } //-- java.lang.String getUsage() 

    /**
     * Returns the value of field 'usageId'.
     * 
     * @return short
     * @return the value of field 'usageId'.
     */
    public short getUsageId()
    {
        return this._usageId;
    } //-- short getUsageId() 

    /**
     * Method hasUsageId
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasUsageId()
    {
        return this._has_usageId;
    } //-- boolean hasUsageId() 

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
     * Sets the value of field 'mimeType'.
     * 
     * @param mimeType the value of field 'mimeType'.
     */
    public void setMimeType(java.lang.String mimeType)
    {
        this._mimeType = mimeType;
    } //-- void setMimeType(java.lang.String) 

    /**
     * Sets the value of field 'usage'.
     * 
     * @param usage the value of field 'usage'.
     */
    public void setUsage(java.lang.String usage)
    {
        this._usage = usage;
    } //-- void setUsage(java.lang.String) 

    /**
     * Sets the value of field 'usageId'.
     * 
     * @param usageId the value of field 'usageId'.
     */
    public void setUsageId(short usageId)
    {
        this._usageId = usageId;
        this._has_usageId = true;
    } //-- void setUsageId(short) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ResourceType
     */
    public static com.pg.brandbank.ResourceType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ResourceType) Unmarshaller.unmarshal(com.pg.brandbank.ResourceType.class, reader);
    } //-- com.pg.brandbank.ResourceType unmarshal(java.io.Reader) 

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
