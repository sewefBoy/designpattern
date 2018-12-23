package com.hyx.observer;
/**
 * Observer模式是行为模式之一，它的作用是当
	一个对象的状态发生变化时，能够自动通知其他
	关联对象，自动刷新对象状态。
	Observer模式提供给关联对象一种同步通信的
	手段，使某个对象与依赖它的其他对象之间保持
	状态同步
	
	Subject（被观察者）   被观察的对象。当需要被观察的状态发生变化时，需要通知队列中所有观察者对象。Subject需要维持（添加，删除，通知）一个观察者对象的队列列表。
	ConcreteSubject    被观察者的具体实现。包含一些基本的属性状态及其他操作。
	Observer（观察者）    接口或抽象类。当Subject的状态发生变化时，Observer对象将通过一个callback函数得到通知。
	ConcreteObserver    观察者的具体实现。得到通知后将完成一些具体的业务逻辑处理。
 */
import java.util.Observable;

public class HuaWeiFactory extends Observable{

	public void create() {
		System.out.println("华为发布新手机");
		this.setChanged();
		this.notifyObservers();
	}

}
