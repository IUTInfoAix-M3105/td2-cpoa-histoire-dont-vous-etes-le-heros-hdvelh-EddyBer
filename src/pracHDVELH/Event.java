/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event<unsigned> extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
	private int id;
	/**
	 * Event identifier
	 **/
	private GUIManager gui;
	/**
	 * Graphical User Interface
	 **/
	private String playerAnswer;
	/**
	 * Text Version of player's answer
	 **/
	private int chosenPath;
	/**
	 * Daughter's index chosen for the next event
	 **/
	private Scanner reader;
	/**
	 * input reader
	 **/
	static private int lastId = -1;

	/* CONSTRUCTORS*/
	public Event() {
		this(new GUIManager(), "");
	}

	public Event(GUIManager gui, String data) {
		super(data);
		this.gui = gui;
		id = ++lastId;
		chosenPath = -1;
		reader = gui.getInputReader();
	}

	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		/* TO BE COMPLETED */
	}

	/* Methods */

	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param data
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 */
	public void setData(String data) {
		/* TO BE COMPLETED */
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * @param daughter
	 * @param i
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 */
	public void setDaughter(Event daughter, int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		/* TO BE COMPLETED */
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the id
	 */
	public int getId() {
		/* TO BE COMPLETED */
	}

	/* Methods */
	/* TO BE COMPLETED */
	public Event run() {
		gui.outputln(toString());
		gui.output(PROMPT_ANSWER);
		playerAnswer = reader.next();
		chosenPath = interpretAnswer();
		return getDaughter(chosenPath);
	}
}

// eof