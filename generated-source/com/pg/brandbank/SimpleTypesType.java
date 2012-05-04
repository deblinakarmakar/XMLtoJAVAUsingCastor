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
 * Class SimpleTypesType.
 * 
 * @version $Revision$ $Date$
 */
public class SimpleTypesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _groupList
     */
    private java.util.ArrayList _groupList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SimpleTypesType() 
     {
        super();
        _groupList = new ArrayList();
    } //-- com.pg.brandbank.SimpleTypesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addGroup
     * 
     * 
     * 
     * @param vGroup
     */
    public void addGroup(com.pg.brandbank.Group vGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _groupList.add(vGroup);
    } //-- void addGroup(com.pg.brandbank.Group) 

    /**
     * Method addGroup
     * 
     * 
     * 
     * @param index
     * @param vGroup
     */
    public void addGroup(int index, com.pg.brandbank.Group vGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        _groupList.add(index, vGroup);
    } //-- void addGroup(int, com.pg.brandbank.Group) 

    /**
     * Method clearGroup
     * 
     */
    public void clearGroup()
    {
        _groupList.clear();
    } //-- void clearGroup() 

    /**
     * Method enumerateGroup
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateGroup()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_groupList.iterator());
    } //-- java.util.Enumeration enumerateGroup() 

    /**
     * Method getGroup
     * 
     * 
     * 
     * @param index
     * @return Group
     */
    public com.pg.brandbank.Group getGroup(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _groupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Group) _groupList.get(index);
    } //-- com.pg.brandbank.Group getGroup(int) 

    /**
     * Method getGroup
     * 
     * 
     * 
     * @return Group
     */
    public com.pg.brandbank.Group[] getGroup()
    {
        int size = _groupList.size();
        com.pg.brandbank.Group[] mArray = new com.pg.brandbank.Group[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Group) _groupList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Group[] getGroup() 

    /**
     * Method getGroupCount
     * 
     * 
     * 
     * @return int
     */
    public int getGroupCount()
    {
        return _groupList.size();
    } //-- int getGroupCount() 

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
     * Method removeGroup
     * 
     * 
     * 
     * @param vGroup
     * @return boolean
     */
    public boolean removeGroup(com.pg.brandbank.Group vGroup)
    {
        boolean removed = _groupList.remove(vGroup);
        return removed;
    } //-- boolean removeGroup(com.pg.brandbank.Group) 

    /**
     * Method setGroup
     * 
     * 
     * 
     * @param index
     * @param vGroup
     */
    public void setGroup(int index, com.pg.brandbank.Group vGroup)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _groupList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _groupList.set(index, vGroup);
    } //-- void setGroup(int, com.pg.brandbank.Group) 

    /**
     * Method setGroup
     * 
     * 
     * 
     * @param groupArray
     */
    public void setGroup(com.pg.brandbank.Group[] groupArray)
    {
        //-- copy array
        _groupList.clear();
        for (int i = 0; i < groupArray.length; i++) {
            _groupList.add(groupArray[i]);
        }
    } //-- void setGroup(com.pg.brandbank.Group) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return SimpleTypesType
     */
    public static com.pg.brandbank.SimpleTypesType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.SimpleTypesType) Unmarshaller.unmarshal(com.pg.brandbank.SimpleTypesType.class, reader);
    } //-- com.pg.brandbank.SimpleTypesType unmarshal(java.io.Reader) 

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
