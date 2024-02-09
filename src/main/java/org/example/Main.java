package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                int age = 32;
                if (age >= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
                }
                if (age < 18) {
                    System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
                }
                System.out.println(" ");
                int speed = 60;
                if (speed > 60) {
                    System.out.println("Если скорость " + speed + ", то  придется заплатить штраф.");
                }
                if (speed <= 60) {
                    System.out.println("Если скорость " + speed + ", то  можно ездить спокойно.");
                }
                System.out.println(" ");
                int agePerson = 17;
                if (agePerson > 2 && agePerson <= 6) {
                    System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
                } else if (agePerson >= 7 && agePerson <= 17) {
                    System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
                } else if (agePerson >= 18 && agePerson <= 24) {
                    System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет.");
                } else if (agePerson > 24) {
                    System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу.");
                }
                System.out.println(" ");
                int ageForAttraction = 16;
                if (ageForAttraction < 5) {
                    System.out.println("Если возраст ребенка равен " + ageForAttraction + ",то ему нельзя кататься на аттракционе.");
                } else if (ageForAttraction >= 5 && ageForAttraction < 14) {
                    System.out.println("Если возраст ребенка равен " + ageForAttraction + ",то ему можно кататься на аттракционе в сопровождении взрослого.");
                } else if (ageForAttraction >= 14) {
                    System.out.println("Если возраст ребенка равен " + ageForAttraction + ",то ему можно кататься на аттракционе без сопровождения взрослого.");
                }
                System.out.println(" ");
                int wagonCapacity = 102;
                int seatsCapacity = 60;
                int amountPersons = 13;
                if (amountPersons > wagonCapacity) {
                    System.out.println("В вагоне нет свободных мест.");
                } else if (amountPersons > seatsCapacity) {
                    System.out.println("В вагоне нет свободных сидячих мест только стоячие.");
                } else if (amountPersons <= seatsCapacity) {
                    System.out.println("В вагоне есть свободные сидячие места.");
                }
                System.out.println(" ");

                int one=255;
                int two=179;
                int three=98;
                if (one > two && one > two) {
                    System.out.println("Наибольшее число one=" + one+".");
                } else if (two > one && two > three) {
                    System.out.println("Наибольшее число two=" + two+".");
                }else if (three > one && three > two) {
                    System.out.println("Наибольшее число three="+three+".");
                }
            }
        }
    }
}