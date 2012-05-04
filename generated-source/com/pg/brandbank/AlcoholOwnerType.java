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
 * Class AlcoholOwnerType.
 * 
 * @version $Revision$ $Date$
 */
public class AlcoholOwnerType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _domain
     */
    private java.lang.String _domain;

    /**
     * Field _beverageType
     */
    private java.lang.String _beverageType;

    /**
     * Field _alcoholUnits
     */
    private java.lang.String _alcoholUnits;

    /**
     * Field _percentageAlcohol
     */
    private java.lang.String _percentageAlcohol;

    /**
     * Field _tastingNotes
     */
    private java.lang.String _tastingNotes;

    /**
     * Field _tasteCategory
     */
    private java.lang.String _tasteCategory;

    /**
     * Field _servingSuggestion
     */
    private java.lang.String _servingSuggestion;

    /**
     * Field _regionOfOrigin
     */
    private java.lang.String _regionOfOrigin;

    /**
     * Field _regionOfOriginLookup
     */
    private java.lang.String _regionOfOriginLookup;

    /**
     * Field _currentVintage
     */
    private java.lang.String _currentVintage;

    /**
     * Field _wineColour
     */
    private java.lang.String _wineColour;

    /**
     * Field _definedArea
     */
    private java.lang.String _definedArea;

    /**
     * Field _definedAreaLookup
     */
    private java.lang.String _definedAreaLookup;

    /**
     * Field _producer
     */
    private java.lang.String _producer;

    /**
     * Field _legalDesignation
     */
    private java.lang.String _legalDesignation;

    /**
     * Field _grapeVariety
     */
    private java.lang.String _grapeVariety;

    /**
     * Field _blend
     */
    private java.lang.String _blend;

    /**
     * Field _typeOfClosure
     */
    private java.lang.String _typeOfClosure;

    /**
     * Field _exclusiveTo
     */
    private com.pg.brandbank.ExclusiveTo _exclusiveTo;

    /**
     * Field _storageInstructions
     */
    private java.lang.String _storageInstructions;

    /**
     * Field _wineMaker
     */
    private java.lang.String _wineMaker;

    /**
     * Field _agentName
     */
    private java.lang.String _agentName;

    /**
     * Field _vinificationDetails
     */
    private java.lang.String _vinificationDetails;

    /**
     * Field _history
     */
    private java.lang.String _history;

    /**
     * Field _regionalInformation
     */
    private java.lang.String _regionalInformation;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlcoholOwnerType() 
     {
        super();
    } //-- com.pg.brandbank.AlcoholOwnerType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'agentName'.
     * 
     * @return String
     * @return the value of field 'agentName'.
     */
    public java.lang.String getAgentName()
    {
        return this._agentName;
    } //-- java.lang.String getAgentName() 

    /**
     * Returns the value of field 'alcoholUnits'.
     * 
     * @return String
     * @return the value of field 'alcoholUnits'.
     */
    public java.lang.String getAlcoholUnits()
    {
        return this._alcoholUnits;
    } //-- java.lang.String getAlcoholUnits() 

    /**
     * Returns the value of field 'beverageType'.
     * 
     * @return String
     * @return the value of field 'beverageType'.
     */
    public java.lang.String getBeverageType()
    {
        return this._beverageType;
    } //-- java.lang.String getBeverageType() 

    /**
     * Returns the value of field 'blend'.
     * 
     * @return String
     * @return the value of field 'blend'.
     */
    public java.lang.String getBlend()
    {
        return this._blend;
    } //-- java.lang.String getBlend() 

    /**
     * Returns the value of field 'currentVintage'.
     * 
     * @return String
     * @return the value of field 'currentVintage'.
     */
    public java.lang.String getCurrentVintage()
    {
        return this._currentVintage;
    } //-- java.lang.String getCurrentVintage() 

    /**
     * Returns the value of field 'definedArea'.
     * 
     * @return String
     * @return the value of field 'definedArea'.
     */
    public java.lang.String getDefinedArea()
    {
        return this._definedArea;
    } //-- java.lang.String getDefinedArea() 

    /**
     * Returns the value of field 'definedAreaLookup'.
     * 
     * @return String
     * @return the value of field 'definedAreaLookup'.
     */
    public java.lang.String getDefinedAreaLookup()
    {
        return this._definedAreaLookup;
    } //-- java.lang.String getDefinedAreaLookup() 

    /**
     * Returns the value of field 'domain'.
     * 
     * @return String
     * @return the value of field 'domain'.
     */
    public java.lang.String getDomain()
    {
        return this._domain;
    } //-- java.lang.String getDomain() 

    /**
     * Returns the value of field 'exclusiveTo'.
     * 
     * @return ExclusiveTo
     * @return the value of field 'exclusiveTo'.
     */
    public com.pg.brandbank.ExclusiveTo getExclusiveTo()
    {
        return this._exclusiveTo;
    } //-- com.pg.brandbank.ExclusiveTo getExclusiveTo() 

    /**
     * Returns the value of field 'grapeVariety'.
     * 
     * @return String
     * @return the value of field 'grapeVariety'.
     */
    public java.lang.String getGrapeVariety()
    {
        return this._grapeVariety;
    } //-- java.lang.String getGrapeVariety() 

    /**
     * Returns the value of field 'history'.
     * 
     * @return String
     * @return the value of field 'history'.
     */
    public java.lang.String getHistory()
    {
        return this._history;
    } //-- java.lang.String getHistory() 

    /**
     * Returns the value of field 'legalDesignation'.
     * 
     * @return String
     * @return the value of field 'legalDesignation'.
     */
    public java.lang.String getLegalDesignation()
    {
        return this._legalDesignation;
    } //-- java.lang.String getLegalDesignation() 

    /**
     * Returns the value of field 'percentageAlcohol'.
     * 
     * @return String
     * @return the value of field 'percentageAlcohol'.
     */
    public java.lang.String getPercentageAlcohol()
    {
        return this._percentageAlcohol;
    } //-- java.lang.String getPercentageAlcohol() 

    /**
     * Returns the value of field 'producer'.
     * 
     * @return String
     * @return the value of field 'producer'.
     */
    public java.lang.String getProducer()
    {
        return this._producer;
    } //-- java.lang.String getProducer() 

    /**
     * Returns the value of field 'regionOfOrigin'.
     * 
     * @return String
     * @return the value of field 'regionOfOrigin'.
     */
    public java.lang.String getRegionOfOrigin()
    {
        return this._regionOfOrigin;
    } //-- java.lang.String getRegionOfOrigin() 

    /**
     * Returns the value of field 'regionOfOriginLookup'.
     * 
     * @return String
     * @return the value of field 'regionOfOriginLookup'.
     */
    public java.lang.String getRegionOfOriginLookup()
    {
        return this._regionOfOriginLookup;
    } //-- java.lang.String getRegionOfOriginLookup() 

    /**
     * Returns the value of field 'regionalInformation'.
     * 
     * @return String
     * @return the value of field 'regionalInformation'.
     */
    public java.lang.String getRegionalInformation()
    {
        return this._regionalInformation;
    } //-- java.lang.String getRegionalInformation() 

    /**
     * Returns the value of field 'servingSuggestion'.
     * 
     * @return String
     * @return the value of field 'servingSuggestion'.
     */
    public java.lang.String getServingSuggestion()
    {
        return this._servingSuggestion;
    } //-- java.lang.String getServingSuggestion() 

    /**
     * Returns the value of field 'storageInstructions'.
     * 
     * @return String
     * @return the value of field 'storageInstructions'.
     */
    public java.lang.String getStorageInstructions()
    {
        return this._storageInstructions;
    } //-- java.lang.String getStorageInstructions() 

    /**
     * Returns the value of field 'tasteCategory'.
     * 
     * @return String
     * @return the value of field 'tasteCategory'.
     */
    public java.lang.String getTasteCategory()
    {
        return this._tasteCategory;
    } //-- java.lang.String getTasteCategory() 

    /**
     * Returns the value of field 'tastingNotes'.
     * 
     * @return String
     * @return the value of field 'tastingNotes'.
     */
    public java.lang.String getTastingNotes()
    {
        return this._tastingNotes;
    } //-- java.lang.String getTastingNotes() 

    /**
     * Returns the value of field 'typeOfClosure'.
     * 
     * @return String
     * @return the value of field 'typeOfClosure'.
     */
    public java.lang.String getTypeOfClosure()
    {
        return this._typeOfClosure;
    } //-- java.lang.String getTypeOfClosure() 

    /**
     * Returns the value of field 'vinificationDetails'.
     * 
     * @return String
     * @return the value of field 'vinificationDetails'.
     */
    public java.lang.String getVinificationDetails()
    {
        return this._vinificationDetails;
    } //-- java.lang.String getVinificationDetails() 

    /**
     * Returns the value of field 'wineColour'.
     * 
     * @return String
     * @return the value of field 'wineColour'.
     */
    public java.lang.String getWineColour()
    {
        return this._wineColour;
    } //-- java.lang.String getWineColour() 

    /**
     * Returns the value of field 'wineMaker'.
     * 
     * @return String
     * @return the value of field 'wineMaker'.
     */
    public java.lang.String getWineMaker()
    {
        return this._wineMaker;
    } //-- java.lang.String getWineMaker() 

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
     * Sets the value of field 'agentName'.
     * 
     * @param agentName the value of field 'agentName'.
     */
    public void setAgentName(java.lang.String agentName)
    {
        this._agentName = agentName;
    } //-- void setAgentName(java.lang.String) 

    /**
     * Sets the value of field 'alcoholUnits'.
     * 
     * @param alcoholUnits the value of field 'alcoholUnits'.
     */
    public void setAlcoholUnits(java.lang.String alcoholUnits)
    {
        this._alcoholUnits = alcoholUnits;
    } //-- void setAlcoholUnits(java.lang.String) 

    /**
     * Sets the value of field 'beverageType'.
     * 
     * @param beverageType the value of field 'beverageType'.
     */
    public void setBeverageType(java.lang.String beverageType)
    {
        this._beverageType = beverageType;
    } //-- void setBeverageType(java.lang.String) 

    /**
     * Sets the value of field 'blend'.
     * 
     * @param blend the value of field 'blend'.
     */
    public void setBlend(java.lang.String blend)
    {
        this._blend = blend;
    } //-- void setBlend(java.lang.String) 

    /**
     * Sets the value of field 'currentVintage'.
     * 
     * @param currentVintage the value of field 'currentVintage'.
     */
    public void setCurrentVintage(java.lang.String currentVintage)
    {
        this._currentVintage = currentVintage;
    } //-- void setCurrentVintage(java.lang.String) 

    /**
     * Sets the value of field 'definedArea'.
     * 
     * @param definedArea the value of field 'definedArea'.
     */
    public void setDefinedArea(java.lang.String definedArea)
    {
        this._definedArea = definedArea;
    } //-- void setDefinedArea(java.lang.String) 

    /**
     * Sets the value of field 'definedAreaLookup'.
     * 
     * @param definedAreaLookup the value of field
     * 'definedAreaLookup'.
     */
    public void setDefinedAreaLookup(java.lang.String definedAreaLookup)
    {
        this._definedAreaLookup = definedAreaLookup;
    } //-- void setDefinedAreaLookup(java.lang.String) 

    /**
     * Sets the value of field 'domain'.
     * 
     * @param domain the value of field 'domain'.
     */
    public void setDomain(java.lang.String domain)
    {
        this._domain = domain;
    } //-- void setDomain(java.lang.String) 

    /**
     * Sets the value of field 'exclusiveTo'.
     * 
     * @param exclusiveTo the value of field 'exclusiveTo'.
     */
    public void setExclusiveTo(com.pg.brandbank.ExclusiveTo exclusiveTo)
    {
        this._exclusiveTo = exclusiveTo;
    } //-- void setExclusiveTo(com.pg.brandbank.ExclusiveTo) 

    /**
     * Sets the value of field 'grapeVariety'.
     * 
     * @param grapeVariety the value of field 'grapeVariety'.
     */
    public void setGrapeVariety(java.lang.String grapeVariety)
    {
        this._grapeVariety = grapeVariety;
    } //-- void setGrapeVariety(java.lang.String) 

    /**
     * Sets the value of field 'history'.
     * 
     * @param history the value of field 'history'.
     */
    public void setHistory(java.lang.String history)
    {
        this._history = history;
    } //-- void setHistory(java.lang.String) 

    /**
     * Sets the value of field 'legalDesignation'.
     * 
     * @param legalDesignation the value of field 'legalDesignation'
     */
    public void setLegalDesignation(java.lang.String legalDesignation)
    {
        this._legalDesignation = legalDesignation;
    } //-- void setLegalDesignation(java.lang.String) 

    /**
     * Sets the value of field 'percentageAlcohol'.
     * 
     * @param percentageAlcohol the value of field
     * 'percentageAlcohol'.
     */
    public void setPercentageAlcohol(java.lang.String percentageAlcohol)
    {
        this._percentageAlcohol = percentageAlcohol;
    } //-- void setPercentageAlcohol(java.lang.String) 

    /**
     * Sets the value of field 'producer'.
     * 
     * @param producer the value of field 'producer'.
     */
    public void setProducer(java.lang.String producer)
    {
        this._producer = producer;
    } //-- void setProducer(java.lang.String) 

    /**
     * Sets the value of field 'regionOfOrigin'.
     * 
     * @param regionOfOrigin the value of field 'regionOfOrigin'.
     */
    public void setRegionOfOrigin(java.lang.String regionOfOrigin)
    {
        this._regionOfOrigin = regionOfOrigin;
    } //-- void setRegionOfOrigin(java.lang.String) 

    /**
     * Sets the value of field 'regionOfOriginLookup'.
     * 
     * @param regionOfOriginLookup the value of field
     * 'regionOfOriginLookup'.
     */
    public void setRegionOfOriginLookup(java.lang.String regionOfOriginLookup)
    {
        this._regionOfOriginLookup = regionOfOriginLookup;
    } //-- void setRegionOfOriginLookup(java.lang.String) 

    /**
     * Sets the value of field 'regionalInformation'.
     * 
     * @param regionalInformation the value of field
     * 'regionalInformation'.
     */
    public void setRegionalInformation(java.lang.String regionalInformation)
    {
        this._regionalInformation = regionalInformation;
    } //-- void setRegionalInformation(java.lang.String) 

    /**
     * Sets the value of field 'servingSuggestion'.
     * 
     * @param servingSuggestion the value of field
     * 'servingSuggestion'.
     */
    public void setServingSuggestion(java.lang.String servingSuggestion)
    {
        this._servingSuggestion = servingSuggestion;
    } //-- void setServingSuggestion(java.lang.String) 

    /**
     * Sets the value of field 'storageInstructions'.
     * 
     * @param storageInstructions the value of field
     * 'storageInstructions'.
     */
    public void setStorageInstructions(java.lang.String storageInstructions)
    {
        this._storageInstructions = storageInstructions;
    } //-- void setStorageInstructions(java.lang.String) 

    /**
     * Sets the value of field 'tasteCategory'.
     * 
     * @param tasteCategory the value of field 'tasteCategory'.
     */
    public void setTasteCategory(java.lang.String tasteCategory)
    {
        this._tasteCategory = tasteCategory;
    } //-- void setTasteCategory(java.lang.String) 

    /**
     * Sets the value of field 'tastingNotes'.
     * 
     * @param tastingNotes the value of field 'tastingNotes'.
     */
    public void setTastingNotes(java.lang.String tastingNotes)
    {
        this._tastingNotes = tastingNotes;
    } //-- void setTastingNotes(java.lang.String) 

    /**
     * Sets the value of field 'typeOfClosure'.
     * 
     * @param typeOfClosure the value of field 'typeOfClosure'.
     */
    public void setTypeOfClosure(java.lang.String typeOfClosure)
    {
        this._typeOfClosure = typeOfClosure;
    } //-- void setTypeOfClosure(java.lang.String) 

    /**
     * Sets the value of field 'vinificationDetails'.
     * 
     * @param vinificationDetails the value of field
     * 'vinificationDetails'.
     */
    public void setVinificationDetails(java.lang.String vinificationDetails)
    {
        this._vinificationDetails = vinificationDetails;
    } //-- void setVinificationDetails(java.lang.String) 

    /**
     * Sets the value of field 'wineColour'.
     * 
     * @param wineColour the value of field 'wineColour'.
     */
    public void setWineColour(java.lang.String wineColour)
    {
        this._wineColour = wineColour;
    } //-- void setWineColour(java.lang.String) 

    /**
     * Sets the value of field 'wineMaker'.
     * 
     * @param wineMaker the value of field 'wineMaker'.
     */
    public void setWineMaker(java.lang.String wineMaker)
    {
        this._wineMaker = wineMaker;
    } //-- void setWineMaker(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlcoholOwnerType
     */
    public static com.pg.brandbank.AlcoholOwnerType unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.pg.brandbank.AlcoholOwnerType) Unmarshaller.unmarshal(com.pg.brandbank.AlcoholOwnerType.class, reader);
    } //-- com.pg.brandbank.AlcoholOwnerType unmarshal(java.io.Reader) 

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
