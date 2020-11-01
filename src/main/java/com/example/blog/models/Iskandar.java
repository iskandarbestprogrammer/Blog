package com.example.blog.models;

public class Iskandar implements IskandarRepo {
    private int id;
    private String name;

    public Iskandar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Post create() {
        return new Post();
    }
}
