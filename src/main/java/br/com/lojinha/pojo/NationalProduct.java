package br.com.lojinha.pojo;

import br.com.lojinha.enums.Size;
import br.com.lojinha.interfaces.Favorite;

public class NationalProduct extends Product implements Favorite {

    private double nationalTax;

    public NationalProduct(String initialMark, Size initialSize) {
        super(initialMark, initialSize);
    }

    public double getNationalProduct(){
        return this.nationalTax;
    }

    public void setNationalProduct(double nationalTax){
        this.nationalTax = nationalTax;
    }


    public String getFavoriteData() {
        return this.getName() + "," + this.getMark() + " e " + this.getValue();
    }
}
