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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ItemType.
 * 
 * @version $Revision$ $Date$
 */
public class ItemType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemTypeName
     */
    private com.pg.brandbank.ItemTypeName _itemTypeName;

    /**
     * Field _value
     */
    private com.pg.brandbank.Value _value;

    /**
     * Field _text
     */
    private java.lang.String _text;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemType() 
     {
        super();
    } //-- com.pg.brandbank.ItemType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemTypeName'.
     * 
     * @return ItemTypeName
     * @return the value of field 'itemTypeName'.
     */
    public com.pg.brandbank.ItemTypeName getItemTypeName()
    {
        return this._itemTypeName;
    } //-- com.pg.brandbank.ItemTypeName getItemTypeName() 

    /**
     * Returns the value of field 'text'.
     * 
     * @return String
     * @return the value of field 'text'.
     */
    public java.lang.String getText()
    {
        return this._text;
    } //-- java.lang.String getText() 

    /**
     * Returns the value of field 'value'.
     * 
     * @return Value
     * @return the value of field 'value'.
     */
    public com.pg.brandbank.Value getValue()
    {
        return this._value;
    } //-- com.pg.brandbank.Value getValue() 

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
     * Sets the value of field 'itemTypeName'.
     * 
     * @param itemTypeName the value of field 'itemTypeName'.
     */
    public void setItemTypeName(com.pg.brandbank.ItemTypeName itemTypeName)
    {
        this._itemTypeName = itemTypeName;
    } //-- void setItemTypeName(com.pg.brandbank.ItemTypeName) 

    /**
     * Sets the value of field 'text'.
     * 
     * @param text the value of field 'text'.
     */
    public void setText(java.lang.String text)
    {
        this._text = text;
    } //-- void setText(java.lang.String) 

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(com.pg.brandbank.Value value)
    {
        this._value = value;
    } //-- void setValue(com.pg.brandbank.Value) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ItemType
     */
    public static com.pg.brandbank.ItemType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ItemType) Unmarshaller.unmarshal(com.pg.brandbank.ItemType.class, reader);
    } //-- com.pg.brandbank.ItemType unmarshal(java.io.Reader) 

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
