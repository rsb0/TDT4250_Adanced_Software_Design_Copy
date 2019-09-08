/**
 */
package studyprogramme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.Programme#getName <em>Name</em>}</li>
 *   <li>{@link studyprogramme.Programme#getProgrammeCode <em>Programme Code</em>}</li>
 *   <li>{@link studyprogramme.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyprogramme.Programme#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link studyprogramme.Programme#getProgrammeType <em>Programme Type</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='integratedMastersMustHaveTenSemesters mastersMustHaveFourSemesters bachelorsMustHaveSixSemesters masterLevelValidCourseCombination'"
 * @generated
 */
public interface Programme extends SemesterContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogramme.StudyprogrammePackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogramme.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme Code</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprogramme.ProgrammeCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Code</em>' attribute.
	 * @see studyprogramme.ProgrammeCode
	 * @see #setProgrammeCode(ProgrammeCode)
	 * @see studyprogramme.StudyprogrammePackage#getProgramme_ProgrammeCode()
	 * @model required="true"
	 * @generated
	 */
	ProgrammeCode getProgrammeCode();

	/**
	 * Sets the value of the '{@link studyprogramme.Programme#getProgrammeCode <em>Programme Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Code</em>' attribute.
	 * @see studyprogramme.ProgrammeCode
	 * @see #getProgrammeCode()
	 * @generated
	 */
	void setProgrammeCode(ProgrammeCode value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogramme.Specialization}.
	 * It is bidirectional and its opposite is '{@link studyprogramme.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see studyprogramme.StudyprogrammePackage#getProgramme_Specializations()
	 * @see studyprogramme.Specialization#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Years</em>' attribute.
	 * @see #setNumberOfYears(int)
	 * @see studyprogramme.StudyprogrammePackage#getProgramme_NumberOfYears()
	 * @model
	 * @generated
	 */
	int getNumberOfYears();

	/**
	 * Sets the value of the '{@link studyprogramme.Programme#getNumberOfYears <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Years</em>' attribute.
	 * @see #getNumberOfYears()
	 * @generated
	 */
	void setNumberOfYears(int value);

	/**
	 * Returns the value of the '<em><b>Programme Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprogramme.ProgrammeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Type</em>' attribute.
	 * @see studyprogramme.ProgrammeType
	 * @see #setProgrammeType(ProgrammeType)
	 * @see studyprogramme.StudyprogrammePackage#getProgramme_ProgrammeType()
	 * @model required="true"
	 * @generated
	 */
	ProgrammeType getProgrammeType();

	/**
	 * Sets the value of the '{@link studyprogramme.Programme#getProgrammeType <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Type</em>' attribute.
	 * @see studyprogramme.ProgrammeType
	 * @see #getProgrammeType()
	 * @generated
	 */
	void setProgrammeType(ProgrammeType value);

} // Programme
