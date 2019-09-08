/**
 */
package studyprogramme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Course List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogramme.ElectiveCourseList#getAvailableCourses <em>Available Courses</em>}</li>
 *   <li>{@link studyprogramme.ElectiveCourseList#getName <em>Name</em>}</li>
 *   <li>{@link studyprogramme.ElectiveCourseList#getElectiveCourseSlot <em>Elective Course Slot</em>}</li>
 * </ul>
 *
 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseList()
 * @model
 * @generated
 */
public interface ElectiveCourseList extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Courses</b></em>' reference list.
	 * The list contents are of type {@link studyprogramme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Courses</em>' reference list.
	 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseList_AvailableCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getAvailableCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogramme.ElectiveCourseList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elective Course Slot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogramme.ElectiveCourseSlot#getElectiveCourseList <em>Elective Course List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Course Slot</em>' container reference.
	 * @see #setElectiveCourseSlot(ElectiveCourseSlot)
	 * @see studyprogramme.StudyprogrammePackage#getElectiveCourseList_ElectiveCourseSlot()
	 * @see studyprogramme.ElectiveCourseSlot#getElectiveCourseList
	 * @model opposite="electiveCourseList" transient="false"
	 * @generated
	 */
	ElectiveCourseSlot getElectiveCourseSlot();

	/**
	 * Sets the value of the '{@link studyprogramme.ElectiveCourseList#getElectiveCourseSlot <em>Elective Course Slot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective Course Slot</em>' container reference.
	 * @see #getElectiveCourseSlot()
	 * @generated
	 */
	void setElectiveCourseSlot(ElectiveCourseSlot value);

} // ElectiveCourseList
