package observer;

import lombok.Builder;

@Builder
public class MenuItem {
    String label;
    Runnable action;
}
