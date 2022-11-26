/**
 */
package SequenceDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SequenceDiagram.Message#getMess <em>Mess</em>}</li>
 *   <li>{@link SequenceDiagram.Message#getInput <em>Input</em>}</li>
 *   <li>{@link SequenceDiagram.Message#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see SequenceDiagram.SequenceDiagramPackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Mess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mess</em>' attribute.
	 * @see #setMess(String)
	 * @see SequenceDiagram.SequenceDiagramPackage#getMessage_Mess()
	 * @model
	 * @generated
	 */
	String getMess();

	/**
	 * Sets the value of the '{@link SequenceDiagram.Message#getMess <em>Mess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mess</em>' attribute.
	 * @see #getMess()
	 * @generated
	 */
	void setMess(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(SequenceDiagram.Object)
	 * @see SequenceDiagram.SequenceDiagramPackage#getMessage_Input()
	 * @model required="true"
	 * @generated
	 */
	SequenceDiagram.Object getInput();

	/**
	 * Sets the value of the '{@link SequenceDiagram.Message#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(SequenceDiagram.Object value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(SequenceDiagram.Object)
	 * @see SequenceDiagram.SequenceDiagramPackage#getMessage_Output()
	 * @model required="true"
	 * @generated
	 */
	SequenceDiagram.Object getOutput();

	/**
	 * Sets the value of the '{@link SequenceDiagram.Message#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(SequenceDiagram.Object value);

} // Message
