package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {

            Dustbin db = new Dustbin("Yellow");



            PaperGarbage paperG = new PaperGarbage("paper", true);

            PlasticGarbage plasticG = new PlasticGarbage("plastic", false);

            Garbage garbageG = new Garbage("sima");

            db.throwOutGarbage(paperG);
            db.throwOutGarbage(paperG);
            db.throwOutGarbage(garbageG);

            PlasticGarbage dirtyPlastic = new PlasticGarbage("dirty", true);

            db.throwOutGarbage(dirtyPlastic);

            PlasticGarbage n = new PlasticGarbage("Test", false);
            db.throwOutGarbage(n);

            PlasticGarbage n2 = new PlasticGarbage("n2", true);
            db.throwOutGarbage(n2);
            // db.displayContents();

            // db.emptyContent();

            db.displayContents();

    }
}
