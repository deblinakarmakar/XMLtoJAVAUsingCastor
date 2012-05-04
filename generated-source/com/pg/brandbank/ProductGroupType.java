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
 * Class ProductGroupType.
 * 
 * @version $Revision$ $Date$
 */
public class ProductGroupType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _systemList
     */
    private java.util.ArrayList _systemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProductGroupType() 
     {
        super();
        _systemList = new ArrayList();
    } //-- com.pg.brandbank.ProductGroupType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSystem
     * 
     * 
     * 
     * @param vSystem
     */
    public void addSystem(com.pg.brandbank.System vSystem)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_systemList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _systemList.add(vSystem);
    } //-- void addSystem(com.pg.brandbank.System) 

    /**
     * Method addSystem
     * 
     * 
     * 
     * @param index
     * @param vSystem
     */
    public void addSystem(int index, com.pg.brandbank.System vSystem)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_systemList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _systemList.add(index, vSystem);
    } //-- void addSystem(int, com.pg.brandbank.System) 

    /**
     * Method clearSystem
     * 
     */
    public void clearSystem()
    {
        _systemList.clear();
    } //-- void clearSystem() 

    /**
     * Method enumerateSystem
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateSystem()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_systemList.iterator());
    } //-- java.util.Enumeration enumerateSystem() 

    /**
     * Method getSystem
     * 
     * 
     * 
     * @param index
     * @return System
     */
    public com.pg.brandbank.System getSystem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _systemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.System) _systemList.get(index);
    } //-- com.pg.brandbank.System getSystem(int) 

    /**
     * Method getSystem
     * 
     * 
     * 
     * @return System
     */
    public com.pg.brandbank.System[] getSystem()
    {
        int size = _systemList.size();
        com.pg.brandbank.System[] mArray = new com.pg.brandbank.System[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.System) _systemList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.System[] getSystem() 

    /**
     * Method getSystemCount
     * 
     * 
     * 
     * @return int
     */
    public int getSystemCount()
    {
        return _systemList.size();
    } //-- int getSystemCount() 

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
     * Method removeSystem
     * 
     * 
     * 
     * @param vSystem
     * @return boolean
     */
    public boolean removeSystem(com.pg.brandbank.System vSystem)
    {
        boolean removed = _systemList.remove(vSystem);
        return removed;
    } //-- boolean removeSystem(com.pg.brandbank.System) 

    /**
     * Method setSystem
     * 
     * 
     * 
     * @param index
     * @param vSystem
     */
    public void setSystem(int index, com.pg.brandbank.System vSystem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _systemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _systemList.set(index, vSystem);
    } //-- void setSystem(int, com.pg.brandbank.System) 

    /**
     * Method setSystem
     * 
     * 
     * 
     * @param systemArray
     */
    public void setSystem(com.pg.brandbank.System[] systemArray)
    {
        //-- copy array
        _systemList.clear();
        for (int i = 0; i < systemArray.length; i++) {
            _systemList.add(systemArray[i]);
        }
    } //-- void setSystem(com.pg.brandbank.System) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ProductGroupType
     */
    public static com.pg.brandbank.ProductGroupType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ProductGroupType) Unmarshaller.unmarshal(com.pg.brandbank.ProductGroupType.class, reader);
    } //-- com.pg.brandbank.ProductGroupType unmarshal(java.io.Reader) 

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
