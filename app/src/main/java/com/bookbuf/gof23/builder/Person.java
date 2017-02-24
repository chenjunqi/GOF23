package com.bookbuf.gof23.builder;

/**
 * author: robert.
 * date :  2017/2/24.
 */

public class Person {

    private String color;
    private String height;
    private String weight;
    private String gender;

    private Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {

        private String color;
        private String height;
        private String weight;
        private String gender;

        public Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        public Builder buildWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder buildHeight(String height) {
            this.height = height;
            return this;
        }

        public Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.color = color;
            person.gender = gender;
            person.height = height;
            person.weight = weight;
            return person;
        }
    }
}
