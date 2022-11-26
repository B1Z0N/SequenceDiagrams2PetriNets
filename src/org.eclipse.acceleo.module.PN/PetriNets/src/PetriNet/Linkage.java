/**
 */
package PetriNet;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.Linkage#getInput <em>Input</em>}</li>
 *   <li>{@link PetriNet.Linkage#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getLinkage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Flow'"
 * @generated
 */
public interface Linkage extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Node)
	 * @see PetriNet.PetriNetPackage#getLinkage_Input()
	 * @model required="true"
	 * @generated
	 */
	Node getInput();

	/**
	 * Sets the value of the '{@link PetriNet.Linkage#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Node value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Node)
	 * @see PetriNet.PetriNetPackage#getLinkage_Output()
	 * @model required="true"
	 * @generated
	 */
	Node getOutput();

	/**
	 * Sets the value of the '{@link PetriNet.Linkage#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Node value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not input.oclIsTypeOf(output.oclType())'"
	 * @generated
	 */
	boolean Flow(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Linkage
