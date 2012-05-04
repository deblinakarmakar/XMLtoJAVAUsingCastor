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
 * Class SystemType.
 * 
 * @version $Revision$ $Date$
 */
public class SystemType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _domain
     */
    private java.lang.String _domain;

    /**
     * Field _levelList
     */
    private java.util.ArrayList _levelList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SystemType() 
     {
        super();
        _levelList = new ArrayList();
    } //-- com.pg.brandbank.SystemType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLevel
     * 
     * 
     * 
     * @param vLevel
     */
    public void addLevel(com.pg.brandbank.Level vLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_levelList.size() < 3)) {
            throw new IndexOutOfBoundsException();
        }
        _levelList.add(vLevel);
    } //-- void addLevel(com.pg.brandbank.Level) 

    /**
     * Method addLevel
     * 
     * 
     * 
     * @param index
     * @param vLevel
     */
    public void addLevel(int index, com.pg.brandbank.Level vLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_levelList.size() < 3)) {
            throw new IndexOutOfBoundsException();
        }
        _levelList.add(index, vLevel);
    } //-- void addLevel(int, com.pg.brandbank.Level) 

    /**
     * Method clearLevel
     * 
     */
    public void clearLevel()
    {
        _levelList.clear();
    } //-- void clearLevel() 

    /**
     * Method enumerateLevel
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLevel()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_levelList.iterator());
    } //-- java.util.Enumeration enumerateLevel() 

    /**
     * Returns the value of field 'domain'.
     * 
     * @return String
     * @return the value of field 'domain'.
     */
    public java.lang.String getDomain()
    {
        return this._domain;
    } //-- java.lang.String getDomain() 

    /**
     * Method getLevel
     * 
     * 
     * 
     * @param index
     * @return Level
     */
    public com.pg.brandbank.Level getLevel(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _levelList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Level) _levelList.get(index);
    } //-- com.pg.brandbank.Level getLevel(int) 

    /**
     * Method getLevel
     * 
     * 
     * 
     * @return Level
     */
    public com.pg.brandbank.Level[] getLevel()
    {
        int size = _levelList.size();
        com.pg.brandbank.Level[] mArray = new com.pg.brandbank.Level[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Level) _levelList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Level[] getLevel() 

    /**
     * Method getLevelCount
     * 
     * 
     * 
     * @return int
     */
    public int getLevelCount()
    {
        return _levelList.size();
    } //-- int getLevelCount() 

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
     * Method removeLevel
     * 
     * 
     * 
     * @param vLevel
     * @return boolean
     */
    public boolean removeLevel(com.pg.brandbank.Level vLevel)
    {
        boolean removed = _levelList.remove(vLevel);
        return removed;
    } //-- boolean removeLevel(com.pg.brandbank.Level) 

    /**
     * Sets the value of field 'domain'.
     * 
     * @param domain the value of field 'domain'.
     */
    public void setDomain(java.lang.String domain)
    {
        this._domain = domain;
    } //-- void setDomain(java.lang.String) 

    /**
     * Method setLevel
     * 
     * 
     * 
     * @param index
     * @param vLevel
     */
    public void setLevel(int index, com.pg.brandbank.Level vLevel)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _levelList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 3)) {
            throw new IndexOutOfBoundsException();
        }
        _levelList.set(index, vLevel);
    } //-- void setLevel(int, com.pg.brandbank.Level) 

    /**
     * Method setLevel
     * 
     * 
     * 
     * @param levelArray
     */
    public void setLevel(com.pg.brandbank.Level[] levelArray)
    {
        //-- copy array
        _levelList.clear();
        for (int i = 0; i < levelArray.length; i++) {
            _levelList.add(levelArray[i]);
        }
    } //-- void setLevel(com.pg.brandbank.Level) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return SystemType
     */
    public static com.pg.brandbank.SystemType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.SystemType) Unmarshaller.unmarshal(com.pg.brandbank.SystemType.class, reader);
    } //-- com.pg.brandbank.SystemType unmarshal(java.io.Reader) 

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
