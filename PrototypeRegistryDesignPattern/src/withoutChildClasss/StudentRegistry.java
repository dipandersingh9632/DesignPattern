package withoutChildClasss;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    /* so this class is used like I want a student type object of nov21Batch so that some of its values
    is already filled and Ii just need to change some attributes like we see in the Notebook example
     it will contain 2 methods
     1. register() :- so here we will have the student object and they get identified their batchName
      2. get():- so here in param we will receive the batchName and on that we return the withoutChildClasss.Student object*/
    Map<String, Student> map = new HashMap<>();

    public void register(String batchName, Student s) {map.put(batchName, s); }

    public Student get(String batchName) { return map.get(batchName); }
}
