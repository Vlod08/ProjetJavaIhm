package application;

import application.elements.Element;

import java.util.ArrayList;
import java.util.Random;

public class Plateforme {
    int dim;
    double ratioMurVide;
    private ArrayList<ArrayList<Element>> Cases;

    public Plateforme(){
        this.dim = 25;
        this.ratioMurVide = 0.25;
        generateNewPlateforme();
    }

    public void generateNewPlateforme(){
        int nVide = dim*dim;
        int nMure = 0;
        int xTemp, yTemp;
        Cases = new ArrayList<ArrayList<Element>>();
        Random random = new Random();


        while(nMure/nVide < ratioMurVide){

            xTemp = random.nextInt(dim);
            yTemp = random.nextInt(dim);

            if(Cases.get(xTemp).get(yTemp).getType()=='V'){
                Cases.get(xTemp).get(yTemp).setType('M');
                nMure++;
                nVide--;
            }
        }

    }



}
