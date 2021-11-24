package factory;

import java.time.LocalDate;

class Human {
    private String heart;
    private String mother;

    public Human clone(){
        LocalDate date = LocalDate.now();
        final LocalDate localDate = date.withMonth(2);
        final Human human = new Human();
        human.heart = new String(heart);
        human.mother = mother;
        return human;
    }
}
