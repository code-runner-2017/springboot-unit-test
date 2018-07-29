package com.example.demo;

public class SomeBusinessImpl {
	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

	public int findTheGreatestFromAllData() {
		return new MyMath().sum(dataService.retrieveAllData());
	}
}