import com.google.gson.annotations.SerializedName;

public class Endereco {
    @SerializedName("conversion_rate")
    private String valorMoeda;
    @SerializedName("base_code")
    private String moedaBase;
    @SerializedName("target_code")
    private String moedaFinal;
    @SerializedName("conversion_result")
    private String resultado;

    private String qtd;

    public String getValorMoeda() {
        return valorMoeda;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaFinal() {
        return moedaFinal;
    }

    public String getResultado() {
        return resultado;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Você converteu "+getQtd()+"("+getMoedaBase()+")"+
                " para "+getResultado()+"("+getMoedaFinal()+"),sendo que cada 1("+getMoedaBase()+
                ") equivale a "+getValorMoeda()+"("+getMoedaFinal()+")";
    }
}

//return "Moeda base: " + getMoedaBase() +
//        " - Moeda final: " + getMoedaFinal() +
//        " - Valor base: " + getValorMoeda() +
//        " - Valor Convertido: " + getResultado() +
//        " - Quantidade: " + getQtd();