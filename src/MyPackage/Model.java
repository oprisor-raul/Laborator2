package MyPackage;

class Course {
    private String CourseName;
    private String CourseId;
    private String CourseDifficulty;

    public String getId() {
        return CourseId;
    }

    public void setId(String id) {
        this.CourseId = id;
    }

    public String getName() {
        return CourseName;
    }

    public void setName(String name) {
        this.CourseName = name;
    }

    public String getDifficulty() {
        return CourseDifficulty;
    }

    public void setDifficulty(String difficulty) {
        this.CourseDifficulty = difficulty;
    }

}