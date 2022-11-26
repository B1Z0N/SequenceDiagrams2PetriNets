/**
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PetriNet.PN#getNode <em>Node</em>}</li>
 *   <li>{@link PetriNet.PN#getLinkage <em>Linkage</em>}</li>
 * </ul>
 *
 * @see PetriNet.PetriNetPackage#getPN()
 * @model
 * @generated
 */
public interface PN extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPN_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Linkage</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Linkage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkage</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPN_Linkage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Linkage> getLinkage();

} // PN
