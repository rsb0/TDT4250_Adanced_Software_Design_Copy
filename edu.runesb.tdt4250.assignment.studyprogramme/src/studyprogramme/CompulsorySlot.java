/**
 */
package studyprogramme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compulsory Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.CompulsorySlot#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getCompulsorySlot()
 * @model
 * @generated
 */
public interface CompulsorySlot extends CourseSlot {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see studyprogramme.StudyprogrammePackage#getCompulsorySlot_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyprogramme.CompulsorySlot#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CompulsorySlot
