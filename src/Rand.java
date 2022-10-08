public class Rand {
    //Создание массива в диапозоне от 0 до 400 с помощью Math.random()
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * 400); //[0,1] * 400. 0*400 = 0, 1*400=400;
            System.out.println("arr[" + i + "]=" + arr[i]);
        }

    }
}
