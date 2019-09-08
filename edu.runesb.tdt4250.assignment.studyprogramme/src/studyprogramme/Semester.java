/**
 */
package studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link studyprogramme.Semester#getSlots <em>Slots</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterMustHaveThirtyCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 semesterMustHaveThirtyCredits='self.slots.course.credits-&gt;sum() == 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see studyprogramme.StudyprogrammePackage#getSemester_SemesterNumber()
	 * @model id="true" required="true" transient="true"
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link studyprogramme.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogramme.CourseSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see studyprogramme.StudyprogrammePackage#getSemester_Slots()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseSlot> getSlots();

} // Semester
