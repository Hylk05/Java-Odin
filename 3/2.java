Object obj1 = "String";
Object obj2 = new Integer(10);
Object obj3 = null;

boolean b1 = obj1 instanceof String;
boolean b2 = obj2 instanceof Number;
boolean b3 = obj2 instanceof Integer;
boolean b4 = obj3 instanceof String;

Number num = 100;
boolean b5 = num instanceof Integer;
boolean b6 = num instanceof Object;

List<String> list = new ArrayList<>();
boolean b7 = list instanceof List;