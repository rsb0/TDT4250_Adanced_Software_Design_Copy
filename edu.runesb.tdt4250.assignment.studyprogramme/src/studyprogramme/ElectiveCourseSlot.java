/**
 */
package studyprogramme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.ElectiveCourseSlot#getElectiveCourseList <em>Elective Course List</em>}</li>
 *   <li>{@link studyprogramme.ElectiveCourseSlot#getAssignedCourse <em>Assigned Course</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assignedCourseIsValid'"
 * @generated
 */
public interface ElectiveCourseSlot extends CourseSlot {
	/**
	 * Returns the value of the '<em><b>Elective Course List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link studyprogramme.ElectiveCourseList#getElectiveCourseSlot <em>Elective Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Course List</em>' containment reference.
	 * @see #setElectiveCourseList(ElectiveCourseList)
	 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseSlot_ElectiveCourseList()
	 * @see studyprogramme.ElectiveCourseList#getElectiveCourseSlot
	 * @model opposite="electiveCourseSlot" containment="true"
	 * @generated
	 */
	ElectiveCourseList getElectiveCourseList();

	/**
	 * Sets the value of the '{@link studyprogramme.ElectiveCourseSlot#getElectiveCourseList <em>Elective Course List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective Course List</em>' containment reference.
	 * @see #getElectiveCourseList()
	 * @generated
	 */
	void setElectiveCourseList(ElectiveCourseList value);

	/**
	 * Returns the value of the '<em><b>Assigned Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Course</em>' reference.
	 * @see #setAssignedCourse(Course)
	 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseSlot_AssignedCourse()
	 * @model required="true"
	 * @generated
	 */
	Course getAssignedCourse();

	/**
	 * Sets the value of the '{@link studyprogramme.ElectiveCourseSlot#getAssignedCourse <em>Assigned Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Course</em>' reference.
	 * @see #getAssignedCourse()
	 * @generated
	 */
	void setAssignedCourse(Course value);

} // ElectiveCourseSlot
