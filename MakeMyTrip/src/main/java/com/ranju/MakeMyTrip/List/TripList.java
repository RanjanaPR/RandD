package com.ranju.MakeMyTrip.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.ranju.MakeMyTrip.Pojo.FlightDetails;


public class TripList {
	 int accountCount=-1;
	 ArrayList<FlightDetails> FlightList = new ArrayList<FlightDetails>();
	
	 
	 public ArrayList<FlightDetails> addAccount(FlightDetails flight) {
         
		FlightList.add(flight);
		return FlightList;
  }

	    public ArrayList<FlightDetails> getAllFlightdetails() {
	           return FlightList;
	    }
	    
	public ArrayList<FlightDetails> updateOriginTimeandDestTime(int FlightNo,String originTime,String destinationTime) {
		for(FlightDetails flight:FlightList) {
			if(flight.getFlightNo()==FlightNo) {
				flight.setOriginTime(originTime);
				flight.setDepatureTime(destinationTime);
				
			}
			return FlightList;
		}
		throw new RuntimeException("account doesnt exist");
		
	}
	
	public ArrayList<FlightDetails> updateFlightDestination(int FlightNo, String destination) {
		for(FlightDetails flight:FlightList) {
			if(flight.getFlightNo()==FlightNo) {
				flight.setDestination(destination);
				
			}
			return FlightList;
		}
		throw new RuntimeException("account doesnt exist");
		
	}
	
	public ArrayList<FlightDetails> deleteFlight(int  FlightNo) {
		 FlightList.remove( FlightNo);
		return FlightList;
		
	}

	 public  ArrayList<FlightDetails> getFlightById(int FlightNo) {
		 for(FlightDetails flight:FlightList) {
				if(flight.getFlightNo()==FlightNo) {
					return FlightList;
				}
		 }
		throw new RuntimeException("");
	 }
	 
	 
	 
	 public ArrayList<FlightDetails> sortFlightByDuration(String originCity,String DestnCity){
         TripList.sort((trip1, trip2)->trip1.getduration()-trip2.getduration());
         return FlightList;
                }
  
  public ArrayList<FlightDetails> sortFlightByPrice(String source,String destination){
         FlightList.sort((trip1, trip2)->trip1.getCost()-trip2.getCost());
         ArrayList<FlightDetails> cheapflight=new ArrayList<FlightDetails>();
         
         for(FlightDetails fly : FlightList){
                if(fly.getOriginCity().equals(source) && fly.getDestnCity().equals(destination)){
                      cheapflight.add(fly);
                }
                }
         return cheapflight;
  }
  
         public ArrayList<FlightDetails> sortFlightByTime(String source,String destination){
                FlightList.sort((trip1, trip2)->trip1.getduration()-trip2.getduration());
                ArrayList<FlightDetails> flightTime=new ArrayList<FlightDetails>();
                
                for(FlightDetails fly : FlightList){
                      if(fly.getOriginCity().equals(source) && fly.getDestnCity().equals(destination)){
                             flightTime.add(fly);
                      }
                      }
                return flightTime;
}
         
  public ArrayList<FlightDetails> morningFlight(String source,String destination){
         ArrayList<FlightDetails> morningTime=new ArrayList<FlightDetails>();
         
         for(FlightDetails fly: FlightList){
                if(fly.getArrivalTime()<12 && fly.getDepartureTime()<12)
                      morningTime.add(fly);
         }
         return morningTime;
  }

	 
	/* public List<BankAccount> SortAccountsByName(){
		 Collections.sort(accountList,(BankAccount acc1, BankAccount acc2) -> acc1.getAccountHolderName().compare)
		 
		 
	 }*/
	 
	 public static void main(String[] args) {
		TripList fly=new TripList();
		 fly.addAccount(new FlightDetails("1:50:70", "08:01:07", "07:00:00", "AirIndia", "04:00:00", "Mangalore", 10000));
		 fly.addAccount(new FlightDetails("7:50:70", "05:01:07", "08:00:00", "Goair", "08:00:00", "Bangalore", 80000));
		 		 for(FlightDetails fly1:fly.getAllFlightdetails()) {
			 System.out.println(fly1);
			 
		 }
		 		 for(FlightDetails fly1:fly.updateOriginTimeandDestTime(1,"12:00:70","1:12:90")) {
					 System.out.println(fly1);
		 		 
	 }
		 		 for(FlightDetails fly1:fly.updateFlightDestination(1,"chennai")) {
					 System.out.println(fly1);
	 }
		 		for(FlightDetails fly1:fly.deleteFlight(1) ) {
					 System.out.println(fly1);
	 }
	                  
	 }
}
