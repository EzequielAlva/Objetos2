package document_ref_3;

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
        return this.characterCount() / this.words.size();
    }
    // Resto del código que no importa
}
