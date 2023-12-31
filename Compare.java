public class Compare {
  static class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    public int compareTo(Student s) {
      if (this.rank > s.rank) {
        return 1;
      } else if (this.rank < s.rank) {
        return -1;
      } else {
        return 0;
      }
    }

  }
}