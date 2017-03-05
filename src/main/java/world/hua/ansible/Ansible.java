package world.hua.ansible;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ansible {
	
	public static void main(String[] args) {
		try {
			Process pro = Runtime.getRuntime().exec("sudo ansible-playbook /etc/ansible/test.yml");
			pro.waitFor();
			InputStream is = pro.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String result = null;
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}
			
			
			Process pro1 = Runtime.getRuntime().exec("cat /etc/ansible/test.txt");
			pro1.waitFor();
			InputStream is1 = pro1.getInputStream();
			BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
			String result1 = null;
			while((result1 = br1.readLine()) != null) {
				System.out.println(result1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
