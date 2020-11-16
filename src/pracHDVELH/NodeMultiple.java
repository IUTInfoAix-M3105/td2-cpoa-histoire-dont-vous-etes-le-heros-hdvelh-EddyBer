/**
 * File: NodeMultiple.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class NodeMultiple {
	public static final int ERROR_STATUS_INDEX_OUT_OF_RANGE = -1;
	public static final String ERROR_MSG_INDEX_OUT_OF_RANGE = "Index out of range";
	public static int NODE_MAX_ARITY = 10;
	private NodeMultiple[] daughters;
	private Object Ndata;
	/* Overridden methods */

	@Override
	public String toString() {
		return Ndata.toString();
	}

	/* Getters/Setters */

	/**
	 * Gets the {@code i}th daughter node.
	 * <p>
	 * Aborts if the given index {@code i} is out of range.
	 *
	 * @param i the index of the daughter node.
	 * @return the {@code i}th daughter node, or {@code null} if it does not exist.
	 */
	public NodeMultiple getDaughter(int i) {
		if (i >= NODE_MAX_ARITY || i<0){
			ErrorNaiveHandler.abort(ERROR_STATUS_INDEX_OUT_OF_RANGE,
					ERROR_MSG_INDEX_OUT_OF_RANGE + '@'+ getClass() + ".getDaughter()");
		}
		return daughters[i];
	}

	/**
	 * Sets the {@code i}th daughter node to the input parameter {@code daughter}.
	 * Should be used cautiously, since {@code i} may not be the first index
	 * available (i.e. there may be lower indexes which do not refer to any
	 * daughter).
	 * <p>
	 * If a daughter node is already referred to at this index then it is erased
	 * with {@code daughter}.
	 * <p>
	 * Aborts if the index {@code i} is out of range.
	 *
	 * @param daughter the node to be linked as a daughter of {@code this} node.
	 * @param i        the daughter node's index
	 */
	public void setDaughter(NodeMultiple daughter, int i) {
		this.daughters[i] = daughter;
	}

	/**
	 * @return all the daughters
	 */
	public NodeMultiple[] getDaughters() {
		return daughters;
	}

	/**
	 * @param daughters the daughters to set
	 */
	public void setDaughters(NodeMultiple[] daughters) {
		int i = 0;
		while (daughters[i] != null && i < NODE_MAX_ARITY) {
			daughters[i] = daughters[i];
		}

	}


	/**
	 * Adds the given {@code daughter} node at the first available index.
	 * <p>
	 * If the max number of daughters ({@link #NODE_MAX_ARITY}) is already reached
	 * nothing happens (no abort).
	 *
	 * @param daughter
	 */
	public void addDaughter(NodeMultiple daughter) {
		if (daughter == null) {
			return;
		}
		int index = 0;
		while (daughters[i] != null && i < NODE_MAX_ARITY) {
			index++;
		}
		if (i < NODE_MAX_ARITY) {
			daughters[i] = daughter;
		}
	}

	/**
	 * @return the content data
	 */
	public Object getData() {
		return Ndata;
	}

	/**
	 * @param data
	 */
	public void setData(Object data) {
		Ndata = data;
	}

	/**
	 * @return {@code true} if and only if this node has at least one non-null
	 * daughter node.
	 */
	public boolean hasDaughters() {
		if (getDaughters() != null) {
			return true;
		} else return false;
	}

	/* Constructors */

	/**
	 * Default constructor.
	 */
	public NodeMultiple() {
		this.Ndata = null;
		daughters = new NodeMultiple[NODE_MAX_ARITY];
	}

	/**
	 * Constructor. Sets the content data to {@code data} and creates an empty set
	 * of daughters.
	 *
	 * @param data
	 */
	public NodeMultiple(Object data) {
		this();
		this.Ndata = data;
	}
}

// eof