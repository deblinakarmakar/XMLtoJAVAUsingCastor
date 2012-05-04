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
 * Class AlcoholType.
 * 
 * @version $Revision$ $Date$
 */
public class AlcoholType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ownerList
     */
    private java.util.ArrayList _ownerList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlcoholType() 
     {
        super();
        _ownerList = new ArrayList();
    } //-- com.pg.brandbank.AlcoholType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOwner
     * 
     * 
     * 
     * @param vOwner
     */
    public void addOwner(com.pg.brandbank.Owner vOwner)
        throws java.lang.IndexOutOfBoundsException
    {
        _ownerList.add(vOwner);
    } //-- void addOwner(com.pg.brandbank.Owner) 

    /**
     * Method addOwner
     * 
     * 
     * 
     * @param index
     * @param vOwner
     */
    public void addOwner(int index, com.pg.brandbank.Owner vOwner)
        throws java.lang.IndexOutOfBoundsException
    {
        _ownerList.add(index, vOwner);
    } //-- void addOwner(int, com.pg.brandbank.Owner) 

    /**
     * Method clearOwner
     * 
     */
    public void clearOwner()
    {
        _ownerList.clear();
    } //-- void clearOwner() 

    /**
     * Method enumerateOwner
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOwner()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_ownerList.iterator());
    } //-- java.util.Enumeration enumerateOwner() 

    /**
     * Method getOwner
     * 
     * 
     * 
     * @param index
     * @return Owner
     */
    public com.pg.brandbank.Owner getOwner(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ownerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Owner) _ownerList.get(index);
    } //-- com.pg.brandbank.Owner getOwner(int) 

    /**
     * Method getOwner
     * 
     * 
     * 
     * @return Owner
     */
    public com.pg.brandbank.Owner[] getOwner()
    {
        int size = _ownerList.size();
        com.pg.brandbank.Owner[] mArray = new com.pg.brandbank.Owner[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Owner) _ownerList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Owner[] getOwner() 

    /**
     * Method getOwnerCount
     * 
     * 
     * 
     * @return int
     */
    public int getOwnerCount()
    {
        return _ownerList.size();
    } //-- int getOwnerCount() 

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
     * Method removeOwner
     * 
     * 
     * 
     * @param vOwner
     * @return boolean
     */
    public boolean removeOwner(com.pg.brandbank.Owner vOwner)
    {
        boolean removed = _ownerList.remove(vOwner);
        return removed;
    } //-- boolean removeOwner(com.pg.brandbank.Owner) 

    /**
     * Method setOwner
     * 
     * 
     * 
     * @param index
     * @param vOwner
     */
    public void setOwner(int index, com.pg.brandbank.Owner vOwner)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ownerList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _ownerList.set(index, vOwner);
    } //-- void setOwner(int, com.pg.brandbank.Owner) 

    /**
     * Method setOwner
     * 
     * 
     * 
     * @param ownerArray
     */
    public void setOwner(com.pg.brandbank.Owner[] ownerArray)
    {
        //-- copy array
        _ownerList.clear();
        for (int i = 0; i < ownerArray.length; i++) {
            _ownerList.add(ownerArray[i]);
        }
    } //-- void setOwner(com.pg.brandbank.Owner) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlcoholType
     */
    public static com.pg.brandbank.AlcoholType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.AlcoholType) Unmarshaller.unmarshal(com.pg.brandbank.AlcoholType.class, reader);
    } //-- com.pg.brandbank.AlcoholType unmarshal(java.io.Reader) 

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
