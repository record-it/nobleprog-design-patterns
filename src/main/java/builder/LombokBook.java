package builder;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true) //generowanie metod equals i hashCode dla wybranych pól
public class LombokBook {
    @NonNull    //wymuszenia parametru symuluje obowiązkowy parametr builder'a.
    @EqualsAndHashCode.Include  //tylko dla tego pola generowane są metody equals i hashCode
    private String title;
    @NonNull    //wymuszenie parametru symuluje obowiązkowy parametr builder'a.
    private String author;
    private Integer publishingYear;
}
