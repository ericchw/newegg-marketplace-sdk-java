//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.12 at 02:15:02 PM CST 
//


package com.newegg.marketplace.sdk.datafeed.model.sub.properties;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeadsetModelValueList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeadsetModelValueList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="V-flashblack2"/>
 *     &lt;enumeration value="V-FLASHBLACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeadsetModelValueList")
@XmlEnum
public enum HeadsetModelValueList {

    @XmlEnumValue("V-flashblack2")
    V_FLASHBLACK_2("V-flashblack2"),
    @XmlEnumValue("V-FLASHBLACK")
    V_FLASHBLACK("V-FLASHBLACK");
    private final String value;

    HeadsetModelValueList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadsetModelValueList fromValue(String v) {
        for (HeadsetModelValueList c: HeadsetModelValueList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
