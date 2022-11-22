package br.com.lojinha.pojo;

import br.com.lojinha.enums.Size;

import java.util.List;

public class Product{
    private String name;
    private String mark;
    private double value;
    private Size size;

    private List<IncludedItems> includedItems;

    public Product(String initialMark, Size initialSize){
        // Defining commands that will be started during instantiation
        this.mark = initialMark;
        this.size = initialSize;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getMark(){
        return this.mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }
    public double getValue(){
        return this.value;
    }

    public void setValue(double value){
        if(value!=0){
            this.value = value;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }
    public Size getSize(){
        return this.size;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public List<IncludedItems> getIncludedItems() {
        return includedItems;
    }

    public void setIncludedItems(List<IncludedItems> includedItems) {
        this.includedItems = includedItems;
    }




}
