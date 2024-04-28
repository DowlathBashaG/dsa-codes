package io.dowlath.equals_hashcode;

public class Country {
	private String countryName;
	private int population;
	public Country(){
		
	}
	public Country(String countryName, int population) {
		this.countryName = countryName;
		this.population = population;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	 public boolean equals(Object obj){
		   if(this == obj) return true;
		   if(obj==null) return false;
		   if(this.getClass()!=obj.getClass())return false;
		   Country other = (Country)obj;
		   if(this.population != other.population) return false;
		   if(this.countryName == null){
			   if(other.countryName !=null){
				   return false;
			   }
		   }
		   else if(!(this.countryName.equals(other.countryName))) return false;
		   return true;
	   }
	 public int hashCode(){
		 final int primeNumber = 31;
		 int result = 1;
		 result = result * primeNumber + population;
		 result = result * primeNumber + ((countryName==null)? 0 : countryName.hashCode());
		 return result;
	 }
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", population=" + population + "]";
	}	

}
