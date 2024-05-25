package com.example03;
public class Test {
    public static void main(String[] args) {
      Button b1 = new Button("ButtonA");
      b1.setClickable(new Clickable() {
          @Override
          public void click() {

              System.out.println(b1.getName());
          }
      });
      b1.getClickable().click();
      Button b2 = new Button("ButtonB");
      b2.setClickable(new Clickable() {
          @Override
          public void click() {

              System.out.println(b2.getName());
          }
      });
      b2.getClickable().click();

    }
}
