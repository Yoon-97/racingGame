package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String name;
    //private String race = "";
    private int distance;
    private int round;
    private final ArrayList<Car> car = new ArrayList<>();

    Car() {
    };

    Car(String name) {
        this.name = name;
    }

    public void makeCar() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        for (String name : Console.readLine().split(",")) {
            if (checkLength(name)) {
                car.add(new Car(name));
            }
        }
    }

    public void inputRound() {
        round = Integer.parseInt(Console.readLine());
        if (Character.isDigit(round)){
            throw new IllegalArgumentException("유효한 숫자를 입력해주세요");
        }
    }
    public void isMove() {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        if (randomNumber > 4) {
            distance++;
        }
    }
    private boolean checkLength (String name){
        if (name.length() > 5 || name.length() == 0) {
            throw new IllegalArgumentException("이름의 길이는 5글자 이하입니다");
        }
        return true;
    }
}