class Solution {
   public static int[] twoSum(int[] numbers, int target) {
int[] ret = new int[2];
for (int i = 0; i < numbers.length; i++) {
for (int j = i + 1; j < numbers.length; j++) {
if (numbers[i] + numbers[j] == target) {
ret[0] = i ;
ret[1] = j;
}
}
}
return ret;
}
        
}
