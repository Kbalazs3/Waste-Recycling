package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {


        public Dustbin(String colorName) {
                this.colorName = colorName;
        }


        public String getColor() {
                return this.colorName;
        }


        public void throwOutGarbage(Garbage newGarbage) {
                if(newGarbage instanceof PlasticGarbage) {
                        if(!((PlasticGarbage) newGarbage).isClean()) {
                                ((PlasticGarbage) newGarbage).clean();
                        }
                        garbagesInDustbin.add(newGarbage);
                        newGarbage.setPlasticCount();
                }

                else if(newGarbage instanceof PaperGarbage) {
                        if(!(((PaperGarbage) newGarbage).isSqueezed())) {
                                ((PaperGarbage) newGarbage).squeeze();
                        }
                        garbagesInDustbin.add(newGarbage);
                        newGarbage.setPaperCount();
                }
                else{
                        garbagesInDustbin.add(newGarbage);
                        newGarbage.setHouseWaste();
                }
        }


        public void emptyContent() {
                // Garbage g = new Garbage();
                 this.garbagesInDustbin.clear();
                Garbage.setCountsTOZero();
                 new Garbage();
        }




        public String toString() {
                String houseWasteCount = "House waste content: " + Garbage.getHouseWaste();
                String plasticContent = "Plastic content: " + Garbage.getPlasticCount() + " item(s)";
                String paper = "Paper content: " + Garbage.getPaperCount() + " item(s) ";

                for(Garbage g : garbagesInDustbin) {
                        if(g instanceof PlasticGarbage) {
                                plasticContent += (" " + g.getName()) + "\n";
                        }
                        else if(g instanceof PaperGarbage) {
                                houseWasteCount += (" " + g.getName()) + "\n";
                        }
                        else{
                                paper += (" " + g.getName()) + "\n";
                        }
                }
                return this.colorName + "!" + houseWasteCount + plasticContent + paper;
        }




        public void displayContents() {
                System.out.println(this);
        }


//------------------------------------------------------------------------------------------------
        // FIELDS

        private ArrayList<Garbage> garbagesInDustbin = new ArrayList<>();

        private String colorName;






}
