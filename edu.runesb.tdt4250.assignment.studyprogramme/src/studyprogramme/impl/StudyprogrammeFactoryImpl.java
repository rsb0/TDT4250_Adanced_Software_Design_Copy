/**
 */
package studyprogramme.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import studyprogramme.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogrammeFactoryImpl extends EFactoryImpl implements StudyprogrammeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyprogrammeFactory init() {
		try {
			StudyprogrammeFactory theStudyprogrammeFactory = (StudyprogrammeFactory)EPackage.Registry.INSTANCE.getEFactory(StudyprogrammePackage.eNS_URI);
			if (theStudyprogrammeFactory != null) {
				return theStudyprogrammeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyprogrammeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogrammeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyprogrammePackage.COURSE: return createCourse();
			case StudyprogrammePackage.PROGRAMME: return createProgramme();
			case StudyprogrammePackage.SPECIALIZATION: return createSpecialization();
			case StudyprogrammePackage.SEMESTER: return createSemester();
			case StudyprogrammePackage.COURSE_SLOT: return createCourseSlot();
			case StudyprogrammePackage.SEMESTER_CONTAINER: return createSemesterContainer();
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST: return createElectiveCourseList();
			case StudyprogrammePackage.UNIVERSITY: return createUniversity();
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT: return createElectiveCourseSlot();
			case StudyprogrammePackage.COMPULSORY_COURSE_SLOT: return createCompulsoryCourseSlot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StudyprogrammePackage.PROGRAMME_CODE:
				return createProgrammeCodeFromString(eDataType, initialValue);
			case StudyprogrammePackage.PROGRAMME_TYPE:
				return createProgrammeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StudyprogrammePackage.PROGRAMME_CODE:
				return convertProgrammeCodeToString(eDataType, instanceValue);
			case StudyprogrammePackage.PROGRAMME_TYPE:
				return convertProgrammeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSlot createCourseSlot() {
		CourseSlotImpl courseSlot = new CourseSlotImpl();
		return courseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterContainer createSemesterContainer() {
		SemesterContainerImpl semesterContainer = new SemesterContainerImpl();
		return semesterContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCourseList createElectiveCourseList() {
		ElectiveCourseListImpl electiveCourseList = new ElectiveCourseListImpl();
		return electiveCourseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCourseSlot createElectiveCourseSlot() {
		ElectiveCourseSlotImpl electiveCourseSlot = new ElectiveCourseSlotImpl();
		return electiveCourseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompulsoryCourseSlot createCompulsoryCourseSlot() {
		CompulsoryCourseSlotImpl compulsoryCourseSlot = new CompulsoryCourseSlotImpl();
		return compulsoryCourseSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeCode createProgrammeCodeFromString(EDataType eDataType, String initialValue) {
		ProgrammeCode result = ProgrammeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeType createProgrammeTypeFromString(EDataType eDataType, String initialValue) {
		ProgrammeType result = ProgrammeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyprogrammePackage getStudyprogrammePackage() {
		return (StudyprogrammePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyprogrammePackage getPackage() {
		return StudyprogrammePackage.eINSTANCE;
	}

} //StudyprogrammeFactoryImpl
