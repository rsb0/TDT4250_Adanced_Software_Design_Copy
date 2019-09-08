/**
 */
package studyprogramme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import studyprogramme.Course;
import studyprogramme.ElectiveCourseList;
import studyprogramme.ElectiveCourseSlot;
import studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elective Course List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.impl.ElectiveCourseListImpl#getAvailableCourses <em>Available Courses</em>}</li>
 *   <li>{@link studyprogramme.impl.ElectiveCourseListImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogramme.impl.ElectiveCourseListImpl#getElectiveCourseSlot <em>Elective Course Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveCourseListImpl extends MinimalEObjectImpl.Container implements ElectiveCourseList {
	/**
	 * The cached value of the '{@link #getAvailableCourses() <em>Available Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> availableCourses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCourseListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.ELECTIVE_COURSE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getAvailableCourses() {
		if (availableCourses == null) {
			availableCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyprogrammePackage.ELECTIVE_COURSE_LIST__AVAILABLE_COURSES);
		}
		return availableCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ELECTIVE_COURSE_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCourseSlot getElectiveCourseSlot() {
		if (eContainerFeatureID() != StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT) return null;
		return (ElectiveCourseSlot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectiveCourseSlot(ElectiveCourseSlot newElectiveCourseSlot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElectiveCourseSlot, StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectiveCourseSlot(ElectiveCourseSlot newElectiveCourseSlot) {
		if (newElectiveCourseSlot != eInternalContainer() || (eContainerFeatureID() != StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT && newElectiveCourseSlot != null)) {
			if (EcoreUtil.isAncestor(this, newElectiveCourseSlot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElectiveCourseSlot != null)
				msgs = ((InternalEObject)newElectiveCourseSlot).eInverseAdd(this, StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST, ElectiveCourseSlot.class, msgs);
			msgs = basicSetElectiveCourseSlot(newElectiveCourseSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT, newElectiveCourseSlot, newElectiveCourseSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElectiveCourseSlot((ElectiveCourseSlot)otherEnd, msgs);
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
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				return basicSetElectiveCourseSlot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				return eInternalContainer().eInverseRemove(this, StudyprogrammePackage.ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST, ElectiveCourseSlot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__AVAILABLE_COURSES:
				return getAvailableCourses();
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__NAME:
				return getName();
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				return getElectiveCourseSlot();
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
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__AVAILABLE_COURSES:
				getAvailableCourses().clear();
				getAvailableCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__NAME:
				setName((String)newValue);
				return;
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				setElectiveCourseSlot((ElectiveCourseSlot)newValue);
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
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__AVAILABLE_COURSES:
				getAvailableCourses().clear();
				return;
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				setElectiveCourseSlot((ElectiveCourseSlot)null);
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
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__AVAILABLE_COURSES:
				return availableCourses != null && !availableCourses.isEmpty();
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT:
				return getElectiveCourseSlot() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElectiveCourseListImpl
