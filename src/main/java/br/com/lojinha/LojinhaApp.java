package br.com.lojinha;

import br.com.lojinha.enums.Size;
import br.com.lojinha.pojo.IncludedItems;
import br.com.lojinha.pojo.InternationalProduct;
import br.com.lojinha.pojo.NationalProduct;
import br.com.lojinha.pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Product product = new Product("Sony", Size.MEDIO);

        product.setName("Play Station 5");
        product.setValue(30);
        product.setMark("Sony");

        List<IncludedItems> includedItems = new ArrayList<>();


        IncludedItems newIncludedItems = new IncludedItems("Controle", 2);
        includedItems.add(newIncludedItems);
        product.setIncludedItems(includedItems);

        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.getMark());
        System.out.println(product.getSize());

        for (IncludedItems currentItems : product.getIncludedItems() ){
            System.out.println(currentItems.getName());
            System.out.println(currentItems.getAmount());
        }

        NationalProduct nationalProduct = new NationalProduct("Sony", Size.MEDIO);
        nationalProduct.setNationalProduct(0.58);
        System.out.println(nationalProduct.getNationalProduct());
        System.out.println(nationalProduct.getFavoriteData());

        InternationalProduct internationalProduct = new InternationalProduct("Sony", Size.PEQUENO);
        internationalProduct.setImportingRate(0.89);
        internationalProduct.setValue(-99);
        System.out.println(internationalProduct.getImportingRate());
        System.out.println(internationalProduct.getFavoriteData());
    }
}
