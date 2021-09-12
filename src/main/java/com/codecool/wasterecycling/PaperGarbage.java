package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {

        public PaperGarbage(String name, boolean flag) {
                super(name);
                 isSqueezed = flag;
        }


        public boolean isSqueezed() {
                return isSqueezed;
        }


        public void squeeze() {
               this.isSqueezed = true;
        }


//----------------------------------------------------------------------------------------------------
        // FIELDS

        private boolean isSqueezed;


}

