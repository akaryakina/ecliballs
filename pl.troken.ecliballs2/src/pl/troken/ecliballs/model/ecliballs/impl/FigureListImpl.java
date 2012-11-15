/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs.impl;

import java.util.Collection;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import pl.troken.ecliballs.model.ecliballs.EcliballsPackage;
import pl.troken.ecliballs.model.ecliballs.Figure;
import pl.troken.ecliballs.model.ecliballs.FigureList;
import pl.troken.ecliballs.model.ecliballs.FiguresType;
import pl.troken.ecliballs.model.ecliballs.core.BufferListener;
import pl.troken.ecliballs.model.ecliballs.core.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl#getFigureSort <em>Figure Sort</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.FigureListImpl#getFigureBuffer <em>Figure Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FigureListImpl extends EObjectImpl implements FigureList {
	
	private BufferListener listener;
	
	/**
	 * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> figures;

	/**
	 * The default value of the '{@link #getFigureSort() <em>Figure Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureSort()
	 * @generated
	 * @ordered
	 */
	protected static final FiguresType FIGURE_SORT_EDEFAULT = FiguresType.BALL;

	/**
	 * The cached value of the '{@link #getFigureSort() <em>Figure Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureSort()
	 * @generated
	 * @ordered
	 */
	protected FiguresType figureSort = FIGURE_SORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFigureBuffer() <em>Figure Buffer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> figureBuffer;

	private static Random rand = new Random();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected FigureListImpl() {
		super();
		initFigures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcliballsPackage.Literals.FIGURE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getFigures() {
		if (figures == null) {
			figures = new EObjectContainmentEList<Figure>(Figure.class, this, EcliballsPackage.FIGURE_LIST__FIGURES);
		}
		return figures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiguresType getFigureSort() {
		return figureSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureSort(FiguresType newFigureSort) {
		FiguresType oldFigureSort = figureSort;
		figureSort = newFigureSort == null ? FIGURE_SORT_EDEFAULT : newFigureSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcliballsPackage.FIGURE_LIST__FIGURE_SORT, oldFigureSort, figureSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getFigureBuffer() {
		if (figureBuffer == null) {
			figureBuffer = new EObjectResolvingEList<Figure>(Figure.class, this, EcliballsPackage.FIGURE_LIST__FIGURE_BUFFER);
		}
		return figureBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addFigure(Figure figureType) {
		figures.add(figureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeFigure(Figure figureType) {
		figures.remove(figureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initFigureBuffer() {
		figureBuffer=new BasicEList<Figure>(Model.SIZE_OF_NEW_FIGURES);
		for(int i=0;i<Model.SIZE_OF_NEW_FIGURES;i++){
			int figureIndex = rand.nextInt(figures.size());
			Figure figure = figures.get(figureIndex);
			figureBuffer.add(figure);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Figure getFigureFromBuffer() {
		Figure figure = figures.get(rand.nextInt(figures.size()));
		figureBuffer.add(figure);
		notifyBufferListerer(figure);
		return figureBuffer.remove(0);
	}

	private void notifyBufferListerer(Figure figure) {
		if(listener!=null)
			listener.handleEvent(figure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addFigureType(Figure figureType) {
		assert figureType !=null;
		figures.add(figureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeFigureType(Figure figureType) {
		assert figureType !=null;
		figures.remove(figureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		initFigures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addFigures(EList figures) {
		this.figures.addAll(figures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcliballsPackage.FIGURE_LIST__FIGURES:
				return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	private void initFigures() {
		figures=new BasicEList<Figure>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcliballsPackage.FIGURE_LIST__FIGURES:
				return getFigures();
			case EcliballsPackage.FIGURE_LIST__FIGURE_SORT:
				return getFigureSort();
			case EcliballsPackage.FIGURE_LIST__FIGURE_BUFFER:
				return getFigureBuffer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcliballsPackage.FIGURE_LIST__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends Figure>)newValue);
				return;
			case EcliballsPackage.FIGURE_LIST__FIGURE_SORT:
				setFigureSort((FiguresType)newValue);
				return;
			case EcliballsPackage.FIGURE_LIST__FIGURE_BUFFER:
				getFigureBuffer().clear();
				getFigureBuffer().addAll((Collection<? extends Figure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcliballsPackage.FIGURE_LIST__FIGURES:
				getFigures().clear();
				return;
			case EcliballsPackage.FIGURE_LIST__FIGURE_SORT:
				setFigureSort(FIGURE_SORT_EDEFAULT);
				return;
			case EcliballsPackage.FIGURE_LIST__FIGURE_BUFFER:
				getFigureBuffer().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcliballsPackage.FIGURE_LIST__FIGURES:
				return figures != null && !figures.isEmpty();
			case EcliballsPackage.FIGURE_LIST__FIGURE_SORT:
				return figureSort != FIGURE_SORT_EDEFAULT;
			case EcliballsPackage.FIGURE_LIST__FIGURE_BUFFER:
				return figureBuffer != null && !figureBuffer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (figureSort: ");
		result.append(figureSort);
		result.append(')');
		return result.toString();
	}
	@Override
	public void setListener(BufferListener listener) {
		if(this.listener==null)
			this.listener = listener;
	}
	
} //FigureListImpl
