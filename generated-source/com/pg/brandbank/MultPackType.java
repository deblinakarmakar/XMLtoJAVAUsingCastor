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
 * Class MultPackType.
 * 
 * @version $Revision$ $Date$
 */
public class MultPackType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _multiType
     */
    private java.lang.String _multiType;

    /**
     * Field _multPackTypeItemList
     */
    private java.util.ArrayList _multPackTypeItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MultPackType() 
     {
        super();
        _multPackTypeItemList = new ArrayList();
    } //-- com.pg.brandbank.MultPackType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMultPackTypeItem
     * 
     * 
     * 
     * @param vMultPackTypeItem
     */
    public void addMultPackTypeItem(com.pg.brandbank.MultPackTypeItem vMultPackTypeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _multPackTypeItemList.add(vMultPackTypeItem);
    } //-- void addMultPackTypeItem(com.pg.brandbank.MultPackTypeItem) 

    /**
     * Method addMultPackTypeItem
     * 
     * 
     * 
     * @param index
     * @param vMultPackTypeItem
     */
    public void addMultPackTypeItem(int index, com.pg.brandbank.MultPackTypeItem vMultPackTypeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _multPackTypeItemList.add(index, vMultPackTypeItem);
    } //-- void addMultPackTypeItem(int, com.pg.brandbank.MultPackTypeItem) 

    /**
     * Method clearMultPackTypeItem
     * 
     */
    public void clearMultPackTypeItem()
    {
        _multPackTypeItemList.clear();
    } //-- void clearMultPackTypeItem() 

    /**
     * Method enumerateMultPackTypeItem
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateMultPackTypeItem()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_multPackTypeItemList.iterator());
    } //-- java.util.Enumeration enumerateMultPackTypeItem() 

    /**
     * Method getMultPackTypeItem
     * 
     * 
     * 
     * @param index
     * @return MultPackTypeItem
     */
    public com.pg.brandbank.MultPackTypeItem getMultPackTypeItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _multPackTypeItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.MultPackTypeItem) _multPackTypeItemList.get(index);
    } //-- com.pg.brandbank.MultPackTypeItem getMultPackTypeItem(int) 

    /**
     * Method getMultPackTypeItem
     * 
     * 
     * 
     * @return MultPackTypeItem
     */
    public com.pg.brandbank.MultPackTypeItem[] getMultPackTypeItem()
    {
        int size = _multPackTypeItemList.size();
        com.pg.brandbank.MultPackTypeItem[] mArray = new com.pg.brandbank.MultPackTypeItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.MultPackTypeItem) _multPackTypeItemList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.MultPackTypeItem[] getMultPackTypeItem() 

    /**
     * Method getMultPackTypeItemCount
     * 
     * 
     * 
     * @return int
     */
    public int getMultPackTypeItemCount()
    {
        return _multPackTypeItemList.size();
    } //-- int getMultPackTypeItemCount() 

    /**
     * Returns the value of field 'multiType'.
     * 
     * @return String
     * @return the value of field 'multiType'.
     */
    public java.lang.String getMultiType()
    {
        return this._multiType;
    } //-- java.lang.String getMultiType() 

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
     * Method removeMultPackTypeItem
     * 
     * 
     * 
     * @param vMultPackTypeItem
     * @return boolean
     */
    public boolean removeMultPackTypeItem(com.pg.brandbank.MultPackTypeItem vMultPackTypeItem)
    {
        boolean removed = _multPackTypeItemList.remove(vMultPackTypeItem);
        return removed;
    } //-- boolean removeMultPackTypeItem(com.pg.brandbank.MultPackTypeItem) 

    /**
     * Method setMultPackTypeItem
     * 
     * 
     * 
     * @param index
     * @param vMultPackTypeItem
     */
    public void setMultPackTypeItem(int index, com.pg.brandbank.MultPackTypeItem vMultPackTypeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _multPackTypeItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _multPackTypeItemList.set(index, vMultPackTypeItem);
    } //-- void setMultPackTypeItem(int, com.pg.brandbank.MultPackTypeItem) 

    /**
     * Method setMultPackTypeItem
     * 
     * 
     * 
     * @param multPackTypeItemArray
     */
    public void setMultPackTypeItem(com.pg.brandbank.MultPackTypeItem[] multPackTypeItemArray)
    {
        //-- copy array
        _multPackTypeItemList.clear();
        for (int i = 0; i < multPackTypeItemArray.length; i++) {
            _multPackTypeItemList.add(multPackTypeItemArray[i]);
        }
    } //-- void setMultPackTypeItem(com.pg.brandbank.MultPackTypeItem) 

    /**
     * Sets the value of field 'multiType'.
     * 
     * @param multiType the value of field 'multiType'.
     */
    public void setMultiType(java.lang.String multiType)
    {
        this._multiType = multiType;
    } //-- void setMultiType(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MultPackType
     */
    public static com.pg.brandbank.MultPackType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.MultPackType) Unmarshaller.unmarshal(com.pg.brandbank.MultPackType.class, reader);
    } //-- com.pg.brandbank.MultPackType unmarshal(java.io.Reader) 

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
