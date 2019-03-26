package task2;

/**
 * 
 * @author Vaishnavi
 * 
 * The program calculates the cost of the house
 * depending on the material used and 
 * area of the house including automation.
 * 
 */

public class Construction {

	double area;
	boolean automation;
	int required_material;
	int standard=1200,above_standard=1500,high_standard=1800,high_standard_and_automated=2500;
	
	Construction(){} //Default constructor
	
	Construction(int required_material,double area){
		this.area=area;
		switch(required_material){
			case 1:
				this.required_material=standard;
				break;
			case 2:
				this.required_material=above_standard;
				break;
			case 3:
				this.required_material=high_standard;
				break;
			case 4:
				this.required_material=high_standard_and_automated;
				break;
		}
	}
	
	double getCost(){
		return required_material*area;
	}
}