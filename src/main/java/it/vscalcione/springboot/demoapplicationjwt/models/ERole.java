package it.vscalcione.springboot.demoapplicationjwt;

public enum ERole {

    ROLE_USER(0, "USER ROLE"),
    ROLE_MODERATOR(1, "MODERATOR ROLE"),
    ROLE_ADMIN(2, "ADMIN ROLE");

    private final Integer id;
    private final String description;

    ERole(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
};