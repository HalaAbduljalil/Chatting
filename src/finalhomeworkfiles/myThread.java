/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalhomeworkfiles;

/**
 *
 * @author dell
 */
public class myThread extends Thread {
    @Override
    public void run()
    {
        ChattingPeerToPeer c = new ChattingPeerToPeer();
        c.setVisible(true);
    }
    
}

