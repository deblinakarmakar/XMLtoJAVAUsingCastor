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
 * Class GroupType.
 * 
 * @version $Revision$ $Date$
 */
public class GroupType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id
     */
    private short _id;

    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _itemsList
     */
    private java.util.ArrayList _itemsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GroupType() 
     {
        super();
        _itemsList = new ArrayList();
    } //-- com.pg.brandbank.GroupType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addItems
     * 
     * 
     * 
     * @param vItems
     */
    public void addItems(com.pg.brandbank.Items vItems)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemsList.add(vItems);
    } //-- void addItems(com.pg.brandbank.Items) 

    /**
     * Method addItems
     * 
     * 
     * 
     * @param index
     * @param vItems
     */
    public void addItems(int index, com.pg.brandbank.Items vItems)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemsList.add(index, vItems);
    } //-- void addItems(int, com.pg.brandbank.Items) 

    /**
     * Method clearItems
     * 
     */
    public void clearItems()
    {
        _itemsList.clear();
    } //-- void clearItems() 

    /**
     * Method deleteId
     * 
     */
    public void deleteId()
    {
        this._has_id= false;
    } //-- void deleteId() 

    /**
     * Method enumerateItems
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateItems()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_itemsList.iterator());
    } //-- java.util.Enumeration enumerateItems() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return short
     * @return the value of field 'id'.
     */
    public short getId()
    {
        return this._id;
    } //-- short getId() 

    /**
     * Method getItems
     * 
     * 
     * 
     * @param index
     * @return Items
     */
    public com.pg.brandbank.Items getItems(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _itemsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.Items) _itemsList.get(index);
    } //-- com.pg.brandbank.Items getItems(int) 

    /**
     * Method getItems
     * 
     * 
     * 
     * @return Items
     */
    public com.pg.brandbank.Items[] getItems()
    {
        int size = _itemsList.size();
        com.pg.brandbank.Items[] mArray = new com.pg.brandbank.Items[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.Items) _itemsList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.Items[] getItems() 

    /**
     * Method getItemsCount
     * 
     * 
     * 
     * @return int
     */
    public int getItemsCount()
    {
        return _itemsList.size();
    } //-- int getItemsCount() 

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
     * Method hasId
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasId()
    {
        return this._has_id;
    } //-- boolean hasId() 

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
     * Method removeItems
     * 
     * 
     * 
     * @param vItems
     * @return boolean
     */
    public boolean removeItems(com.pg.brandbank.Items vItems)
    {
        boolean removed = _itemsList.remove(vItems);
        return removed;
    } //-- boolean removeItems(com.pg.brandbank.Items) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(short id)
    {
        this._id = id;
        this._has_id = true;
    } //-- void setId(short) 

    /**
     * Method setItems
     * 
     * 
     * 
     * @param index
     * @param vItems
     */
    public void setItems(int index, com.pg.brandbank.Items vItems)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _itemsList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _itemsList.set(index, vItems);
    } //-- void setItems(int, com.pg.brandbank.Items) 

    /**
     * Method setItems
     * 
     * 
     * 
     * @param itemsArray
     */
    public void setItems(com.pg.brandbank.Items[] itemsArray)
    {
        //-- copy array
        _itemsList.clear();
        for (int i = 0; i < itemsArray.length; i++) {
            _itemsList.add(itemsArray[i]);
        }
    } //-- void setItems(com.pg.brandbank.Items) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GroupType
     */
    public static com.pg.brandbank.GroupType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.GroupType) Unmarshaller.unmarshal(com.pg.brandbank.GroupType.class, reader);
    } //-- com.pg.brandbank.GroupType unmarshal(java.io.Reader) 

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
