//https://school.programmers.co.kr/learn/courses/30/lessons/118666

package LV_1;

class Test_MBTI{
    public static void main(String args[]){
        System.out.println(new Solution_Test_MBTI().solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }
}

class Solution_Test_MBTI {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] num = new int[]{0, 0, 0, 0};
        int[] rcja = new int[]{0, 0, 0, 0};
        char[] RCJA = new char[]{'R', 'C', 'J', 'A'};
        char[] TFMN = new char[]{'T', 'F', 'M', 'N'};
        for(int i = 0; i < survey.length; i++){
            for(int ii = 0; ii < 4; ii++){
                if(survey[i].charAt(0) == RCJA[ii]){
                    rcja[ii] += 8 - choices[i];
                    num[ii] += 1;
                    break;
                }
                else if(survey[i].charAt(0) == TFMN[ii]){
                    rcja[ii] += choices[i];
                    num[ii] += 1;
                    break;
                }
            }
        }
        for(int i = 0; i < 4; i++){
            if(num[i] == 0 || rcja[i] / num[i] >= 4)   answer += RCJA[i];
            else                        answer += TFMN[i];
        }
        return answer;
    }
}