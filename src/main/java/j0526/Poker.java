package j0526;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Poker{

	// Level 1 ペアが１つあるか？
	public static boolean isOnePair(int[] cards) {
		int pairCount = 0;
        for (int card : cards) {
            if (countRank(rank(card), cards) == 2) {
                pairCount++;
            }
        }
		if (pairCount == 2) {
			return true;
		} else {
			return false;
		}
	}

	// Level 2 ペアが２つあるか？
	public static boolean isTwoPair(int[] cards) {
		int pairCount = 0;
		for (int card : cards) {
			if (countRank(rank(card), cards) == 2) {
				pairCount++;
			}
		}
		if (pairCount == 4) {
			return true;
		} else {
			return false;
		}
	}

	// Level 3 同じランクのカードが３枚あるか？
	public static boolean isThreeCard(int[] cards) {
		int pairCount = 0;
		for (int card : cards) {
			if (countRank(rank(card), cards) == 3) {
				pairCount++;
			}
		}
		if (pairCount == 3) {
			return true;
		} else {
			return false;
		}
	}

	// Level 4 同じランクのカードが４枚あるか？
	public static boolean isFourCard(int[] cards) {
		int pairCount = 0;
		for (int card : cards) {
			if (countRank(rank(card), cards) == 4) {
				pairCount++;
			}
		}
		if (pairCount == 4) {
			return true;
		} else {
			return false;
		}
	}

	// Level 5 全てのカードのマークが同じか？
	public static boolean isFlush(int[] cards) {
		int pairCount = 0;
		for (int card : cards) {
			if (countMark(mark(card), cards) == 5) {
				pairCount++;
			}
		}
		if (pairCount == 5) {
			return true;
		} else {
			return false;
		}
	}

	// Level 6 ペアが１つあり、それ以外に同じランクのカードが３枚あるか？
	public static boolean isFullHouse(int[] cards) {
		return isOnePair(cards) && isThreeCard(cards);
	}

	// Level 7 A,K,Q,J,10があるか？
	public static boolean isStraightWithRoyal(int[] cards) {
		int[] royalCards = {1, 10, 11, 12, 13};
		int[] ranks = new int[5];

		for (int i = 0; i < 5; i++) {
			ranks[i] = Poker.rank(cards[i]);
		}

		Arrays.sort(ranks);
		return Arrays.equals(royalCards, ranks);
	}

	// Level 8 全てのカードのランクが連続しているか？
	public static boolean isStraightWithoutRoyal(int[] cards) {
		int[] ranks = new int[5];

		for (int i = 0; i < 5; i++) {
			ranks[i] = Poker.rank(cards[i]);
		}

		Arrays.sort(ranks);

		int currentCardRank = ranks[0];
		for (int i = 0; i < 5; i++) {
			if (ranks[i] != currentCardRank) {
				return false;
			}
			currentCardRank++;
		}
		return true;
	}

	// Level 09 全てのカードのマークが同じで、しかもランクが連続しているか？
	public static boolean isStraightFlush(int[] cards) {
		return isFlush(cards) && isStraightWithoutRoyal(cards);
	}

	// Level 10 同じマークのA,K,Q,J,10があるか？
	public static boolean isRoyalStraightFlush(int[] cards) {
		return isStraightWithRoyal(cards) && isFlush(cards);
	}

	// Level 11 役がまったく無いか？
	public static boolean isNoPair(int[] cards) {
		return !(isOnePair(cards ) ||
				isTwoPair(cards) ||
				isThreeCard(cards) ||
				isFourCard(cards) ||
				isFlush(cards) ||
				isFullHouse(cards) ||
				isStraightWithRoyal(cards) ||
				isStraightWithoutRoyal(cards) ||
				isStraightFlush(cards) ||
				isStraightFlush(cards) ||
				isRoyalStraightFlush(cards));
	}


	//=================
	// Main関数
	//=================
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("あなたはどの奇跡を求めますか？");
		for (int yaku = 9; yaku >= 0; yaku--) {
			System.out.println(yaku + ":" + getYakuString(yaku));
		}

		int miracleLevel = sc.nextInt();

		int[] cards=new int[5];
		int count = 0;
		do {
			count++;
			cards=getHands();
		} while (!miracleHappened(miracleLevel, cards));

		showResult(count, miracleLevel);
		showHands(cards);
	}

	//=================
	// カード用関数
	//=================
	// カードの数字（1～52）からSuitの数字(1～4)を求める
	public static int mark(int card) {
		if( card<=0 || 53 <= card ){
			return 0;
		}
		return (card - 1) / 13 + 1;
	}

	// カードの数字（1～52）からRankの数字(1～4)を求める
	public static int rank(int card) {
		if( card<=0 || 53 <= card ){
			return 0;
		}
		return (card - 1) % 13 + 1;
	}

	// 手札（cards）に、指定されたSuit（targetSuit）が何枚あるか数える
	public static int countMark(int targetSuit, int[] cards) {
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			if (mark(cards[i]) == targetSuit) {
				count++;
			}
		}
		return count;
	}

	// 手札（cards）に、指定されたRank（targetRank）が何枚あるか数える
	public static int countRank(int targetRank, int[] cards) {
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			if (rank(cards[i]) == targetRank) {
				count++;
			}
		}
		return count;
	}

	// cardsが指定された役になっているか調べる
	public static boolean miracleHappened(int miracleLevel, int[] cards) {
		if (miracleLevel == 9 && isRoyalStraightFlush(cards))
			return true;
		if (miracleLevel == 8 && isStraightFlush(cards))
			return true;
		if (miracleLevel == 7 && isFourCard(cards))
			return true;
		if (miracleLevel == 6 && isFullHouse(cards))
			return true;
		if (miracleLevel == 5 && isFlush(cards))
			return true;
		if (miracleLevel == 4 && isStraightWithRoyal(cards))
			return true;
		if (miracleLevel == 4 && isStraightWithoutRoyal(cards))
			return true;
		if (miracleLevel == 3 && isTwoPair(cards))
			return true;
		if (miracleLevel == 2 && isThreeCard(cards))
			return true;
		if (miracleLevel == 1 && isOnePair(cards))
			return true;
		if (miracleLevel == 0 && isNoPair(cards))
			return true;
		return false;
	}

	//=================
	// 表示用関数
	//=================
	public static String getYakuString(int yaku) {
		switch (yaku) {
			case 9:
				return "ロイヤルストレートフラッシュ";
			case 8:
				return "ストレートフラッシュ";
			case 7:
				return "フォーカード";
			case 6:
				return "フルハウス";
			case 5:
				return "フラッシュ";
			case 4:
				return "ストレート";
			case 3:
				return "ツーペア";
			case 2:
				return "スリーカード";
			case 1:
				return "ワンペア";
		}
		return "ノーペア";
	}

	public static String getMarkString(int card) {
		switch (mark(card)) {
			case 1:
				return "スペード";
			case 2:
				return "ハート";
			case 3:
				return "ダイヤ";
			case 4:
				return "クラブ";
		}
		return "";
	}

	public static String getRankString(int card) {
		int rank = rank(card);
		switch (rank) {
			case 1:
				return "A";
			case 11:
				return "J";
			case 12:
				return "Q";
			case 13:
				return "K";
			default:
				if (2 <= rank && rank <= 10) {
					return "" + rank;
				}
		}
		return "";
	}

	public static String getCardString(int card) {
		String str="";
		str += getMarkString(card);
		str += " ";
		str += getRankString(card);
		return str;
	}

	public static void showHands(int[] cards) {
		for (int i = 0; i < 5; i++) {
			System.out.println(getCardString(cards[i]));
		}
	}

	public static void showResult(int count, int miracleLevel) {
		System.out.println();
		System.out.println(count + "回トライして");
		System.out.print("「" + getYakuString(miracleLevel) + "」");
		System.out.println("をGetしました。");
	}

	//=================
	// 乱数用関数
	//=================
	public static int getRansu() {
		return (int) (Math.random() * 52) + 1;
	}

	public static int getRansuWithout(int card1, int card2, int card3, int card4) {
		int card = getRansu();
		while (card == card1 || card == card2 || card == card3 || card == card4) {
			card = getRansu();
		}
		return card;
	}

	public static int[] getHands() {
		int[] cards = new int[5];
		cards[0] = getRansuWithout(0, 0, 0, 0);
		cards[1] = getRansuWithout(cards[0], 0, 0, 0);
		cards[2] = getRansuWithout(cards[0], cards[1], 0, 0);
		cards[3] = getRansuWithout(cards[0], cards[1], cards[2], 0);
		cards[4] = getRansuWithout(cards[0], cards[1], cards[2], cards[3]);
		return cards;
	}

}
