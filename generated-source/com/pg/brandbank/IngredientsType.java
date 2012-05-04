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
 * Class IngredientsType.
 * 
 * @version $Revision$ $Date$
 */
public class IngredientsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ingredientList
     */
    private java.util.ArrayList _ingredientList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IngredientsType() 
     {
        super();
        _ingredientList = new ArrayList();
    } //-- com.pg.brandbank.IngredientsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addIngredient
     * 
     * 
     * 
     * @param vIngredient
     */
    public void addIngredient(com.pg.brandbank.Ingredient vIngredient)
        throws java.lang.IndexOutOfBoundsException
    {
        _ingredientList.add(vIngredient);
    } //-- void addIngredient(com.pg.brandbank.Ingredient) 

    /**
     * Method addIngredient
     * 
     * 
     * 
     * @param index
     * @param vIngredient
     */
    public void addIngredient(int index, com.pg.brandbank.Ingredient vIngredient)
        throws java.lang.IndexOutOfBoundsException
    {
        _ingredientList.add(index, vIngredient);
    } //-- void addIngredient(int, com.pg.brandbank.Ingredient) 

    /**
     * Method clearIngredient
     * 
     */
    public void clearIngredient()
    {
        _ingredientList.clear();
    } //-- void clearIngredient() 

    /**
     * Method enumerateIngredient
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateIngredient()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_ingredientList.iterator());
    } //-- java.util.Enumeration enumerateIngredient() 

    /**
     * Method getIngredient
     * 
     * 
     * 
     * @param index
     * @return Ingredient
     */
    public com.pg.brandbank.Ingredient getIngredient(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ingredientList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Ingredient) _ingredientList.get(index);
    } //-- com.pg.brandbank.Ingredient getIngredient(int) 

    /**
     * Method getIngredient
     * 
     * 
     * 
     * @return Ingredient
     */
    public com.pg.brandbank.Ingredient[] getIngredient()
    {
        int size = _ingredientList.size();
        com.pg.brandbank.Ingredient[] mArray = new com.pg.brandbank.Ingredient[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Ingredient) _ingredientList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Ingredient[] getIngredient() 

    /**
     * Method getIngredientCount
     * 
     * 
     * 
     * @return int
     */
    public int getIngredientCount()
    {
        return _ingredientList.size();
    } //-- int getIngredientCount() 

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
     * Method removeIngredient
     * 
     * 
     * 
     * @param vIngredient
     * @return boolean
     */
    public boolean removeIngredient(com.pg.brandbank.Ingredient vIngredient)
    {
        boolean removed = _ingredientList.remove(vIngredient);
        return removed;
    } //-- boolean removeIngredient(com.pg.brandbank.Ingredient) 

    /**
     * Method setIngredient
     * 
     * 
     * 
     * @param index
     * @param vIngredient
     */
    public void setIngredient(int index, com.pg.brandbank.Ingredient vIngredient)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ingredientList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _ingredientList.set(index, vIngredient);
    } //-- void setIngredient(int, com.pg.brandbank.Ingredient) 

    /**
     * Method setIngredient
     * 
     * 
     * 
     * @param ingredientArray
     */
    public void setIngredient(com.pg.brandbank.Ingredient[] ingredientArray)
    {
        //-- copy array
        _ingredientList.clear();
        for (int i = 0; i < ingredientArray.length; i++) {
            _ingredientList.add(ingredientArray[i]);
        }
    } //-- void setIngredient(com.pg.brandbank.Ingredient) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IngredientsType
     */
    public static com.pg.brandbank.IngredientsType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.IngredientsType) Unmarshaller.unmarshal(com.pg.brandbank.IngredientsType.class, reader);
    } //-- com.pg.brandbank.IngredientsType unmarshal(java.io.Reader) 

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
