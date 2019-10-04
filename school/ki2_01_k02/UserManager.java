package ki2_01_k02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManager {
	
	private List<User> list = new ArrayList<User>();
	
	void add(User user) {
		list.add(user);
	}
	
	boolean remove(int no) {
		boolean ret = false;
		Iterator<User> iterator = list.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getNo() == no) {
				iterator.remove();
				ret = true;
			}
		}
		return ret;
	}
	
	User[] getUser() {
		User[] ret = new User[list.size()];
		ret = list.toArray(ret);
		return ret;
	}
	
	int save(String fileName) {
		int cnt = 0;
		try(BufferedWriter wr = new BufferedWriter(new FileWriter(fileName))) {
			Iterator<User> iterator = list.iterator();
			while(iterator.hasNext()) {
				User user = iterator.next();
				String data = user.getNo() + "," + user.getName();
				wr.write(data);
				wr.newLine();
				cnt++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
