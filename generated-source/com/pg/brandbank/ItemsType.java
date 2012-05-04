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
 * Class ItemsType.
 * 
 * @version $Revision$ $Date$
 */
public class ItemsType implements java.io.Serializable {


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
     * Field _itemsTypeItemList
     */
    private java.util.ArrayList _itemsTypeItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemsType() 
     {
        super();
        _itemsTypeItemList = new ArrayList();
    } //-- com.pg.brandbank.ItemsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addItemsTypeItem
     * 
     * 
     * 
     * @param vItemsTypeItem
     */
    public void addItemsTypeItem(com.pg.brandbank.ItemsTypeItem vItemsTypeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemsTypeItemList.add(vItemsTypeItem);
    } //-- void addItemsTypeItem(com.pg.brandbank.ItemsTypeItem) 

    /**
     * Method addItemsTypeItem
     * 
     * 
     * 
     * @param index
     * @param vItemsTypeItem
     */
    public void addItemsTypeItem(int index, com.pg.brandbank.ItemsTypeItem vItemsTypeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _itemsTypeItemList.add(index, vItemsTypeItem);
    } //-- void addItemsTypeItem(int, com.pg.brandbank.ItemsTypeItem) 

    /**
     * Method clearItemsTypeItem
     * 
     */
    public void clearItemsTypeItem()
    {
        _itemsTypeItemList.clear();
    } //-- void clearItemsTypeItem() 

    /**
     * Method deleteId
     * 
     */
    public void deleteId()
    {
        this._has_id= false;
    } //-- void deleteId() 

    /**
     * Method enumerateItemsTypeItem
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateItemsTypeItem()
    {
        return new org.exolab.castor.util.IteratorEnumeration(_itemsTypeItemList.iterator());
    } //-- java.util.Enumeration enumerateItemsTypeItem() 

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
     * Method getItemsTypeItem
     * 
     * 
     * 
     * @param index
     * @return ItemsTypeItem
     */
    public com.pg.brandbank.ItemsTypeItem getItemsTypeItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _itemsTypeItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.pg.brandbank.ItemsTypeItem) _itemsTypeItemList.get(index);
    } //-- com.pg.brandbank.ItemsTypeItem getItemsTypeItem(int) 

    /**
     * Method getItemsTypeItem
     * 
     * 
     * 
     * @return ItemsTypeItem
     */
    public com.pg.brandbank.ItemsTypeItem[] getItemsTypeItem()
    {
        int size = _itemsTypeItemList.size();
        com.pg.brandbank.ItemsTypeItem[] mArray = new com.pg.brandbank.ItemsTypeItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.pg.brandbank.ItemsTypeItem) _itemsTypeItemList.get(index);
        }
        return mArray;
    } //-- com.pg.brandbank.ItemsTypeItem[] getItemsTypeItem() 

    /**
     * Method getItemsTypeItemCount
     * 
     * 
     * 
     * @return int
     */
    public int getItemsTypeItemCount()
    {
        return _itemsTypeItemList.size();
    } //-- int getItemsTypeItemCount() 

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
     * Method removeItemsTypeItem
     * 
     * 
     * 
     * @param vItemsTypeItem
     * @return boolean
     */
    public boolean removeItemsTypeItem(com.pg.brandbank.ItemsTypeItem vItemsTypeItem)
    {
        boolean removed = _itemsTypeItemList.remove(vItemsTypeItem);
        return removed;
    } //-- boolean removeItemsTypeItem(com.pg.brandbank.ItemsTypeItem) 

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
     * Method setItemsTypeItem
     * 
     * 
     * 
     * @param index
     * @param vItemsTypeItem
     */
    public void setItemsTypeItem(int index, com.pg.brandbank.ItemsTypeItem vItemsTypeItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _itemsTypeItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _itemsTypeItemList.set(index, vItemsTypeItem);
    } //-- void setItemsTypeItem(int, com.pg.brandbank.ItemsTypeItem) 

    /**
     * Method setItemsTypeItem
     * 
     * 
     * 
     * @param itemsTypeItemArray
     */
    public void setItemsTypeItem(com.pg.brandbank.ItemsTypeItem[] itemsTypeItemArray)
    {
        //-- copy array
        _itemsTypeItemList.clear();
        for (int i = 0; i < itemsTypeItemArray.length; i++) {
            _itemsTypeItemList.add(itemsTypeItemArray[i]);
        }
    } //-- void setItemsTypeItem(com.pg.brandbank.ItemsTypeItem) 

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
     * @return ItemsType
     */
    public static com.pg.brandbank.ItemsType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ItemsType) Unmarshaller.unmarshal(com.pg.brandbank.ItemsType.class, reader);
    } //-- com.pg.brandbank.ItemsType unmarshal(java.io.Reader) 

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
