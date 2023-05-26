// https://www.acmicpc.net/problem/25206
package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[] grades = new float[20];
        String[] subjectGradeLetters = new String[20];
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            grades[i] = Float.parseFloat(st.nextToken());
            subjectGradeLetters[i] = st.nextToken();
        }

        // 학점 총합
        float totalGrade = 0;
        // 학점 x 과목 평점의 합
        float sum = 0;
        for (int i = 0; i < 20; i++) {
            if (!subjectGradeLetters[i].equals("P")) {
                totalGrade += grades[i];
                sum += grades[i] * parseSubjectGrade(subjectGradeLetters[i]);
            }
        }

        System.out.print(sum / totalGrade);
    }

    public static float parseSubjectGrade(String subjectGradeLetter) {
        switch (subjectGradeLetter) {
            case "A+":
                return 4.5f;
            case "A0":
                return 4.0f;
            case "B+":
                return 3.5f;
            case "B0":
                return 3.0f;
            case "C+":
                return 2.5f;
            case "C0":
                return 2.0f;
            case "D+":
                return 1.5f;
            case "D0":
                return 1.0f;
            default:
                return 0.0f;
        }
    }
}
