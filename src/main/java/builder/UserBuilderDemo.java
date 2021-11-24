package builder;

import java.time.LocalDate;

public class UserBuilderDemo {
    public static void main(String[] args) {
        User.builder()
                .firstName("Adam")
                .lastName("Kowal")
                .birthDate(LocalDate.now())
                .build();

        User.Builder builder = User.builder();
        //..
        builder.firstName("Ewa");
        //..
        builder.lastName("Nowak");
        //..
        User ewa = builder.build();
    }
}
