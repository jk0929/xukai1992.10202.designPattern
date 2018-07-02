package behavioralPattern.interpreterPattern;


/**
 *解释器模式（Interpreter）
 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄
 * 解释器模式是一种用得比较少的行为型模式.提供了一种解释语言的语法或表达式的方式.
 * 通过定义一个表达式接口,解释一个特定的上下文.
 *
 * 使用场景
 * 某个简单的语言需要解释执行并且可以将该语言中的语句表示为一个抽象语法树的时候.
 * 在某些特定的领域出现不断重复的问题时,可以将该领域的问题转化为一种语法规则下的语句,并构建解释器来解释该语句.
 */
public class Test {

    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
