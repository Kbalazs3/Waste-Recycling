package com.codecool.wasterecycling;


public class Garbage {


        public Garbage(String name) {
                this.name = name;
        }


         public Garbage() {

        }

        public static void setCountsTOZero() {
                houseWaste = 0;
                plasticCount = 0;
                paperCount = 0;
        }


        public void setHouseWaste() {
                this.houseWaste += 1;
        }

        public void setPlasticCount() {
                this.plasticCount += 1;
        }


        public void setPaperCount() {
                this.paperCount += 1;
        }





        public static int getHouseWaste() {
                return houseWaste;
        }


        public static int getPaperCount() {
                return paperCount;
        }


        public static int getPlasticCount() {
                return plasticCount;
        }



//---------------------------------------------------------------------------------------------------
        //FIELDS


        public String getName() {
                return name;
        }

        private String name;
        private static int houseWaste = 0;
        private static int paperCount = 0;
        private static int plasticCount = 0;

}
