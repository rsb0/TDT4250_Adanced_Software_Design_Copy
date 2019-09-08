/**
 */
package studyprogramme.tests;

import junit.textui.TestRunner;

import studyprogramme.CompulsoryCourseSlot;
import studyprogramme.StudyprogrammeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compulsory Course Slot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompulsoryCourseSlotTest extends CourseSlotTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompulsoryCourseSlotTest.class);
	}

	/**
	 * Constructs a new Compulsory Course Slot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompulsoryCourseSlotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Compulsory Course Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompulsoryCourseSlot getFixture() {
		return (CompulsoryCourseSlot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogrammeFactory.eINSTANCE.createCompulsoryCourseSlot());
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

} //CompulsoryCourseSlotTest
