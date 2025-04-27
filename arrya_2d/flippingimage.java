class Solution {
      public int[][] flipAndInvertImage(int[][] image) {
            int[][] reverse = new int[image.length][image[0].length];
            for (int i = 0; i < image.length; i++) {
                  for (int j = image[0].length - 1; j >= 0; j--) {
                        reverse[i][image[0].length - 1 - j] = image[i][j];
                  }
            }
            for (int i = 0; i < image.length; i++) {
                  for (int j = 0; j < image[0].length; j++) {
                        if (reverse[i][j] == 1) {
                              reverse[i][j] = 0;
                        } else if (reverse[i][j] == 0) {
                              reverse[i][j] = 1;
                        }
                  }
            }

            return reverse;
      }
}