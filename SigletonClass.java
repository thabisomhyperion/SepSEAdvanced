
/**
*Sigleton Design Pattern
* 1. Change the constructo to private
*2. Create a static object as an attributes
*3. Create a static method to return the onlyObject
*/
class SigletonClass{
	private String data;

	//Static object created
	private static SigletonClass onlyObject = null;

	//constructor
	//make constructor private
	private SigletonClass(){
		//intentionally left empty
	}

	//static method to return the static object
	public static SigletonClass getOnlyObject(){
		if (onlyObject == null){
			onlyObject = new SigletonClass();
		}

		return onlyObject;
	}
	public void setData(String d){
		data = d;
	}
	public String getData(){
		return data;
	}
}