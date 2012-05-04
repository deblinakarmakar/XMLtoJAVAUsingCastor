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
 * Class ExtendedAttributeValuesType.
 * 
 * @version $Revision$ $Date$
 */
public class ExtendedAttributeValuesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _extendedAttributeValueList
     */
    private java.util.ArrayList _extendedAttributeValueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExtendedAttributeValuesType() 
     {
        super();
        _extendedAttributeValueList = new ArrayList();
    } //-- com.pg.brandbank.ExtendedAttributeValuesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addExtendedAttributeValue
     * 
     * 
     * 
     * @param vExtendedAttributeValue
     */
    public void addExtendedAttributeValue(com.pg.brandbank.ExtendedAttributeValue vExtendedAttributeValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _extendedAttributeValueList.add(vExtendedAttributeValue);
    } //-- void addExtendedAttributeValue(com.pg.brandbank.ExtendedAttributeValue) 

    /**
     * Method addExtendedAttributeValue
     * 
     * 
     * 
     * @param index
     * @param vExtendedAttributeValue
     */
    public void addExtendedAttributeValue(int index, com.pg.brandbank.ExtendedAttributeValue vExtendedAttributeValue)
        throws java.lang.IndexOutOfBoundsException
    {
        _extendedAttributeValueList.add(index, vExtendedAttributeValue);
    } //-- void addExtendedAttributeValue(int, com.pg.brandbank.ExtendedAttributeValue) 

    /**
     * Method clearExtendedAttributeValue
     * 
     */
    public void clearExtendedAttributeValue()
    {
        _extendedAttributeValueList.clear();
    } //-- void clearExtendedAttributeValue() 

    /**
     * Method enumerateExtendedAttributeValue
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateExtendedAttributeValue()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_extendedAttributeValueList.iterator());
    } //-- java.util.Enumeration enumerateExtendedAttributeValue() 

    /**
     * Method getExtendedAttributeValue
     * 
     * 
     * 
     * @param index
     * @return ExtendedAttributeValue
     */
    public com.pg.brandbank.ExtendedAttributeValue getExtendedAttributeValue(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _extendedAttributeValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.ExtendedAttributeValue) _extendedAttributeValueList.get(index);
    } //-- com.pg.brandbank.ExtendedAttributeValue getExtendedAttributeValue(int) 

    /**
     * Method getExtendedAttributeValue
     * 
     * 
     * 
     * @return ExtendedAttributeValue
     */
    public com.pg.brandbank.ExtendedAttributeValue[] getExtendedAttributeValue()
    {
        int size = _extendedAttributeValueList.size();
        com.pg.brandbank.ExtendedAttributeValue[] mArray = new com.pg.brandbank.ExtendedAttributeValue[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.ExtendedAttributeValue) _extendedAttributeValueList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.ExtendedAttributeValue[] getExtendedAttributeValue() 

    /**
     * Method getExtendedAttributeValueCount
     * 
     * 
     * 
     * @return int
     */
    public int getExtendedAttributeValueCount()
    {
        return _extendedAttributeValueList.size();
    } //-- int getExtendedAttributeValueCount() 

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
     * Method removeExtendedAttributeValue
     * 
     * 
     * 
     * @param vExtendedAttributeValue
     * @return boolean
     */
    public boolean removeExtendedAttributeValue(com.pg.brandbank.ExtendedAttributeValue vExtendedAttributeValue)
    {
        boolean removed = _extendedAttributeValueList.remove(vExtendedAttributeValue);
        return removed;
    } //-- boolean removeExtendedAttributeValue(com.pg.brandbank.ExtendedAttributeValue) 

    /**
     * Method setExtendedAttributeValue
     * 
     * 
     * 
     * @param index
     * @param vExtendedAttributeValue
     */
    public void setExtendedAttributeValue(int index, com.pg.brandbank.ExtendedAttributeValue vExtendedAttributeValue)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _extendedAttributeValueList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _extendedAttributeValueList.set(index, vExtendedAttributeValue);
    } //-- void setExtendedAttributeValue(int, com.pg.brandbank.ExtendedAttributeValue) 

    /**
     * Method setExtendedAttributeValue
     * 
     * 
     * 
     * @param extendedAttributeValueArray
     */
    public void setExtendedAttributeValue(com.pg.brandbank.ExtendedAttributeValue[] extendedAttributeValueArray)
    {
        //-- copy array
        _extendedAttributeValueList.clear();
        for (int i = 0; i < extendedAttributeValueArray.length; i++) {
            _extendedAttributeValueList.add(extendedAttributeValueArray[i]);
        }
    } //-- void setExtendedAttributeValue(com.pg.brandbank.ExtendedAttributeValue) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExtendedAttributeValuesType
     */
    public static com.pg.brandbank.ExtendedAttributeValuesType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ExtendedAttributeValuesType) Unmarshaller.unmarshal(com.pg.brandbank.ExtendedAttributeValuesType.class, reader);
    } //-- com.pg.brandbank.ExtendedAttributeValuesType unmarshal(java.io.Reader) 

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
