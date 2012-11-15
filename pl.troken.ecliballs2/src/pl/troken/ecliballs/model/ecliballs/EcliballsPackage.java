/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pl.troken.ecliballs.model.ecliballs.EcliballsFactory
 * @model kind="package"
 * @generated
 */
public interface EcliballsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecliballs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecliballs/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecliballs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcliballsPackage eINSTANCE = pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.impl.BoardImpl
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Selected Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SELECTED_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Figure List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__FIGURE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SCORE = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SIZE = 5;

	/**
	 * The feature id for the '<em><b>Empty Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__EMPTY_FIELDS = 6;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.impl.FigureImpl
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 3;

	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.impl.FieldImpl
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIGURE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__Y = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl <em>Figure List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getFigureList()
	 * @generated
	 */
	int FIGURE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_LIST__FIGURES = 0;

	/**
	 * The feature id for the '<em><b>Figure Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_LIST__FIGURE_SORT = 1;

	/**
	 * The feature id for the '<em><b>Figure Buffer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_LIST__FIGURE_BUFFER = 2;

	/**
	 * The number of structural features of the '<em>Figure List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_LIST_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.impl.ScoreImpl
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 4;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__POINTS = 0;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.Status
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 5;


	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.PointsValues <em>Points Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.PointsValues
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getPointsValues()
	 * @generated
	 */
	int POINTS_VALUES = 6;


	/**
	 * The meta object id for the '{@link pl.troken.ecliballs.model.ecliballs.FiguresType <em>Figures Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pl.troken.ecliballs.model.ecliballs.FiguresType
	 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getFiguresType()
	 * @generated
	 */
	int FIGURES_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link pl.troken.ecliballs.model.ecliballs.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.troken.ecliballs.model.ecliballs.Board#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getFields()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Fields();

	/**
	 * Returns the meta object for the reference '{@link pl.troken.ecliballs.model.ecliballs.Board#getSelectedField <em>Selected Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Field</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getSelectedField()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_SelectedField();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.Board#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getStatus()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Status();

	/**
	 * Returns the meta object for the containment reference '{@link pl.troken.ecliballs.model.ecliballs.Board#getFigureList <em>Figure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Figure List</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getFigureList()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_FigureList();

	/**
	 * Returns the meta object for the containment reference '{@link pl.troken.ecliballs.model.ecliballs.Board#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getScore()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Score();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.Board#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getSize()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Size();

	/**
	 * Returns the meta object for the attribute list '{@link pl.troken.ecliballs.model.ecliballs.Board#getEmptyFields <em>Empty Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Empty Fields</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Board#getEmptyFields()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_EmptyFields();

	/**
	 * Returns the meta object for class '{@link pl.troken.ecliballs.model.ecliballs.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.Figure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Figure#getType()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Type();

	/**
	 * Returns the meta object for class '{@link pl.troken.ecliballs.model.ecliballs.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.Score#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Score#getPoints()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Points();

	/**
	 * Returns the meta object for class '{@link pl.troken.ecliballs.model.ecliballs.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link pl.troken.ecliballs.model.ecliballs.Field#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figure</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Field#getFigure()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Figure();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.Field#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Field#getX()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_X();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.Field#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Field#getY()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Y();

	/**
	 * Returns the meta object for class '{@link pl.troken.ecliballs.model.ecliballs.FigureList <em>Figure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure List</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.FigureList
	 * @generated
	 */
	EClass getFigureList();

	/**
	 * Returns the meta object for the containment reference list '{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.FigureList#getFigures()
	 * @see #getFigureList()
	 * @generated
	 */
	EReference getFigureList_Figures();

	/**
	 * Returns the meta object for the attribute '{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigureSort <em>Figure Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Figure Sort</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.FigureList#getFigureSort()
	 * @see #getFigureList()
	 * @generated
	 */
	EAttribute getFigureList_FigureSort();

	/**
	 * Returns the meta object for the reference list '{@link pl.troken.ecliballs.model.ecliballs.FigureList#getFigureBuffer <em>Figure Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Figure Buffer</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.FigureList#getFigureBuffer()
	 * @see #getFigureList()
	 * @generated
	 */
	EReference getFigureList_FigureBuffer();

	/**
	 * Returns the meta object for enum '{@link pl.troken.ecliballs.model.ecliballs.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link pl.troken.ecliballs.model.ecliballs.PointsValues <em>Points Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Points Values</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.PointsValues
	 * @generated
	 */
	EEnum getPointsValues();

	/**
	 * Returns the meta object for enum '{@link pl.troken.ecliballs.model.ecliballs.FiguresType <em>Figures Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Figures Type</em>'.
	 * @see pl.troken.ecliballs.model.ecliballs.FiguresType
	 * @generated
	 */
	EEnum getFiguresType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcliballsFactory getEcliballsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.impl.BoardImpl
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__FIELDS = eINSTANCE.getBoard_Fields();

		/**
		 * The meta object literal for the '<em><b>Selected Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SELECTED_FIELD = eINSTANCE.getBoard_SelectedField();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__STATUS = eINSTANCE.getBoard_Status();

		/**
		 * The meta object literal for the '<em><b>Figure List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__FIGURE_LIST = eINSTANCE.getBoard_FigureList();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SCORE = eINSTANCE.getBoard_Score();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__SIZE = eINSTANCE.getBoard_Size();

		/**
		 * The meta object literal for the '<em><b>Empty Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__EMPTY_FIELDS = eINSTANCE.getBoard_EmptyFields();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.impl.FigureImpl
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__TYPE = eINSTANCE.getFigure_Type();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.impl.ScoreImpl
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__POINTS = eINSTANCE.getScore_Points();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.impl.FieldImpl
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FIGURE = eINSTANCE.getField_Figure();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__X = eINSTANCE.getField_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__Y = eINSTANCE.getField_Y();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl <em>Figure List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getFigureList()
		 * @generated
		 */
		EClass FIGURE_LIST = eINSTANCE.getFigureList();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE_LIST__FIGURES = eINSTANCE.getFigureList_Figures();

		/**
		 * The meta object literal for the '<em><b>Figure Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_LIST__FIGURE_SORT = eINSTANCE.getFigureList_FigureSort();

		/**
		 * The meta object literal for the '<em><b>Figure Buffer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE_LIST__FIGURE_BUFFER = eINSTANCE.getFigureList_FigureBuffer();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.Status
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.PointsValues <em>Points Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.PointsValues
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getPointsValues()
		 * @generated
		 */
		EEnum POINTS_VALUES = eINSTANCE.getPointsValues();

		/**
		 * The meta object literal for the '{@link pl.troken.ecliballs.model.ecliballs.FiguresType <em>Figures Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pl.troken.ecliballs.model.ecliballs.FiguresType
		 * @see pl.troken.ecliballs.model.ecliballs.impl.EcliballsPackageImpl#getFiguresType()
		 * @generated
		 */
		EEnum FIGURES_TYPE = eINSTANCE.getFiguresType();

	}

} //EcliballsPackage
