package com.hyx.builder;
/**
 * 具体产品
 * @author sewef
 *
 */
public class Phone {
	private String screen;
	private String camera;
	private String fingerLock;
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getFingerLock() {
		return fingerLock;
	}
	public void setFingerLock(String fingerLock) {
		this.fingerLock = fingerLock;
	}
	@Override
	public String toString() {
		return "Phone [screen=" + screen + ", camera=" + camera + ", fingerLock=" + fingerLock + "]";
	}
}
