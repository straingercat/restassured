package GenericUtils;

import io.restassured.response.Response;

public class JsonUtility {
	public String getJsonData(Response resp,String jSonXpath) {
		String jsonData=resp.jsonPath().getString(jSonXpath);
		return jsonData;
	}

}
