package com.hucet.adapter;

import com.hucet.adaptee.EnemyRobot;
import com.hucet.target.EnemyAttacker;

/**
 * Created by taesu- on 2016-05-26.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    // Adapter Pattern
    // 수정해야 할 코드의 양이 대폭 감소한다.
    // 어댑터를 이용하면 인터페이스의 호환성 문제 떄문에 같이 쓸 수 없는 클래스를 연결해 쓸 수 있다.
    // EnemyRobot(Adaptee) 를 지원할 수 있도록 EnemyRobotAdapter을 만들어 사용.

    // Object or Class Adapter 형태가 있음.
    // Object : Passive 형태로 전달된 Adaptee 객체의 함수를 호출 구현
    // Class : Adaptee 를 상속을 통하여 구현

    // 장점 : 기존 설계의 변경 없이 새로운 모델 함께 설계될 수 있다.
    // 단점 :

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        theRobot.reactToHuman(driver);
    }

}
