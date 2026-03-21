
class containerwithmostwater {

    public static int maxArea(int[] height) {
        int maxwater = 0;
        int n = height.length;
        int i = 0;
        int end = n - 1;

        while (i < end) {
            int w = end - i;
            int h = Math.min(height[i], height[end]);
            int area = w * h;
            maxwater = Math.max(maxwater, area);

            if (height[i] > height[end]) {
                end--;
            } else {
                i++;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("Maximum water: " + result);
    }
}