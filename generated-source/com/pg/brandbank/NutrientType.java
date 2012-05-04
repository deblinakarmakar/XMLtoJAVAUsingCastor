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
 * Class NutrientType.
 * 
 * @version $Revision$ $Date$
 */
public class NutrientType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _text
     */
    private java.lang.String _text;

    /**
     * Field _code
     */
    private java.lang.String _code;

    /**
     * Field _asSold
     */
    private java.lang.String _asSold;

    /**
     * Field _asMadeUp
     */
    private java.lang.String _asMadeUp;

    /**
     * Field _asMadeUpQualifier
     */
    private java.lang.String _asMadeUpQualifier;

    /**
     * Field _perRecommendedServing
     */
    private java.lang.String _perRecommendedServing;

    /**
     * Field _recommendedServingSize
     */
    private java.lang.String _recommendedServingSize;


      //----------------/
     //- Constructors -/
    //----------------/

    public NutrientType() 
     {
        super();
    } //-- com.pg.brandbank.NutrientType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'asMadeUp'.
     * 
     * @return String
     * @return the value of field 'asMadeUp'.
     */
    public java.lang.String getAsMadeUp()
    {
        return this._asMadeUp;
    } //-- java.lang.String getAsMadeUp() 

    /**
     * Returns the value of field 'asMadeUpQualifier'.
     * 
     * @return String
     * @return the value of field 'asMadeUpQualifier'.
     */
    public java.lang.String getAsMadeUpQualifier()
    {
        return this._asMadeUpQualifier;
    } //-- java.lang.String getAsMadeUpQualifier() 

    /**
     * Returns the value of field 'asSold'.
     * 
     * @return String
     * @return the value of field 'asSold'.
     */
    public java.lang.String getAsSold()
    {
        return this._asSold;
    } //-- java.lang.String getAsSold() 

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
     * Returns the value of field 'perRecommendedServing'.
     * 
     * @return String
     * @return the value of field 'perRecommendedServing'.
     */
    public java.lang.String getPerRecommendedServing()
    {
        return this._perRecommendedServing;
    } //-- java.lang.String getPerRecommendedServing() 

    /**
     * Returns the value of field 'recommendedServingSize'.
     * 
     * @return String
     * @return the value of field 'recommendedServingSize'.
     */
    public java.lang.String getRecommendedServingSize()
    {
        return this._recommendedServingSize;
    } //-- java.lang.String getRecommendedServingSize() 

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
     * Sets the value of field 'asMadeUp'.
     * 
     * @param asMadeUp the value of field 'asMadeUp'.
     */
    public void setAsMadeUp(java.lang.String asMadeUp)
    {
        this._asMadeUp = asMadeUp;
    } //-- void setAsMadeUp(java.lang.String) 

    /**
     * Sets the value of field 'asMadeUpQualifier'.
     * 
     * @param asMadeUpQualifier the value of field
     * 'asMadeUpQualifier'.
     */
    public void setAsMadeUpQualifier(java.lang.String asMadeUpQualifier)
    {
        this._asMadeUpQualifier = asMadeUpQualifier;
    } //-- void setAsMadeUpQualifier(java.lang.String) 

    /**
     * Sets the value of field 'asSold'.
     * 
     * @param asSold the value of field 'asSold'.
     */
    public void setAsSold(java.lang.String asSold)
    {
        this._asSold = asSold;
    } //-- void setAsSold(java.lang.String) 

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
     * Sets the value of field 'perRecommendedServing'.
     * 
     * @param perRecommendedServing the value of field
     * 'perRecommendedServing'.
     */
    public void setPerRecommendedServing(java.lang.String perRecommendedServing)
    {
        this._perRecommendedServing = perRecommendedServing;
    } //-- void setPerRecommendedServing(java.lang.String) 

    /**
     * Sets the value of field 'recommendedServingSize'.
     * 
     * @param recommendedServingSize the value of field
     * 'recommendedServingSize'.
     */
    public void setRecommendedServingSize(java.lang.String recommendedServingSize)
    {
        this._recommendedServingSize = recommendedServingSize;
    } //-- void setRecommendedServingSize(java.lang.String) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return NutrientType
     */
    public static com.pg.brandbank.NutrientType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.NutrientType) Unmarshaller.unmarshal(com.pg.brandbank.NutrientType.class, reader);
    } //-- com.pg.brandbank.NutrientType unmarshal(java.io.Reader) 

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
