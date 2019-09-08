/**
 */
package studyprogramme.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprogramme.CourseSlot;
import studyprogramme.StudyprogrammeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Slot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseSlotTest extends TestCase {

	/**
	 * The fixture for this Course Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseSlot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseSlotTest.class);
	}

	/**
	 * Constructs a new Course Slot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseSlotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseSlot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseSlot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogrammeFactory.eINSTANCE.createCourseSlot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CourseSlotTest
