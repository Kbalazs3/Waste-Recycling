package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {


        public PlasticGarbage(String name, boolean flag) {
                super(name);
                this.isClean = flag;
        }


        public boolean isClean() {
                return isClean;
        }


        public void clean() {
                this.isClean = true;
        }


//-----------------------------------------------------------------------------------------------
        //FIELDS

        private boolean isClean;

}
