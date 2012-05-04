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
 * Class NoOfUnitsType.
 * 
 * @version $Revision$ $Date$
 */
public class NoOfUnitsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _unitDescription
     */
    private java.lang.String _unitDescription;

    /**
     * Field _qty
     */
    private java.lang.String _qty;


      //----------------/
     //- Constructors -/
    //----------------/

    public NoOfUnitsType() 
     {
        super();
    } //-- com.pg.brandbank.NoOfUnitsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'qty'.
     * 
     * @return String
     * @return the value of field 'qty'.
     */
    public java.lang.String getQty()
    {
        return this._qty;
    } //-- java.lang.String getQty() 

    /**
     * Returns the value of field 'unitDescription'.
     * 
     * @return String
     * @return the value of field 'unitDescription'.
     */
    public java.lang.String getUnitDescription()
    {
        return this._unitDescription;
    } //-- java.lang.String getUnitDescription() 

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
     * Sets the value of field 'qty'.
     * 
     * @param qty the value of field 'qty'.
     */
    public void setQty(java.lang.String qty)
    {
        this._qty = qty;
    } //-- void setQty(java.lang.String) 

    /**
     * Sets the value of field 'unitDescription'.
     * 
     * @param unitDescription the value of field 'unitDescription'.
     */
    public void setUnitDescription(java.lang.String unitDescription)
    {
        this._unitDescription = unitDescription;
    } //-- void setUnitDescription(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return NoOfUnitsType
     */
    public static com.pg.brandbank.NoOfUnitsType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.NoOfUnitsType) Unmarshaller.unmarshal(com.pg.brandbank.NoOfUnitsType.class, reader);
    } //-- com.pg.brandbank.NoOfUnitsType unmarshal(java.io.Reader) 

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
