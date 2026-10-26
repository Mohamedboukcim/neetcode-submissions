class Solution {
    public int maxArea(int[] heights) {
        int l = 1;
        int r = heights.length - 1;
        int area = r * Math.min(heights[0],heights[r]);
        int result = area;
        
        while(l<r){
            int width = r-l;
            int height = Math.min(heights[l], heights[r]);
            area = width * height;
            result = Math.max(result, area);

            if (heights[l] < heights[r]) l++;
            else r--;
        }
        return result;
    }
}
