package bee1091.resolution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			int K = scanner.nextInt();
			if (K == 0) {
				break;
			}
			int N = scanner.nextInt(), M = scanner.nextInt();
			
			for (int i = 0; i < K; i++) {
				String localization = "";
				int X = scanner.nextInt(), Y = scanner.nextInt();
				if (X == N || Y == M) {
					localization = "divisa";
					System.out.println(localization);
					scanner.nextLine();
					continue;
				}
				if (Y < M) {
					localization = "S";
				}
				if (Y > M) {
					localization = "N";
				}
				if (X < N) {
					localization += "O";
				}
				if (X > N) {
					localization += "E";
				}
				System.out.println(localization);
			}
		}
	}


}
