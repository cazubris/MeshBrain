/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meshbrain.Comm1;

/**
 *
 * @author cazub
 */
public class Comm1Link {
    public enum Comm1State{
        NO_COMM1_LINK(0),
        RC_LINK(1),
        GROUND_LINK(2),
        COMM1_DISABLED(3),
        COMM2_IN_CONTROL(4);
        private int value;
        private Comm1State(int value){
            this.value = value;
        }
    }
    
    
    
}
