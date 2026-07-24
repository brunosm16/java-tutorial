package com.baeldung.domain;

public class User implements Cloneable {
    private String name;
    private int id;


    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.name, this.id);
    }

    @Override
    public User clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) throws Exception {
        User user1 = User.class.getConstructor(String.class, int.class).newInstance("Alice", 2);
        System.out.println("My user " + user1.toString());

        User clonedUser = user1.clone();
        System.out.println("My cloned user " + clonedUser.toString());
    }
}
