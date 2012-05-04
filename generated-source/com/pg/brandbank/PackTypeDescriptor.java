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

import org.exolab.castor.mapping.AccessMode;
import org.exolab.castor.xml.TypeValidator;
import org.exolab.castor.xml.XMLFieldDescriptor;
import org.exolab.castor.xml.validators.*;

/**
 * Class PackTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class PackTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field elementDefinition
     */
    private boolean elementDefinition;

    /**
     * Field nsPrefix
     */
    private java.lang.String nsPrefix;

    /**
     * Field nsURI
     */
    private java.lang.String nsURI;

    /**
     * Field xmlName
     */
    private java.lang.String xmlName;

    /**
     * Field identity
     */
    private org.exolab.castor.xml.XMLFieldDescriptor identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackTypeDescriptor() 
     {
        super();
        nsURI = "http://www.brandbank.com/2007/12";
        xmlName = "PackType";
        elementDefinition = false;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _core
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.Core.class, "_core", "Core", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getCore();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setCore( (com.pg.brandbank.Core) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.Core();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _core
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _productGroup
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.ProductGroup.class, "_productGroup", "ProductGroup", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getProductGroup();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setProductGroup( (com.pg.brandbank.ProductGroup) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.ProductGroup();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _productGroup
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _alcohol
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.Alcohol.class, "_alcohol", "Alcohol", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getAlcohol();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setAlcohol( (com.pg.brandbank.Alcohol) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.Alcohol();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _alcohol
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _packSize
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.PackSize.class, "_packSize", "PackSize", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getPackSize();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setPackSize( (com.pg.brandbank.PackSize) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.PackSize();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _packSize
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _noOfUnits
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.NoOfUnits.class, "_noOfUnits", "NoOfUnits", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getNoOfUnits();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setNoOfUnits( (com.pg.brandbank.NoOfUnits) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.NoOfUnits();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _noOfUnits
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _multPart
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.MultPart.class, "_multPart", "MultPart", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getMultPart();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setMultPart( (com.pg.brandbank.MultPart) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.MultPart();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _multPart
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _multPack
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.MultPack.class, "_multPack", "MultPack", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getMultPack();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setMultPack( (com.pg.brandbank.MultPack) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.MultPack();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _multPack
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _packTypeIngredients
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.PackTypeIngredients.class, "_packTypeIngredients", "Ingredients", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getPackTypeIngredients();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setPackTypeIngredients( (com.pg.brandbank.PackTypeIngredients) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.PackTypeIngredients();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _packTypeIngredients
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _packTypeNutrition
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.PackTypeNutrition.class, "_packTypeNutrition", "Nutrition", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getPackTypeNutrition();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setPackTypeNutrition( (com.pg.brandbank.PackTypeNutrition) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.PackTypeNutrition();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _packTypeNutrition
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _objects
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.Objects.class, "_objects", "Objects", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getObjects();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setObjects( (com.pg.brandbank.Objects) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.Objects();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _objects
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _numericNutritionValues
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.NumericNutritionValues.class, "_numericNutritionValues", "NumericNutritionValues", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getNumericNutritionValues();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setNumericNutritionValues( (com.pg.brandbank.NumericNutritionValues) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.NumericNutritionValues();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _numericNutritionValues
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _extendedAttributeValues
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.ExtendedAttributeValues.class, "_extendedAttributeValues", "ExtendedAttributeValues", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getExtendedAttributeValues();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setExtendedAttributeValues( (com.pg.brandbank.ExtendedAttributeValues) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.ExtendedAttributeValues();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _extendedAttributeValues
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _simpleTypes
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.SimpleTypes.class, "_simpleTypes", "SimpleTypes", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getSimpleTypes();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setSimpleTypes( (com.pg.brandbank.SimpleTypes) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.SimpleTypes();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _simpleTypes
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _resources
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.pg.brandbank.Resources.class, "_resources", "Resources", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PackType target = (PackType) object;
                return target.getResources();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PackType target = (PackType) object;
                    target.setResources( (com.pg.brandbank.Resources) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new com.pg.brandbank.Resources();
            }
        };
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.brandbank.com/2007/12");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _resources
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- com.pg.brandbank.PackTypeDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode
     * 
     * 
     * 
     * @return AccessMode
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode()
    {
        return null;
    } //-- org.exolab.castor.mapping.AccessMode getAccessMode() 

    /**
     * Method getExtends
     * 
     * 
     * 
     * @return ClassDescriptor
     */
    public org.exolab.castor.mapping.ClassDescriptor getExtends()
    {
        return null;
    } //-- org.exolab.castor.mapping.ClassDescriptor getExtends() 

    /**
     * Method getIdentity
     * 
     * 
     * 
     * @return FieldDescriptor
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity()
    {
        return identity;
    } //-- org.exolab.castor.mapping.FieldDescriptor getIdentity() 

    /**
     * Method getJavaClass
     * 
     * 
     * 
     * @return Class
     */
    public java.lang.Class getJavaClass()
    {
        return com.pg.brandbank.PackType.class;
    } //-- java.lang.Class getJavaClass() 

    /**
     * Method getNameSpacePrefix
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String getNameSpacePrefix()
    {
        return nsPrefix;
    } //-- java.lang.String getNameSpacePrefix() 

    /**
     * Method getNameSpaceURI
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String getNameSpaceURI()
    {
        return nsURI;
    } //-- java.lang.String getNameSpaceURI() 

    /**
     * Method getValidator
     * 
     * 
     * 
     * @return TypeValidator
     */
    public org.exolab.castor.xml.TypeValidator getValidator()
    {
        return this;
    } //-- org.exolab.castor.xml.TypeValidator getValidator() 

    /**
     * Method getXMLName
     * 
     * 
     * 
     * @return String
     */
    public java.lang.String getXMLName()
    {
        return xmlName;
    } //-- java.lang.String getXMLName() 

    /**
     * Method isElementDefinition
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isElementDefinition()
    {
        return elementDefinition;
    } //-- boolean isElementDefinition() 

}
