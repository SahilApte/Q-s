/*
An alien spaceship runs out of fuel and wants to refuel at planet earth. 
It sends its fuel requirement to Earth in form of encrypted number. At Earth, 
the message has to be decrypted by finding the number of 1’s that occur in the 
binary format of the number. The total number of 1’s is the number of barrels 
of fuel requirement by the spaceship. Alex, a scientist at earth has to decode 
the message and inform the fuel requirement to his manager. Help Alex in 
decoding the message.

case=1
input=7
output=3
*/
import java.util.*;

class d2p1{
    public static void main(String args[]){
        
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    //int mask = 1;
    int count = 0;
    /*
    for(int i = 0;i<32;i++){
        if((num & mask)!=0){
            count++;
        }
        mask = mask<<1;
    }*/
    while(num>0){
        num = num&(num-1);
        count++;
    }
    /*
    int res = 0, count=0;
    while(i>0){
        res = i&1;
        /*
        if(res==1){
            count = count+1;
        }
        i = i>>1;
    }
    */
    
    System.out.println(count);
    }
}
