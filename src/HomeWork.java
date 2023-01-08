public class HomeWork {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 44, 66, 3};
        int sumOfNumbers = 1 + 44 + 66 + 3;
        System.out.println(sumOfNumbers);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        int[] altArray = new int[]{43,44,77,3,53,8,7,30};
        for(int value : altArray){
            if(value > 30){
                System.out.println(value);
            }

        }
        String cuvant = "Soarele straluceste.Si ne incalzeste.Totul e frumos";
        String[] split = cuvant.split("[.]");
        for(String name : split){
            System.out.println(name);
        }
    }
}

