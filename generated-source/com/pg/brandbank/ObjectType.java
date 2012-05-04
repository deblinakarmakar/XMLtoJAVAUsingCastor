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
 * Class ObjectType.
 * 
 * @version $Revision$ $Date$
 */
public class ObjectType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id
     */
    private int _id;

    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _mimeType
     */
    private java.lang.String _mimeType;

    /**
     * Field _width
     */
    private int _width;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;

    /**
     * Field _height
     */
    private int _height;

    /**
     * keeps track of state for field: _height
     */
    private boolean _has_height;

    /**
     * Field _sizeInBytes
     */
    private int _sizeInBytes;

    /**
     * keeps track of state for field: _sizeInBytes
     */
    private boolean _has_sizeInBytes;

    /**
     * Field _cropped
     */
    private boolean _cropped;

    /**
     * keeps track of state for field: _cropped
     */
    private boolean _has_cropped;

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _inline
     */
    private com.pg.brandbank.Inline _inline;

    /**
     * Field _url
     */
    private com.pg.brandbank.Url _url;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectType() 
     {
        super();
    } //-- com.pg.brandbank.ObjectType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCropped
     * 
     */
    public void deleteCropped()
    {
        this._has_cropped= false;
    } //-- void deleteCropped() 

    /**
     * Method deleteHeight
     * 
     */
    public void deleteHeight()
    {
        this._has_height= false;
    } //-- void deleteHeight() 

    /**
     * Method deleteId
     * 
     */
    public void deleteId()
    {
        this._has_id= false;
    } //-- void deleteId() 

    /**
     * Method deleteSizeInBytes
     * 
     */
    public void deleteSizeInBytes()
    {
        this._has_sizeInBytes= false;
    } //-- void deleteSizeInBytes() 

    /**
     * Method deleteWidth
     * 
     */
    public void deleteWidth()
    {
        this._has_width= false;
    } //-- void deleteWidth() 

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return Object
     * @return the value of field 'choiceValue'.
     */
    public java.lang.Object getChoiceValue()
    {
        return this._choiceValue;
    } //-- java.lang.Object getChoiceValue() 

    /**
     * Returns the value of field 'cropped'.
     * 
     * @return boolean
     * @return the value of field 'cropped'.
     */
    public boolean getCropped()
    {
        return this._cropped;
    } //-- boolean getCropped() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return String
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'height'.
     * 
     * @return int
     * @return the value of field 'height'.
     */
    public int getHeight()
    {
        return this._height;
    } //-- int getHeight() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return int
     * @return the value of field 'id'.
     */
    public int getId()
    {
        return this._id;
    } //-- int getId() 

    /**
     * Returns the value of field 'inline'.
     * 
     * @return Inline
     * @return the value of field 'inline'.
     */
    public com.pg.brandbank.Inline getInline()
    {
        return this._inline;
    } //-- com.pg.brandbank.Inline getInline() 

    /**
     * Returns the value of field 'mimeType'.
     * 
     * @return String
     * @return the value of field 'mimeType'.
     */
    public java.lang.String getMimeType()
    {
        return this._mimeType;
    } //-- java.lang.String getMimeType() 

    /**
     * Returns the value of field 'sizeInBytes'.
     * 
     * @return int
     * @return the value of field 'sizeInBytes'.
     */
    public int getSizeInBytes()
    {
        return this._sizeInBytes;
    } //-- int getSizeInBytes() 

    /**
     * Returns the value of field 'url'.
     * 
     * @return Url
     * @return the value of field 'url'.
     */
    public com.pg.brandbank.Url getUrl()
    {
        return this._url;
    } //-- com.pg.brandbank.Url getUrl() 

    /**
     * Returns the value of field 'width'.
     * 
     * @return int
     * @return the value of field 'width'.
     */
    public int getWidth()
    {
        return this._width;
    } //-- int getWidth() 

    /**
     * Method hasCropped
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCropped()
    {
        return this._has_cropped;
    } //-- boolean hasCropped() 

    /**
     * Method hasHeight
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasHeight()
    {
        return this._has_height;
    } //-- boolean hasHeight() 

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
     * Method hasSizeInBytes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSizeInBytes()
    {
        return this._has_sizeInBytes;
    } //-- boolean hasSizeInBytes() 

    /**
     * Method hasWidth
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasWidth()
    {
        return this._has_width;
    } //-- boolean hasWidth() 

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
     * Sets the value of field 'cropped'.
     * 
     * @param cropped the value of field 'cropped'.
     */
    public void setCropped(boolean cropped)
    {
        this._cropped = cropped;
        this._has_cropped = true;
    } //-- void setCropped(boolean) 

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'height'.
     * 
     * @param height the value of field 'height'.
     */
    public void setHeight(int height)
    {
        this._height = height;
        this._has_height = true;
    } //-- void setHeight(int) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(int id)
    {
        this._id = id;
        this._has_id = true;
    } //-- void setId(int) 

    /**
     * Sets the value of field 'inline'.
     * 
     * @param inline the value of field 'inline'.
     */
    public void setInline(com.pg.brandbank.Inline inline)
    {
        this._inline = inline;
        this._choiceValue = inline;
    } //-- void setInline(com.pg.brandbank.Inline) 

    /**
     * Sets the value of field 'mimeType'.
     * 
     * @param mimeType the value of field 'mimeType'.
     */
    public void setMimeType(java.lang.String mimeType)
    {
        this._mimeType = mimeType;
    } //-- void setMimeType(java.lang.String) 

    /**
     * Sets the value of field 'sizeInBytes'.
     * 
     * @param sizeInBytes the value of field 'sizeInBytes'.
     */
    public void setSizeInBytes(int sizeInBytes)
    {
        this._sizeInBytes = sizeInBytes;
        this._has_sizeInBytes = true;
    } //-- void setSizeInBytes(int) 

    /**
     * Sets the value of field 'url'.
     * 
     * @param url the value of field 'url'.
     */
    public void setUrl(com.pg.brandbank.Url url)
    {
        this._url = url;
        this._choiceValue = url;
    } //-- void setUrl(com.pg.brandbank.Url) 

    /**
     * Sets the value of field 'width'.
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(int width)
    {
        this._width = width;
        this._has_width = true;
    } //-- void setWidth(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ObjectType
     */
    public static com.pg.brandbank.ObjectType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.ObjectType) Unmarshaller.unmarshal(com.pg.brandbank.ObjectType.class, reader);
    } //-- com.pg.brandbank.ObjectType unmarshal(java.io.Reader) 

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
