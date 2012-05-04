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
 * Class NutritionType.
 * 
 * @version $Revision$ $Date$
 */
public class NutritionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementList
     */
    private java.util.ArrayList _elementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NutritionType() 
     {
        super();
        _elementList = new ArrayList();
    } //-- com.pg.brandbank.NutritionType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addElement
     * 
     * 
     * 
     * @param vElement
     */
    public void addElement(com.pg.brandbank.Element vElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _elementList.add(vElement);
    } //-- void addElement(com.pg.brandbank.Element) 

    /**
     * Method addElement
     * 
     * 
     * 
     * @param index
     * @param vElement
     */
    public void addElement(int index, com.pg.brandbank.Element vElement)
        throws java.lang.IndexOutOfBoundsException
    {
        _elementList.add(index, vElement);
    } //-- void addElement(int, com.pg.brandbank.Element) 

    /**
     * Method clearElement
     * 
     */
    public void clearElement()
    {
        _elementList.clear();
    } //-- void clearElement() 

    /**
     * Method enumerateElement
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateElement()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_elementList.iterator());
    } //-- java.util.Enumeration enumerateElement() 

    /**
     * Method getElement
     * 
     * 
     * 
     * @param index
     * @return Element
     */
    public com.pg.brandbank.Element getElement(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _elementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Element) _elementList.get(index);
    } //-- com.pg.brandbank.Element getElement(int) 

    /**
     * Method getElement
     * 
     * 
     * 
     * @return Element
     */
    public com.pg.brandbank.Element[] getElement()
    {
        int size = _elementList.size();
        com.pg.brandbank.Element[] mArray = new com.pg.brandbank.Element[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Element) _elementList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Element[] getElement() 

    /**
     * Method getElementCount
     * 
     * 
     * 
     * @return int
     */
    public int getElementCount()
    {
        return _elementList.size();
    } //-- int getElementCount() 

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
     * Method removeElement
     * 
     * 
     * 
     * @param vElement
     * @return boolean
     */
    public boolean removeElement(com.pg.brandbank.Element vElement)
    {
        boolean removed = _elementList.remove(vElement);
        return removed;
    } //-- boolean removeElement(com.pg.brandbank.Element) 

    /**
     * Method setElement
     * 
     * 
     * 
     * @param index
     * @param vElement
     */
    public void setElement(int index, com.pg.brandbank.Element vElement)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _elementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _elementList.set(index, vElement);
    } //-- void setElement(int, com.pg.brandbank.Element) 

    /**
     * Method setElement
     * 
     * 
     * 
     * @param elementArray
     */
    public void setElement(com.pg.brandbank.Element[] elementArray)
    {
        //-- copy array
        _elementList.clear();
        for (int i = 0; i < elementArray.length; i++) {
            _elementList.add(elementArray[i]);
        }
    } //-- void setElement(com.pg.brandbank.Element) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return NutritionType
     */
    public static com.pg.brandbank.NutritionType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.NutritionType) Unmarshaller.unmarshal(com.pg.brandbank.NutritionType.class, reader);
    } //-- com.pg.brandbank.NutritionType unmarshal(java.io.Reader) 

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
