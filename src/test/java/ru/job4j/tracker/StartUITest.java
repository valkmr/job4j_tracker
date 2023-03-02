package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "edited item"};
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("First");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "delete item"};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item[] expected = new Item[] {};
        assertThat(tracker.findAll()).isEqualTo(expected);
    }

    @Test
    public void whenDeleteOneOfTwo() {
        Tracker tracker = new Tracker();
        Item itemOne = new Item("First");
        tracker.add(itemOne);
        Item itemTwo = new Item("Second");
        tracker.add(itemTwo);
        String[] answers = {String.valueOf(itemTwo.getId()), "delete item"};
        StartUI.deleteItem(new StubInput(answers), tracker);
        assertThat(tracker.findAll()[0]).isEqualTo(itemOne);
    }
}