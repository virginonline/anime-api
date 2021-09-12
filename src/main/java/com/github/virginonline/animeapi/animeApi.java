package com.github.virginonline.animeapi;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class animeApi {
    public String getImage(Endpoints endpoints) throws IOException {
        String json = IOUtils.toString(new URL("https://anime-api.hisoka17.repl.co/" + endpoints.toString()), StandardCharsets.UTF_8);
        return new JSONObject(json).getString("url");

    }
}
