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
 * Class ResourcesType.
 * 
 * @version $Revision$ $Date$
 */
public class ResourcesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resourceList
     */
    private java.util.ArrayList _resourceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourcesType() 
     {
        super();
        _resourceList = new ArrayList();
    } //-- com.pg.brandbank.ResourcesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addResource
     * 
     * 
     * 
     * @param vResource
     */
    public void addResource(com.pg.brandbank.Resource vResource)
        throws java.lang.IndexOutOfBoundsException
    {
        _resourceList.add(vResource);
    } //-- void addResource(com.pg.brandbank.Resource) 

    /**
     * Method addResource
     * 
     * 
     * 
     * @param index
     * @param vResource
     */
    public void addResource(int index, com.pg.brandbank.Resource vResource)
        throws java.lang.IndexOutOfBoundsException
    {
        _resourceList.add(index, vResource);
    } //-- void addResource(int, com.pg.brandbank.Resource) 

    /**
     * Method clearResource
     * 
     */
    public void clearResource()
    {
        _resourceList.clear();
    } //-- void clearResource() 

    /**
     * Method enumerateResource
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateResource()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_resourceList.iterator());
    } //-- java.util.Enumeration enumerateResource() 

    /**
     * Method getResource
     * 
     * 
     * 
     * @param index
     * @return Resource
     */
    public com.pg.brandbank.Resource getResource(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _resourceList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Resource) _resourceList.get(index);
    } //-- com.pg.brandbank.Resource getResource(int) 

    /**
     * Method getResource
     * 
     * 
     * 
     * @return Resource
     */
    public com.pg.brandbank.Resource[] getResource()
    {
        int size = _resourceList.size();
        com.pg.brandbank.Resource[] mArray = new com.pg.brandbank.Resource[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Resource) _resourceList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Resource[] getResource() 

    /**
     * Method getResourceCount
     * 
     * 
     * 
     * @return int
     */
    public int getResourceCount()
    {
        return _resourceList.size();
    } //-- int getResourceCount() 

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
     * Method removeResource
     * 
     * 
     * 
     * @param vResource
     * @return boolean
     */
    public boolean removeResource(com.pg.brandbank.Resource vResource)
    {
        boolean removed = _resourceList.remove(vResource);
        return removed;
    } //-- boolean removeResource(com.pg.brandbank.Resource) 

    /**
     * Method setResource
     * 
     * 
     * 
     * @param index
     * @param vResource
     */
    public void setResource(int index, com.pg.brandbank.Resource vResource)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _resourceList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _resourceList.set(index, vResource);
    } //-- void setResource(int, com.pg.brandbank.Resource) 

    /**
     * Method setResource
     * 
     * 
     * 
     * @param resourceArray
     */
    public void setResource(com.pg.brandbank.Resource[] resourceArray)
    {
        //-- copy array
        _resourceList.clear();
        for (int i = 0; i < resourceArray.length; i++) {
            _resourceList.add(resourceArray[i]);
        }
    } //-- void setResource(com.pg.brandbank.Resource) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ResourcesType
     */
    public static com.pg.brandbank.ResourcesType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ResourcesType) Unmarshaller.unmarshal(com.pg.brandbank.ResourcesType.class, reader);
    } //-- com.pg.brandbank.ResourcesType unmarshal(java.io.Reader) 

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
