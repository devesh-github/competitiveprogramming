package PracticeSet1;

public class Stealth {
   public static void main(String[] args) {
         Integer i = 420;
         Integer i2;
         Integer i3;
         int i22 = i.intValue();
         int i33 = i.valueOf(420);
         System.out.println("i22 :"+i22);
         System.out.println("i33 :"+i33);
         i2 = i.intValue();
         i3 = i.valueOf(420);
         System.out.println("i2 :"+i2);
         System.out.println("i3 :"+i3);
        System.out.println((i == i2) + " " + (i == i3)+ " " + (i2 == i3));
        System.out.println(i.equals(i2) + " " + i.equals(i3)+ " " + i2.equals(i3));
        i2=i3;
        System.out.println("i2==i3 :"+(i2==i3));
        System.out.println("i2.equals(i3) :"+i2.equals(i3));
} }

