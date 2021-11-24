package facade;

public class Report {
    Header header;
    Body body = new Body();

    public void addHeader(String content) {
        header = Header.builder().content(content).build();
    }

    public void addParagraphBody(String content) {
        body.addItem(Paragraph.builder().content(content).build());
    }

    public void addHeaderBody(String content) {
        body.addItem(Header.builder().content(content).build());
    }

    @Override
    public String toString() {
        return header.getContent() +
                "\n=====================\n" +
                body.content.stream().map(item -> item.toString() + "\n").reduce("", (a, i) -> a + i);
    }
}
