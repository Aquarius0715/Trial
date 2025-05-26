package j0526;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PokerTest {
	public static final int TRY_COUNT=50;
	public static LinkedList<int[]> handsOfNoPair;
	public static LinkedList<int[]> handsOfOnePair;
	public static LinkedList<int[]> handsOfTwoPair;
	public static LinkedList<int[]> handsOfThreeCard;
	public static LinkedList<int[]> handsOfFourCard;
	public static LinkedList<int[]> handsOfFlush;
	public static LinkedList<int[]> handsOfFullHouse;
	public static LinkedList<int[]> handsOfStraightWithRoyal;
	public static LinkedList<int[]> handsOfStraightWithoutRoyal;
	public static LinkedList<int[]> handsOfStraightFlush;
	public static LinkedList<int[]> handsOfRoyalStraightFlush;

	@BeforeEach
	public void makeTestHands(){
		handsOfNoPair = getShuffleHands(TRY_COUNT, createNoPair());
		handsOfOnePair = getShuffleHands(TRY_COUNT, createOnePair());
		handsOfTwoPair=getShuffleHands(TRY_COUNT, createTwoPair());
		handsOfThreeCard = getShuffleHands(TRY_COUNT, createThreeCard());
		handsOfFourCard = getShuffleHands(TRY_COUNT, createFourCard());
		handsOfFlush = getShuffleHands(TRY_COUNT, createFlush());
		handsOfFullHouse = getShuffleHands(TRY_COUNT, createFullHouse());
		handsOfStraightWithRoyal = getShuffleHands(TRY_COUNT, createStraightWithRoyal());
		handsOfStraightWithoutRoyal = getShuffleHands(TRY_COUNT, createStraightWithoutRoyal());
		handsOfStraightFlush = getShuffleHands(TRY_COUNT, createStraightFlush());
		handsOfRoyalStraightFlush = getShuffleHands(TRY_COUNT, createRoyalStraightFlush());
	}

	@Test
	public void Level01_ワンペア() {
		checkOnePair(true, handsOfOnePair);
		checkOnePair(true, handsOfFullHouse);

		checkOnePair(false, handsOfNoPair);
		checkOnePair(false, handsOfTwoPair);
		checkOnePair(false, handsOfThreeCard);
		checkOnePair(false, handsOfFourCard);
		checkOnePair(false, handsOfFlush);
		checkOnePair(false, handsOfStraightWithRoyal);
		checkOnePair(false, handsOfStraightWithoutRoyal);
		checkOnePair(false, handsOfStraightFlush);
		checkOnePair(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level02_ツーペア() {
		checkTwoPair(true, handsOfTwoPair);

		checkTwoPair(false, handsOfNoPair);
		checkTwoPair(false, handsOfOnePair);
		checkTwoPair(false, handsOfThreeCard);
		checkTwoPair(false, handsOfFullHouse);
		checkTwoPair(false, handsOfFourCard);
		checkTwoPair(false, handsOfFlush);
		checkTwoPair(false, handsOfStraightWithRoyal);
		checkTwoPair(false, handsOfStraightWithoutRoyal);
		checkTwoPair(false, handsOfStraightFlush);
		checkTwoPair(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level03_スリーカード() {
		checkThreeCard(true, handsOfThreeCard);
		checkThreeCard(true, handsOfFullHouse);

		checkThreeCard(false, handsOfNoPair);
		checkThreeCard(false, handsOfOnePair);
		checkThreeCard(false, handsOfTwoPair);
		checkThreeCard(false, handsOfFourCard);
		checkThreeCard(false, handsOfFlush);
		checkThreeCard(false, handsOfStraightWithRoyal);
		checkThreeCard(false, handsOfStraightWithoutRoyal);
		checkThreeCard(false, handsOfStraightFlush);
		checkThreeCard(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level04_フォーカード() {
		checkFourCard(true, handsOfFourCard);

		checkFourCard(false, handsOfNoPair);
		checkFourCard(false, handsOfOnePair);
		checkFourCard(false, handsOfTwoPair);
		checkFourCard(false, handsOfThreeCard);
		checkFourCard(false, handsOfFullHouse);
		checkFourCard(false, handsOfFlush);
		checkFourCard(false, handsOfStraightWithRoyal);
		checkFourCard(false, handsOfStraightWithoutRoyal);
		checkFourCard(false, handsOfStraightFlush);
		checkFourCard(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level05_フラッシュ() {
		checkFlush(true, handsOfFlush);
		checkFlush(true, handsOfStraightFlush);
		checkFlush(true, handsOfRoyalStraightFlush);

		checkFlush(false, handsOfNoPair);
		checkFlush(false, handsOfOnePair);
		checkFlush(false, handsOfTwoPair);
		checkFlush(false, handsOfThreeCard);
		checkFlush(false, handsOfFullHouse);
		checkFlush(false, handsOfFourCard);
		checkFlush(false, handsOfStraightWithRoyal);
		checkFlush(false, handsOfStraightWithoutRoyal);
	}

	@Test
	public void Level06_フルハウス() {
		checkFullHouse(true, handsOfFullHouse);

		checkFullHouse(false, handsOfNoPair);
		checkFullHouse(false, handsOfOnePair);
		checkFullHouse(false, handsOfTwoPair);
		checkFullHouse(false, handsOfThreeCard);
		checkFullHouse(false, handsOfFourCard);
		checkFullHouse(false, handsOfFlush);
		checkFullHouse(false, handsOfStraightWithRoyal);
		checkFullHouse(false, handsOfStraightWithoutRoyal);
		checkFullHouse(false, handsOfStraightFlush);
		checkFullHouse(false, handsOfRoyalStraightFlush);
		checkFullHouse(false, handsOfStraightFlush);
		checkFullHouse(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level07_ロイヤルストレート() {
		checkStraightWithRoyal(true, handsOfStraightWithRoyal);
		checkStraightWithRoyal(true, handsOfRoyalStraightFlush);

		checkStraightWithRoyal(false, handsOfNoPair);
		checkStraightWithRoyal(false, handsOfOnePair);
		checkStraightWithRoyal(false, handsOfTwoPair);
		checkStraightWithRoyal(false, handsOfThreeCard);
		checkStraightWithRoyal(false, handsOfFourCard);
		checkStraightWithRoyal(false, handsOfFullHouse);
		checkStraightWithRoyal(false, handsOfFlush);
		checkStraightWithRoyal(false, handsOfStraightWithoutRoyal);
		checkStraightWithRoyal(false, handsOfStraightFlush);
	}

	@Test
	public void Level08_ロイヤル以外のストレート() {
		checkStraightWithoutRoyal(true, handsOfStraightWithoutRoyal);
		checkStraightWithoutRoyal(true, handsOfStraightFlush);

		checkStraightWithoutRoyal(false, handsOfNoPair);
		checkStraightWithoutRoyal(false, handsOfOnePair);
		checkStraightWithoutRoyal(false, handsOfTwoPair);
		checkStraightWithoutRoyal(false, handsOfThreeCard);
		checkStraightWithoutRoyal(false, handsOfFullHouse);
		checkStraightWithoutRoyal(false, handsOfFourCard);
		checkStraightWithoutRoyal(false, handsOfFlush);
		checkStraightWithoutRoyal(false, handsOfStraightWithRoyal);
		checkStraightWithoutRoyal(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level09_ストレートフラッシュ() {
		checkStraightFlush(true, handsOfStraightFlush);

		checkStraightFlush(false, handsOfNoPair);
		checkStraightFlush(false, handsOfOnePair);
		checkStraightFlush(false, handsOfTwoPair);
		checkStraightFlush(false, handsOfThreeCard);
		checkStraightFlush(false, handsOfFullHouse);
		checkStraightFlush(false, handsOfFourCard);
		checkStraightFlush(false, handsOfFlush);
		checkStraightFlush(false, handsOfStraightWithRoyal);
		checkStraightFlush(false, handsOfStraightWithoutRoyal);
		checkStraightFlush(false, handsOfRoyalStraightFlush);
	}

	@Test
	public void Level10_ロイヤルストレートフラッシュ() {
		checkRoyalStraightFlush(true, handsOfRoyalStraightFlush);

		checkRoyalStraightFlush(false, handsOfNoPair);
		checkRoyalStraightFlush(false, handsOfOnePair);
		checkRoyalStraightFlush(false, handsOfTwoPair);
		checkRoyalStraightFlush(false, handsOfThreeCard);
		checkRoyalStraightFlush(false, handsOfFullHouse);
		checkRoyalStraightFlush(false, handsOfFourCard);
		checkRoyalStraightFlush(false, handsOfFlush);
		checkRoyalStraightFlush(false, handsOfStraightWithRoyal);
		checkRoyalStraightFlush(false, handsOfStraightWithoutRoyal);
		checkRoyalStraightFlush(false, handsOfStraightFlush);
	}

	@Test
	public void Level11_ノーペア() {
		checkNoPair(true, handsOfNoPair);

		checkNoPair( false,handsOfOnePair);
		checkNoPair(false, handsOfTwoPair);
		checkNoPair(false, handsOfThreeCard);
		checkNoPair(false, handsOfFullHouse);
		checkNoPair(false, handsOfFourCard);
		checkNoPair(false, handsOfFlush);
		checkNoPair(false, handsOfStraightWithRoyal);
		checkNoPair(false, handsOfStraightWithoutRoyal);
		checkNoPair(false, handsOfStraightFlush);
		checkNoPair(false,handsOfRoyalStraightFlush);
	}

	public void Level12_奇跡を求める者() {
		checkMiracle(0, handsOfNoPair);
		checkMiracle(1, handsOfOnePair);
		checkMiracle(2, handsOfThreeCard);
		checkMiracle(3, handsOfTwoPair);
		checkMiracle(4, handsOfStraightWithRoyal);
		checkMiracle(4, handsOfStraightWithoutRoyal);
		checkMiracle(5, handsOfFlush);
		checkMiracle(6, handsOfFullHouse);
		checkMiracle(7, handsOfFourCard);
		checkMiracle(8, handsOfStraightFlush);
		checkMiracle(9, handsOfRoyalStraightFlush);
	}

	//=============================
	// シャフルして手札チェック
	//=============================
	private void checkOnePair(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isOnePair(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkTwoPair(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isTwoPair(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);;
		}
	}

	private void checkThreeCard(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isThreeCard(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkFourCard(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isFourCard(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkFullHouse(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isFullHouse(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkFlush(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isFlush(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkStraightWithRoyal(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isStraightWithRoyal(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkStraightWithoutRoyal(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isStraightWithoutRoyal(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkStraightFlush(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isStraightFlush(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkRoyalStraightFlush(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isRoyalStraightFlush(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkNoPair(boolean expected,LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.isNoPair(hand))
					.withFailMessage(getHandString(hand))
					.isEqualTo(expected);
		}
	}

	private void checkMiracle(int miracleLevel, LinkedList<int[]> hands) {
		for (int[] hand : hands) {
			assertThat(Poker.miracleHappened(miracleLevel, hand))
					.withFailMessage(getHandString(hand))
					.isTrue();
		}
	}

	//=======================
	// 手札生成
	//=======================
	static int[] createHand(int[] mark, int[] rank) {
		int[] hand = new int[5];
		for (int i = 0; i < 5; i++) {
			hand[i] = card(mark[i], rank[i]);
		}
		return hand;
	}

	static LinkedList<int[]> createNoPair() {
		LinkedList<int[]> hands = new LinkedList<int[]>();

		int[] marks = new int[5];
		int[] ranks = new int[5];
		for (int rank = 1; rank <= 13; rank++) {
			int rank1plus = (rank + 1) % 13 ;
			int rank1minus = (rank - 1) % 13;
			ranks[0] = rank;
			ranks[1] = getRandomRankWithout(ranks[0], rank1plus, rank1minus, 0, 0, 0);
			ranks[2] = getRandomRankWithout(ranks[0], rank1plus, rank1minus, ranks[1], 0, 0);
			ranks[3] = getRandomRankWithout(ranks[0], rank1plus, rank1minus, ranks[1], ranks[2], 0);
			ranks[4] = getRandomRankWithout(ranks[0], rank1plus, rank1minus, ranks[1], ranks[2], ranks[3]);

			marks[0] = getRandomMark();
			marks[1] = getRandomMarkWithout(marks[0], 0);
			marks[2] = getRandomMarkWithout(marks[0], 0);
			marks[3] = getRandomMarkWithout(marks[0], 0);
			marks[4] = getRandomMarkWithout(marks[0], 0);

			hands.add(createHand(marks, ranks));
		}
		return hands;
	}

	static LinkedList<int[]> createOnePair() {
		LinkedList<int[]> hands = new LinkedList<int[]>();

		int[] marks = new int[5];
		int[] ranks = new int[5];
		for (int rank = 1; rank <= 13; rank++) {
			ranks[0] = rank;
			ranks[1] = rank;
			ranks[2] = getRandomRankWithout(ranks[0], 0, 0, 0, 0, 0);
			ranks[3] = getRandomRankWithout(ranks[0], ranks[2], 0, 0, 0, 0);
			ranks[4] = getRandomRankWithout(ranks[0], ranks[2], ranks[3], 0, 0, 0);

			marks[0] = getRandomMark();
			marks[1] = getRandomMarkWithout(marks[0], 0);
			marks[2] = getRandomMark();
			marks[3] = getRandomMark();
			marks[4] = getRandomMark();

			hands.add(createHand(marks, ranks));
		}
		return hands;
	}

	static LinkedList<int[]> createThreeCard() {
		LinkedList<int[]> hands = new LinkedList<int[]>();

		int[] marks = new int[5];
		int[] ranks = new int[5];
		for (int rank = 1; rank <= 13; rank++) {
			ranks[0] = rank;
			ranks[1] = rank;
			ranks[2] = rank;
			ranks[3] = getRandomRankWithout(ranks[0], 0, 0, 0, 0, 0);
			ranks[4] = getRandomRankWithout(ranks[0], ranks[3], 0, 0, 0, 0);

			marks[0] = getRandomMark();
			marks[1] = getRandomMarkWithout(marks[0], 0);
			marks[2] = getRandomMarkWithout(marks[0], marks[1]);
			marks[3] = getRandomMark();
			marks[4] = getRandomMark();

			hands.add(createHand(marks, ranks));
		}
		return hands;
	}

	static LinkedList<int[]> createFourCard() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int rank = 1; rank <= 13; rank++) {
			int rank1=rank;
			int rank2 = getRandomRankWithout(rank1, 0, 0, 0, 0, 0);

			int[] hand = new int[5];
			hand[0] = card(1, rank1);
			hand[1] = card(2, rank1);
			hand[2] = card(3, rank1);
			hand[3] = card(4, rank1);
			hand[4] = card(getRandomMark(), rank2);
			hands.add(hand);
		}
		return hands;
	}

	static LinkedList<int[]> createTwoPair() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int rank = 1; rank <= 13; rank++) {
			int rank1=rank;
			int rank2 = getRandomRankWithout(rank1, 0, 0, 0, 0, 0);
			int rank3 = getRandomRankWithout(rank1, rank2, 0, 0, 0, 0);

			int mark1 = getRandomMark();
			int mark2 = getRandomMarkWithout(mark1, 0);
			int mark3 = getRandomMark();
			int mark4 = getRandomMarkWithout(mark3, 0);
			int mark5 = getRandomMark();

			int[] hand = new int[5];
			hand[0] = card(mark1, rank1);
			hand[1] = card(mark2, rank1);
			hand[2] = card(mark3, rank2);
			hand[3] = card(mark4, rank2);
			hand[4] = card(mark5, rank3);
			hands.add(hand);
		}
		return hands;
	}

	static LinkedList<int[]> createFullHouse() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int rank = 1; rank <= 13; rank++) {
			int rank1 = rank;
			int rank2 = getRandomRankWithout(rank1, 0, 0, 0, 0, 0);

			int mark1 = getRandomMark();
			int mark2 = getRandomMarkWithout(mark1, 0);
			int mark3 = getRandomMarkWithout(mark1, mark2);
			int mark4 = getRandomMark();
			int mark5 = getRandomMarkWithout(mark4, 0);

			int[] hand = new int[5];
			hand[0] = card(mark1, rank1);
			hand[1] = card(mark2, rank1);
			hand[2] = card(mark3, rank2);
			hand[3] = card(mark4, rank2);
			hand[4] = card(mark5, rank2);
			hands.add(hand);
		}
		return hands;
	}

	static LinkedList<int[]> createFlush() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int mark = 1; mark <= 4; mark++) {
			int rank1 = getRandomRank();
			int rank2 = getRandomRankWithout(rank1, rank1-1, rank1+1,0, 0, 0);
			int rank3 = getRandomRankWithout(rank1, rank2, rank1-1, rank1+1, 0, 0);
			int rank4 = getRandomRankWithout(rank1, rank2, rank3, rank1-1, rank1+1, 0);
			int rank5 = getRandomRankWithout(rank1, rank2, rank3, rank4, rank1-1, rank1+1);

			int[] hand = new int[5];
			hand[0] = card(mark, rank1);
			hand[1] = card(mark, rank2);
			hand[2] = card(mark, rank3);
			hand[3] = card(mark, rank4);
			hand[4] = card(mark, rank5);
			hands.add(hand);
		}
		return hands;
	}

	static LinkedList<int[]> createStraightWithRoyal() {
		LinkedList<int[]> hands = new LinkedList<int[]>();

		int mark1 = getRandomMark();
		int mark2 = getRandomMarkWithout(mark1, 0);
		int mark3 = getRandomMarkWithout(mark1, 0);
		int mark4 = getRandomMarkWithout(mark1, 0);
		int mark5 = getRandomMarkWithout(mark1, 0);

		int[] hand = new int[5];
		hand[0] = card(mark1, 1);
		hand[1] = card(mark2, 10);
		hand[2] = card(mark3, 11);
		hand[3] = card(mark4, 12);
		hand[4] = card(mark5, 13);

		hands.add(hand);
		return hands;
	}

	static LinkedList<int[]> createStraightWithoutRoyal() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int rank = 1; rank <= 9; rank++) {

			int mark1 = getRandomMark();
			int mark2 = getRandomMarkWithout(mark1, 0);
			int mark3 = getRandomMarkWithout(mark1, 0);
			int mark4 = getRandomMarkWithout(mark1, 0);
			int mark5 = getRandomMarkWithout(mark1, 0);

			int[] hand = new int[5];
			hand[0] = card(mark1, rank);
			hand[1] = card(mark2, rank + 1);
			hand[2] = card(mark3, rank + 2);
			hand[3] = card(mark4, rank + 3);
			hand[4] = card(mark5, rank + 4);
			hands.add(hand);
		}
		return hands;
	}

	static LinkedList<int[]> createStraightFlush() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int rank = 1; rank <= 9; rank++) {
			for (int mark = 1; mark <= 4; mark++) {
				int[] hand = new int[5];
				hand[0] = card(mark, rank);
				hand[1] = card(mark, rank + 1);
				hand[2] = card(mark, rank + 2);
				hand[3] = card(mark, rank + 3);
				hand[4] = card(mark, rank + 4);
				hands.add(hand);
			}
		}
		return hands;
	}

	static LinkedList<int[]> createRoyalStraightFlush() {
		LinkedList<int[]> hands = new LinkedList<int[]>();
		for (int mark = 1; mark <= 4; mark++) {
			int[] hand = new int[5];
			hand[0] = card(mark, 1);
			hand[1] = card(mark, 10);
			hand[2] = card(mark, 11);
			hand[3] = card(mark, 12);
			hand[4] = card(mark, 13);
			hands.add(hand);
		}
		return hands;
	}

	//=======================
	// ヘルパー関数
	//=======================
	static int mark(int card) {
		return (card - 1) / 13 + 1;
	}

	static int rank(int card) {
		return (card - 1) % 13 + 1;
	}

	static int card(int mark, int rank) {
		return (mark - 1) * 13 + rank;
	}

	//=======================
	// シャフル用関数
	//=======================
	static LinkedList<int[]> getShuffleHands(int num, LinkedList<int[]> hands) {
		LinkedList<int[]> repeatHands = new LinkedList<int[]>();
		for (int[] hand : hands) {
			repeatHands.add(hand);
			for (int count = 0; count <= num; count++) {
				repeatHands.add(getShuffleHand(hand));
			}
		}
		return repeatHands;
	}

	static int[] getShuffleHand(int[] hand) {
		int pos1 = getRandomPos();
		int pos2 = getRandomPosWithout(pos1);

		int[] shuffleHand = new int[5];
		for (int pos = 0; pos < 5; pos++) {
			shuffleHand[pos] = hand[pos];
		}
		shuffleHand[pos1] = hand[pos2];
		shuffleHand[pos2] = hand[pos1];
		return shuffleHand;
	}

	//=======================
	// 乱数生成用の関数
	//=======================
	static int getRandomPosWithout(int withoutPos) {
		int pos = 0;
		do {
			pos = getRandomPos();
		} while (pos == withoutPos);
		return pos;
	}

	static int getRandomRankWithout(int rank1, int rank2, int rank3, int rank4, int rank5, int rank6) {
		int rank = 0;
		do {
			rank = getRandomRank();
		} while (rank == rank1 || rank == rank2 || rank == rank3 || rank == rank4 || rank == rank5 || rank == rank6);
		return rank;
	}

	static int getRandomMarkWithout(int mark1, int mark2) {
		int mark = 0;
		do {
			mark = getRandomMark();
		} while (mark == mark1 || mark == mark2);
		return mark;
	}

	static int getRandomPos() {
		return (int) (Math.random() * 5);
	}

	static int getRandomMark() {
		return (int) (Math.random() * 4) + 1;
	}

	static int getRandomRank() {
		return (int) (Math.random() * 13) + 1;
	}

	//=========================
	// テスト表示用の関数
	//=========================
	static String getHandString(int[] hand) {
		String str = "\n";
		for (int pos = 0; pos <= 4; pos++) {
			str += hand[pos];
			str += ":";
			str += getMarkString(hand[pos]);
			str += " ";
			str += getRankString(hand[pos]);
			str += "\n";
		}
		return str;
	}

	static String getMarkString(int card) {
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

	static String getRankString(int card) {
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
}
