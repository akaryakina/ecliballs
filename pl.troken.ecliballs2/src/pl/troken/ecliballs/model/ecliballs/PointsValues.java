/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Points Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#getPointsValues()
 * @model
 * @generated
 */
public enum PointsValues implements Enumerator {
	/**
	 * The '<em><b>Four</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUR_VALUE
	 * @generated
	 * @ordered
	 */
	FOUR(40, "four", "four"),

	/**
	 * The '<em><b>Five</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE(65, "five", "five"),

	/**
	 * The '<em><b>Six</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIX_VALUE
	 * @generated
	 * @ordered
	 */
	SIX(80, "six", "six"),

	/**
	 * The '<em><b>Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(100, "max", "max");

	/**
	 * The '<em><b>Four</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Four</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOUR
	 * @model name="four"
	 * @generated
	 * @ordered
	 */
	public static final int FOUR_VALUE = 40;

	/**
	 * The '<em><b>Five</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Five</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIVE
	 * @model name="five"
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_VALUE = 65;

	/**
	 * The '<em><b>Six</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Six</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIX
	 * @model name="six"
	 * @generated
	 * @ordered
	 */
	public static final int SIX_VALUE = 80;

	/**
	 * The '<em><b>Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model name="max"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 100;

	/**
	 * An array of all the '<em><b>Points Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PointsValues[] VALUES_ARRAY =
		new PointsValues[] {
			FOUR,
			FIVE,
			SIX,
			MAX,
		};

	/**
	 * A public read-only list of all the '<em><b>Points Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PointsValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Points Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PointsValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PointsValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Points Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PointsValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PointsValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Points Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PointsValues get(int value) {
		switch (value) {
			case FOUR_VALUE: return FOUR;
			case FIVE_VALUE: return FIVE;
			case SIX_VALUE: return SIX;
			case MAX_VALUE: return MAX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PointsValues(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PointsValues
