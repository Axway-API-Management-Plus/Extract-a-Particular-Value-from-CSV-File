import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.vordel.trace.Trace;

def invoke(msg)
{
    def id=msg.get("params.query.id");
    #Location of CSV file
    String csvFile ="C:\\Axway - 7.5.3\\input.csv";
    BufferedReader br = null;
    String line = "";
    #Separator for CSV file
    String csvSplitBy = ",";

    try 
	  {
                   br = new BufferedReader(new FileReader(csvFile));
		   while ((line = br.readLine()) != null) 
		   {
			String[] data = line.split(csvSplitBy);

			if (data[0]==id)
			{
				msg.put("Csv_Id",data[0]);
				msg.put("City",data[1]);
				msg.put("Country",data[2]);
			}
		   }
	   } catch (FileNotFoundException ex) 
	   {
	    StringWriter errors = new StringWriter();
	    ex.printStackTrace(new PrintWriter(errors));
	    #Sets the error message in ErrorMessage attribute 
	    msg.put("ErrorMessage", errors.toString());
	    return false;
           }  
return true;
}