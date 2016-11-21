package t2;

public class BubbleSort implements Interface {
    
    private int[] a; // Ссылка на массив a
    private int nElems; // Количество элементов данных
    
    public BubbleSort(int max) // Конструктор
    {
        a = new int[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }
    
    public void insert(int value) // Вставка элемента в массив
    {
            a[nElems] = value;
            nElems++;
    }
    
    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Для каждого элемента
            System.out.print(a[j]+" "); // Вывод
            System.out.println("");
    }

    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = (int) temp;
    }
    
    @Override
    public void sort() {
        int out, in;
        for(out=nElems-1; out>1; out--) // Внешний цикл (обратный)
            for(in=0; in<out; in++) // Внутренний цикл (прямой)
                if( a[in] > a[in+1] ) // Порядок нарушен?
                    swap(in, in+1); // Поменять местами
    }

}
