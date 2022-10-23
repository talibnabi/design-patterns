package creational.builder;


public class EmployeeWithBuilder {
    // coxlu field i olan constructorlar yaratmaqdan bizi qurtarir
    private final String firstName; //optional
    private final String lastName; //optional
    private final Integer age; //optional
    private final String jobCompany; //optional
    private final String country; //optional

    private EmployeeWithBuilder(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.jobCompany = employeeBuilder.jobCompany;
        this.country = employeeBuilder.country;
    }

    static class EmployeeBuilder {
        private final String firstName; //required
        private final String lastName; //required
        private final Integer age; //required
        private String jobCompany; //optional
        private String country; //optional

        public EmployeeBuilder(String firstName, String lastName, Integer age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public EmployeeBuilder setJobCompany(String jobCompany) {
            this.jobCompany = jobCompany;
            return this;
        }

        public EmployeeBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public EmployeeWithBuilder build() {
            return new EmployeeWithBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "EmployeeWithBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", jobCompany='" + jobCompany + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EmployeeWithBuilder employee = new EmployeeWithBuilder
                .EmployeeBuilder("Alisa", "Aslan", 20)
                .setJobCompany("ABB")
                .setCountry("Azerbaijan").build();
        System.out.println(employee);
    }
}
