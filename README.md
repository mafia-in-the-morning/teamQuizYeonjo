# teamQuizYeonjo

## 홀짝 게임 요구사항

## 게임 규칙
1. 게임을 시작할 때, 사용자는 자신의 잔액을 입력합니다.
2. 사용자는 홀수 또는 짝수에 대한 베팅을 할 수 있습니다.
3. 베팅 금액은 사용자의 잔액보다 적어야 합니다.
4. 게임이 진행되면, 컴퓨터는 랜덤한 숫자를 선택합니다.
5. 선택된 숫자가 홀수이고 사용자가 홀수에 대해 베팅을 했을 경우, 사용자는 베팅한 금액의 2배를 얻습니다.
6. 선택된 숫자가 짝수이고 사용자가 짝수에 대해 베팅을 했을 경우, 사용자는 베팅한 금액의 2배를 얻습니다.
7. 선택된 숫자와 사용자의 베팅이 다를 경우, 사용자는 베팅한 금액을 잃습니다.
8. 사용자의 잔액이 0원이 되면 게임은 종료됩니다.



# Player 클래스
Player 클래스는 게임에 참가하는 플레이어의 정보를 담는 클래스입니다.
각 플레이어는 고유한 id를 가지며, 이름(name)과 잔액(balance) 정보를 가지고 있습니다. 

# Game 클래스
Game 클래스는 게임 자체를 관리하는 클래스입니다. 
각 게임은 참가하는 플레이어들(players)과 게임 결과(result)를 가지고 있으며, 게임을 시작하고(placeBet) 베팅을 받아 결괏값을 결정(decideResult)하는 등의 메소드를 가지고 있습니다. 

# Betting 클래스
Betting(int balance): balance 값을 인자로 받아 객체를 생성하면서 balance 변수를 초기화합니다.
placeBet(int betAmount, String betType): 베팅할 금액과 베팅할 종류를 인자로 받아 잔액을 차감한 뒤, betAmount와 betType 변수에 저장합니다. 잔액이 충분하지 않을 경우에는 false를 반환합니다.
calculateResult(int winningNumber): 인자로 받은 winningNumber가 홀수이고 betType이 "홀"일 경우 또는 winningNumber가 짝수이고 betType이 "짝"일 경우, 베팅 금액의 두 배를 잔액에 더해줍니다. 그 후, 변경된 잔액을 반환합니다.