public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다. \n야생 포켓몬이 나타났습니다.");
//        System.out.println(Math.random()); // 0.0 <= x < 1.0   -- Math.random은 1을 넘지않음
//        System.out.println((int)(Math.random()*6)+1); // 1.0 <= x <= 6.0
        
        //적군 포켓몬스터 랜덤생성
        int enemyPick = ((int)(Math.random()*3));
        if (enemyPick == 0){
            NoFly noFly = new NoFly();
            Pikachu pikachu = new Pikachu(noFly);
        } else if(enemyPick == 1){
            NoFly noFly = new NoFly();
            Squirtle squirtle = new Squirtle(noFly);
        } else if(enemyPick == 2){
            Wings wings = new Wings();
            Charizard charizard = new Charizard(wings);
        } else {
            System.out.println("여기는 영원히 실행 안됩니다.");
        }
    }
}
