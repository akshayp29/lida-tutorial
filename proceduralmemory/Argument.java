/*******************************************************************************
 * Copyright (c) The University of Memphis.  All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the LIDA Software Framework Non-Commercial License v1.0 
 * which accompanies this distribution, and is available at
 * http://ccrg.cs.memphis.edu/assets/papers/2010/LIDA-framework-non-commercial-v1.0.pdf
 *******************************************************************************/
package edu.memphis.ccrg.lida.proceduralmemory;
import edu.memphis.ccrg.lida.framework.shared.RootableNode;

/**
 * Argument is used to denote a "slot" for real Node. It implements the Node interface, so
 * it can be used as part of a NodeStructure. 
 * It is mostly used for define Context and results for Schemes and SBC.
 * The Argument can be bound to a real Node.
 *  Then, the Argument works as a wrapper for the real Node and can be used 
 * directly in any operation like comparisons.
 * If the real Node is not yet binded, the Argument ignores invocations to methods like ?? 
 * 
 * @author Akshay Padmanabha
 */
public interface Argument extends RootableNode {
	
	/**
	 * Gets argument id 
	 * @return unique id of argument
	 */
	public long getArgumentId();
	
	/**
	 * Binds specified {@link RootableNode}
	 * @param n Node to be bound to this argument
	 */
	public void bindNode(RootableNode n);
	
	/**
	 * Gets bound node
	 * @return {@link RootableNode} currently bound to this argument
	 */
	public RootableNode getBoundNode();
	
	/**
	 * Returns whether argument has a bound {@link RootableNode}
	 * @return true if argument has a bound {@link RootableNode}
	 */
	public boolean hasBoundNode();
}
