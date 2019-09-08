/**
 */
package studyprogramme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.Elective#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getElective()
 * @model
 * @generated
 */
public interface Elective extends courseSlot {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyprogramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyprogramme.StudyprogrammePackage#getElective_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // Elective
