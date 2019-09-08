/**
 */
package studyprogramme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.ElectiveSlot#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getElectiveSlot()
 * @model
 * @generated
 */
public interface ElectiveSlot extends CourseSlot {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference.
	 * @see #setCourses(Course)
	 * @see studyprogramme.StudyprogrammePackage#getElectiveSlot_Courses()
	 * @model required="true"
	 * @generated
	 */
	Course getCourses();

	/**
	 * Sets the value of the '{@link studyprogramme.ElectiveSlot#getCourses <em>Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses</em>' reference.
	 * @see #getCourses()
	 * @generated
	 */
	void setCourses(Course value);

} // ElectiveSlot
