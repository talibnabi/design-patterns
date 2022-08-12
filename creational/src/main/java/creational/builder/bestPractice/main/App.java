package creational.builder.bestPractice.main;

import creational.builder.bestPractice.builder.School;
import creational.builder.bestPractice.builder.School.SchoolBuilder;
import creational.builder.bestPractice.enums.SchoolLocation;
import creational.builder.bestPractice.enums.SchoolName;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        School school = new SchoolBuilder(SchoolName.DERELEYEZ, 311)
                .setSchoolAge(23)
                .setSchoolLocation(SchoolLocation.BORCALI)
                .build();
        System.out.println(school);
    }
}
