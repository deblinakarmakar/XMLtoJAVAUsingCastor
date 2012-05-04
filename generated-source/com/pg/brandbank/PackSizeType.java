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
 * Class PackSizeType.
 * 
 * @version $Revision$ $Date$
 */
public class PackSizeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _action
     */
    private int _action;

    /**
     * keeps track of state for field: _action
     */
    private boolean _has_action;

    /**
     * Field _packQty
     */
    private java.lang.String _packQty;

    /**
     * Field _packMeasure
     */
    private java.lang.String _packMeasure;

    /**
     * Field _exactMeasure
     */
    private java.lang.String _exactMeasure;

    /**
     * Field _numeric
     */
    private java.lang.String _numeric;

    /**
     * Field _measureId
     */
    private java.lang.String _measureId;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackSizeType() 
     {
        super();
    } //-- com.pg.brandbank.PackSizeType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAction
     * 
     */
    public void deleteAction()
    {
        this._has_action= false;
    } //-- void deleteAction() 

    /**
     * Returns the value of field 'action'.
     * 
     * @return int
     * @return the value of field 'action'.
     */
    public int getAction()
    {
        return this._action;
    } //-- int getAction() 

    /**
     * Returns the value of field 'exactMeasure'.
     * 
     * @return String
     * @return the value of field 'exactMeasure'.
     */
    public java.lang.String getExactMeasure()
    {
        return this._exactMeasure;
    } //-- java.lang.String getExactMeasure() 

    /**
     * Returns the value of field 'measureId'.
     * 
     * @return String
     * @return the value of field 'measureId'.
     */
    public java.lang.String getMeasureId()
    {
        return this._measureId;
    } //-- java.lang.String getMeasureId() 

    /**
     * Returns the value of field 'numeric'.
     * 
     * @return String
     * @return the value of field 'numeric'.
     */
    public java.lang.String getNumeric()
    {
        return this._numeric;
    } //-- java.lang.String getNumeric() 

    /**
     * Returns the value of field 'packMeasure'.
     * 
     * @return String
     * @return the value of field 'packMeasure'.
     */
    public java.lang.String getPackMeasure()
    {
        return this._packMeasure;
    } //-- java.lang.String getPackMeasure() 

    /**
     * Returns the value of field 'packQty'.
     * 
     * @return String
     * @return the value of field 'packQty'.
     */
    public java.lang.String getPackQty()
    {
        return this._packQty;
    } //-- java.lang.String getPackQty() 

    /**
     * Method hasAction
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAction()
    {
        return this._has_action;
    } //-- boolean hasAction() 

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
     * Sets the value of field 'action'.
     * 
     * @param action the value of field 'action'.
     */
    public void setAction(int action)
    {
        this._action = action;
        this._has_action = true;
    } //-- void setAction(int) 

    /**
     * Sets the value of field 'exactMeasure'.
     * 
     * @param exactMeasure the value of field 'exactMeasure'.
     */
    public void setExactMeasure(java.lang.String exactMeasure)
    {
        this._exactMeasure = exactMeasure;
    } //-- void setExactMeasure(java.lang.String) 

    /**
     * Sets the value of field 'measureId'.
     * 
     * @param measureId the value of field 'measureId'.
     */
    public void setMeasureId(java.lang.String measureId)
    {
        this._measureId = measureId;
    } //-- void setMeasureId(java.lang.String) 

    /**
     * Sets the value of field 'numeric'.
     * 
     * @param numeric the value of field 'numeric'.
     */
    public void setNumeric(java.lang.String numeric)
    {
        this._numeric = numeric;
    } //-- void setNumeric(java.lang.String) 

    /**
     * Sets the value of field 'packMeasure'.
     * 
     * @param packMeasure the value of field 'packMeasure'.
     */
    public void setPackMeasure(java.lang.String packMeasure)
    {
        this._packMeasure = packMeasure;
    } //-- void setPackMeasure(java.lang.String) 

    /**
     * Sets the value of field 'packQty'.
     * 
     * @param packQty the value of field 'packQty'.
     */
    public void setPackQty(java.lang.String packQty)
    {
        this._packQty = packQty;
    } //-- void setPackQty(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return PackSizeType
     */
    public static com.pg.brandbank.PackSizeType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.PackSizeType) Unmarshaller.unmarshal(com.pg.brandbank.PackSizeType.class, reader);
    } //-- com.pg.brandbank.PackSizeType unmarshal(java.io.Reader) 

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
