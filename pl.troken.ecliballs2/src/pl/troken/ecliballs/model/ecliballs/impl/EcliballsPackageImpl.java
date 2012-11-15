/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.EcliballsFactory;
import pl.troken.ecliballs.model.ecliballs.EcliballsPackage;
import pl.troken.ecliballs.model.ecliballs.Field;
import pl.troken.ecliballs.model.ecliballs.Figure;
import pl.troken.ecliballs.model.ecliballs.FigureList;
import pl.troken.ecliballs.model.ecliballs.FiguresType;
import pl.troken.ecliballs.model.ecliballs.PointsValues;
import pl.troken.ecliballs.model.ecliballs.Score;
import pl.troken.ecliballs.model.ecliballs.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcliballsPackageImpl extends EPackageImpl implements EcliballsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pointsValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum figuresTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pl.troken.ecliballs.model.ecliballs.EcliballsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcliballsPackageImpl() {
		super(eNS_URI, EcliballsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcliballsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcliballsPackage init() {
		if (isInited) return (EcliballsPackage)EPackage.Registry.INSTANCE.getEPackage(EcliballsPackage.eNS_URI);

		// Obtain or create and register package
		EcliballsPackageImpl theEcliballsPackage = (EcliballsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcliballsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcliballsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEcliballsPackage.createPackageContents();

		// Initialize created meta-data
		theEcliballsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcliballsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcliballsPackage.eNS_URI, theEcliballsPackage);
		return theEcliballsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Fields() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_SelectedField() {
		return (EReference)boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_Status() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_FigureList() {
		return (EReference)boardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Score() {
		return (EReference)boardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_Size() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_EmptyFields() {
		return (EAttribute)boardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigure() {
		return figureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigure_Type() {
		return (EAttribute)figureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScore() {
		return scoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScore_Points() {
		return (EAttribute)scoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Figure() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_X() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Y() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureList() {
		return figureListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigureList_Figures() {
		return (EReference)figureListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureList_FigureSort() {
		return (EAttribute)figureListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigureList_FigureBuffer() {
		return (EReference)figureListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPointsValues() {
		return pointsValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFiguresType() {
		return figuresTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcliballsFactory getEcliballsFactory() {
		return (EcliballsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__FIELDS);
		createEReference(boardEClass, BOARD__SELECTED_FIELD);
		createEAttribute(boardEClass, BOARD__STATUS);
		createEReference(boardEClass, BOARD__FIGURE_LIST);
		createEReference(boardEClass, BOARD__SCORE);
		createEAttribute(boardEClass, BOARD__SIZE);
		createEAttribute(boardEClass, BOARD__EMPTY_FIELDS);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__FIGURE);
		createEAttribute(fieldEClass, FIELD__X);
		createEAttribute(fieldEClass, FIELD__Y);

		figureListEClass = createEClass(FIGURE_LIST);
		createEReference(figureListEClass, FIGURE_LIST__FIGURES);
		createEAttribute(figureListEClass, FIGURE_LIST__FIGURE_SORT);
		createEReference(figureListEClass, FIGURE_LIST__FIGURE_BUFFER);

		figureEClass = createEClass(FIGURE);
		createEAttribute(figureEClass, FIGURE__TYPE);

		scoreEClass = createEClass(SCORE);
		createEAttribute(scoreEClass, SCORE__POINTS);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		pointsValuesEEnum = createEEnum(POINTS_VALUES);
		figuresTypeEEnum = createEEnum(FIGURES_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Fields(), this.getField(), null, "fields", null, 10, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_SelectedField(), this.getField(), null, "selectedField", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_Status(), this.getStatus(), "status", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_FigureList(), this.getFigureList(), null, "figureList", null, 1, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Score(), this.getScore(), null, "score", null, 1, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_EmptyFields(), ecorePackage.getEInt(), "emptyFields", null, 0, -1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(boardEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "boardSize", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(boardEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(boardEClass, null, "setRandomFigureInField", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, ecorePackage.getEBoolean(), "isFieldEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getField(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, null, "moveFigureToField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getField(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, this.getField(), "getField", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, this.getField(), "getNeighbors", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getField(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(boardEClass, null, "calculateMatches", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getField(), "field", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Figure(), this.getFigure(), null, "figure", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_X(), ecorePackage.getEInt(), "x", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fieldEClass, ecorePackage.getEBoolean(), "hasFigure", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(fieldEClass, ecorePackage.getEBoolean(), "hasFigure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFigure(), "figure", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fieldEClass, null, "removeFigure", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(figureListEClass, FigureList.class, "FigureList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFigureList_Figures(), this.getFigure(), null, "figures", null, 1, -1, FigureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigureList_FigureSort(), this.getFiguresType(), "figureSort", null, 0, 1, FigureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigureList_FigureBuffer(), this.getFigure(), null, "figureBuffer", null, 3, 3, FigureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(figureListEClass, null, "addFigure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFigure(), "figureType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(figureListEClass, null, "removeFigure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFigure(), "figureType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(figureListEClass, null, "initFigureBuffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(figureListEClass, this.getFigure(), "getFigureFromBuffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(figureListEClass, null, "addFigures", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getFigure());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "figures", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(figureEClass, Figure.class, "Figure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigure_Type(), ecorePackage.getEString(), "type", "", 0, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(figureEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scoreEClass, Score.class, "Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScore_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(scoreEClass, null, "addPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointsValues(), "pointValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(scoreEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.READY);
		addEEnumLiteral(statusEEnum, Status.SELECTED);

		initEEnum(pointsValuesEEnum, PointsValues.class, "PointsValues");
		addEEnumLiteral(pointsValuesEEnum, PointsValues.FOUR);
		addEEnumLiteral(pointsValuesEEnum, PointsValues.FIVE);
		addEEnumLiteral(pointsValuesEEnum, PointsValues.SIX);
		addEEnumLiteral(pointsValuesEEnum, PointsValues.MAX);

		initEEnum(figuresTypeEEnum, FiguresType.class, "FiguresType");
		addEEnumLiteral(figuresTypeEEnum, FiguresType.BALL);
		addEEnumLiteral(figuresTypeEEnum, FiguresType.SQUARE);

		// Create resource
		createResource(eNS_URI);
	}

} //EcliballsPackageImpl
