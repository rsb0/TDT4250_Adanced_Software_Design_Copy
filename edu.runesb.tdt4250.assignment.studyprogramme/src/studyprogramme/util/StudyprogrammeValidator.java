/**
 */
package studyprogramme.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import studyprogramme.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyprogramme.StudyprogrammePackage
 * @generated
 */
public class StudyprogrammeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyprogrammeValidator INSTANCE = new StudyprogrammeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyprogramme";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogrammeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyprogrammePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyprogrammePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyprogrammePackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case StudyprogrammePackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case StudyprogrammePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyprogrammePackage.COURSE_SLOT:
				return validateCourseSlot((CourseSlot)value, diagnostics, context);
			case StudyprogrammePackage.SEMESTER_CONTAINER:
				return validateSemesterContainer((SemesterContainer)value, diagnostics, context);
			case StudyprogrammePackage.ELECTIVE_COURSE_LIST:
				return validateElectiveCourseList((ElectiveCourseList)value, diagnostics, context);
			case StudyprogrammePackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyprogrammePackage.ELECTIVE_COURSE_SLOT:
				return validateElectiveCourseSlot((ElectiveCourseSlot)value, diagnostics, context);
			case StudyprogrammePackage.COMPULSORY_COURSE_SLOT:
				return validateCompulsoryCourseSlot((CompulsoryCourseSlot)value, diagnostics, context);
			case StudyprogrammePackage.PROGRAMME_CODE:
				return validateProgrammeCode((ProgrammeCode)value, diagnostics, context);
			case StudyprogrammePackage.PROGRAMME_TYPE:
				return validateProgrammeType((ProgrammeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_integratedMastersMustHaveTenSemesters(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_mastersMustHaveFourSemesters(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_bachelorsMustHaveSixSemesters(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_masterLevelValidCourseCombination(programme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the integratedMastersMustHaveTenSemesters constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramme_integratedMastersMustHaveTenSemesters(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! integratedMastersHasTenSemesters(programme)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "integratedMastersMustHaveTenSemesters", getObjectLabel(programme, context) },
						 new Object[] { programme },
						 context));
			}
			return false;
		}
		return true;
	}
	
	//Validate that integrated master's programme has ten semesters
	private boolean integratedMastersHasTenSemesters(Programme programme) {
		if(programme.getProgrammeType().getValue() == ProgrammeType.INTEGRATED_MASTER_VALUE) {
			int numberOfSemesters = programme.getSemesters().size();
			return numberOfSemesters == 10;
		}
		return true;
	}

	/**
	 * Validates the mastersMustHaveFourSemesters constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramme_mastersMustHaveFourSemesters(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! mastersHasFourSemesters(programme)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "mastersMustHaveFourSemesters", getObjectLabel(programme, context) },
						 new Object[] { programme },
						 context));
			}
			return false;
		}
		return true;
	}
	
	//Validate that masters's programme has four semesters
	private boolean mastersHasFourSemesters(Programme programme) {
		if(programme.getProgrammeType().getValue() == ProgrammeType.MASTERS_VALUE) {
			int numberOfSemesters = programme.getSemesters().size();
			return numberOfSemesters == 4;
		}
		return true;
	}

	/**
	 * Validates the bachelorsMustHaveSixSemesters constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramme_bachelorsMustHaveSixSemesters(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (bachelorsHasSixSemesters(programme)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "bachelorsMustHaveSixSemesters", getObjectLabel(programme, context) },
						 new Object[] { programme },
						 context));
			}
			return false;
		}
		return true;
	}
	
	//Validate that bachelor's programme has six semesters
	private boolean bachelorsHasSixSemesters(Programme programme) {
		if(programme.getProgrammeType().getValue() == ProgrammeType.BACHELORS_VALUE) { 
			int numberOfSemesters = programme.getSemesters().size();
			return numberOfSemesters == 6;
		}
		return true;
	}
	
	/**
	 * Validates the masterLevelValidCourseCombination constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramme_masterLevelValidCourseCombination(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! masterProgrammeHasValidLevelCourses(programme)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "masterLevelValidCourseCombination", getObjectLabel(programme, context) },
						 new Object[] { programme },
						 context));
			}
			return false;
		}
		return true;
	}
	
	/*
	 * check that the combination of courses selected at master's level has no more
	 * than 22.5 credits worth of 3rd-level courses
	 */
	private boolean masterProgrammeHasValidLevelCourses(Programme programme) {
		if(programme.getProgrammeType().getValue() == ProgrammeType.MASTERS_VALUE) {
			float thirdLevelCredits = 0f;
			
			//loop over semester 1 through 4 for a master's course. A master's programme will never exceed 4 semesters, per the constraint placed on master's programmes
			for (int i = 1; i < 5; i++) {
				//within each semester, loop over all courseSlots and add the credits provided by 3rd level courses
				for(int j = 0; j < programme.getSemesters().get(i).getSlots().size(); i++) {
					//check if a course in this programme is a 3rd level course, its credits are added to variable thirdLevelCredits
					if(programme.getSemesters().get(i).getSlots().get(j).getCourse().getLevel() <= 3) {
						thirdLevelCredits += programme.getSemesters().get(i).getSlots().get(j).getCourse().getCredits();
					}
				}
			}
			//check if credits provided 3rd level courses exceed 22.5.
			return (thirdLevelCredits <= 22.5f);
		}
		return true;
	}


	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_semesterMustHaveThirtyCredits(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the semesterMustHaveThirtyCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__SEMESTER_MUST_HAVE_THIRTY_CREDITS__EEXPRESSION = "self.slots.course.credits->sum() == 30.0";

	/**
	 * Validates the semesterMustHaveThirtyCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_semesterMustHaveThirtyCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyprogrammePackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "semesterMustHaveThirtyCredits",
				 SEMESTER__SEMESTER_MUST_HAVE_THIRTY_CREDITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}
	
	
	

	private boolean assertfalse() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseSlot(CourseSlot courseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterContainer(SemesterContainer semesterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semesterContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectiveCourseList(ElectiveCourseList electiveCourseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electiveCourseList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(university, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniversity_courseCodesMustBeUnique(university, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseCodesMustBeUnique constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUniversity_courseCodesMustBeUnique(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! allCourseCodesAreUnique(university)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseCodesMustBeUnique", getObjectLabel(university, context) },
						 new Object[] { university },
						 context));
			}
			return false;
		}
		return true;
	}
	
	private boolean allCourseCodesAreUnique(University university) {
		for (int i = 0; i < university.getCourses().size() - 1; i++) {
			for (int j = i+1; j < university.getCourses().size(); j++) {
				
				/*
				*Return true if an instance is found where the courseCode of element i is equal to 
				*courseCode of element j in university's list of courses 
				*/
				if(university.getCourses().get(i).getCourseCode().equals(university.getCourses().get(j).getCourseCode())) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectiveCourseSlot(ElectiveCourseSlot electiveCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(electiveCourseSlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(electiveCourseSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateElectiveCourseSlot_assignedCourseIsValid(electiveCourseSlot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the assignedCourseIsValid constraint of '<em>Elective Course Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateElectiveCourseSlot_assignedCourseIsValid(ElectiveCourseSlot electiveCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (assignedCourseIsInCourseList(electiveCourseSlot)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "assignedCourseIsValid", getObjectLabel(electiveCourseSlot, context) },
						 new Object[] { electiveCourseSlot },
						 context));
			}
			return false;
		}
		return true;
	}
	
	//Check that the course placed in electiveCourseSlot exists in electiveCourseList
	private boolean assignedCourseIsInCourseList(ElectiveCourseSlot slot) {
		for (int i = 0; i < slot.getElectiveCourseList().getAvailableCourses().size(); i++) {
			if(slot.getElectiveCourseList().getAvailableCourses().get(i).getCourseCode() == slot.getAssignedCourse().getCourseCode()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompulsoryCourseSlot(CompulsoryCourseSlot compulsoryCourseSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compulsoryCourseSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeCode(ProgrammeCode programmeCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeType(ProgrammeType programmeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyprogrammeValidator
