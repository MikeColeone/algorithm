
```java
//在map中获取到对应键值并实现自增
class test{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("count", 1);
        map.put("count", map.getOrDefault("count", 0) + 1);
        // 打印自增后的结果
        // 使用 computeIfPresent 自增
        map.computeIfPresent("count", (k, v) -> v + 1);
        map.merge("c",1,(old,new)->old+new);
    }
}
       

```