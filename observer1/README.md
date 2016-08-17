### 문제 정의
## audio path 정하기
Android Device 는 다양한 Audio Output 을 지원한다.

일단 간단하게 아래와 같은 출력을 지원한다고 하자.

(우선순위별 정렬)
- (default)Built-in Speaker
- Headset
- Bluetooth
- USB audio
- HDMI

각 디바이스가 연결되었는지를 확인해서 Audio Output 을 선택하는 클래스를 만들어 볼꺼다



