class MobileBatteryHasa {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Motto", "touchscreen");
		Battery battery = new Battery("Motto", 5, mobile);
		battery.batteryDeatail();

	}
}