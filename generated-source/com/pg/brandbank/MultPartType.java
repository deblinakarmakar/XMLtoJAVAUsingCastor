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
 * Class MultPartType.
 * 
 * @version $Revision$ $Date$
 */
public class MultPartType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _partList
     */
    private java.util.ArrayList _partList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MultPartType() 
     {
        super();
        _partList = new ArrayList();
    } //-- com.pg.brandbank.MultPartType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPart
     * 
     * 
     * 
     * @param vPart
     */
    public void addPart(com.pg.brandbank.Part vPart)
        throws java.lang.IndexOutOfBoundsException
    {
        _partList.add(vPart);
    } //-- void addPart(com.pg.brandbank.Part) 

    /**
     * Method addPart
     * 
     * 
     * 
     * @param index
     * @param vPart
     */
    public void addPart(int index, com.pg.brandbank.Part vPart)
        throws java.lang.IndexOutOfBoundsException
    {
        _partList.add(index, vPart);
    } //-- void addPart(int, com.pg.brandbank.Part) 

    /**
     * Method clearPart
     * 
     */
    public void clearPart()
    {
        _partList.clear();
    } //-- void clearPart() 

    /**
     * Method enumeratePart
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumeratePart()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_partList.iterator());
    } //-- java.util.Enumeration enumeratePart() 

    /**
     * Method getPart
     * 
     * 
     * 
     * @param index
     * @return Part
     */
    public com.pg.brandbank.Part getPart(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _partList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Part) _partList.get(index);
    } //-- com.pg.brandbank.Part getPart(int) 

    /**
     * Method getPart
     * 
     * 
     * 
     * @return Part
     */
    public com.pg.brandbank.Part[] getPart()
    {
        int size = _partList.size();
        com.pg.brandbank.Part[] mArray = new com.pg.brandbank.Part[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Part) _partList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Part[] getPart() 

    /**
     * Method getPartCount
     * 
     * 
     * 
     * @return int
     */
    public int getPartCount()
    {
        return _partList.size();
    } //-- int getPartCount() 

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
     * Method removePart
     * 
     * 
     * 
     * @param vPart
     * @return boolean
     */
    public boolean removePart(com.pg.brandbank.Part vPart)
    {
        boolean removed = _partList.remove(vPart);
        return removed;
    } //-- boolean removePart(com.pg.brandbank.Part) 

    /**
     * Method setPart
     * 
     * 
     * 
     * @param index
     * @param vPart
     */
    public void setPart(int index, com.pg.brandbank.Part vPart)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _partList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _partList.set(index, vPart);
    } //-- void setPart(int, com.pg.brandbank.Part) 

    /**
     * Method setPart
     * 
     * 
     * 
     * @param partArray
     */
    public void setPart(com.pg.brandbank.Part[] partArray)
    {
        //-- copy array
        _partList.clear();
        for (int i = 0; i < partArray.length; i++) {
            _partList.add(partArray[i]);
        }
    } //-- void setPart(com.pg.brandbank.Part) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MultPartType
     */
    public static com.pg.brandbank.MultPartType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.MultPartType) Unmarshaller.unmarshal(com.pg.brandbank.MultPartType.class, reader);
    } //-- com.pg.brandbank.MultPartType unmarshal(java.io.Reader) 

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
