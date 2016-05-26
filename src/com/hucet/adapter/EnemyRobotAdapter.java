package com.hucet.adapter;

import com.hucet.adaptee.EnemyRobot;
import com.hucet.target.EnemyAttacker;

/**
 * Created by taesu- on 2016-05-26.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    // Adapter Pattern
    // 어댑터를 이용하면 인터페이스의 호환성 문제 떄문에 같이 쓸 수 없는 클래스를 연결해 쓸 수 있다.
    // EnemyRobot(Adaptee) 를 지원할 수 있도록 EnemyRobotAdapter을 만들어 사용.

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
