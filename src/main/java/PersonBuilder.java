public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    private Person person;

    public PersonBuilder setName(String name) {
        if (this.name == null) this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (this.surname == null) this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Указан отрицательный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name != null && surname != null) {
            person = new Person(name, surname);
            if (age != 0) {
                person.setAge(age);
            }
            if (address != null) {
                person.setAddress(address);
            }
        } else {
            throw new IllegalStateException("Неуказаны обязательные поля Имя Фамилия");
        }
        return person;
    }
}