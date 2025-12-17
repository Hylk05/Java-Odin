List<String> list = new ArrayList<>();
boolean b1 = list instanceof List;
boolean b2 = list instanceof List<?>;
// boolean b3 = list instanceof List<String>; // Ошибка компиляции

Map<Integer, String> map = new HashMap<>();
boolean b4 = map instanceof Map;
boolean b5 = map instanceof Map<?, ?>;