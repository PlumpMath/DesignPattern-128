package proxy;

import proxy.proxy.CommandExecutorProxy;
import proxy.subject.CommandExecutor;

/**
 * Created by taesu- on 2016-06-29.
 */
public class Main {
    // 패턴 요약
    // 특정 객체에 접근을 조절하기 위하여 대리자(Proxy)를 세움
    // 필요할 때만 비싼 대가의 기능을 접근하도록 프록시를 사이에 둠

    // Remote Proxy : 다른 주소에 존재, 다른 공간에 존재하는 객체에 대한 로컬 표현
    // Virtual Proxy :  복잡한 객체를 필요할 때 생성 (이미지)
    // Protection Proxy : 일련의 네트워크 자원에 대한 접근을 제어함으로써 주 객체를 '나쁜' 클라이언트들로부터 보호해준다.
    // 기업용 방화벽 시스템에서 자주 쓰인다. 원래 객체에 대한 엑세스 권한을 제한
    // Smart Reference Proxy : 객체접근 시 추가적인 액션 수행. 참조횟수를
    // 관리하거나 객체를 수정할 수 없도록 locking

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Yeon", "wrong_pwd");

        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message:: " + e.getMessage());
        }
    }
}
