public class FizzBuzz{
    public static void main(String[] args) {
        if(args.length == 0){
            return;
        }
        int max = Integer.parseInt(args[0]);
		String result = null;
		for (int i = 1; i <= max; i++) {
			int num = 0;
			result = "";
			if (num % 3 == 0) {
				result = "Fizz";
			}
			if (num % 5 == 0) {
				result = "Buzz";
			}
			if (result.length() == 0) {
				result = num;
			}
			System.out.print(result + " ");
         }
    }
}
/*ステップ１：
「数字を表示するプログラム」を作る
1.コマンドライン引数を受け取る＝数字をうつ
2.上記で受け取った引数を数値に変換する
3.２．で受け取った数値の回数分、繰り返し処理を行う
4.３．の繰り返し処理の中で、「何回目の処理か？」を表示する
 */
/*ステップ２：
出力する文字列を保持する変数を利用してみる
1.表示用の文字列を保持する変数'result'を定義する
2.表示しようとしている数字が３で割り切れるかを確認
    割り切れるとき→変数'result'に文字列'Fizz'を追加する
3.表示しようとしている数字が３で割り切れるかを確認
     割り切れるとき→変数'result'に文字列'Buzz'を追加する
4.変数'result'の文字数が'空文字'かどうかを確認する
    空文字だったときだけ、変数'result'に数字を文字列として加える
5.変数'result'を表示する
 */