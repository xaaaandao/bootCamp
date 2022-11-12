import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares
    }

    public static void classifyMatrix(int[] nums) {
        int j = 0;
        for (int l = 0; l < nums.length; l++){
            if (nums[l] % 2 == 0) {
                if (nums[l] != nums[j]) {
                    int aux = nums[l];
                    move(nums, j, l);
                    nums[j] = aux;
                    j++;
                }
            }
        }
        if (nums.length == nums[nums.length-1])
            troca(nums, nums.length-1, nums.length-2);
        for (var entry : nums) {
            System.out.println(entry);
        }
    }

    private static void move(int[] nums, int j, int l) {
        for (int k = l; k> j; k--){
            nums[k] = nums[k-1];
        }
    }

    private static void troca(int[] nums, int j, int i) {
        int aux = nums[i];
        nums[i] = nums[j];
        nums[j] = aux;
    }

    public static void QuadradoPerfeito(int n) {
        for(int i = n; i > 0; i--){
//            System.out.println(i);
            if ((i * i) % i == 0){
//                System.out.println(String.valueOf(i) + "->" + String.valueOf(res));
                System.out.println(String.valueOf(i) + "->" + String.valueOf(i * i));
            }
        }
    }
}