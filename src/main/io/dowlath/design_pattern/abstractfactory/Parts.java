package io.dowlath.design_pattern.abstractfactory;

public class Parts {
    private String specification;
    public Parts(String specification){
    	this.specification = specification;
    }
    public String getSpecification(){
    	return specification;
    }
}
