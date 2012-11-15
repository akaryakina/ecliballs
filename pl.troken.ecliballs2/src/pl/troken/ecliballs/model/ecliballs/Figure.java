/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.Figure#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getFigure()
 * @model
 * @generated
 */
public interface Figure extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getFigure_Type()
	 * @model default="" id="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pl.troken.ecliballs.model.ecliballs.Figure#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean equals(Object object);

	Figure clone();

} // Figure
