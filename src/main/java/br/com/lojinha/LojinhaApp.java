package br.com.lojinha;

import br.com.lojinha.enums.Size;
import br.com.lojinha.pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Play Station 5");
        product.setValue(30);
        product.setMark("Sony");
        product.setSize(Size.PEQUENO);

        List<String> included_items = new ArrayList<String>();
        included_items.add("2 Controles");
        included_items.add("3 Jogos");
        product.setIncluded_Items(included_items);

        System.out.println(product.getIncluded_Items().get(1));
        System.out.println(product.getSize());

        System.out.println(product.getValue());
    }
}
