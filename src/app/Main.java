package app;

import java.util.List;

import constants.Const;
import dto.WikiDto;
import model.WikiReader;

/**
 * ファイルベースWikiアプリ
 * 
 * Wikiアプリ開発05 - 定数を使ってハードコーディングを無くそう！
 *
 * Mainクラス
 * ファイルベースWikiアプリの実行エントリポイントを持つクラス
 * @author　Say Consulting Group
 * @version　1.0.0
 */
public class Main {

  /**
   * mainメソッド
   * ファイルベースwikiアプリのエントリポイント
   * @param args コマンドライン引数(未使用)
   */
  public static void main(String[] args) {

    // ウェルカムメッセージ表示
    System.out.println(Const.WELCOME_MESSAGE);

    // wikiのリスト読み込み
    List<WikiDto> list = WikiReader.getAll();

    // 読み込んだwikiを全て表示する
    int i = 0;
  //参考演算子：　＜？　　：＞　　、？の左が正しければ？の後が実行され、？の前が間違ってたら：の後が実行される
  // if elseは５行使うのを、参考演算子なら１行え済む。
    for (WikiDto item : list) {
      System.out.print(item.index());
      // 一定数の表示後は改行し、改行しない場合は余白を表示
      String margin = i % Const.INDEX_LENGTH == Const.INDEX_LENGTH - 1 ? "\n\n" : "  "; 
      System.out.print(margin);
      i++;
    }
  }
}
