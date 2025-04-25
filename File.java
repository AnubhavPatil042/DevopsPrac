public class File {

    static int areaRect(int length, int width){
        return length * width;
    }

    static int perimeterRect(int length, int width){
        return 2 * (length + width);  
    }

    public static void main(String[] args) {
        int l = 10;
        int w = 5;

        int area = areaRect(l, w);
        int per = perimeterRect(l, w);

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + per);
    }
}
