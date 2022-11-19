package br.com.lojinha.pojo;

public class Product {
    private String name;
    private String mark;
    private double value;
    private String size;
    private String included_items;

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
    public String getSize(){
        return this.size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getIncluded_items(){
        return this.included_items;
    }

    public void  setIncluded_items(String included_items){
        this.included_items = included_items;
    }

}
