/**
 * Class for student.
 */
class Student {
    String name;
    double marks;

    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      m     { parameter_description }
     */
    Student(final String n, final String m) {
        this.marks = Double.parseDouble(m);
        this.name  = n;
    }
}
