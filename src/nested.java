public class nested {
    public static void main (String[] args) {
        String object1 = "{\"a\": {\"b\", {\"c\", {\"d\"}}}";
        String key1 = "a/b/c";
        String object2 = "{\"x\": {\"y\", {\"z\", {\"a\"}}}";
        String key2 = "x/y/z";
        nested sample = new nested();
            System.out.println("ex1: value: "+sample.getOddMenuOut(object1, key1));
            System.out.println("ex1: value: "+sample.getOddMenuOut(object2, key2));
    }

    public String getOddMenuOut(String jsonObject,String key) {
        String value = null;
        value = jsonObject.replaceAll("[^a-z]","");
        String[] stringarr = value.split("");
        for (String arrayValue : stringarr) {
            if (!arrayValue.contains(key)) {
                value = arrayValue;
            }
        }
        return value;
    }
}
