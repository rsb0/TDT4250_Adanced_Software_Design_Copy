/**
 */
package studyprogramme.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import studyprogramme.Course;
import studyprogramme.ElectiveCourseList;
import studyprogramme.ElectiveCourseSlot;
import studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elective Course Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.impl.ElectiveCourseSlotImpl#getElectiveCourseList <em>Elective Course List</em>}</li>
 *   <li>{@link studyprogramme.impl.ElectiveCourseSlotImpl#getAssignedCourse <em>Assigned Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveCourseSlotImpl extends CourseSlotImpl implements ElectiveCourseSlot {
	/**
	 * The cached value of the '{@link #getElectiveCourseList() <em>Elective Course List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourseList()
	 * @generated
	 * @ordered
	 */
	protected ElectiveCourseList electiveCourseList;

	/**
	 * The cached value of the '{@link #getAssignedCourse() <em>Assigned Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedCourse()
	 * @generated
	 * @ordered
	 */
	protected Course assignedCourse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCourseSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.ELECTIVE_COURSE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCourseList getElectiveCourseList() {
		return electiveCourseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectiveCourseList(ElectiveCourseList newElectiveCourseList, NotificationChain msgs) {
		ElectiveCourseList oldElectiveCourseList = electiveCourseList;
		electiveCourseList = newElectiveCourseList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST, oldElectiveCourseList, newElectiveCourseList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectiveCourseList(ElectiveCourseList newElectiveCourseList) {
		if (newElectiveCourseList != electiveCourseList) {
			NotificationChain msgs = null;
			if (electiveCourseList != null)
				msgs = ((InternalEObject)electiveCourseList).eInverseRemove(this, StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT, ElectiveCourseList.class, msgs);
			if (newElectiveCourseList != null)
				msgs = ((InternalEObject)newElectiveCourseList).eInverseAdd(this, StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT, ElectiveCourseList.class, msgs);
			msgs = basicSetElectiveCourseList(newElectiveCourseList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST, newElectiveCourseList, newElectiveCourseList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getAssignedCourse() {
		if (assignedCourse != null && assignedCourse.eIsProxy()) {
			InternalEObject oldAssignedCourse = (InternalEObject)assignedCourse;
			assignedCourse = (Course)eResolveProxy(oldAssignedCourse);
			if (assignedCourse != oldAssignedCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE, oldAssignedCourse, assignedCourse));
			}
		}
		return assignedCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetAssignedCourse() {
		return assignedCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedCourse(Course newAssignedCourse) {
		Course oldAssignedCourse = assignedCourse;
		assignedCourse = newAssignedCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE, oldAssignedCourse, assignedCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST:
				if (electiveCourseList != null)
					msgs = ((InternalEObject)electiveCourseList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST, null, msgs);
				return basicSetElectiveCourseList((ElectiveCourseList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST:
				return basicSetElectiveCourseList(null, msgs);
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
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST:
				return getElectiveCourseList();
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE:
				if (resolve) return getAssignedCourse();
				return basicGetAssignedCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST:
				setElectiveCourseList((ElectiveCourseList)newValue);
				return;
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE:
				setAssignedCourse((Course)newValue);
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
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST:
				setElectiveCourseList((ElectiveCourseList)null);
				return;
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE:
				setAssignedCourse((Course)null);
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
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST:
				return electiveCourseList != null;
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE:
				return assignedCourse != null;
		}
		return super.eIsSet(featureID);
	}

} //ElectiveCourseSlotImpl
