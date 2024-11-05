package io.codeexperience.appwiremock.testutils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Instant;

//[Notes] Classe para serializar e deserializar Instant - Evitar exceção de parse de data em contexto de teste
public class InstantTypeAdapter implements JsonSerializer<Instant>, JsonDeserializer<Instant> {
    @Override
    public JsonElement serialize(Instant src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.toString());
    }

    @Override
    public Instant deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return Instant.parse(json.getAsString());
    }
}
