/**
 * 
 */
package pattern.memento;

// 现在的感觉就是设计模式并不是万能的，仍然可以通过设计数据的结构来解决
// 所以说设计模式只是人造结构的不完美的因素的体现，并不是什么特别的东西
// 也是人的不完美的因素的体现，是不充分的时间的体现。都是一个意思
// 不过训练一下或者说了解一下，就把这些因素在这些简短的代码中体现出来也是一种效率
// 另外，列表可以作为一种线性历史
// 迪米特原则：类之间的对话越少越好。简单的原则可以解释你的很多自己总结的话（都是时间）。所以别人的思考也是一种财富。一定要明白。
// 把电脑用烂是一种荣誉

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:45:52 PM
 */
public class MementoPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");

		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
	}

}
