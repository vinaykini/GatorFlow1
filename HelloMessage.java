/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gatorflow1;

/**
 *
 * @author vinay
 */
public class HelloMessage {
    private int xid;
    private byte version;
    private byte type;
    private short length;
    
    public HelloMessage(){
        xid = 1;
        version = 0x01;
        type = 0;
        length = 8;
    }
    
    public int getXid(){
        return xid;
    }
    
    public byte version(){
        return version;
    }
    
    public byte type(){
        return type;
    }
    
    public short length(){
        return length;
    }
    
    
}
