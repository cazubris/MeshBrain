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
public enum AgentState {
    STATE_INITIALIZING(0),
    STATE_WAITING_FOR_COMM1(1),
    STATE_COMM1_ESTABLISHED(2),
    STATE_COMM1_PLANNING(3),
    STATE_COMM1_EXECUTING(4),
    STATE_INITIALIZING_COMM2_LINK(5),
    STATE_COMM2_ESTABLISHED(6),
    STATE_COMM2_HANDSHAKE_INITIALIZED(7),
    STATE_COMM2_HANDSHAKE_COMPLETE(8),
    STATE_HANDOFF_TO_COMM2(9),
    STATE_COMM2_EXECUTE_IN_COMMAND(10),
    STATE_COMM2_EXECUTE_NOT_IN_COMMAND(11),
    STATE_PLAN_COMPLETE(12),
    STATE_HANDOFF_TO_COMM1(13),
    STATE_LOST_LINK(14);
    
    private int value;
    private AgentState(int value){
        this.value = value;
    }
}
