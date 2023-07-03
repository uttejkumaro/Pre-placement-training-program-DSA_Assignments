public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println("Output: " + result);
       System.out.print("nums = [");
for (int i = 0; i < nums.length; i++) {
    if (i < result) {
        System.out.print(nums[i]);
    } else {
        System.out.print("_");
    }
    if (i != nums.length - 1) {
        System.out.print(", ");
    }
}
System.out.println("]");

}
}
