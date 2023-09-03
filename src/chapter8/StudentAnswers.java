package chapter8;

public class StudentAnswers {

    public static void main(String[] args) {
        char[][] answer = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'C', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        //Keys to the questions
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int grade = 0;

        printTestScores(answer, key);
    }

    public static int[] TestScore(char[][] student, char[] key){

        int[] score = new int[8];

        for(int i = 0; i < student.length; i++){
            for(int j = 0; j < student[i].length; j++) {
                if (student[i][j] == key[j]) {
                    score[i]++;
                }
            }
        }
        return score;
    }

    public static void printTestScores(char[][] answer, char[] key){
        for(int i = 0; i < answer.length; i++){
            System.out.println("Student " + (i+1) + " answered " + TestScore(answer, key)[i] + " questions correctly");
        }
    }

}
