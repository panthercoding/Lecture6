public class Words{
  public static void main(String[] args){

    //creates an array of strings/texts
    String songs[] = new String[4];

    songs[0] = "Future Nostalgia";
    songs[1] = "Watermelon Sugar";
    songs[2] = "Folklore";
    songs[3] = "Everything I Wanted";

    //printing them out 
    for (String song: songs){ //for each song in songs
      System.out.println(song); //print out song name
    }
    
    //printing them out by index (identical result)
    for (int i = 0; i < songs.length; i++){
      System.out.println(songs[i]); //print out ith song
    }

  }
}