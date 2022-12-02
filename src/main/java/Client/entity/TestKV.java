package Client.entity;

public class TestKV {

    public static void main(String[] args) {
        KV k = new KV();
        k.key="hello";
        k.value="java";
        System.out.println(k.value+":"+k.key);
    }
}
