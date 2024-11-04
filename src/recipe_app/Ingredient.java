/**
 * @author Rachel Schulz
 * @date Oct 29, 2024
 */
package recipe_app;

/**
 * 
 */
public class Ingredient {
	
	private String ingName;
	private double ingAmt;	
	private String ingUnit;	//Cup, Tbsp, Oz, etc
	private String ingPrep;	//ex: diced, chopped, sliced
	
	//Constructor ingredient name only
	/**
	 * @param ingredName
	 */
	public Ingredient(String ingredName) {
		this.ingName = ingredName;
		this.ingAmt = 1;	//default to 1 if not provided
		this.ingUnit = "";
		this.ingPrep = "";
	}
	
	/**
	 * @param ingName
	 * @param ingAmt
	 */
	public Ingredient(String ingName, double ingAmt) {
		this.ingName = ingName;
		this.ingAmt = ingAmt;
		this.ingUnit = "";
		this.ingPrep = "";
	}

	/**
	 * @param ingName
	 * @param ingAmt
	 * @param ingUnit
	 */
	public Ingredient(String ingName, double ingAmt, String ingUnit) {
		this.ingName = ingName;
		this.ingAmt = ingAmt;
		this.ingUnit = ingUnit;
		this.ingPrep = "";
	}

	/**
	 * @param ingName
	 * @param ingAmt
	 * @param ingUnit
	 * @param ingPrep
	 */
	public Ingredient(String ingName, double ingAmt, String ingUnit, String ingPrep) {
		this.ingName = ingName;
		this.ingAmt = ingAmt;
		this.ingUnit = ingUnit;
		this.ingPrep = ingPrep;
	}

	/**
	 * @return the ingredName
	 */
	public String getIngredName() {
		return ingName;
	}
	/**
	 * @param ingredName the ingredName to set
	 */
	public void setIngredName(String ingredName) {
		this.ingName = ingredName;
	}

	/**
	 * @return the ingAmt
	 */
	public double getIngAmt() {
		return ingAmt;
	}

	/**
	 * @param ingAmt the ingAmt to set
	 */
	public void setIngAmt(double ingAmt) {
		this.ingAmt = ingAmt;
	}

	/**
	 * @return the ingUnit
	 */
	public String getIngUnit() {
		return ingUnit;
	}

	/**
	 * @param ingUnit the ingUnit to set
	 */
	public void setIngUnit(String ingUnit) {
		this.ingUnit = ingUnit;
	}

	/**
	 * @return the ingPrep
	 */
	public String getIngPrep() {
		return ingPrep;
	}

	/**
	 * @param ingPrep the ingPrep to set
	 */
	public void setIngPrep(String ingPrep) {
		this.ingPrep = ingPrep;
	}

	@Override
	public String toString() {
		if (ingAmt%1 == 0) {
			int newAmt;
			newAmt = (int)ingAmt;
			if (ingUnit.isEmpty() && ingPrep.isEmpty()) {
				return newAmt + " " + ingName;
			}
			else if (ingPrep.isEmpty()) {
				return newAmt + " " + ingUnit + " " + ingName;
			}
			else {
				return newAmt + " " + ingUnit + " " + ingName + ", " + ingPrep;
			}
		}
		if (ingUnit.isEmpty() && ingPrep.isEmpty()) {
			return ingAmt + " " + ingName;
		}
		else if (ingPrep.isEmpty()) {
			return ingAmt + " " + ingUnit + " " + ingName;
		}
		else {
			return ingAmt + " " + ingUnit + " " + ingName + ", " + ingPrep;
		}
	}
	
	
	
}
