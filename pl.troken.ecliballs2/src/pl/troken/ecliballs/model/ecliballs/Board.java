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
import pl.troken.ecliballs.model.ecliballs.core.FieldListener;
import pl.troken.ecliballs.model.ecliballs.core.ScoreListener;
import pl.troken.ecliballs.ui.view.components.BoardComposite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getFields <em>Fields</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getSelectedField <em>Selected Field</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getStatus <em>Status</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getFigureList <em>Figure List</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getScore <em>Score</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getSize <em>Size</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Board#getEmptyFields <em>Empty Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	
	public static int DEFAULT_BOARD_SIZE=9;
	
	
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link pl.troken.ecliballs.model.ecliballs.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_Fields()
	 * @model containment="true" lower="10"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Selected Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Field</em>' reference.
	 * @see #setSelectedField(Field)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_SelectedField()
	 * @model
	 * @generated
	 */
	Field getSelectedField();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.Board#getSelectedField <em>Selected Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Field</em>' reference.
	 * @see #getSelectedField()
	 * @generated
	 */
	void setSelectedField(Field value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link pl.troken.ecliballs.model.ecliballs.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see pl.troken.ecliballs.model.ecliballs.Status
	 * @see #setStatus(Status)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.Board#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see pl.troken.ecliballs.model.ecliballs.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Figure List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure List</em>' containment reference.
	 * @see #setFigureList(FigureList)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_FigureList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FigureList getFigureList();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.Board#getFigureList <em>Figure List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure List</em>' containment reference.
	 * @see #getFigureList()
	 * @generated
	 */
	void setFigureList(FigureList value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Score)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_Score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.Board#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.Board#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Empty Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Fields</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Fields</em>' attribute list.
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getBoard_EmptyFields()
	 * @model
	 * @generated
	 */
	EList<Integer> getEmptyFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(int boardSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRandomFigureInField();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isFieldEmpty(Field field);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveFigureToField(Field field);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Field getField(int position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateMatches(Field field);

	public void addFieldChangeListener(FieldListener composite);

	void notifyFieldListeners(Field field);

	void addScoreChangeListener(ScoreListener composite);

	void addBufferListener(BufferListener listener);

	void notifyScoreListeners(Score field);

	void drawBoardFromModel();
} // Board
