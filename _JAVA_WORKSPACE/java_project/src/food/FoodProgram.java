package food;

import java.util.Scanner;

public interface FoodProgram {
	void printFood();
	void serach_food(Scanner scan); //음식찾기
	void price_food(Scanner scan); //음식가격
	void sortout_food(Scanner scan); //다팔린음식
	void remvoe_Food(Scanner scan); //음식 제거

}
