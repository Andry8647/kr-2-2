package Task;

public enum Type {
     WORK("WORK"),
     PERSON("PERSON");
     private final String type;

     Type(String type) {
          this.type = type;
     }

     public String getType() {
          return type;
     }
}
