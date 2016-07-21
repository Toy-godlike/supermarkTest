
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>onSale complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="onSale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://service/}area" minOccurs="0"/>
 *         &lt;element name="products" type="{http://service/}products" minOccurs="0"/>
 *         &lt;element name="rfid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onSale", propOrder = {
    "area",
    "products",
    "rfid"
})
public class OnSale {

    protected Area area;
    protected Products products;
    protected String rfid;

    /**
     * 获取area属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * 设置area属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

    /**
     * 获取products属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Products }
     *     
     */
    public Products getProducts() {
        return products;
    }

    /**
     * 设置products属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Products }
     *     
     */
    public void setProducts(Products value) {
        this.products = value;
    }

    /**
     * 获取rfid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfid() {
        return rfid;
    }

    /**
     * 设置rfid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfid(String value) {
        this.rfid = value;
    }

}
