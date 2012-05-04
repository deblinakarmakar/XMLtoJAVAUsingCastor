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
 * Class NutrientValuesType.
 * 
 * @version $Revision$ $Date$
 */
public class NutrientValuesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nutrientList
     */
    private java.util.ArrayList _nutrientList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NutrientValuesType() 
     {
        super();
        _nutrientList = new ArrayList();
    } //-- com.pg.brandbank.NutrientValuesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addNutrient
     * 
     * 
     * 
     * @param vNutrient
     */
    public void addNutrient(com.pg.brandbank.Nutrient vNutrient)
        throws java.lang.IndexOutOfBoundsException
    {
        _nutrientList.add(vNutrient);
    } //-- void addNutrient(com.pg.brandbank.Nutrient) 

    /**
     * Method addNutrient
     * 
     * 
     * 
     * @param index
     * @param vNutrient
     */
    public void addNutrient(int index, com.pg.brandbank.Nutrient vNutrient)
        throws java.lang.IndexOutOfBoundsException
    {
        _nutrientList.add(index, vNutrient);
    } //-- void addNutrient(int, com.pg.brandbank.Nutrient) 

    /**
     * Method clearNutrient
     * 
     */
    public void clearNutrient()
    {
        _nutrientList.clear();
    } //-- void clearNutrient() 

    /**
     * Method enumerateNutrient
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateNutrient()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_nutrientList.iterator());
    } //-- java.util.Enumeration enumerateNutrient() 

    /**
     * Method getNutrient
     * 
     * 
     * 
     * @param index
     * @return Nutrient
     */
    public com.pg.brandbank.Nutrient getNutrient(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _nutrientList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Nutrient) _nutrientList.get(index);
    } //-- com.pg.brandbank.Nutrient getNutrient(int) 

    /**
     * Method getNutrient
     * 
     * 
     * 
     * @return Nutrient
     */
    public com.pg.brandbank.Nutrient[] getNutrient()
    {
        int size = _nutrientList.size();
        com.pg.brandbank.Nutrient[] mArray = new com.pg.brandbank.Nutrient[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Nutrient) _nutrientList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Nutrient[] getNutrient() 

    /**
     * Method getNutrientCount
     * 
     * 
     * 
     * @return int
     */
    public int getNutrientCount()
    {
        return _nutrientList.size();
    } //-- int getNutrientCount() 

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
     * Method removeNutrient
     * 
     * 
     * 
     * @param vNutrient
     * @return boolean
     */
    public boolean removeNutrient(com.pg.brandbank.Nutrient vNutrient)
    {
        boolean removed = _nutrientList.remove(vNutrient);
        return removed;
    } //-- boolean removeNutrient(com.pg.brandbank.Nutrient) 

    /**
     * Method setNutrient
     * 
     * 
     * 
     * @param index
     * @param vNutrient
     */
    public void setNutrient(int index, com.pg.brandbank.Nutrient vNutrient)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _nutrientList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _nutrientList.set(index, vNutrient);
    } //-- void setNutrient(int, com.pg.brandbank.Nutrient) 

    /**
     * Method setNutrient
     * 
     * 
     * 
     * @param nutrientArray
     */
    public void setNutrient(com.pg.brandbank.Nutrient[] nutrientArray)
    {
        //-- copy array
        _nutrientList.clear();
        for (int i = 0; i < nutrientArray.length; i++) {
            _nutrientList.add(nutrientArray[i]);
        }
    } //-- void setNutrient(com.pg.brandbank.Nutrient) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return NutrientValuesType
     */
    public static com.pg.brandbank.NutrientValuesType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.NutrientValuesType) Unmarshaller.unmarshal(com.pg.brandbank.NutrientValuesType.class, reader);
    } //-- com.pg.brandbank.NutrientValuesType unmarshal(java.io.Reader) 

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
