package silicon.common.serialization;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public interface IJSONObjectionDeserializable {

	public abstract void fromJSONObject(JSONObject m_json) throws JSONException;
}
