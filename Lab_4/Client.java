interface Function {
    int evaluate(int x);
}

class Half implements Function {
    public int evaluate(int x) {
        return x / 2;
    }
}

class Client {

    static int[] halfArray(int[] arr) {
        int[] result = new int[arr.length];
        Function f = new Half();

        for (int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {10, 25, 8, 7};
        int[] ans = halfArray(data);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
