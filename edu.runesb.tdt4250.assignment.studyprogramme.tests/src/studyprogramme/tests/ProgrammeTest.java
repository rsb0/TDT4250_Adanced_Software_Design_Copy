/**
 */
package studyprogramme.tests;

import junit.textui.TestRunner;

import studyprogramme.Programme;
import studyprogramme.StudyprogrammeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgrammeTest extends SemesterContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgrammeTest.class);
	}

	/**
	 * Constructs a new Programme test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Programme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Programme getFixture() {
		return (Programme)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogrammeFactory.eINSTANCE.createProgramme());
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

} //ProgrammeTest
