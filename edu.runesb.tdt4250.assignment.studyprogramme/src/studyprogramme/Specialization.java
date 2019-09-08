/**
 */
package studyprogramme;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link studyprogramme.Specialization#getSelectionSemester <em>Selection Semester</em>}</li>
 *   <li>{@link studyprogramme.Specialization#getProgramme <em>Programme</em>}</li>
 *   <li>{@link studyprogramme.Specialization#getSubSpecialisations <em>Sub Specialisations</em>}</li>
 *   <li>{@link studyprogramme.Specialization#getParrentSpecialisation <em>Parrent Specialisation</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends SemesterContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogramme.StudyprogrammePackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogramme.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Selection Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Semester</em>' attribute.
	 * @see #setSelectionSemester(int)
	 * @see studyprogramme.StudyprogrammePackage#getSpecialization_SelectionSemester()
	 * @model upper="-2"
	 * @generated
	 */
	int getSelectionSemester();

	/**
	 * Sets the value of the '{@link studyprogramme.Specialization#getSelectionSemester <em>Selection Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Semester</em>' attribute.
	 * @see #getSelectionSemester()
	 * @generated
	 */
	void setSelectionSemester(int value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogramme.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see studyprogramme.StudyprogrammePackage#getSpecialization_Programme()
	 * @see studyprogramme.Programme#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link studyprogramme.Specialization#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Sub Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogramme.Specialization}.
	 * It is bidirectional and its opposite is '{@link studyprogramme.Specialization#getParrentSpecialisation <em>Parrent Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Specialisations</em>' containment reference list.
	 * @see studyprogramme.StudyprogrammePackage#getSpecialization_SubSpecialisations()
	 * @see studyprogramme.Specialization#getParrentSpecialisation
	 * @model opposite="parrentSpecialisation" containment="true"
	 * @generated
	 */
	EList<Specialization> getSubSpecialisations();

	/**
	 * Returns the value of the '<em><b>Parrent Specialisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogramme.Specialization#getSubSpecialisations <em>Sub Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parrent Specialisation</em>' container reference.
	 * @see #setParrentSpecialisation(Specialization)
	 * @see studyprogramme.StudyprogrammePackage#getSpecialization_ParrentSpecialisation()
	 * @see studyprogramme.Specialization#getSubSpecialisations
	 * @model opposite="subSpecialisations" transient="false"
	 * @generated
	 */
	Specialization getParrentSpecialisation();

	/**
	 * Sets the value of the '{@link studyprogramme.Specialization#getParrentSpecialisation <em>Parrent Specialisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parrent Specialisation</em>' container reference.
	 * @see #getParrentSpecialisation()
	 * @generated
	 */
	void setParrentSpecialisation(Specialization value);

} // Specialization
