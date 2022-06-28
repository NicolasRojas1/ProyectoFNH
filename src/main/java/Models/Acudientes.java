
package Models;

public class Acudientes {
    
    private int     AcuId;
    private int     EstId;
    private int     PerId;
    private String  AcuTelFijo;
    private String  AcuTelCelular;
    private String  AcuNivelEducacion;
    private String  AcuOcupacion; 

    public Acudientes() {
    }

    public int getAcuId() {
        return AcuId;
    }

    public void setAcuId(int AcuId) {
        this.AcuId = AcuId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public int getPerId() {
        return PerId;
    }

    public void setPerId(int PerId) {
        this.PerId = PerId;
    }

    public String getAcuTelFijo() {
        return AcuTelFijo;
    }

    public void setAcuTelFijo(String AcuTelFijo) {
        this.AcuTelFijo = AcuTelFijo;
    }

    public String getAcuTelCelular() {
        return AcuTelCelular;
    }

    public void setAcuTelCelular(String AcuTelCelular) {
        this.AcuTelCelular = AcuTelCelular;
    }

    public String getAcuNivelEducacion() {
        return AcuNivelEducacion;
    }

    public void setAcuNivelEducacion(String AcuNivelEducacion) {
        this.AcuNivelEducacion = AcuNivelEducacion;
    }

    public String getAcuOcupacion() {
        return AcuOcupacion;
    }

    public void setAcuOcupacion(String AcuOcupacion) {
        this.AcuOcupacion = AcuOcupacion;
    }

    @Override
    public String toString() {
        return "Acudientes{" + "Id=" + AcuId + 
                ", EstId=" + EstId + ", PerId=" + PerId + 
                ", TelFijo=" + AcuTelFijo + 
                ", TelCelular=" + AcuTelCelular + 
                ", NivelEducacion=" + AcuNivelEducacion + 
                ", Ocupacion=" + AcuOcupacion + '}';
    }
      
}
