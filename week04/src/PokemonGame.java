import java.util.Scanner;

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

        //플레이어 포켓몬스터 선택
        Scanner scanner = new Scanner(System.in);
        System.out.println("포켓몬을 고르세요.\n1) 피카츄  2) 꼬부기  3) 리자몽");
        int pokemonPick = scanner.nextInt();
        if (pokemonPick == 1){
            NoFly noFly = new NoFly();
            Pikachu p1 = new Pikachu(noFly);
        } else if (pokemonPick == 2){
            NoFly noFly = new NoFly();
            Squirtle s1 = new Squirtle(noFly);
        } else if (pokemonPick == 3){
            Wings wings = new Wings();
            Charizard c1 = new Charizard(wings);
        } else {
            System.out.println("정상적인 값이 아닙니다!");
        }

        int menu;
        while (true){
            System.out.print("\t1) 전투   2) 도망   3) 종료  : ");
            menu = scanner.nextInt();
            if(menu == 1){

            } else if (menu == 2){

            } else{
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
