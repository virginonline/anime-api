package com.github.virginonline.animeapi;

public enum Endpoints {
    HUG("img/hug"),
    KISS("img/kiss"),
    SLAP("img/slap"),
    WINK("img/wink"),
    PAT("img/pat"),
    KILL("img/kill"),
    CUDDLE("img/cuddle"),
    WAIFU("img/waifu"),
    BOOBS("/img/nsfw/boobs"),
    HENTAI("/img/nsfw/hentai"),
    LESBIAN("/img/nsfw/lesbian");

    private final String endpoints;
    Endpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public String toString() {
        return endpoints;
    }
}
