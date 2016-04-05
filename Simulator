public abstract class Simulator() {
  public static Simulator createSimulator(Type type){
    return type.getClass().newInstance();
  }
}
class x86 extends Simulator() {
  x86() {
    //implementation
  }
}
class ARM extends Simulator() {
  ARM() {
    //implementation
  }
}
enum Type {
  Type(x86,ARM);
}
