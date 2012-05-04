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
 * Class ObjectsType.
 * 
 * @version $Revision$ $Date$
 */
public class ObjectsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _message
     */
    private java.lang.String _message;

    /**
     * Field _objectList
     */
    private java.util.ArrayList _objectList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectsType() 
     {
        super();
        _objectList = new ArrayList();
    } //-- com.pg.brandbank.ObjectsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addObject
     * 
     * 
     * 
     * @param vObject
     */
    public void addObject(com.pg.brandbank.Object vObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _objectList.add(vObject);
    } //-- void addObject(com.pg.brandbank.Object) 

    /**
     * Method addObject
     * 
     * 
     * 
     * @param index
     * @param vObject
     */
    public void addObject(int index, com.pg.brandbank.Object vObject)
        throws java.lang.IndexOutOfBoundsException
    {
        _objectList.add(index, vObject);
    } //-- void addObject(int, com.pg.brandbank.Object) 

    /**
     * Method clearObject
     * 
     */
    public void clearObject()
    {
        _objectList.clear();
    } //-- void clearObject() 

    /**
     * Method enumerateObject
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateObject()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_objectList.iterator());
    } //-- java.util.Enumeration enumerateObject() 

    /**
     * Returns the value of field 'message'.
     * 
     * @return String
     * @return the value of field 'message'.
     */
    public java.lang.String getMessage()
    {
        return this._message;
    } //-- java.lang.String getMessage() 

    /**
     * Method getObject
     * 
     * 
     * 
     * @param index
     * @return Object
     */
    public com.pg.brandbank.Object getObject(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _objectList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Object) _objectList.get(index);
    } //-- com.pg.brandbank.Object getObject(int) 

    /**
     * Method getObject
     * 
     * 
     * 
     * @return Object
     */
    public com.pg.brandbank.Object[] getObject()
    {
        int size = _objectList.size();
        com.pg.brandbank.Object[] mArray = new com.pg.brandbank.Object[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Object) _objectList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Object[] getObject() 

    /**
     * Method getObjectCount
     * 
     * 
     * 
     * @return int
     */
    public int getObjectCount()
    {
        return _objectList.size();
    } //-- int getObjectCount() 

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
     * Method removeObject
     * 
     * 
     * 
     * @param vObject
     * @return boolean
     */
    public boolean removeObject(com.pg.brandbank.Object vObject)
    {
        boolean removed = _objectList.remove(vObject);
        return removed;
    } //-- boolean removeObject(com.pg.brandbank.Object) 

    /**
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(java.lang.String message)
    {
        this._message = message;
    } //-- void setMessage(java.lang.String) 

    /**
     * Method setObject
     * 
     * 
     * 
     * @param index
     * @param vObject
     */
    public void setObject(int index, com.pg.brandbank.Object vObject)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _objectList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _objectList.set(index, vObject);
    } //-- void setObject(int, com.pg.brandbank.Object) 

    /**
     * Method setObject
     * 
     * 
     * 
     * @param objectArray
     */
    public void setObject(com.pg.brandbank.Object[] objectArray)
    {
        //-- copy array
        _objectList.clear();
        for (int i = 0; i < objectArray.length; i++) {
            _objectList.add(objectArray[i]);
        }
    } //-- void setObject(com.pg.brandbank.Object) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ObjectsType
     */
    public static com.pg.brandbank.ObjectsType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ObjectsType) Unmarshaller.unmarshal(com.pg.brandbank.ObjectsType.class, reader);
    } //-- com.pg.brandbank.ObjectsType unmarshal(java.io.Reader) 

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
