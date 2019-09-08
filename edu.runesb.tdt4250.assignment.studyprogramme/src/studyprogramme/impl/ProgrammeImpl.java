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
import org.eclipse.emf.ecore.util.InternalEList;
import studyprogramme.Programme;
import studyprogramme.ProgrammeCode;
import studyprogramme.ProgrammeType;
import studyprogramme.Specialization;
import studyprogramme.StudyprogrammePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogramme.impl.ProgrammeImpl#getProgrammeCode <em>Programme Code</em>}</li>
 *   <li>{@link studyprogramme.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyprogramme.impl.ProgrammeImpl#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link studyprogramme.impl.ProgrammeImpl#getProgrammeType <em>Programme Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends SemesterContainerImpl implements Programme {
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
	 * The default value of the '{@link #getProgrammeCode() <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCode()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammeCode PROGRAMME_CODE_EDEFAULT = ProgrammeCode.MTDT;

	/**
	 * The cached value of the '{@link #getProgrammeCode() <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeCode()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeCode programmeCode = PROGRAMME_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The default value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected int numberOfYears = NUMBER_OF_YEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgrammeType() <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeType()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammeType PROGRAMME_TYPE_EDEFAULT = ProgrammeType.BACHELORS;

	/**
	 * The cached value of the '{@link #getProgrammeType() <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeType()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeType programmeType = PROGRAMME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogrammePackage.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeCode getProgrammeCode() {
		return programmeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeCode(ProgrammeCode newProgrammeCode) {
		ProgrammeCode oldProgrammeCode = programmeCode;
		programmeCode = newProgrammeCode == null ? PROGRAMME_CODE_EDEFAULT : newProgrammeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__PROGRAMME_CODE, oldProgrammeCode, programmeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS, StudyprogrammePackage.SPECIALIZATION__PROGRAMME);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfYears(int newNumberOfYears) {
		int oldNumberOfYears = numberOfYears;
		numberOfYears = newNumberOfYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__NUMBER_OF_YEARS, oldNumberOfYears, numberOfYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeType getProgrammeType() {
		return programmeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeType(ProgrammeType newProgrammeType) {
		ProgrammeType oldProgrammeType = programmeType;
		programmeType = newProgrammeType == null ? PROGRAMME_TYPE_EDEFAULT : newProgrammeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogrammePackage.PROGRAMME__PROGRAMME_TYPE, oldProgrammeType, programmeType));
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
			case StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
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
			case StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				return getName();
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_CODE:
				return getProgrammeCode();
			case StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case StudyprogrammePackage.PROGRAMME__NUMBER_OF_YEARS:
				return getNumberOfYears();
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_TYPE:
				return getProgrammeType();
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_CODE:
				setProgrammeCode((ProgrammeCode)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__NUMBER_OF_YEARS:
				setNumberOfYears((Integer)newValue);
				return;
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_TYPE:
				setProgrammeType((ProgrammeType)newValue);
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_CODE:
				setProgrammeCode(PROGRAMME_CODE_EDEFAULT);
				return;
			case StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case StudyprogrammePackage.PROGRAMME__NUMBER_OF_YEARS:
				setNumberOfYears(NUMBER_OF_YEARS_EDEFAULT);
				return;
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_TYPE:
				setProgrammeType(PROGRAMME_TYPE_EDEFAULT);
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
			case StudyprogrammePackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_CODE:
				return programmeCode != PROGRAMME_CODE_EDEFAULT;
			case StudyprogrammePackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case StudyprogrammePackage.PROGRAMME__NUMBER_OF_YEARS:
				return numberOfYears != NUMBER_OF_YEARS_EDEFAULT;
			case StudyprogrammePackage.PROGRAMME__PROGRAMME_TYPE:
				return programmeType != PROGRAMME_TYPE_EDEFAULT;
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
		result.append(", programmeCode: ");
		result.append(programmeCode);
		result.append(", numberOfYears: ");
		result.append(numberOfYears);
		result.append(", programmeType: ");
		result.append(programmeType);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
