package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static int distance;

    public static void isMove() {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        if (randomNumber > 4) {
            distance++;
        }
    }
}
