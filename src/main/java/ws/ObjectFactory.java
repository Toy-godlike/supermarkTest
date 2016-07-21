
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveOnSale_QNAME = new QName("http://service/", "saveOnSale");
    private final static QName _SaveDiscountResponse_QNAME = new QName("http://service/", "saveDiscountResponse");
    private final static QName _SaveDiscount_QNAME = new QName("http://service/", "saveDiscount");
    private final static QName _SaveOnSaleResponse_QNAME = new QName("http://service/", "saveOnSaleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveDiscountResponse }
     * 
     */
    public SaveDiscountResponse createSaveDiscountResponse() {
        return new SaveDiscountResponse();
    }

    /**
     * Create an instance of {@link SaveOnSale }
     * 
     */
    public SaveOnSale createSaveOnSale() {
        return new SaveOnSale();
    }

    /**
     * Create an instance of {@link SaveOnSaleResponse }
     * 
     */
    public SaveOnSaleResponse createSaveOnSaleResponse() {
        return new SaveOnSaleResponse();
    }

    /**
     * Create an instance of {@link SaveDiscount }
     * 
     */
    public SaveDiscount createSaveDiscount() {
        return new SaveDiscount();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link Discount }
     * 
     */
    public Discount createDiscount() {
        return new Discount();
    }

    /**
     * Create an instance of {@link OnSale }
     * 
     */
    public OnSale createOnSale() {
        return new OnSale();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOnSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "saveOnSale")
    public JAXBElement<SaveOnSale> createSaveOnSale(SaveOnSale value) {
        return new JAXBElement<SaveOnSale>(_SaveOnSale_QNAME, SaveOnSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDiscountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "saveDiscountResponse")
    public JAXBElement<SaveDiscountResponse> createSaveDiscountResponse(SaveDiscountResponse value) {
        return new JAXBElement<SaveDiscountResponse>(_SaveDiscountResponse_QNAME, SaveDiscountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDiscount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "saveDiscount")
    public JAXBElement<SaveDiscount> createSaveDiscount(SaveDiscount value) {
        return new JAXBElement<SaveDiscount>(_SaveDiscount_QNAME, SaveDiscount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOnSaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "saveOnSaleResponse")
    public JAXBElement<SaveOnSaleResponse> createSaveOnSaleResponse(SaveOnSaleResponse value) {
        return new JAXBElement<SaveOnSaleResponse>(_SaveOnSaleResponse_QNAME, SaveOnSaleResponse.class, null, value);
    }

}
