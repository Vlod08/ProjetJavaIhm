package application.elements;

import java.util.Random;
public class Element{
    int x;
    int y;

    /***image a implementer*/
    char type;


    public Element(int x,int y,char type){
        setX(x);
        setY(y);
        setType(type);
    }

    public Element(){

        Random random = new Random();
        this.x = random.nextInt();
        this.y = random.nextInt();
        this.type = 'V';
    }

    /**Setters */
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x,int y){
        this.x= x;
        this.y = y;
    }
    public void setType(char type){
        if(type == 'V' || type == 'M' || type == 'P' || type == 'G' || type == 'F'){
            this.type = type;
        }
        else{
            System.out.println("Unknow type error !!!");
        }
    }

    /**Getters*/
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public char getType(){
        return type;
    }
}

