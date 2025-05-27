package document_ref_2;

import java.util.List;

public class Document {
    private List<String> words;

    public long characterCount() {
        return this.words
                .stream()
                .mapToLong(w -> w.length())
                .sum();
    }
    public long calculateAvg() {
        return this.words
                .stream()
                .mapToLong(w -> w.length())
                .sum() / this.words.size();
    }
    // Resto del código que no importa
}
