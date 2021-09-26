package text_block;

/**
 * @author Nowshad Hasan
 * @since 25/9/21 6:43 pm
 */
public class TextBlockExample {
    /*
     Our new newHtml and newSql variable have much cleaner string initialization.
     Text block prints each line as new line. If we don't want new line somewhere, we can add \ to suppress it.
     By default, space is removed from each of the line. If we want a space, we've to add \s at the end of the line.
     We can find the generated class at out/ folder.
     */
    public static void main(String[] args) {

        String oldHtml = "<html>\n" +
                "<head>\n" +
                "    <title>\n" +
                "        Hello Text Block\n" +
                "    </title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";

        String newHtml = """
                <html>
                 <head>
                     <title>
                         Hello Text Block
                     </title>
                 </head>
                 <body>
                 </body>
                </html>
                 """;

        String oldSql = "SELECT * \n" +
                "FROM student\n" +
                "WHERE id=100;";

        String newSql = """
                SELECT * 
                FROM student
                WHERE id=100;
                """;

        String inlineStr = """
                Hello \
                world
                """;
        String spaceStr = """
                Hello \s
                World
                """;

        System.out.println(oldHtml);
        System.out.println();
        System.out.println(newHtml);

        System.out.println(oldSql);
        System.out.println();
        System.out.println(newSql);

        System.out.println(inlineStr);
        System.out.println(spaceStr);
    }
}
