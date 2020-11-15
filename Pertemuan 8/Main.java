Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@fikrianargya 
rizky-ibnu-awaldy
/
PBO
1
00
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
PBO/Pertemuan8/src/com/pboreg/Main.java /
@rizky-ibnu-awaldy
rizky-ibnu-awaldy Add files via upload
Latest commit bcc6dfe 3 days ago
 History
 1 contributor
37 lines (34 sloc)  955 Bytes
  
package com.pboreg;
//class Abstract
abstract class Hewan{
    //Abstract Method (tidak memiliki bodi)
    public abstract void suaraHewan();

    //Regular Method
    public void tidur() {
        System.out.println("Zzz....");
    }
}
//Sublass (turunan dari Class Hewan)
class Ayam extends Hewan {
    public void suaraHewan(){
        // Body dari abstract method suaraHewan() ditulis disini
        System.out.println("Kukuruyuk");
    }
}
class Kucing extends Hewan {
    public void suaraHewan(){
        // Body dari abstract method suaraHewan() ditulis disini
        System.out.println("Meong");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ayam ayamku = new Ayam();//membuat objek ayam
        Kucing kucingku = new Kucing();
        ayamku.suaraHewan();
        ayamku.tidur();
        kucingku.suaraHewan();
        kucingku.tidur();

    }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
