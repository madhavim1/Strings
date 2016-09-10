/* Write a program to implement hashCode() and equals() methods. */

package com.training.Strings;

public class MobilePhone {
	private String color;
	private String model;

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			MobilePhone mobile = (MobilePhone) object;
			if (this.color == mobile.getColor()
					&& this.model == mobile.getModel()) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.color.hashCode();
		hash = 7 * hash + this.model.hashCode();
		return hash;
	}

	public static void main(String args[]) {
		MobilePhone Apple = new MobilePhone("white", "iphone");
		MobilePhone Android = new MobilePhone("black", "nexus");
		MobilePhone Android2= new MobilePhone("black", "nexus");
		System.out.println("Apple and Android: "
				+ Apple.equals(Android));
		System.out.println("Android and Android2: "
				+ Android.equals(Android2));

		System.out.println("Apple hashCode: " + Apple.hashCode());
		System.out.println("Android hashCode: " + Android.hashCode());
		System.out.println("Android2 hashCode: "
				+ Android2.hashCode());
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public MobilePhone(String color, String model) {
		this.color = color;
		this.model = model;
	}
}