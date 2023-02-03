package com.techreturners.cats;

public class DomesticCat implements Cat {

    private boolean isAsleep;

    public boolean isAsleep() {
       return isAsleep;
   }
   public boolean goToSleep(){
       isAsleep=true;
       return isAsleep;
   }

   public boolean wakeUp(){
       isAsleep=false;
       return isAsleep;
   }

   public String getSetting(){
      return "domestic";
   }

}

