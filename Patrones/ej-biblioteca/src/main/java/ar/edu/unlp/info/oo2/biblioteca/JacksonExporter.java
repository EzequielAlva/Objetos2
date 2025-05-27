package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JacksonExporter extends VoorheesExporter {
    ObjectMapper objectMapper;

    public JacksonExporter() {
        objectMapper = new ObjectMapper();
    }

    @Override
    public String exportar(List<Socio> socios) {
        String data = "";
        try {
            data = this.objectMapper.writeValueAsString(socios);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
}
