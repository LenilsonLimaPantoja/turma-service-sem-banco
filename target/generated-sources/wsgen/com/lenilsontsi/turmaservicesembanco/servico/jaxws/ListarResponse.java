
package com.lenilsontsi.turmaservicesembanco.servico.jaxws;

import java.util.List;
import com.lenilsontsi.turmaservicesembanco.modelo.Turma;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listarResponse", namespace = "http://servico.turmaservicesembanco.lenilsontsi.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarResponse", namespace = "http://servico.turmaservicesembanco.lenilsontsi.com/")
public class ListarResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Turma> _return;

    /**
     * 
     * @return
     *     returns List<Turma>
     */
    public List<Turma> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Turma> _return) {
        this._return = _return;
    }

}
