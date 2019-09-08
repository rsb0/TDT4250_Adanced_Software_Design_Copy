/**
 */
package studyprogramme.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprogramme.SemesterContainer;
import studyprogramme.StudyprogrammeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemesterContainerTest extends TestCase {

	/**
	 * The fixture for this Semester Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterContainerTest.class);
	}

	/**
	 * Constructs a new Semester Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SemesterContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterContainer getFixture() {
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
		setFixture(StudyprogrammeFactory.eINSTANCE.createSemesterContainer());
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

} //SemesterContainerTest
