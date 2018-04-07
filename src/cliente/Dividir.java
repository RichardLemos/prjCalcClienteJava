
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Dividir complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Dividir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dividir", propOrder = {
    "num1",
    "num2"
})
public class Dividir {

    protected float num1;
    protected float num2;

    /**
     * Obtém o valor da propriedade num1.
     * 
     */
    public float getNum1() {
        return num1;
    }

    /**
     * Define o valor da propriedade num1.
     * 
     */
    public void setNum1(float value) {
        this.num1 = value;
    }

    /**
     * Obtém o valor da propriedade num2.
     * 
     */
    public float getNum2() {
        return num2;
    }

    /**
     * Define o valor da propriedade num2.
     * 
     */
    public void setNum2(float value) {
        this.num2 = value;
    }

}
