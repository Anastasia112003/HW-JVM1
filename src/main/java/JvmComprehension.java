
public class JvmComprehension {          //Класс JvmComprehension обрабатывается системой классов ClassLoader'ов,
                                         // загружается и после
                                         //перемещается в область памяти MetaSpace для созранения инфоррмации о классе.

    public static void main(String[] args) {
        int i = 1;                      // 1 в стеке создаётся фрейм main, в нём сохраняется переменная i со значением 1
        Object o = new Object();        // 2 в области памяти хип созддаётся объект Object,
                                        // в стеке в фрейме main создаётся переменная о,с сылкой на объект Object в хипе
        Integer ii = 2;                 // 3 в хип создаётся объект Integer со значением 2,
                                        // в стеке в фрейме main создаётся переменная ii с ссылкой на объект Integer
        printAll(o, i, ii);             // 4 в стеке создаётся новый фрейм printAll , в который происходит запись переменных
                                        //o, i, ii
        System.out.println("finished"); // 7 в стеке создаётся фрейм println, в хипе создаётся объект String со значением
                                        //"finished", куда передаётся ссылка на объект String
                                        // Сборка мусора работает на протяжении всего времени работы программы
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 в хип создаётся объект Integer со значением 700, в стеке в фрейме printAll
                                                    // создаётся переменная uselessVar с ссылкой на этот объект в куче
        System.out.println(o.toString() + i + ii);  // 6 создаётся новый фрейм println в стеке, в который передаются ссылки на
                                                    // o, i, ii
                                                    //в стеке создаётся фрейм toString
    }
}

