// Тройные кавычки для текстовых блоков (с Java 15)
String html = """
    <html>
        <body>
            <p>Hello, World!</p>
        </body>
    </html>
    """;

String query = """
    SELECT * FROM users
    WHERE age > 18
    ORDER BY name
    """;

System.out.println(html);
System.out.println(query);