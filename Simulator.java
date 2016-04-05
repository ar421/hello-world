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
  @override
  public Class getClass() {
    if(this instanceof x86) {
      return x86.getClassName();
    } else if (this instanceof ARM) {
      return ARM.getClassName();
    }
  }
}
