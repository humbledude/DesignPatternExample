### 문제 정의
## audio path 정하기
Android Device 는 다양한 Audio Output 을 지원한다.

일단 간단하게 아래와 같은 출력을 지원한다고 하자.

(우선순위별 정렬 : 동시에 장비가 장착 되었을때는 맨 위에꺼 선택)
- HDMI
- USB audio
- Bluetooth
- Headset
- (default)Built-in Speaker

각 디바이스가 연결되었는지를 확인해서 Audio Output 을 선택하는 클래스를 만들어 볼꺼다



