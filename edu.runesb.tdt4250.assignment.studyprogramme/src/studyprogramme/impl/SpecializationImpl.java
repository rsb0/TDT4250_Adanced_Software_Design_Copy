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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import studyprogramme.Programme;
import studyprogramme.Specialization;
import studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogramme.impl.SpecializationImpl#getSelectionSemester <em>Selection Semester</em>}</li>
 *   <li>{@link studyprogramme.impl.SpecializationImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link studyprogramme.impl.SpecializationImpl#getSubSpecialisations <em>Sub Specialisations</em>}</li>
 *   <li>{@link studyprogramme.impl.SpecializationImpl#getParrentSpecialisation <em>Parrent Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends SemesterContainerImpl implements Specialization {
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
	 * The default value of the '{@link #getSelectionSemester() <em>Selection Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionSemester()
	 * @generated
	 * @ordered
	 */
	protected static final int SELECTION_SEMESTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSelectionSemester() <em>Selection Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionSemester()
	 * @generated
	 * @ordered
	 */
	protected int selectionSemester = SELECTION_SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSpecialisations() <em>Sub Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> subSpecialisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSelectionSemester() {
		return selectionSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectionSemester(int newSelectionSemester) {
		int oldSelectionSemester = selectionSemester;
		selectionSemester = newSelectionSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.SPECIALIZATION__SELECTION_SEMESTER, oldSelectionSemester, selectionSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != StudyprogrammePackage.SPECIALIZATION__PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, StudyprogrammePackage.SPECIALIZATION__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != StudyprogrammePackage.SPECIALIZATION__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.SPECIALIZATION__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSubSpecialisations() {
		if (subSpecialisations == null) {
			subSpecialisations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS, StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION);
		}
		return subSpecialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getParrentSpecialisation() {
		if (eContainerFeatureID() != StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION) return null;
		return (Specialization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParrentSpecialisation(Specialization newParrentSpecialisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParrentSpecialisation, StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParrentSpecialisation(Specialization newParrentSpecialisation) {
		if (newParrentSpecialisation != eInternalContainer() || (eContainerFeatureID() != StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION && newParrentSpecialisation != null)) {
			if (EcoreUtil.isAncestor(this, newParrentSpecialisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParrentSpecialisation != null)
				msgs = ((InternalEObject)newParrentSpecialisation).eInverseAdd(this, StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS, Specialization.class, msgs);
			msgs = basicSetParrentSpecialisation(newParrentSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION, newParrentSpecialisation, newParrentSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programme)otherEnd, msgs);
			case StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubSpecialisations()).basicAdd(otherEnd, msgs);
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParrentSpecialisation((Specialization)otherEnd, msgs);
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
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS:
				return ((InternalEList<?>)getSubSpecialisations()).basicRemove(otherEnd, msgs);
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				return basicSetParrentSpecialisation(null, msgs);
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
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				return eInternalContainer().eInverseRemove(this, StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS, Specialization.class, msgs);
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
			case StudyprogrammePackage.SPECIALIZATION__NAME:
				return getName();
			case StudyprogrammePackage.SPECIALIZATION__SELECTION_SEMESTER:
				return getSelectionSemester();
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				return getProgramme();
			case StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS:
				return getSubSpecialisations();
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				return getParrentSpecialisation();
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
			case StudyprogrammePackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case StudyprogrammePackage.SPECIALIZATION__SELECTION_SEMESTER:
				setSelectionSemester((Integer)newValue);
				return;
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				setProgramme((Programme)newValue);
				return;
			case StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS:
				getSubSpecialisations().clear();
				getSubSpecialisations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				setParrentSpecialisation((Specialization)newValue);
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
			case StudyprogrammePackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogrammePackage.SPECIALIZATION__SELECTION_SEMESTER:
				setSelectionSemester(SELECTION_SEMESTER_EDEFAULT);
				return;
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				setProgramme((Programme)null);
				return;
			case StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS:
				getSubSpecialisations().clear();
				return;
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				setParrentSpecialisation((Specialization)null);
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
			case StudyprogrammePackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogrammePackage.SPECIALIZATION__SELECTION_SEMESTER:
				return selectionSemester != SELECTION_SEMESTER_EDEFAULT;
			case StudyprogrammePackage.SPECIALIZATION__PROGRAMME:
				return getProgramme() != null;
			case StudyprogrammePackage.SPECIALIZATION__SUB_SPECIALISATIONS:
				return subSpecialisations != null && !subSpecialisations.isEmpty();
			case StudyprogrammePackage.SPECIALIZATION__PARRENT_SPECIALISATION:
				return getParrentSpecialisation() != null;
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
		result.append(", selectionSemester: ");
		result.append(selectionSemester);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
