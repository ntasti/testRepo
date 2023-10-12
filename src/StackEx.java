


import java.util.Stack;
        import java.util.*;
        import java.util.Arrays;
public class StackEx {
    Scanner scanner = new Scanner(System.in);
    public int size;
    public Stack<Integer> stack11;
    public Stack<Integer> stack22;

    public StackEx(){
        System.out.println("Введите кол-во элементов в стеках ");
        size = scanner.nextInt();

        System.out.println("Введите элементы первого стека");
        stack11= stak(size);
        System.out.println(stack11);

        System.out.println("Введите элементы для второго стека");
        stack22= stak(size);
        System.out.println(stack22);

        System.out.println("Первый стек до смены "+stack11);
        System.out.println("Второй стек до смены "+stack22);

    }
    //    заполнение стека с клавиатуры
    public static Stack<Integer> stak(int a) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackN = new Stack<>();

        for (int i = 0; i < a; i++) {
            int element = scanner.nextInt();
            stackN.push(element);
        }
        return stackN;
    }

    //метод в котором данные стеков меняются местами через ArrayList
    public  String perenos(Stack<Integer> stack11,Stack<Integer> stack22,int size) {

        //создание двух динамических массивов в которые будут переноситься данные со стеков
        //с использованием колекции List
        ArrayList<Integer> save1 = new ArrayList<>();//для первого стека
        ArrayList<Integer> save2 = new ArrayList<>();//для второго

        //Перенос данных со стеков в массивы
        for (int i = 0; i < size; i++) {
            save2.add(stack22.pop());
            save1.add(stack11.pop());
        }
        //переворачиваю содержимое массивов,чтоб порядок чисел стека не изменился в последующем
        Collections.reverse(save1);
        Collections.reverse(save2);
        //перенос данных из массива в стек
        for (int i = 0; i < size; i++) {
            stack11.push(save2.get(i));
            stack22.push(save1.get(i));
        }
        String res = "Стек 1 после смены информации: " + stack11 + "\n" + "Стек 2 после смены информаци: " + stack22;
        return res;
    }

    //метод через который выводятся данные
    public String getValues(){
        String data=perenos(stack11,stack22,size);
        return data;
    }

}












