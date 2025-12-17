// <? extends T> - можно читать, нельзя добавлять (кроме null)
List<? extends Number> numbers = new ArrayList<Integer>();
Number n = numbers.get(0);
// numbers.add(new Integer(5)); // Ошибка компиляции

// <? super T> - можно добавлять объекты типа T и его подтипы
List<? super Integer> integers = new ArrayList<Number>();
integers.add(10);
integers.add(20);
Object obj = integers.get(0);