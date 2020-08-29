import java.util.*;

public class ConnectFour {
    enum Color {red,yellow}

    public static String whoIsWinner(List<String> piecesPositionList) {
        Color[][] GameArray = new Color[7][6];
        Stack<Color> stackA = new Stack<>();
        Stack<Color> stackB = new Stack<>();
        Stack<Color> stackC = new Stack<>();
        Stack<Color> stackD = new Stack<>();
        Stack<Color> stackE = new Stack<>();
        Stack<Color> stackF = new Stack<>();
        Stack<Color> stackG = new Stack<>();
        for(String i:piecesPositionList){ //ход по листу
            switch (i.charAt(0)){
                case 'A': switch (i.charAt(2)){
                    case 'R':stackA.push(Color.red); break;
                    case 'Y':stackA.push(Color.yellow); break;
                } break;
                case 'B': switch (i.charAt(2)){
                    case 'R':stackB.push(Color.red); break;
                    case 'Y':stackB.push(Color.yellow); break;
                } break;
                case 'C': switch (i.charAt(2)){
                    case 'R':stackC.push(Color.red); break;
                    case 'Y':stackC.push(Color.yellow); break;
                } break;
                case 'D': switch (i.charAt(2)){
                    case 'R':stackD.push(Color.red); break;
                    case 'Y':stackD.push(Color.yellow); break;
                } break;
                case 'E': switch (i.charAt(2)){
                    case 'R':stackE.push(Color.red); break;
                    case 'Y':stackE.push(Color.yellow); break;
                } break;
                case 'F': switch (i.charAt(2)){
                    case 'R':stackF.push(Color.red); break;
                    case 'Y':stackF.push(Color.yellow); break;
                } break;
                case 'G': switch (i.charAt(2)){
                    case 'R':stackG.push(Color.red); break;
                    case 'Y':stackG.push(Color.yellow); break;
                } break;
            }   //забивание стака
        for (int x = 0; x < 6;x++){
            GameArray[0] = stackA.toArray(GameArray[0]);
            GameArray[1] = stackB.toArray(GameArray[1]);;
            GameArray[2] = stackC.toArray(GameArray[2]);
            GameArray[3] = stackD.toArray(GameArray[3]);
            GameArray[4] = stackE.toArray(GameArray[4]);
            GameArray[5] = stackF.toArray(GameArray[5]);
            GameArray[6] = stackG.toArray(GameArray[6]);
        } //преобразование в игровой массив
            //вертикильная проверка
            for (int x = 0; x < 7;x++){
                for (int y = 0; y < 2;y++){
                    if ((GameArray[x][y] == GameArray[x][y+1]) &&
                            (GameArray[x][y+1] == GameArray[x][y+2]) &&
                            (GameArray[x][y+2] == GameArray[x][y+3]) && (GameArray[x][y] != null)) {
                        if(GameArray[x][y] == Color.red){
                            return "Red";
                        } else return "Yellow";
                    }
                }
            }
            //горизонтальная проверка
            for (int y = 0; y < 6;y++){
                for (int x = 0; x < 3;x++){
                    if ((GameArray[x][y] == GameArray[x+1][y]) &&
                            (GameArray[x+1][y] == GameArray[x+2][y]) &&
                            (GameArray[x+2][y] == GameArray[x+3][y]) && (GameArray[x][y] != null)) {
                        if(GameArray[x][y] == Color.red){
                            return "Red";
                        } else return "Yellow";
                    }
                }
            }
            //диагональная проверка '/'
            for (int y = 0; y < 3;y++){
                for (int x = 0; x < 4;x++){
                    if ((GameArray[x][y] == GameArray[x+1][y+1]) &&
                            (GameArray[x+1][y+1] == GameArray[x+2][y+2]) &&
                            (GameArray[x+2][y+2] == GameArray[x+3][y+3]) && (GameArray[x][y] != null)) {
                        if(GameArray[x][y] == Color.red){
                            return "Red";
                        } else return "Yellow";
                    }
                }
            }
            //диагональная проверка '\'
            for (int y = 3; y < 6;y++){
                for (int x = 0; x < 4;x++){
                    if ((GameArray[x][y] == GameArray[x+1][y-1]) &&
                            (GameArray[x+1][y-1] == GameArray[x+2][y-2]) &&
                            (GameArray[x+2][y-2] == GameArray[x+3][y-3]) && (GameArray[x][y] != null)) {
                        if(GameArray[x][y] == Color.red){
                            return "Red";
                        } else return "Yellow";
                    }
                }
            }
        }
        return "Draw";
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList(
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "A_Red",
                "B_Yellow",
                "G_Red",
                "B_Yellow"
        ));
        List<String> myList2 = new ArrayList<>(Arrays.asList(
                "G1Yellow",
                "C1Red",
                "E1Yellow",
                "B1Red",
                "A1Yellow",
                "E2Red",
                "G2Yellow",
                "B2Red",
                "A2Yellow",
                "C2Red",
                "F1Yellow",
                "F2Red",
                "D1Yellow",
                "A3Red",
                "A4Yellow",
                "A5Red",
                "A6Yellow",
                "B3Red",
                "D2Yellow",
                "G3Red",
                "F3Yellow",
                "F4Red",
                "D3Yellow",
                "G4Red",
                "D4Yellow",
                "D5Red",
                "G5Yellow",
                "C3Red",
                "F5Yellow",
                "E3Red",
                "F6Yellow",
                "D6Red",
                "G6Yellow",
                "E4Red",
                "E5Yellow",
                "C4Red",
                "C5Yellow",
                "B4Red",
                "C6Yellow",
                "B5Red",
                "B6Yellow",
                "E6Red"
        ));
        System.out.println(whoIsWinner(myList));
        System.out.println(whoIsWinner(myList2));
    }
}