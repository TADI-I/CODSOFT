import java.util.*;

class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;
    List<String> registeredStudents = new ArrayList<>();

    // constructor, getters, setters omitted for brevity
}

class Student {
    String id;
    String name;
    List<String> registeredCourses = new ArrayList<>();

    // constructor, getters, setters omitted for brevity
}

class University {
    Map<String, Course> courseDatabase = new HashMap<>();
    Map<String, Student> studentDatabase = new HashMap<>();

    void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (list, register, remove, quit):");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            } else if (command.equals("list")) {
                listCourses();
            } else if (command.equals("register")) {
                System.out.println("Enter student ID:");
                String studentId = scanner.nextLine();
                System.out.println("Enter course code:");
                String courseCode = scanner.nextLine();
                registerStudentForCourse(studentId, courseCode);
            } else if (command.equals("remove")) {
                System.out.println("Enter student ID:");
                String studentId = scanner.nextLine();
                System.out.println("Enter course code:");
                String courseCode = scanner.nextLine();
                removeStudentFromCourse(studentId, courseCode);
            }
        }

        scanner.close();
    }

    void listCourses() {
        for (Course course : courseDatabase.values()) {
            System.out.println(course.title + " (" + course.code + "): " + course.description);
            System.out.println("Available slots: " + (course.capacity - course.registeredStudents.size()));
        }
    }

    void registerStudentForCourse(String studentId, String courseCode) {
        Student student = studentDatabase.get(studentId);
        Course course = courseDatabase.get(courseCode);

        if (student != null && course != null && course.registeredStudents.size() < course.capacity) {
            student.registeredCourses.add(courseCode);
            course.registeredStudents.add(studentId);
        }
    }

    void removeStudentFromCourse(String studentId, String courseCode) {
        Student student = studentDatabase.get(studentId);
        Course course = courseDatabase.get(courseCode);

        if (student != null && course != null) {
            student.registeredCourses.remove(courseCode);
            course.registeredStudents.remove(studentId);
        }
    }
}
