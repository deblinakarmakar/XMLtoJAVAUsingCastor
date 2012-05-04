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
 * Class NutritionElementType.
 * 
 * @version $Revision$ $Date$
 */
public class NutritionElementType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _portionList
     */
    private java.util.ArrayList _portionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NutritionElementType() 
     {
        super();
        _portionList = new ArrayList();
    } //-- com.pg.brandbank.NutritionElementType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addPortion
     * 
     * 
     * 
     * @param vPortion
     */
    public void addPortion(com.pg.brandbank.Portion vPortion)
        throws java.lang.IndexOutOfBoundsException
    {
        _portionList.add(vPortion);
    } //-- void addPortion(com.pg.brandbank.Portion) 

    /**
     * Method addPortion
     * 
     * 
     * 
     * @param index
     * @param vPortion
     */
    public void addPortion(int index, com.pg.brandbank.Portion vPortion)
        throws java.lang.IndexOutOfBoundsException
    {
        _portionList.add(index, vPortion);
    } //-- void addPortion(int, com.pg.brandbank.Portion) 

    /**
     * Method clearPortion
     * 
     */
    public void clearPortion()
    {
        _portionList.clear();
    } //-- void clearPortion() 

    /**
     * Method enumeratePortion
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumeratePortion()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_portionList.iterator());
    } //-- java.util.Enumeration enumeratePortion() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return String
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Method getPortion
     * 
     * 
     * 
     * @param index
     * @return Portion
     */
    public com.pg.brandbank.Portion getPortion(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _portionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Portion) _portionList.get(index);
    } //-- com.pg.brandbank.Portion getPortion(int) 

    /**
     * Method getPortion
     * 
     * 
     * 
     * @return Portion
     */
    public com.pg.brandbank.Portion[] getPortion()
    {
        int size = _portionList.size();
        com.pg.brandbank.Portion[] mArray = new com.pg.brandbank.Portion[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Portion) _portionList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Portion[] getPortion() 

    /**
     * Method getPortionCount
     * 
     * 
     * 
     * @return int
     */
    public int getPortionCount()
    {
        return _portionList.size();
    } //-- int getPortionCount() 

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
     * Method removePortion
     * 
     * 
     * 
     * @param vPortion
     * @return boolean
     */
    public boolean removePortion(com.pg.brandbank.Portion vPortion)
    {
        boolean removed = _portionList.remove(vPortion);
        return removed;
    } //-- boolean removePortion(com.pg.brandbank.Portion) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Method setPortion
     * 
     * 
     * 
     * @param index
     * @param vPortion
     */
    public void setPortion(int index, com.pg.brandbank.Portion vPortion)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _portionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _portionList.set(index, vPortion);
    } //-- void setPortion(int, com.pg.brandbank.Portion) 

    /**
     * Method setPortion
     * 
     * 
     * 
     * @param portionArray
     */
    public void setPortion(com.pg.brandbank.Portion[] portionArray)
    {
        //-- copy array
        _portionList.clear();
        for (int i = 0; i < portionArray.length; i++) {
            _portionList.add(portionArray[i]);
        }
    } //-- void setPortion(com.pg.brandbank.Portion) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return NutritionElementType
     */
    public static com.pg.brandbank.NutritionElementType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.NutritionElementType) Unmarshaller.unmarshal(com.pg.brandbank.NutritionElementType.class, reader);
    } //-- com.pg.brandbank.NutritionElementType unmarshal(java.io.Reader) 

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
