package afternoon.lang.math;

import java.util.Random;

public class LottoGenerator {

    static int[] lottoNumbers = new int[6];

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        lottoGenerator.generate();
        lottoGenerator.printLottoNumbers();
    }

    public void printLottoNumbers() {
        for(Integer number : lottoNumbers) {
            System.out.println(number);
        }
    }

    public void generate() {
        Random rand = new Random();

        int index = 0;
        while(lottoNumbers[5]==0) {
            int randomNumber = rand.nextInt(45) + 1;
            if(duplicateNumberCheck(lottoNumbers,randomNumber)) {
                lottoNumbers[index] = randomNumber;
                index++;
            }
        }
    }

    public boolean duplicateNumberCheck(int[] lottoNumbers, int randNum){
        for (int n : lottoNumbers) {
            if (n == randNum) {
                return false;
            }
        }
        return true;
    }
}
