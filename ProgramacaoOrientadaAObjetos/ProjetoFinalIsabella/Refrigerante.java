package vendingIsabella;

import java.util.Date;

public class Refrigerante extends Produto{

    public Refrigerante(String nome, Double preco, String referencia, Date validade, String tipo, String marca) {
        super(nome, preco, referencia, validade);
        this.tipo = tipo;
        this.marca = marca;
    }

    private String tipo;
    private String marca;

    //Métodos:
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }
}