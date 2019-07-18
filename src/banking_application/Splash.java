/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_application;


public class Splash {
    public static void main(String[] args) throws InterruptedException {
        ProgressBar progressbar = new ProgressBar();
        
        for(int i=0;i<=100;i++){
            Thread.sleep(50);
            progressbar.setVisible(true);
            progressbar.Redirecting.setText("Loading..."+i+"%");
            progressbar.Load.setValue(i);
            
            if(i==100){
                //next page er object
                Banking_Software bs = new Banking_Software();
                bs.setVisible(true);
                
                //splash.dispose();
            }
        }
    }
}
