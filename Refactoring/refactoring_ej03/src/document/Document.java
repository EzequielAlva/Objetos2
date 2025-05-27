package document;

import java.util.List;

public class Document {
    List<String> words;

    public long characterCount() {
        long count = this.words
                .stream()
                .mapToLong(w -> w.length())
                .sum();
        return count;
    }
    public long calculateAvg() {
        long avgLength = this.words
                .stream()
                .mapToLong(w -> w.length())
                .sum() / this.words.size();
        return avgLength;
    }
    // Resto del código que no importa
}
