/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pl.troken.ecliballs.model.ecliballs.core.BufferListener;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigures <em>Figures</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigureSort <em>Figure Sort</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigureBuffer <em>Figure Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getFigureList()
 * @model
 * @generated
 */
public interface FigureList extends EObject {
	
	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link pl.troken.ecliballs.model.ecliballs.Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getFigureList_Figures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Figure> getFigures();

	/**
	 * Returns the value of the '<em><b>Figure Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link pl.troken.ecliballs.model.ecliballs.FiguresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Sort</em>' attribute.
	 * @see pl.troken.ecliballs.model.ecliballs.FiguresType
	 * @see #setFigureSort(FiguresType)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getFigureList_FigureSort()
	 * @model
	 * @generated
	 */
	FiguresType getFigureSort();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigureSort <em>Figure Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Sort</em>' attribute.
	 * @see pl.troken.ecliballs.model.ecliballs.FiguresType
	 * @see #getFigureSort()
	 * @generated
	 */
	void setFigureSort(FiguresType value);

	/**
	 * Returns the value of the '<em><b>Figure Buffer</b></em>' reference list.
	 * The list contents are of type {@link pl.troken.ecliballs.model.ecliballs.Figure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Buffer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Buffer</em>' reference list.
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getFigureList_FigureBuffer()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Figure> getFigureBuffer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addFigure(Figure figureType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFigure(Figure figureType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initFigureBuffer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Figure getFigureFromBuffer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model figuresMany="false"
	 * @generated
	 */
	void addFigures(EList<Figure> figures);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	void setListener(BufferListener listener);
	
} // FigureList
