package document_ref_1;

import java.util.List;

public class Document {
    private List<String> words;

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
