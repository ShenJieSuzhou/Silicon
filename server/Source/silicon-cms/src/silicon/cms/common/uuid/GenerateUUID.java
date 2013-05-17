package silicon.cms.common.uuid;

import java.util.UUID;

public class GenerateUUID {
	
	public GenerateUUID()
	{
		
	}
	
	public static String getUUID()
	{
		UUID _uuid = UUID.randomUUID();
		String _temp = _uuid.toString();
		String _str = "a" + _temp.substring(1, 8) + _temp.subSequence(9, 13) + _temp.substring(14, 18) + 
				_temp.subSequence(19, 23) + _temp.subSequence(24, 36);
		System.out.println(_str);
		
		return _str;
	}

}
