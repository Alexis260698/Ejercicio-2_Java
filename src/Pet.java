public interface Pet {
    String name="";

    default void getName(){}
   default void setName(String name){}
    default void play(){}

}
