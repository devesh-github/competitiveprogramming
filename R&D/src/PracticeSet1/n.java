package PracticeSet1;

interface Syrupable {
      void getSugary();
    }
    abstract class Pancake implements Syrupable { }
   
    class BlueBerryPancake extends Pancake {
      public void getSugary() { ; }
    }
    class SourdoughBlueBerryPancake extends BlueBerryPancake {
     void getSugary(int s) { ; }
    }

