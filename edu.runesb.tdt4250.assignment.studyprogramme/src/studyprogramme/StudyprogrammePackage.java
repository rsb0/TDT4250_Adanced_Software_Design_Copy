/**
 */
package studyprogramme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see studyprogramme.StudyprogrammeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyprogrammePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyprogramme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://edu/runesb/tdt4250/assignment/studyprogramme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.runesb.tdt4250.assignment.studyprogramme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyprogrammePackage eINSTANCE = studyprogramme.impl.StudyprogrammePackageImpl.init();

	/**
	 * The meta object id for the '{@link studyprogramme.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.CourseImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Displayed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DISPLAYED_NAME = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.SemesterContainerImpl <em>Semester Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.SemesterContainerImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getSemesterContainer()
	 * @generated
	 */
	int SEMESTER_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_CONTAINER__SEMESTERS = 0;

	/**
	 * The number of structural features of the '<em>Semester Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semester Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.ProgrammeImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTERS = SEMESTER_CONTAINER__SEMESTERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = SEMESTER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programme Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_CODE = SEMESTER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALIZATIONS = SEMESTER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NUMBER_OF_YEARS = SEMESTER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Programme Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_TYPE = SEMESTER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = SEMESTER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = SEMESTER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.SpecializationImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTERS = SEMESTER_CONTAINER__SEMESTERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = SEMESTER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SELECTION_SEMESTER = SEMESTER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAMME = SEMESTER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SUB_SPECIALISATIONS = SEMESTER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parrent Specialisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PARRENT_SPECIALISATION = SEMESTER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = SEMESTER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = SEMESTER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.SemesterImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SLOTS = 1;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.CourseSlotImpl <em>Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.CourseSlotImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getCourseSlot()
	 * @generated
	 */
	int COURSE_SLOT = 4;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT__COURSE = 0;

	/**
	 * The number of structural features of the '<em>Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.ElectiveCourseListImpl <em>Elective Course List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.ElectiveCourseListImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getElectiveCourseList()
	 * @generated
	 */
	int ELECTIVE_COURSE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Available Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_LIST__AVAILABLE_COURSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_LIST__NAME = 1;

	/**
	 * The feature id for the '<em><b>Elective Course Slot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT = 2;

	/**
	 * The number of structural features of the '<em>Elective Course List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Elective Course List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.UniversityImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__PROGRAMMES = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__SEMESTERS = 3;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__SPECIALISATIONS = 4;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.ElectiveCourseSlotImpl <em>Elective Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.ElectiveCourseSlotImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getElectiveCourseSlot()
	 * @generated
	 */
	int ELECTIVE_COURSE_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_SLOT__COURSE = COURSE_SLOT__COURSE;

	/**
	 * The feature id for the '<em><b>Elective Course List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST = COURSE_SLOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE = COURSE_SLOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Elective Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_SLOT_FEATURE_COUNT = COURSE_SLOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elective Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_SLOT_OPERATION_COUNT = COURSE_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link studyprogramme.impl.CompulsoryCourseSlotImpl <em>Compulsory Course Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.impl.CompulsoryCourseSlotImpl
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getCompulsoryCourseSlot()
	 * @generated
	 */
	int COMPULSORY_COURSE_SLOT = 9;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPULSORY_COURSE_SLOT__COURSE = COURSE_SLOT__COURSE;

	/**
	 * The number of structural features of the '<em>Compulsory Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPULSORY_COURSE_SLOT_FEATURE_COUNT = COURSE_SLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compulsory Course Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPULSORY_COURSE_SLOT_OPERATION_COUNT = COURSE_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link studyprogramme.ProgrammeCode <em>Programme Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.ProgrammeCode
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getProgrammeCode()
	 * @generated
	 */
	int PROGRAMME_CODE = 10;

	/**
	 * The meta object id for the '{@link studyprogramme.ProgrammeType <em>Programme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyprogramme.ProgrammeType
	 * @see studyprogramme.impl.StudyprogrammePackageImpl#getProgrammeType()
	 * @generated
	 */
	int PROGRAMME_TYPE = 11;

	/**
	 * Returns the meta object for class '{@link studyprogramme.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see studyprogramme.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprogramme.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see studyprogramme.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see studyprogramme.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyprogramme.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Course#getDisplayedName <em>Displayed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displayed Name</em>'.
	 * @see studyprogramme.Course#getDisplayedName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_DisplayedName();

	/**
	 * Returns the meta object for class '{@link studyprogramme.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see studyprogramme.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprogramme.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Programme#getProgrammeCode <em>Programme Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programme Code</em>'.
	 * @see studyprogramme.Programme#getProgrammeCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_ProgrammeCode();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see studyprogramme.Programme#getSpecializations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specializations();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Programme#getNumberOfYears <em>Number Of Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Years</em>'.
	 * @see studyprogramme.Programme#getNumberOfYears()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_NumberOfYears();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Programme#getProgrammeType <em>Programme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programme Type</em>'.
	 * @see studyprogramme.Programme#getProgrammeType()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_ProgrammeType();

	/**
	 * Returns the meta object for class '{@link studyprogramme.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see studyprogramme.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprogramme.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Specialization#getSelectionSemester <em>Selection Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Semester</em>'.
	 * @see studyprogramme.Specialization#getSelectionSemester()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_SelectionSemester();

	/**
	 * Returns the meta object for the container reference '{@link studyprogramme.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see studyprogramme.Specialization#getProgramme()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Programme();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.Specialization#getSubSpecialisations <em>Sub Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Specialisations</em>'.
	 * @see studyprogramme.Specialization#getSubSpecialisations()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SubSpecialisations();

	/**
	 * Returns the meta object for the container reference '{@link studyprogramme.Specialization#getParrentSpecialisation <em>Parrent Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parrent Specialisation</em>'.
	 * @see studyprogramme.Specialization#getParrentSpecialisation()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_ParrentSpecialisation();

	/**
	 * Returns the meta object for class '{@link studyprogramme.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see studyprogramme.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.Semester#getSemesterNumber <em>Semester Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Number</em>'.
	 * @see studyprogramme.Semester#getSemesterNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.Semester#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see studyprogramme.Semester#getSlots()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Slots();

	/**
	 * Returns the meta object for class '{@link studyprogramme.CourseSlot <em>Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Slot</em>'.
	 * @see studyprogramme.CourseSlot
	 * @generated
	 */
	EClass getCourseSlot();

	/**
	 * Returns the meta object for the reference '{@link studyprogramme.CourseSlot#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see studyprogramme.CourseSlot#getCourse()
	 * @see #getCourseSlot()
	 * @generated
	 */
	EReference getCourseSlot_Course();

	/**
	 * Returns the meta object for class '{@link studyprogramme.SemesterContainer <em>Semester Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Container</em>'.
	 * @see studyprogramme.SemesterContainer
	 * @generated
	 */
	EClass getSemesterContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.SemesterContainer#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see studyprogramme.SemesterContainer#getSemesters()
	 * @see #getSemesterContainer()
	 * @generated
	 */
	EReference getSemesterContainer_Semesters();

	/**
	 * Returns the meta object for class '{@link studyprogramme.ElectiveCourseList <em>Elective Course List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective Course List</em>'.
	 * @see studyprogramme.ElectiveCourseList
	 * @generated
	 */
	EClass getElectiveCourseList();

	/**
	 * Returns the meta object for the reference list '{@link studyprogramme.ElectiveCourseList#getAvailableCourses <em>Available Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Courses</em>'.
	 * @see studyprogramme.ElectiveCourseList#getAvailableCourses()
	 * @see #getElectiveCourseList()
	 * @generated
	 */
	EReference getElectiveCourseList_AvailableCourses();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.ElectiveCourseList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprogramme.ElectiveCourseList#getName()
	 * @see #getElectiveCourseList()
	 * @generated
	 */
	EAttribute getElectiveCourseList_Name();

	/**
	 * Returns the meta object for the container reference '{@link studyprogramme.ElectiveCourseList#getElectiveCourseSlot <em>Elective Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Elective Course Slot</em>'.
	 * @see studyprogramme.ElectiveCourseList#getElectiveCourseSlot()
	 * @see #getElectiveCourseList()
	 * @generated
	 */
	EReference getElectiveCourseList_ElectiveCourseSlot();

	/**
	 * Returns the meta object for class '{@link studyprogramme.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see studyprogramme.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link studyprogramme.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyprogramme.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.University#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see studyprogramme.University#getProgrammes()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see studyprogramme.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.University#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see studyprogramme.University#getSemesters()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Semesters();

	/**
	 * Returns the meta object for the containment reference list '{@link studyprogramme.University#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see studyprogramme.University#getSpecialisations()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Specialisations();

	/**
	 * Returns the meta object for class '{@link studyprogramme.ElectiveCourseSlot <em>Elective Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective Course Slot</em>'.
	 * @see studyprogramme.ElectiveCourseSlot
	 * @generated
	 */
	EClass getElectiveCourseSlot();

	/**
	 * Returns the meta object for the containment reference '{@link studyprogramme.ElectiveCourseSlot#getElectiveCourseList <em>Elective Course List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elective Course List</em>'.
	 * @see studyprogramme.ElectiveCourseSlot#getElectiveCourseList()
	 * @see #getElectiveCourseSlot()
	 * @generated
	 */
	EReference getElectiveCourseSlot_ElectiveCourseList();

	/**
	 * Returns the meta object for the reference '{@link studyprogramme.ElectiveCourseSlot#getAssignedCourse <em>Assigned Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Course</em>'.
	 * @see studyprogramme.ElectiveCourseSlot#getAssignedCourse()
	 * @see #getElectiveCourseSlot()
	 * @generated
	 */
	EReference getElectiveCourseSlot_AssignedCourse();

	/**
	 * Returns the meta object for class '{@link studyprogramme.CompulsoryCourseSlot <em>Compulsory Course Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compulsory Course Slot</em>'.
	 * @see studyprogramme.CompulsoryCourseSlot
	 * @generated
	 */
	EClass getCompulsoryCourseSlot();

	/**
	 * Returns the meta object for enum '{@link studyprogramme.ProgrammeCode <em>Programme Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programme Code</em>'.
	 * @see studyprogramme.ProgrammeCode
	 * @generated
	 */
	EEnum getProgrammeCode();

	/**
	 * Returns the meta object for enum '{@link studyprogramme.ProgrammeType <em>Programme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programme Type</em>'.
	 * @see studyprogramme.ProgrammeType
	 * @generated
	 */
	EEnum getProgrammeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyprogrammeFactory getStudyprogrammeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link studyprogramme.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.CourseImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Displayed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DISPLAYED_NAME = eINSTANCE.getCourse_DisplayedName();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.ProgrammeImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Programme Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__PROGRAMME_CODE = eINSTANCE.getProgramme_ProgrammeCode();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALIZATIONS = eINSTANCE.getProgramme_Specializations();

		/**
		 * The meta object literal for the '<em><b>Number Of Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NUMBER_OF_YEARS = eINSTANCE.getProgramme_NumberOfYears();

		/**
		 * The meta object literal for the '<em><b>Programme Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__PROGRAMME_TYPE = eINSTANCE.getProgramme_ProgrammeType();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.SpecializationImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Selection Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__SELECTION_SEMESTER = eINSTANCE.getSpecialization_SelectionSemester();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PROGRAMME = eINSTANCE.getSpecialization_Programme();

		/**
		 * The meta object literal for the '<em><b>Sub Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SUB_SPECIALISATIONS = eINSTANCE.getSpecialization_SubSpecialisations();

		/**
		 * The meta object literal for the '<em><b>Parrent Specialisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PARRENT_SPECIALISATION = eINSTANCE.getSpecialization_ParrentSpecialisation();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.SemesterImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_NUMBER = eINSTANCE.getSemester_SemesterNumber();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SLOTS = eINSTANCE.getSemester_Slots();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.CourseSlotImpl <em>Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.CourseSlotImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getCourseSlot()
		 * @generated
		 */
		EClass COURSE_SLOT = eINSTANCE.getCourseSlot();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_SLOT__COURSE = eINSTANCE.getCourseSlot_Course();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.SemesterContainerImpl <em>Semester Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.SemesterContainerImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getSemesterContainer()
		 * @generated
		 */
		EClass SEMESTER_CONTAINER = eINSTANCE.getSemesterContainer();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_CONTAINER__SEMESTERS = eINSTANCE.getSemesterContainer_Semesters();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.ElectiveCourseListImpl <em>Elective Course List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.ElectiveCourseListImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getElectiveCourseList()
		 * @generated
		 */
		EClass ELECTIVE_COURSE_LIST = eINSTANCE.getElectiveCourseList();

		/**
		 * The meta object literal for the '<em><b>Available Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSE_LIST__AVAILABLE_COURSES = eINSTANCE.getElectiveCourseList_AvailableCourses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTIVE_COURSE_LIST__NAME = eINSTANCE.getElectiveCourseList_Name();

		/**
		 * The meta object literal for the '<em><b>Elective Course Slot</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSE_LIST__ELECTIVE_COURSE_SLOT = eINSTANCE.getElectiveCourseList_ElectiveCourseSlot();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.UniversityImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__PROGRAMMES = eINSTANCE.getUniversity_Programmes();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__SEMESTERS = eINSTANCE.getUniversity_Semesters();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__SPECIALISATIONS = eINSTANCE.getUniversity_Specialisations();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.ElectiveCourseSlotImpl <em>Elective Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.ElectiveCourseSlotImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getElectiveCourseSlot()
		 * @generated
		 */
		EClass ELECTIVE_COURSE_SLOT = eINSTANCE.getElectiveCourseSlot();

		/**
		 * The meta object literal for the '<em><b>Elective Course List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSE_SLOT__ELECTIVE_COURSE_LIST = eINSTANCE.getElectiveCourseSlot_ElectiveCourseList();

		/**
		 * The meta object literal for the '<em><b>Assigned Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSE_SLOT__ASSIGNED_COURSE = eINSTANCE.getElectiveCourseSlot_AssignedCourse();

		/**
		 * The meta object literal for the '{@link studyprogramme.impl.CompulsoryCourseSlotImpl <em>Compulsory Course Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.impl.CompulsoryCourseSlotImpl
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getCompulsoryCourseSlot()
		 * @generated
		 */
		EClass COMPULSORY_COURSE_SLOT = eINSTANCE.getCompulsoryCourseSlot();

		/**
		 * The meta object literal for the '{@link studyprogramme.ProgrammeCode <em>Programme Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.ProgrammeCode
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getProgrammeCode()
		 * @generated
		 */
		EEnum PROGRAMME_CODE = eINSTANCE.getProgrammeCode();

		/**
		 * The meta object literal for the '{@link studyprogramme.ProgrammeType <em>Programme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyprogramme.ProgrammeType
		 * @see studyprogramme.impl.StudyprogrammePackageImpl#getProgrammeType()
		 * @generated
		 */
		EEnum PROGRAMME_TYPE = eINSTANCE.getProgrammeType();

	}

} //StudyprogrammePackage
