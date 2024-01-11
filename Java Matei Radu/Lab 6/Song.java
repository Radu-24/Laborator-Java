import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Song implements Comparable<Song> {
    private String title;
    private String publishedAt;
    private int duration;
    private int viewCount;

    // Constructor
    public Song() {
    }

    public Song(String title, String publishedAt, int duration, int viewCount) {
        this.title = title;
        this.publishedAt = publishedAt;
        this.duration = duration;
        this.viewCount = viewCount;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    // Comparable interface
    @Override
    public int compareTo(Song other) {
        // Ordonare după viewCount
        return Integer.compare(this.viewCount, other.viewCount);
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Citire date din fișierul CSV
            String filePath = "C:\\Users\\Radu\\Downloads\\archive (2)\\taylor_swift_videos.csv";
            List<Song> songs = readSongsFromCSV(filePath);

            // Sortare după titlu folosind Comparable (ordine naturală)
            Collections.sort(songs);
            System.out.println("Sortat după titlu (ordine naturală):");
            for (Song song : songs) {
                System.out.println(song.getTitle());
            }

            // Sortare după durată folosind Comparator
            Comparator<Song> durationComparator = Comparator.comparingInt(Song::getDuration);
            Collections.sort(songs, durationComparator);
            System.out.println("\nSortat după durată folosind Comparator:");
            for (Song song : songs) {
                System.out.println(song.getTitle() + " - " + song.getDuration());
            }

            // Sortare după viewCount folosind Comparable
            Collections.sort(songs);
            System.out.println("\nSortat după viewCount folosind Comparable:");
            for (Song song : songs) {
                System.out.println(song.getTitle() + " - " + song.getViewCount());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Metoda pentru citirea datelor din fișierul CSV
    public static List<Song> readSongsFromCSV(String filePath) {
        List<Song> songs = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length >= 4) { // Verifică dacă există cel puțin 4 elemente în array
                    String title = data[0];
                    String publishedAt = data[1];
                    int duration = Integer.parseInt(data[2]);
                    int viewCount = Integer.parseInt(data[3]);
                    songs.add(new Song(title, publishedAt, duration, viewCount));
                } else {
                    System.err.println("Linie CSV invalidă: " + line);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return songs;
    }
}
