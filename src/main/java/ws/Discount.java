
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>discount complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="discount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="d_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disc" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="products" type="{http://service/}products" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount", propOrder = {
    "beginDate",
    "dNum",
    "disc",
    "endDate",
    "products"
})
public class Discount {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "d_num")
    protected int dNum;
    protected float disc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Products products;

    /**
     * ��ȡbeginDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * ����beginDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * ��ȡdNum���Ե�ֵ��
     * 
     */
    public int getDNum() {
        return dNum;
    }

    /**
     * ����dNum���Ե�ֵ��
     * 
     */
    public void setDNum(int value) {
        this.dNum = value;
    }

    /**
     * ��ȡdisc���Ե�ֵ��
     * 
     */
    public float getDisc() {
        return disc;
    }

    /**
     * ����disc���Ե�ֵ��
     * 
     */
    public void setDisc(float value) {
        this.disc = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡproducts���Ե�ֵ��
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
     * ����products���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Products }
     *     
     */
    public void setProducts(Products value) {
        this.products = value;
    }

}
