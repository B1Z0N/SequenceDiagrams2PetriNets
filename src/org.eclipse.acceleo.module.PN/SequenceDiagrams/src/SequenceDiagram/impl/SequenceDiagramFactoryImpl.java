/**
 */
package SequenceDiagram.impl;

import SequenceDiagram.Call;
import SequenceDiagram.CallAck;
import SequenceDiagram.Return;
import SequenceDiagram.SD;
import SequenceDiagram.SequenceDiagramFactory;
import SequenceDiagram.SequenceDiagramPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceDiagramFactoryImpl extends EFactoryImpl implements SequenceDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SequenceDiagramFactory init() {
		try {
			SequenceDiagramFactory theSequenceDiagramFactory = (SequenceDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(SequenceDiagramPackage.eNS_URI);
			if (theSequenceDiagramFactory != null) {
				return theSequenceDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SequenceDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SequenceDiagramPackage.SD: return createSD();
			case SequenceDiagramPackage.CALL: return createCall();
			case SequenceDiagramPackage.CALL_ACK: return createCallAck();
			case SequenceDiagramPackage.RETURN: return createReturn();
			case SequenceDiagramPackage.OBJECT: return createObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SD createSD() {
		SDImpl sd = new SDImpl();
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAck createCallAck() {
		CallAckImpl callAck = new CallAckImpl();
		return callAck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagram.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramPackage getSequenceDiagramPackage() {
		return (SequenceDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SequenceDiagramPackage getPackage() {
		return SequenceDiagramPackage.eINSTANCE;
	}

} //SequenceDiagramFactoryImpl
