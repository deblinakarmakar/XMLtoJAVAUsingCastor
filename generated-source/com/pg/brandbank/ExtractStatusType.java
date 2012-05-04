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
 * Class ExtractStatusType.
 * 
 * @version $Revision$ $Date$
 */
public class ExtractStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _productCount
     */
    private int _productCount;

    /**
     * keeps track of state for field: _productCount
     */
    private boolean _has_productCount;

    /**
     * Field _renderTime
     */
    private java.lang.String _renderTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExtractStatusType() 
     {
        super();
    } //-- com.pg.brandbank.ExtractStatusType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteProductCount
     * 
     */
    public void deleteProductCount()
    {
        this._has_productCount= false;
    } //-- void deleteProductCount() 

    /**
     * Returns the value of field 'productCount'.
     * 
     * @return int
     * @return the value of field 'productCount'.
     */
    public int getProductCount()
    {
        return this._productCount;
    } //-- int getProductCount() 

    /**
     * Returns the value of field 'renderTime'.
     * 
     * @return String
     * @return the value of field 'renderTime'.
     */
    public java.lang.String getRenderTime()
    {
        return this._renderTime;
    } //-- java.lang.String getRenderTime() 

    /**
     * Method hasProductCount
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasProductCount()
    {
        return this._has_productCount;
    } //-- boolean hasProductCount() 

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
     * Sets the value of field 'productCount'.
     * 
     * @param productCount the value of field 'productCount'.
     */
    public void setProductCount(int productCount)
    {
        this._productCount = productCount;
        this._has_productCount = true;
    } //-- void setProductCount(int) 

    /**
     * Sets the value of field 'renderTime'.
     * 
     * @param renderTime the value of field 'renderTime'.
     */
    public void setRenderTime(java.lang.String renderTime)
    {
        this._renderTime = renderTime;
    } //-- void setRenderTime(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExtractStatusType
     */
    public static com.pg.brandbank.ExtractStatusType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ExtractStatusType) Unmarshaller.unmarshal(com.pg.brandbank.ExtractStatusType.class, reader);
    } //-- com.pg.brandbank.ExtractStatusType unmarshal(java.io.Reader) 

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
