package com.itschool.session20.homework.ex7;

import java.util.Objects;

public class Entity {

    private final String name;
    private final int id;
    private final long timestamp;

    public Entity(String name, int id, long timestamp) {
        this.name = name;
        this.id = id;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", timestamp=" + timestamp +
                '}';
    }
}