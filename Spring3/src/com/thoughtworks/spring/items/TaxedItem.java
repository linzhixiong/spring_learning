package com.thoughtworks.spring.items;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/26/11
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaxedItem extends AbstractItem {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getName() {
        return title;
    }
}
