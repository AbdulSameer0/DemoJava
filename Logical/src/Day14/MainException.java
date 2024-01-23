package Day14;

public class MainException {
        public static void main(String[] args) {
			try {
				int age = 14;
				if(age<=18) {
					throw new AgeOutOfException();
				}else {
					System.out.println("are you eligble for vote");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
}
