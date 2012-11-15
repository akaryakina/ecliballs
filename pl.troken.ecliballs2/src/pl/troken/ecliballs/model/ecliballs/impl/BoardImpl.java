/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pl.troken.ecliballs.model.ecliballs.impl;

import java.util.Collection;
import java.util.Random;

import javax.security.auth.login.FailedLoginException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pl.troken.ecliballs.EcliBallsPlugin;
import pl.troken.ecliballs.model.ecliballs.Board;
import pl.troken.ecliballs.model.ecliballs.EcliballsFactory;
import pl.troken.ecliballs.model.ecliballs.EcliballsPackage;
import pl.troken.ecliballs.model.ecliballs.Field;
import pl.troken.ecliballs.model.ecliballs.Figure;
import pl.troken.ecliballs.model.ecliballs.FigureList;
import pl.troken.ecliballs.model.ecliballs.Score;
import pl.troken.ecliballs.model.ecliballs.Status;
import pl.troken.ecliballs.model.ecliballs.core.BufferListener;
import pl.troken.ecliballs.model.ecliballs.core.FieldListener;
import pl.troken.ecliballs.model.ecliballs.core.ScoreListener;
import pl.troken.ecliballs.ui.view.components.BoardComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getSelectedField <em>Selected Field</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getFigureList <em>Figure List</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getScore <em>Score</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getSize <em>Size</em>}</li>
 *   <li>{@link pl.troken.ecliballs.model.ecliballs.impl.BoardImpl#getEmptyFields <em>Empty Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoardImpl extends EObjectImpl implements Board {
	
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;
	
	protected FieldListener fieldListener=null;
	protected ScoreListener scoreListener=null;

	/**
	 * The cached value of the '{@link #getSelectedField() <em>Selected Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedField()
	 * @generated
	 * @ordered
	 */
	protected Field selectedField;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.READY;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFigureList() <em>Figure List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureList()
	 * @generated
	 * @ordered
	 */
	protected FigureList figureList;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Score score;


	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;


	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmptyFields() <em>Empty Fields</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> emptyFields;

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcliballsPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, EcliballsPackage.BOARD__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getSelectedField() {
		if (selectedField != null && selectedField.eIsProxy()) {
			InternalEObject oldSelectedField = (InternalEObject)selectedField;
			selectedField = (Field)eResolveProxy(oldSelectedField);
			if (selectedField != oldSelectedField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcliballsPackage.BOARD__SELECTED_FIELD, oldSelectedField, selectedField));
			}
		}
		return selectedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetSelectedField() {
		return selectedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedField(Field newSelectedField) {
		Field oldSelectedField = selectedField;
		selectedField = newSelectedField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__SELECTED_FIELD, oldSelectedField, selectedField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureList getFigureList() {
		return figureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigureList(FigureList newFigureList, NotificationChain msgs) {
		FigureList oldFigureList = figureList;
		figureList = newFigureList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__FIGURE_LIST, oldFigureList, newFigureList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureList(FigureList newFigureList) {
		if (newFigureList != figureList) {
			NotificationChain msgs = null;
			if (figureList != null)
				msgs = ((InternalEObject)figureList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcliballsPackage.BOARD__FIGURE_LIST, null, msgs);
			if (newFigureList != null)
				msgs = ((InternalEObject)newFigureList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcliballsPackage.BOARD__FIGURE_LIST, null, msgs);
			msgs = basicSetFigureList(newFigureList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__FIGURE_LIST, newFigureList, newFigureList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Score newScore, NotificationChain msgs) {
		Score oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(Score newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcliballsPackage.BOARD__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcliballsPackage.BOARD__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcliballsPackage.BOARD__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getEmptyFields() {
		if (emptyFields == null) {
			emptyFields = new EDataTypeUniqueEList<Integer>(Integer.class, this, EcliballsPackage.BOARD__EMPTY_FIELDS);
		}
		return emptyFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init(int boardSize) {
		EcliballsFactory factory = EcliballsFactory.eINSTANCE;
		createFileldsArray(boardSize*boardSize);
		createEmptyFields();
		setSize(boardSize);
		for(int i=0;i<boardSize;i++){
			for(int k=0;k<boardSize;k++){
				Field field = factory.createField();
				field.setX(k);
				field.setY(i);
				fields.add(field);
				emptyFields.add(fields.size()-1);
			}
		}
		score=factory.createScore();
	}

	protected void createFileldsArray(int numberOfFields) {
		fields=new BasicEList<Field>(numberOfFields);
	}

	private void createEmptyFields() {
		emptyFields=new BasicEList<Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void clear() {
		//TODO 
		//init(size);
	}
	 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setRandomFigureInField() {
		Field field = getRandomCleanField();
		Figure randomFigure = figureList.getFigureFromBuffer();
		field.setFigure(randomFigure);
		notifyFieldListeners(field);
	}
	
	private Field getRandomCleanField() {
		Random rand=new Random();
		int emptyMarkerPosition = rand.nextInt(emptyFields.size());
		int removedEmptyPosition = emptyFields.remove(emptyMarkerPosition);
		return fields.get(removedEmptyPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isFieldEmpty(Field field) {
		assert field!=null;
		return field.hasFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void moveFigureToField(Field field) {
		if(selectedField==null){
			throw new UnsupportedOperationException("Selected field is null");
		}
		else{
			Figure figure = selectedField.getFigure();
			field.setFigure(figure);
			selectedField.removeFigure();
			emptyFields.remove((Object)(field.getY()*size+field.getX()));
			emptyFields.add(selectedField.getY()*size+selectedField.getX());
			notifyFieldListeners(selectedField);
			notifyFieldListeners(field);
			selectedField=null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Position starts from 0 to *
	 * <!-- end-user-doc -->
	 */
	public Field getField(int position) {
		if(fields==null)
			throw new UnsupportedOperationException("Fields are null. Board non initialisated");
		return fields.get(position);
	}

	private int incrementalValues[][]=new int[][]{
			{1,0},{-1,0}, // pion
			{0,1},{0,-1}, // poziom
			{1,1},{-1,-1}, // malej¹co
			{-1,1},{1,-1}}; // rosn¹co
	
	/**
	 */
	public void calculateMatches(Field field) {
		Figure figure = field.getFigure();
		@SuppressWarnings("rawtypes")
		EList<Field> fieldsToRemove=null;
		int orgX = field.getX();
		int orgY = field.getY();
		
		for(int i=0;i<incrementalValues.length;i+=2){
			EList<Field> fields=new BasicEList<Field>();
			for(int k=0;k<2;k++)
			{
				int tempX=orgX;
				int tempY=orgY;
				while(true){
					int[] shift = incrementalValues[i+k];
					tempX=tempX+shift[0];
					tempY=tempY+shift[1];
					Field curField;
					
					try {
						curField = getField(tempY * size + tempX);
					} catch (Exception e) {
						break;
					}
					if(curField.hasFigure(figure))
					{
						fields.add(curField);
					}else {
						break;
					}
				}
			}
			if(fieldsToRemove==null || fieldsToRemove.size()<=fields.size()){
				fieldsToRemove=fields;
			}
		}
		if(fieldsToRemove.size()>=4){
			fieldsToRemove.add(field);
			removeFields(fieldsToRemove);
			calculatePoints(fieldsToRemove.size());
		}
	}

	private void calculatePoints(int size) {
		score.addPoints(size);
		notifyScoreListeners(score);
	}

	private void removeFields(EList<Field> fieldsToRemove) {
		for(Field field:fieldsToRemove){
			field.removeFigure();
			notifyFieldListeners(field);
			emptyFields.add(field.getY()*size+field.getX());
			
		}
	}
	
	@Override
	public void drawBoardFromModel(){
		for(Field field:fields)
		{
			notifyFieldListeners(field);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcliballsPackage.BOARD__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case EcliballsPackage.BOARD__FIGURE_LIST:
				return basicSetFigureList(null, msgs);
			case EcliballsPackage.BOARD__SCORE:
				return basicSetScore(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcliballsPackage.BOARD__FIELDS:
				return getFields();
			case EcliballsPackage.BOARD__SELECTED_FIELD:
				if (resolve) return getSelectedField();
				return basicGetSelectedField();
			case EcliballsPackage.BOARD__STATUS:
				return getStatus();
			case EcliballsPackage.BOARD__FIGURE_LIST:
				return getFigureList();
			case EcliballsPackage.BOARD__SCORE:
				return getScore();
			case EcliballsPackage.BOARD__SIZE:
				return getSize();
			case EcliballsPackage.BOARD__EMPTY_FIELDS:
				return getEmptyFields();
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
			case EcliballsPackage.BOARD__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case EcliballsPackage.BOARD__SELECTED_FIELD:
				setSelectedField((Field)newValue);
				return;
			case EcliballsPackage.BOARD__STATUS:
				setStatus((Status)newValue);
				return;
			case EcliballsPackage.BOARD__FIGURE_LIST:
				setFigureList((FigureList)newValue);
				return;
			case EcliballsPackage.BOARD__SCORE:
				setScore((Score)newValue);
				return;
			case EcliballsPackage.BOARD__SIZE:
				setSize((Integer)newValue);
				return;
			case EcliballsPackage.BOARD__EMPTY_FIELDS:
				getEmptyFields().clear();
				getEmptyFields().addAll((Collection<? extends Integer>)newValue);
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
			case EcliballsPackage.BOARD__FIELDS:
				getFields().clear();
				return;
			case EcliballsPackage.BOARD__SELECTED_FIELD:
				setSelectedField((Field)null);
				return;
			case EcliballsPackage.BOARD__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EcliballsPackage.BOARD__FIGURE_LIST:
				setFigureList((FigureList)null);
				return;
			case EcliballsPackage.BOARD__SCORE:
				setScore((Score)null);
				return;
			case EcliballsPackage.BOARD__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EcliballsPackage.BOARD__EMPTY_FIELDS:
				getEmptyFields().clear();
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
			case EcliballsPackage.BOARD__FIELDS:
				return fields != null && !fields.isEmpty();
			case EcliballsPackage.BOARD__SELECTED_FIELD:
				return selectedField != null;
			case EcliballsPackage.BOARD__STATUS:
				return status != STATUS_EDEFAULT;
			case EcliballsPackage.BOARD__FIGURE_LIST:
				return figureList != null;
			case EcliballsPackage.BOARD__SCORE:
				return score != null;
			case EcliballsPackage.BOARD__SIZE:
				return size != SIZE_EDEFAULT;
			case EcliballsPackage.BOARD__EMPTY_FIELDS:
				return emptyFields != null && !emptyFields.isEmpty();
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
		result.append(" (status: ");
		result.append(status);
		result.append(", size: ");
		result.append(size);
		result.append(", emptyFields: ");
		result.append(emptyFields);
		result.append(')');
		return result.toString();
	}

	@Override
	public void addFieldChangeListener(FieldListener composite) {
		if(fieldListener==null)
			fieldListener=composite;
	}
	
	public void notifyFieldListeners(Field field){
		if(fieldListener!=null)
			fieldListener.handleEvent(field);
	}
	
	@Override
	public void addScoreChangeListener(ScoreListener composite) {
		if(scoreListener==null)
			scoreListener=composite;
	}
	
	@Override
	public void notifyScoreListeners(Score score){
		if(scoreListener!=null)
			scoreListener.handleEvent(score);
	}
	
	@Override
	public void addBufferListener(BufferListener listener) {
		figureList.setListener(listener);
	}
	
} //BoardImpl
