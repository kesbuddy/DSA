import static java.lang.System.out;
import java.util.Map;
import java.util.LinkedHashMap;
public class wipro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> lhm = new LinkedHashMap<String,String>();
		lhm.put("Platform","Windows" );
		lhm.put("Language", "Java");
		lhm.put("Version", "1.5");
		out.format("%s", lhm);

	}

}
