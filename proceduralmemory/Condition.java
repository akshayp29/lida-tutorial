package edu.memphis.ccrg.lida.proceduralmemory;

import edu.memphis.ccrg.lida.actionselection.Behavior;
import edu.memphis.ccrg.lida.framework.shared.activation.Activatible;


/**
 * A requirement for a {@link Behavior} to be selected. 
 * Implementors should correctly override {@link Object#equals(Object)} and {@link Object#hashCode()}
 * since Conditions are used as keys in Maps. 
 * @author Akshay Padmanabha
 */
public interface Condition extends Activatible {
	
   /** 
    * Gets id. 
    * The return object must be unique and it must be able to use as a map key i.e.
    * {@link Object#equals(Object)} and {@link Object#hashCode()} must be overwritten for this id. 
    * 
    * @return Condition's unique id
	*/
	public Object getConditionId();
	
//	/**
//	 * Sets weight. 
//	 * @param w condition's weight. How important the condition is for this {@link Behavior}
//	 */
//	public void setWeight(double w);
//	
//	/**
//	 * Gets weight
//	 * @return this condition's weight. How important the condition is for this {@link Behavior}
//	 */
//	public double getWeight();
}
