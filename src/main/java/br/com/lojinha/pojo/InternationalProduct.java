package br.com.lojinha.pojo;

import br.com.lojinha.enums.Size;
import br.com.lojinha.interfaces.Favorite;

public class InternationalProduct extends Product implements Favorite {

    private double importingRate;

    public InternationalProduct(String initialMark, Size initialSize) {
        super(initialMark, initialSize);
    }

    public double getImportingRate(){
       return this.importingRate;
    }

    public void setImportingRate(double importingRate){
        this.importingRate = importingRate;
    }

    public void setValue(double value){
        if(value > -100){
            this.value = value;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    public String getFavoriteData() {
        return this.getName() + "," + this.getMark() + " e " + this.getValue();
    }
}
