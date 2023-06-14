import java.util.Scanner;

public class Playlist {
    public static void printPlaylist(SongNode songs) {
        SongNode song = songs.getNext();
        while (song != null) {
            song.printSongInfo();
            System.out.println();
            song = song.getNext();
        }
    }

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        SongNode headNode;
        SongNode currNode;
        SongNode lastNode;

        String songTitle;
        int songLength;
        String songArtist;

        headNode = new SongNode();
        lastNode = headNode;

        songTitle = scnr.nextLine();
        while (!songTitle.equals("-1")) {
            songLength = scnr.nextInt();
            scnr.nextLine();
            songArtist = scnr.nextLine();

            currNode = new SongNode(songTitle, songLength, songArtist);
            lastNode.insertAfter(currNode);
            lastNode = currNode;
        }

        System.out.println("LIST OF SONGS");
        System.out.println("-------------");
        printPlaylist(headNode);
    }
}