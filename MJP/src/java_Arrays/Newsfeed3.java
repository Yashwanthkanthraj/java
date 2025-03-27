
package java_Arrays;

import java.util.Arrays;

public class Newsfeed3 {

        public static void main(String[] args) {

            Newsfeed3 samplefeed = new Newsfeed3();
        samplefeed.setFavoriteArticle(2, "Actors");
        samplefeed.setFavoriteArticle(0, "Actress");
        samplefeed.setFavoriteArticle(1, "Movies");

        System.out.println(Arrays.toString(samplefeed.topics));        
        System.out.println(Arrays.toString(samplefeed.favoriteArticles));

        }
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        int[] views = {0, 0, 0, 0};
        
        String[] favoriteArticles;
        
        public Newsfeed3(){
          // Initialize favoriteArticles here:
         favoriteArticles = new String[10];
       
        }
        public void setFavoriteArticle(int favoriteIndex, String newArticle){
          // Add newArticle to favoriteArt
          favoriteArticles[favoriteIndex] = newArticle;
        }
      }
