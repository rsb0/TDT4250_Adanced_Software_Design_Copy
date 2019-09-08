/**
 */
package studyprogramme.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprogramme.ElectiveCourseList;
import studyprogramme.StudyprogrammeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elective Course List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElectiveCourseListTest extends TestCase {

	/**
	 * The fixture for this Elective Course List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCourseList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElectiveCourseListTest.class);
	}

	/**
	 * Constructs a new Elective Course List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCourseListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Elective Course List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ElectiveCourseList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Elective Course List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCourseList getFixture() {
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
		setFixture(StudyprogrammeFactory.eINSTANCE.createElectiveCourseList());
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

} //ElectiveCourseListTest
