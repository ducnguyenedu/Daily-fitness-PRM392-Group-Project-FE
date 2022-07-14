package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


public class Food {
    @DatabaseField(id = true)
    int id;
    @DatabaseField
    private String title;
    @DatabaseField
    private String description;

    @DatabaseField
    private int img;

    public Food() {

    }

    public Food(int id,String title, String description, int img) {
       this.id = id;
        this.title = title;
        this.description = description;
        this.img = img;
    }

    public String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getImg() {
        return this.img;
    }

    public int update(Repo repo) throws Exception {
        if (repo.getFood().getByID(id) == null) {
            return repo.getFood().create(this);
        } else {
            return repo.getFood().update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.getFood().delete(this);
    }
}