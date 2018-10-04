package com.ranju.MakeMyTrip.Pojo;

import java.util.TimeZone;

public class FlightDetails {
			/**
	 * @param flightNo
	 * @param arrivalTime
	 * @param depatureTime
	 * @param routeTime
	 * @param flightName
	 * @param origin
	 * @param destination
	 * @param cost
	 */
	int FlightNo;
	 String arrivalTime,depatureTime,routeTime;
	 String flightName,originTime,destination;
	 int cost;
	 static int autoFlightNoGen;

	public FlightDetails(String arrivalTime, String depatureTime, String routeTime, String flightName,
			String originTime, String destination, int cost) {
		super();
		FlightNo=++autoFlightNoGen;
		this.arrivalTime = arrivalTime;
		this.depatureTime = depatureTime;
		this.routeTime = routeTime;
		this.flightName = flightName;
		this.originTime = originTime;
		this.destination = destination;
		this.cost = cost;
	}
		@Override
	public String toString() {
		return "FlightDetails [FlightNo=" + FlightNo + ", arrivalTime=" + arrivalTime + ", depatureTime=" + depatureTime
				+ ", routeTime=" + routeTime + ", flightName=" + flightName + ", originTime=" + originTime
				+ ", destination=" + destination + ", cost=" + cost + "]";
	}
		public FlightDetails() {
			FlightNo=++autoFlightNoGen;
			 arrivalTime="00:00:00";
			 depatureTime="00:00:00";
			 routeTime="00:00:00";
			 flightName="Unknown";
			 originTime="Unknown";
			 destination="Unknown";
			 cost=0;
		}
		public int getFlightNo() {
			return FlightNo;
		}
		
		public String getArrivalTime() {
			return arrivalTime;
		}
		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}
		public String getDepatureTime() {
			return depatureTime;
		}
		public void setDepatureTime(String depatureTime) {
			this.depatureTime = depatureTime;
		}
		public String getRouteTime() {
			return routeTime;
		}
		public void setRouteTime(String routeTime) {
			this.routeTime = routeTime;
		}
		public String getFlightName() {
			return flightName;
		}
		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}
		public String getOriginTime() {
			return originTime;
		}
		public void setOriginTime(String origin) {
			this.originTime = origin;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public static int getAutoFlightNoGen() {
			return autoFlightNoGen;
		}
		public static void setAutoFlightNoGen(int autoFlightNoGen) {
			FlightDetails.autoFlightNoGen = autoFlightNoGen;
		}
	
		 
}
