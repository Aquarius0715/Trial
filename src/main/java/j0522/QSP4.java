package j0522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QSP4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] names={
                "アカミネ アトム",
                "アダチ トモアキ",
                "ウノ アキラ",
                "エンドウ サクヤ",
                "オオサワ アマネ",
                "オガワ ジントク",
                "カケハタ ソウスケ",
                "カセ ツバサ",
                "カンバヤシ エイスケ",
                "クリバヤシ コウセイ",
                "スウ トク サイ",
                "ニッタ アキヒロ",
                "ヤマムロ カイオ アツシ ブラナ",
                "ヨシイ カイト",
                "イトウ ソウジ",
                "イナバ タカシ",
                "イノウエ ヒデアキ",
                "イワムラ テンセイ",
                "イワワキ ケイタ",
                "オオハタ リョウタロウ",
                "オクヤマ ルイ",
                "オノデラ ショウマ",
                "カッチ トモヤ",
                "カネコ タクロウ",
                "ガイノ ツカサ",
                "キタノ マサキ",
                "クボ チヒロ",
                "クロセ マサキ",
                "サイトウ カンタ",
                "サカグチ コウタロウ",
                "サトウ リョウスケ",
                "シゲタ チアキ",
                "シバノ ソウ",
                "シバヤナギ トモヤ",
                "ジングウジ マサキヨ",
                "スズキ アオイ",
                "スズキ リョウタロウ",
                "タイラ ナツ",
                "タカシ コウヘイ",
                "タナカ ハヤテ",
                "タナカ ハルト",
                "ツボウチ ハジメ",
                "ナカタ シンゴ",
                "ナカノ ケイシン",
                "ナガエ ケンタロウ",
                "ナガヤマ ユウジロウ",
                "ナワヤ サトシ",
                "ナンコウ セイノスケ",
                "ニシムラ ダイキ",
                "ハライガワ アツシ",
                "ヒウラ ユウキ",
                "フジイ タクミ",
                "ホソダ シュンタロウ",
                "マツムラ ナオヤ",
                "ミウラ シオン",
                "ミズノ ヒロト",
                "ミトメ アルト",
                "ヤマモト マコト",
                "ヨコヤマ ユウタ",
                "ロウリードデソウザ ジョエミル",
                "ワカイ ユウマ",
                "ホン アン クアン",
                "ノバ コルテス エドアルド ラファエル",
                "ロペス チャパ ホセ"};

        System.out.println("検索する文字を入力してください。");
        char headChar = scn.next().charAt(0);

        long num = Arrays.stream(names)
                .filter(s -> s.charAt(0) == headChar)
                .count();

        System.out.println("名前が[" + headChar + "]で始まる人は" + num + "人いました。");
        Arrays.stream(names)
                .filter(s -> s.charAt(0) == headChar)
                .forEach(System.out::println);
    }
}
