package org.example;

public class EncapsulationDemo {
    public class person {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // encapsulation is a mechanism of binding the data together and it is basically hiding the internal working state of an showing only the important part

}
