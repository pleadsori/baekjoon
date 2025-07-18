import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		//스캐너로 성적 받기

        double totalScore = 0.0;				// 총 점수 합계
        double totalCredit = 0.0;				// 총 학점 크레딧

        for (int i = 0; i < 20; i++) {			// 20개의 과목 받기
            String[] line = sc.nextLine().split(" ");
            String subject = line[0];			// 과목 이름
            double credit = Double.parseDouble(line[1]);
            String grade = line[2];

            if (grade.equals("P")) continue;

            double score = 0.0;

            switch (grade) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
                case "F":  score = 0.0; break;
            }

            totalScore += credit * score;
            totalCredit += credit;
        }

        System.out.printf("%.6f\n", totalScore / totalCredit);
    }
}
