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
 * Class LevelType.
 * 
 * @version $Revision$ $Date$
 */
public class LevelType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * Field _order
     */
    private int _order;

    /**
     * keeps track of state for field: _order
     */
    private boolean _has_order;

    /**
     * Field _code
     */
    private java.lang.String _code;


      //----------------/
     //- Constructors -/
    //----------------/

    public LevelType() 
     {
        super();
        setContent("");
    } //-- com.pg.brandbank.LevelType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteOrder
     * 
     */
    public void deleteOrder()
    {
        this._has_order= false;
    } //-- void deleteOrder() 

    /**
     * Returns the value of field 'code'.
     * 
     * @return String
     * @return the value of field 'code'.
     */
    public java.lang.String getCode()
    {
        return this._code;
    } //-- java.lang.String getCode() 

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return String
     * @return the value of field 'content'.
     */
    public java.lang.String getContent()
    {
        return this._content;
    } //-- java.lang.String getContent() 

    /**
     * Returns the value of field 'order'.
     * 
     * @return int
     * @return the value of field 'order'.
     */
    public int getOrder()
    {
        return this._order;
    } //-- int getOrder() 

    /**
     * Method hasOrder
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasOrder()
    {
        return this._has_order;
    } //-- boolean hasOrder() 

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
     * Sets the value of field 'code'.
     * 
     * @param code the value of field 'code'.
     */
    public void setCode(java.lang.String code)
    {
        this._code = code;
    } //-- void setCode(java.lang.String) 

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(java.lang.String content)
    {
        this._content = content;
    } //-- void setContent(java.lang.String) 

    /**
     * Sets the value of field 'order'.
     * 
     * @param order the value of field 'order'.
     */
    public void setOrder(int order)
    {
        this._order = order;
        this._has_order = true;
    } //-- void setOrder(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LevelType
     */
    public static com.pg.brandbank.LevelType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.LevelType) Unmarshaller.unmarshal(com.pg.brandbank.LevelType.class, reader);
    } //-- com.pg.brandbank.LevelType unmarshal(java.io.Reader) 

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
