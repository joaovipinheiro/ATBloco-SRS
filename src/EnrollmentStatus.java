// Used by the Section class to represent various possible outcomes of
// an attempt to enroll by a Student.

public enum EnrollmentStatus {
    success("Enrollment successful!  :o)"),
    secFull("Enrollment failed;  section was full.  :op"),
    prereq("Enrollment failed; prerequisites not satisfied.  :op"),
    prevEnroll("Enrollment failed; previously enrolled.  :op");

    private final String value;

    EnrollmentStatus(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
