/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meshbrain;

/**
 *
 * @author cazub
 */
public class Plan {
    public enum PlanState{
        UNCHECKED(0),
        NOT_VALIDATED(1),
        INVALID(2),
        VALID(3),
        CURRENT(4);
        private int value;
        private PlanState(int value){
            this.value = value;
        }
    }
    public long startTime;
    public long estimatedEndTime;
    public long estimatedTimeRemaining;
    public long timeElapsed;
    
    //off set each additional AV from planned wp
    public int offsetValue_Xft = 0;
    public int offsetValue_yft = 0;
    public int offsetValue_zft = 0;
    
}
