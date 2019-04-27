import java.util.*;




public class Main {
    public static void main(String[] args) {
        Set array = new HashSet();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array.add(random.nextInt(100));
        }
        List list1 = new ArrayList();
        ObjectBox objectBox = new ObjectBox(list1);
        objectBox.addOject("Object 1");
        objectBox.addOject("Object 2");
        objectBox.addOject("Object 3");

        System.out.println("TASK 01 ");
        System.out.println("Создали массив чисел: " + array);

        MathBox mathBox = new MathBox(array,list1,array);
        System.out.println("Сортируем массив:" + mathBox);

        System.out.println("Сумма всех чисел: "+ mathBox.summator());

        System.out.println("Данные после деления: " + mathBox.splitter(5));

        System.out.println("HashCode: " + mathBox.hashCode());

        System.out.println("equils:" + mathBox.equals(mathBox));

        System.out.println("Удалим число 10:" +mathBox.remove(10));

        System.out.println("TASK 02 ");

        System.out.println("Добавили обьекты: "+ objectBox.collection);

        System.out.println("Удалил лишнии обьект 'Object 2' = " + objectBox.deleteObject("Object 2"));

        objectBox.dump();


    }
}
