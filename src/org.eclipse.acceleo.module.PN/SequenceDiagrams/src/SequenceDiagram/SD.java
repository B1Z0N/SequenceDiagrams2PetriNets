/**
 */
package SequenceDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SequenceDiagram.SD#getMessages <em>Messages</em>}</li>
 *   <li>{@link SequenceDiagram.SD#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see SequenceDiagram.SequenceDiagramPackage#getSD()
 * @model
 * @generated
 */
public interface SD extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link SequenceDiagram.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see SequenceDiagram.SequenceDiagramPackage#getSD_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link SequenceDiagram.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see SequenceDiagram.SequenceDiagramPackage#getSD_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceDiagram.Object> getObjects();

} // SD
