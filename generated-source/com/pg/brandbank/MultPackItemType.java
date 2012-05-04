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
 * Class MultPackItemType.
 * 
 * @version $Revision$ $Date$
 */
public class MultPackItemType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemCode
     */
    private java.lang.String _itemCode;

    /**
     * Field _itemQty
     */
    private java.lang.String _itemQty;


      //----------------/
     //- Constructors -/
    //----------------/

    public MultPackItemType() 
     {
        super();
    } //-- com.pg.brandbank.MultPackItemType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemCode'.
     * 
     * @return String
     * @return the value of field 'itemCode'.
     */
    public java.lang.String getItemCode()
    {
        return this._itemCode;
    } //-- java.lang.String getItemCode() 

    /**
     * Returns the value of field 'itemQty'.
     * 
     * @return String
     * @return the value of field 'itemQty'.
     */
    public java.lang.String getItemQty()
    {
        return this._itemQty;
    } //-- java.lang.String getItemQty() 

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
     * Sets the value of field 'itemCode'.
     * 
     * @param itemCode the value of field 'itemCode'.
     */
    public void setItemCode(java.lang.String itemCode)
    {
        this._itemCode = itemCode;
    } //-- void setItemCode(java.lang.String) 

    /**
     * Sets the value of field 'itemQty'.
     * 
     * @param itemQty the value of field 'itemQty'.
     */
    public void setItemQty(java.lang.String itemQty)
    {
        this._itemQty = itemQty;
    } //-- void setItemQty(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MultPackItemType
     */
    public static com.pg.brandbank.MultPackItemType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.MultPackItemType) Unmarshaller.unmarshal(com.pg.brandbank.MultPackItemType.class, reader);
    } //-- com.pg.brandbank.MultPackItemType unmarshal(java.io.Reader) 

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
