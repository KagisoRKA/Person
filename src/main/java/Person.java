class Person {

    private String name, gender;
    private int age;
    private String[] interests;

    Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    String hello() {

        String isOrAre;
        if (interests.length == 1) {
            isOrAre = "is";
        } else {
            isOrAre = "are";
        }

        return String.format("Hello, my name is %s and I am a %s year old %s. My interests %s %s.",name,age,gender,isOrAre,printList());
    }

    // This is a method to go through a list of interests a person has and then return the list as a string.
    // If the user put only one list item then program will output "My interest is" instead of "My interest are".
    // If the user does not have any interest then the program will output "My interest are none".

    private String printList() {

        StringBuilder list = new StringBuilder();
        if (interests.length == 0) {
            list.append("none");
        }
        else if (interests.length == 1) {
            list.append(interests[0]);
        }
        else if (interests.length == 2) {
            list.append(interests[0]).append(" and ").append(interests[1]);
        }
        else {
            for (int i = 0; i < interests.length; i++) {
                if (i == interests.length - 1) {
                    list.append("and" + " ").append(interests[interests.length - 1]);
                }
                else if (i == interests.length - 2) {
                    list.append(interests[interests.length - 2]).append(" ");
                }
                else {
                    list.append(interests[i]).append(", ");
                }
            }
        }
        return list.toString();
    }
}
