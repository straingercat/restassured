package GenericUtils;

import io.restassured.response.Response;

public class RestAssuredUtility {
	/**
	 * this class contains generic methods pertaining to rest-assured
	 * @author punith raj.c
	 */
	public class RestAssuredUtilites{
		/**
		 * This method will return the data inside json path
		 * @param res
		 * @param jsonpath
		 * @return
		 */
		public String getJsonData(Response res, String jsonPath)
		{
			String value=res.jsonPath().get(jsonPath);
			return value;
		}
	} 
	

}
