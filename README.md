# TDT4250_Advanced_Software_Design_Copy

My solution to assignment 1 in TDT4250 Advanced Software Design, modelling a studyprogramme.


ECLasses:

                                                ------University------
                                                
This is the top level element of the model, and it is this EClass that should be created when creating a Dynamic Instance of the model, or running the main plugin as an Eclipse Application in a runtime window. 

EReferences and EAttributes:
It contains containment references, of cardinality 0-N, to the EClasses Programme and Course. I have not modelled institutes, so courses are owned by the university as a whole. The Programme and Course EClasses has a 1-1 reference back to University with oposites.

Constraints:
University has one constraint (implemented with manually written java code in the validator) that all course codes must be unique.


                                                ------Course------
ERefences and EAttributes:
Name, courseCode, credits and level are regular EAttributes of a course. 
There is also a changable, volatile and transient derived feature called displayedName, consisting of the courseCode and courseName EAttributes, and is intented to be used when displaying course information to a student looking at a study plan. If a student for example looks at the course Advanced Software Design they will see it displayed as "TDT4250 Advanced Software Design". The getter and setter method in CourseImpl has been edited manually to implement this derived feature.
There is one reference back to university. This reference is an oposite.


                                                ------Programme------
Programme has SemesterContainer as its superclass.

ERefernces and EAttributes:
Regular EAttributes are name, numberOfYears. It also contains programmeType and programmeCode EAttributes. These two have EType of programmeType and ProgrammeCode respectively which are EEnums with a finite number of literals to choose from.
There is a 0-N containment EReferences to Specialisation, and a container EReference to University.

Constraints:
Programme has constraints saying that programmes of type Master's, Bachelor's and Integrated Master's must have 4, 6, and 10 semesters respectively, as well as one constraint saying that at the master's level one may only receive 22.5 credits from 3rd level courses. These constraints are implemented with written java code in the Validator class.


                                                ------Specialisation------
Specialisatiion has SemesterContainer as its superclass

EAttributes and EReferences:
name and selectionSemester. selectionSemester is the semester at which this specialisation is to be selected.
There is a container refernce with oposite to Programme, a 0-N containment reference to subSpecialisation if the programme has further specialisation in later semesters, and a container reference with oposite to parrentSpecialisation.


                                                ------Semester------
EReferences and EAttributes:
semesterNumber indicating which semester in the programme this is.
Containment EReference to CourseSlot

Constraints:
Semester must have thirty credits. This constraint is written in AQL.


                                                ------SemesterContainer------
Superclass for programme and specialisation. Has a 0-N containment refernce to semester.


                                                ------ElectiveCourseList------
This class contains a list of courses a student can choose from to fill an elective course slot.

EReferences and EAttributes:
name attribute. 
AvailableCourses is a 0-N ordinary refernce to Course, which serves as a list of courses that are allowed to be in the elective course slot. 
ElectiveCourseSlot is a container refernce to the EClass ElectiveCourseSlot.


                                                ------CourseSlot------
Superclass for elective and compulsory course slots. Has an ordinary 1-1 reference to a Course representing the Course assigned to this particular slot.


                                                ------ElectiveCourseSlot------
A slot to be filled with an elective course. Its superclass is CourseSlot

EReferences and EAttributes:
There is a 0-1 containment EReference to the EClass ElectiveCourseList containing a list of courses that are allowed to be in this particular slot.

Constraints:
There are two constraints here one written and one in OCL, and they both are intended to do the same thing. The written constraint is called "assignedCourseIsValid" and in the Validator class it does a for loop over the list of available courses and returns true if the course assigned in the assignedCourse EReference is present in the list. 
The other constraint is an attempt at writing an AQL query that does a select-call on the availableCourses EList and return the element with courseCode equal to self.course.courseCode. If this select-call is not equal to null (i.e. assignedCourse is present in the electiveCourseList) it is supposed to return true. 
Neither of these methods gives the correct behaviour when creating a dynamic instance of the model, I haven't figured out why, and I'm out of time now.


                                                ------CompulsoryCourseSlot------
Simply a course slot containing a course that is compulsory for this slot. CourseSlot is its superclass and it only contains the reference to Course that it inherits from the CourseSlot EClass.





EENums:
                                                ------ProgramCode------
Used by the Programme EClass to identify programs. As of now it contains the literals MTDT, MIDT, BIT, MIT, MTIOT, MTPROD.

                                                ------ProgramType------
Used by Programme EClass to tell what type of programme it is. As of now it contains the literals Bachelors, Masters, and Integrated Masters.
