
public class trial {

	 public static int mostWordsFound(String[] sentences) {
	        int count = sentences[0].length();
	        int temp = 0;
	        for(int i=1;i<sentences.length;i++){
	            temp = sentences[i].length();
	            if(temp>count){
	                count = temp;
	            }
	        }
	        return count;
	    }
	
	public static void main(String[] args) {
		String sentences[] = {"this is good","this is very bad","hehe so","good for u my brothaman"};
		int lenght = mostWordsFound(sentences);
		System.out.println(lenght);

	}

}
