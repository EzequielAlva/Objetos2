package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.stream.Collectors;

public class JSONSimpleExporter extends VoorheesExporter {
    private JSONArray jsonArray;

    public JSONSimpleExporter() {
        jsonArray = new JSONArray();
    }

    private JSONObject exportar(Socio socio) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", socio.getNombre());
        jsonObject.put("email", socio.getEmail());
        jsonObject.put("legajo", socio.getLegajo());
        return jsonObject;
    }

    @Override
    public String exportar(List<Socio> socios) {
        socios.stream().forEach(socio -> this.jsonArray.add(this.exportar(socio)));
        return this.jsonArray.toJSONString();
    }
}
