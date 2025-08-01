class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Avoid infinite loop if starting pixel already has the desired color
        if (image[sr][sc] == color) {
            return image;
        }

        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color, int cur) {
        //handling edge case, index out of bound
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        // if the current pixel is not equal to the next pixel 
        if (image[sr][sc] != cur) {
            return;
        }
        //change the color to desired color
        image[sr][sc] = color;
        // recursion, do the same thing for the element to the N,W,S,E
        fill(image, sr - 1, sc, color, cur);
        fill(image, sr + 1, sc, color, cur);
        fill(image, sr, sc - 1, color, cur);
        fill(image, sr, sc + 1, color, cur);
    }
}
