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
 * Class PackType.
 * 
 * @version $Revision$ $Date$
 */
public class PackType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _core
     */
    private com.pg.brandbank.Core _core;

    /**
     * Field _productGroup
     */
    private com.pg.brandbank.ProductGroup _productGroup;

    /**
     * Field _alcohol
     */
    private com.pg.brandbank.Alcohol _alcohol;

    /**
     * Field _packSize
     */
    private com.pg.brandbank.PackSize _packSize;

    /**
     * Field _noOfUnits
     */
    private com.pg.brandbank.NoOfUnits _noOfUnits;

    /**
     * Field _multPart
     */
    private com.pg.brandbank.MultPart _multPart;

    /**
     * Field _multPack
     */
    private com.pg.brandbank.MultPack _multPack;

    /**
     * Field _packTypeIngredients
     */
    private com.pg.brandbank.PackTypeIngredients _packTypeIngredients;

    /**
     * Field _packTypeNutrition
     */
    private com.pg.brandbank.PackTypeNutrition _packTypeNutrition;

    /**
     * Field _objects
     */
    private com.pg.brandbank.Objects _objects;

    /**
     * Field _numericNutritionValues
     */
    private com.pg.brandbank.NumericNutritionValues _numericNutritionValues;

    /**
     * Field _extendedAttributeValues
     */
    private com.pg.brandbank.ExtendedAttributeValues _extendedAttributeValues;

    /**
     * Field _simpleTypes
     */
    private com.pg.brandbank.SimpleTypes _simpleTypes;

    /**
     * Field _resources
     */
    private com.pg.brandbank.Resources _resources;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackType() 
     {
        super();
    } //-- com.pg.brandbank.PackType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'alcohol'.
     * 
     * @return Alcohol
     * @return the value of field 'alcohol'.
     */
    public com.pg.brandbank.Alcohol getAlcohol()
    {
        return this._alcohol;
    } //-- com.pg.brandbank.Alcohol getAlcohol() 

    /**
     * Returns the value of field 'core'.
     * 
     * @return Core
     * @return the value of field 'core'.
     */
    public com.pg.brandbank.Core getCore()
    {
        return this._core;
    } //-- com.pg.brandbank.Core getCore() 

    /**
     * Returns the value of field 'extendedAttributeValues'.
     * 
     * @return ExtendedAttributeValues
     * @return the value of field 'extendedAttributeValues'.
     */
    public com.pg.brandbank.ExtendedAttributeValues getExtendedAttributeValues()
    {
        return this._extendedAttributeValues;
    } //-- com.pg.brandbank.ExtendedAttributeValues getExtendedAttributeValues() 

    /**
     * Returns the value of field 'multPack'.
     * 
     * @return MultPack
     * @return the value of field 'multPack'.
     */
    public com.pg.brandbank.MultPack getMultPack()
    {
        return this._multPack;
    } //-- com.pg.brandbank.MultPack getMultPack() 

    /**
     * Returns the value of field 'multPart'.
     * 
     * @return MultPart
     * @return the value of field 'multPart'.
     */
    public com.pg.brandbank.MultPart getMultPart()
    {
        return this._multPart;
    } //-- com.pg.brandbank.MultPart getMultPart() 

    /**
     * Returns the value of field 'noOfUnits'.
     * 
     * @return NoOfUnits
     * @return the value of field 'noOfUnits'.
     */
    public com.pg.brandbank.NoOfUnits getNoOfUnits()
    {
        return this._noOfUnits;
    } //-- com.pg.brandbank.NoOfUnits getNoOfUnits() 

    /**
     * Returns the value of field 'numericNutritionValues'.
     * 
     * @return NumericNutritionValues
     * @return the value of field 'numericNutritionValues'.
     */
    public com.pg.brandbank.NumericNutritionValues getNumericNutritionValues()
    {
        return this._numericNutritionValues;
    } //-- com.pg.brandbank.NumericNutritionValues getNumericNutritionValues() 

    /**
     * Returns the value of field 'objects'.
     * 
     * @return Objects
     * @return the value of field 'objects'.
     */
    public com.pg.brandbank.Objects getObjects()
    {
        return this._objects;
    } //-- com.pg.brandbank.Objects getObjects() 

    /**
     * Returns the value of field 'packSize'.
     * 
     * @return PackSize
     * @return the value of field 'packSize'.
     */
    public com.pg.brandbank.PackSize getPackSize()
    {
        return this._packSize;
    } //-- com.pg.brandbank.PackSize getPackSize() 

    /**
     * Returns the value of field 'packTypeIngredients'.
     * 
     * @return PackTypeIngredients
     * @return the value of field 'packTypeIngredients'.
     */
    public com.pg.brandbank.PackTypeIngredients getPackTypeIngredients()
    {
        return this._packTypeIngredients;
    } //-- com.pg.brandbank.PackTypeIngredients getPackTypeIngredients() 

    /**
     * Returns the value of field 'packTypeNutrition'.
     * 
     * @return PackTypeNutrition
     * @return the value of field 'packTypeNutrition'.
     */
    public com.pg.brandbank.PackTypeNutrition getPackTypeNutrition()
    {
        return this._packTypeNutrition;
    } //-- com.pg.brandbank.PackTypeNutrition getPackTypeNutrition() 

    /**
     * Returns the value of field 'productGroup'.
     * 
     * @return ProductGroup
     * @return the value of field 'productGroup'.
     */
    public com.pg.brandbank.ProductGroup getProductGroup()
    {
        return this._productGroup;
    } //-- com.pg.brandbank.ProductGroup getProductGroup() 

    /**
     * Returns the value of field 'resources'.
     * 
     * @return Resources
     * @return the value of field 'resources'.
     */
    public com.pg.brandbank.Resources getResources()
    {
        return this._resources;
    } //-- com.pg.brandbank.Resources getResources() 

    /**
     * Returns the value of field 'simpleTypes'.
     * 
     * @return SimpleTypes
     * @return the value of field 'simpleTypes'.
     */
    public com.pg.brandbank.SimpleTypes getSimpleTypes()
    {
        return this._simpleTypes;
    } //-- com.pg.brandbank.SimpleTypes getSimpleTypes() 

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
     * Sets the value of field 'alcohol'.
     * 
     * @param alcohol the value of field 'alcohol'.
     */
    public void setAlcohol(com.pg.brandbank.Alcohol alcohol)
    {
        this._alcohol = alcohol;
    } //-- void setAlcohol(com.pg.brandbank.Alcohol) 

    /**
     * Sets the value of field 'core'.
     * 
     * @param core the value of field 'core'.
     */
    public void setCore(com.pg.brandbank.Core core)
    {
        this._core = core;
    } //-- void setCore(com.pg.brandbank.Core) 

    /**
     * Sets the value of field 'extendedAttributeValues'.
     * 
     * @param extendedAttributeValues the value of field
     * 'extendedAttributeValues'.
     */
    public void setExtendedAttributeValues(com.pg.brandbank.ExtendedAttributeValues extendedAttributeValues)
    {
        this._extendedAttributeValues = extendedAttributeValues;
    } //-- void setExtendedAttributeValues(com.pg.brandbank.ExtendedAttributeValues) 

    /**
     * Sets the value of field 'multPack'.
     * 
     * @param multPack the value of field 'multPack'.
     */
    public void setMultPack(com.pg.brandbank.MultPack multPack)
    {
        this._multPack = multPack;
    } //-- void setMultPack(com.pg.brandbank.MultPack) 

    /**
     * Sets the value of field 'multPart'.
     * 
     * @param multPart the value of field 'multPart'.
     */
    public void setMultPart(com.pg.brandbank.MultPart multPart)
    {
        this._multPart = multPart;
    } //-- void setMultPart(com.pg.brandbank.MultPart) 

    /**
     * Sets the value of field 'noOfUnits'.
     * 
     * @param noOfUnits the value of field 'noOfUnits'.
     */
    public void setNoOfUnits(com.pg.brandbank.NoOfUnits noOfUnits)
    {
        this._noOfUnits = noOfUnits;
    } //-- void setNoOfUnits(com.pg.brandbank.NoOfUnits) 

    /**
     * Sets the value of field 'numericNutritionValues'.
     * 
     * @param numericNutritionValues the value of field
     * 'numericNutritionValues'.
     */
    public void setNumericNutritionValues(com.pg.brandbank.NumericNutritionValues numericNutritionValues)
    {
        this._numericNutritionValues = numericNutritionValues;
    } //-- void setNumericNutritionValues(com.pg.brandbank.NumericNutritionValues) 

    /**
     * Sets the value of field 'objects'.
     * 
     * @param objects the value of field 'objects'.
     */
    public void setObjects(com.pg.brandbank.Objects objects)
    {
        this._objects = objects;
    } //-- void setObjects(com.pg.brandbank.Objects) 

    /**
     * Sets the value of field 'packSize'.
     * 
     * @param packSize the value of field 'packSize'.
     */
    public void setPackSize(com.pg.brandbank.PackSize packSize)
    {
        this._packSize = packSize;
    } //-- void setPackSize(com.pg.brandbank.PackSize) 

    /**
     * Sets the value of field 'packTypeIngredients'.
     * 
     * @param packTypeIngredients the value of field
     * 'packTypeIngredients'.
     */
    public void setPackTypeIngredients(com.pg.brandbank.PackTypeIngredients packTypeIngredients)
    {
        this._packTypeIngredients = packTypeIngredients;
    } //-- void setPackTypeIngredients(com.pg.brandbank.PackTypeIngredients) 

    /**
     * Sets the value of field 'packTypeNutrition'.
     * 
     * @param packTypeNutrition the value of field
     * 'packTypeNutrition'.
     */
    public void setPackTypeNutrition(com.pg.brandbank.PackTypeNutrition packTypeNutrition)
    {
        this._packTypeNutrition = packTypeNutrition;
    } //-- void setPackTypeNutrition(com.pg.brandbank.PackTypeNutrition) 

    /**
     * Sets the value of field 'productGroup'.
     * 
     * @param productGroup the value of field 'productGroup'.
     */
    public void setProductGroup(com.pg.brandbank.ProductGroup productGroup)
    {
        this._productGroup = productGroup;
    } //-- void setProductGroup(com.pg.brandbank.ProductGroup) 

    /**
     * Sets the value of field 'resources'.
     * 
     * @param resources the value of field 'resources'.
     */
    public void setResources(com.pg.brandbank.Resources resources)
    {
        this._resources = resources;
    } //-- void setResources(com.pg.brandbank.Resources) 

    /**
     * Sets the value of field 'simpleTypes'.
     * 
     * @param simpleTypes the value of field 'simpleTypes'.
     */
    public void setSimpleTypes(com.pg.brandbank.SimpleTypes simpleTypes)
    {
        this._simpleTypes = simpleTypes;
    } //-- void setSimpleTypes(com.pg.brandbank.SimpleTypes) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return PackType
     */
    public static com.pg.brandbank.PackType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.PackType) Unmarshaller.unmarshal(com.pg.brandbank.PackType.class, reader);
    } //-- com.pg.brandbank.PackType unmarshal(java.io.Reader) 

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
