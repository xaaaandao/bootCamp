import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class MainTest {


    @Test
    public void testOneClassifyMatrix() {
        int[] nums = {0};
        int[] res = {0};
        Main.classifyMatrix(nums);
        Assert.assertArrayEquals(nums, res);
    }

    @Test
    public void testTwoClassifyMatrix() {
        int[] nums = {3, 1, 2, 4};
        int[] res = {2, 4, 3, 1};
        Main.classifyMatrix(nums);
        Assert.assertArrayEquals(nums, res);
    }

    @Test
    public void testThreeClassifyMatrix() {
        int[] nums = {1, 3, 4, 5, 2};
        int[] res = {4, 2, 1, 5, 3};
        Main.classifyMatrix(nums);
        Assert.assertArrayEquals(nums, res);
    }

    @Test
    public void testOneQuadradoPerfeito() {
        int n = 12;
        Main.QuadradoPerfeito(n);
    }
}