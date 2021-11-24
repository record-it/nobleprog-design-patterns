package builder;

import lombok.ToString;

import java.time.LocalDate;

@ToString
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int rating;
    private String email;

    private User(String firstName, String lastName, LocalDate birthDate, int rating, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.rating = rating;
        this.email = email;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private int rating;
        private String email;

        private Builder() {
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(LocalDate birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public Builder rating(int rating){
            this.rating = rating;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public User build(){
            return new User(firstName, lastName, birthDate, rating, email);
        }
    }
}
