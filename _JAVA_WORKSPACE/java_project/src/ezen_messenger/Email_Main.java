package ezen_messenger;

import java.util.Scanner;

public class Email_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;

		
		System.out.println("                                      #####                                     \r\n"
				+ "                             #####             #####                            \r\n"
				+ "                     #####                            ######                    \r\n"
				+ "                 ###                                        ####                \r\n"
				+ "             ####                                               ###             \r\n"
				+ "           ##                                                      ###          \r\n"
				+ "         ##                                                           ##        \r\n"
				+ "       ##                                                               ##      \r\n"
				+ "     ##                                                                  ##     \r\n"
				+ "    ##                                                                     #    \r\n"
				+ "   ##                                                                       #   \r\n"
				+ "  ##                                                                         #  \r\n"
				+ "  #                    ###### ########  ######  ##     ##                     # \r\n"
				+ " ##                    ##          ##   ##      ###    ##                     # \r\n"
				+ " #                     ##         ##    ##  #   #  #   ##                     # \r\n"
				+ " #                     #####     ##     #####   #   ## ##                     # \r\n"
				+ " #                     ##      ##       ##      #    ####                     # \r\n"
				+ "  #                    ###### ########  ######  #     ###                     # \r\n"
				+ "  #                                                                          #  \r\n"
				+ "   #                                                                        ##  \r\n"
				+ "    #                                                                      ##   \r\n"
				+ "     ##                                                                   ##    \r\n"
				+ "      ##                                                                ##      \r\n"
				+ "        ##                                                            ##        \r\n"
				+ "          ###                                                       ##          \r\n"
				+ "             ###                                                 ###            \r\n"
				+ "                ##                                           ####               \r\n"
				+ "                 #                                      #####                   \r\n"
				+ "                 #              #               #######                         \r\n"
				+ "                 #           ###   ###########                                  \r\n"
				+ "                 ##      ####                                                   \r\n"
				+ "                  #   ###                                                       \r\n"
				+ "                  # # ");
		
		do {
			System.out.println("--------------------------|");
			System.out.println("ezen 메신저");
			System.out.println("1.회원가입|2.로그인|3.친구");
			System.out.println("4.쪽지|5.종료");
			System.out.println(">>menu를 입력하세요>>");
			System.out.println("--------------------------");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("회원가입");
				System.out.println("                                                  \r\n"
						+ "                                                  \r\n"
						+ "                                          ##      \r\n"
						+ "                                          ##      \r\n"
						+ "               ####                    #########  \r\n"
						+ "           ############                #########  \r\n"
						+ "         ####        ####   ######        ##      \r\n"
						+ "        ###            ##############     ##      \r\n"
						+ "       ###              ###         ##            \r\n"
						+ "       ##                ##          ##           \r\n"
						+ "       ##                ##           ##          \r\n"
						+ "       ##                ##           ##          \r\n"
						+ "        ##              ##           ##           \r\n"
						+ "        ###            ####         ###           \r\n"
						+ "          ####      ####  ##### #####             \r\n"
						+ "          ##############  ############            \r\n"
						+ "       #####         #######         ####         \r\n"
						+ "     ####                 ###          ###        \r\n"
						+ "    ###                    ###          ###       \r\n"
						+ "   ###                      ###          ##       \r\n"
						+ "   ##                        ##          ##       \r\n"
						+ "   ##                        ##          ##       \r\n"
						+ "   ##                        ##          ##       \r\n"
						+ "   ##                        ##          ##       \r\n"
						+ "   ##                        ###         ##       \r\n"
						+ "   ##                        ##############       \r\n"
						+ "   ############################                   \r\n"
						+ "   ############################                   \r\n"
						+ "                                           ");
				
				System.out.println();
				break;
			case 2:
				System.out.println("로그인");
				System.out.println("                                                  \r\n"
						+ "  ###############################################  \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ## ##  ##  ##                                ## \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ############################################### \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ##                  ##              #        ## \r\n"
						+ "  ##                  ##    ###  #### # ####   ## \r\n"
						+ "  ##                  ##   ## ## #  # # #  #   ## \r\n"
						+ "  ##                  ##### ###  #### # #  #   ## \r\n"
						+ "  ##                              ###          ## \r\n"
						+ "  ##      ######                               ## \r\n"
						+ "  ##     ##    ##     ######################## ## \r\n"
						+ "  ##     ##    ##     ##                    ## ## \r\n"
						+ "  ##      ######      ##                    ## ## \r\n"
						+ "  ##       ####       ##                    ## ## \r\n"
						+ "  ##  ##############   ######################  ## \r\n"
						+ "  ## ##            ##    ###################   ## \r\n"
						+ "  ## ##            ## ##################### ## ## \r\n"
						+ "  ## ##            ## ##                    ## ## \r\n"
						+ "  ## ##            ## ##                    ## ## \r\n"
						+ "  ## ################ ######################## ## \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ##                                           ## \r\n"
						+ "  ## ####################################### # ## \r\n"
						+ "  ###############################################   ");
				
				break;
			case 3:
				System.out.println("친구");
				System.out.println("                         ####                              ###                        \r\n"
						+ "                    ##############                    #############                   \r\n"
						+ "                 ######        ######              ######       ######                \r\n"
						+ "               ####               ####           ####               ####              \r\n"
						+ "              ###                   ##         ####                   ###             \r\n"
						+ "             ###                              ###                      ###            \r\n"
						+ "            ###                        ###    ##                        ###           \r\n"
						+ "           ###                         ###   ###                         ###          \r\n"
						+ "           ###      ###        ###      ###  ##       ##         ##       ##          \r\n"
						+ "           ##      ####       ####      ### ###      ####       ####      ##          \r\n"
						+ "           ##       ##         ##       ### ###       ##         ##       ##          \r\n"
						+ "           ###         ###  ##          ###  ##          ##   ##          ##          \r\n"
						+ "            ##         #######         ###   ###         #######         ###          \r\n"
						+ "            ###                        ##     ###                       ###           \r\n"
						+ "        ########                      #####   ####                     ###            \r\n"
						+ "      ####    ####                  ###############                   ###             \r\n"
						+ "      ##     ####                   #####       ###                   #####           \r\n"
						+ "      ###  ####                        ####                             ###           \r\n"
						+ "       ######                            ####                                ##       \r\n"
						+ "       ####                                ####                              ###      \r\n"
						+ "     ####                                    ###                              ####    \r\n"
						+ "    ####                                      ###                               ###   \r\n"
						+ "    ##                                         ###                               ###  \r\n"
						+ "                                                ###                               ### \r\n"
						+ "  ##       ###                          ###      ###                      ##       ## \r\n"
						+ " ###      ###                            ##       ##                      ###      ###\r\n"
						+ " ##       ##                             ###      ###                      ##       ##\r\n"
						+ " ###     ###     #                       ####     ###          #   #       ###      ##\r\n"
						+ " #####################################################################################");
				break;
				
				
			case 4:
				System.out.println("쪽지");
				System.out.println(""
						+ "   ###############################################                                   \r\n"
						+ "   ####                                    ###  ##                                   \r\n"
						+ "   ## ###                                   ### ##                                    \r\n"
						+ "   ##   ###                               ###   ##                                    \r\n"
						+ "   ##     ###                           ###     ##                                   \r\n"
						+ "   ##       ###                       ####      ##                                    \r\n"
						+ "   ##        ####                   ####        ##                                    \r\n"
						+ "   ##          ###                 ###          ##      #############                  \r\n"
						+ "   ##            ###             ###            ##      ####      ####                \r\n"
						+ "   ##            #####         #####            ##         ##        ###              \r\n"
						+ "   ##          ###   ###     ###   ###          ##          ###        ##             \r\n"
						+ "   ##        ####      #######      ####        ##            ##        ##            \r\n"
						+ "   ##      ####          ###          ####      ##            ##         #            \r\n"
						+ "   ##    ####                           ####    ##             ##        ##           \r\n"
						+ "   ##   ###                               ###   ##         ######        ######       \r\n"
						+ "   ## ###                                   ### ##        ##                 ###      \r\n"
						+ "   ###   #################################  #####         ##                ##       \r\n"
						+ "   ##############################################           ###            ###        \r\n"
						+ "                                                              ##          ##          \r\n"
						+ "                                                               ##        ##           \r\n"
						+ "                                                                ###    ###            \r\n"
						+ "                                                                  ##  ##              \r\n"
						+ "                                                                   ####               \r\n"
						+ "                 #                                                                    \r\n"
						+ "               #####                                                                  \r\n"
						+ "              ##   ##                                                                 \r\n"
						+ "             ##     ###                                                               \r\n"
						+ "           ###        ##                                                              \r\n"
						+ "          ##           ##                                                             \r\n"
						+ "         ##             ###          ##############################################    \r\n"
						+ "        ##                ##         ####                                      ####   \r\n"
						+ "       ##                 ##         #  ###                                  ###  #   \r\n"
						+ "        #####         #####          ##   ###                               ##    #   \r\n"
						+ "            ##        ##             ##     ###                           ##      #   \r\n"
						+ "            ##         #             ##       ##                        ###       #   \r\n"
						+ "             ##        ##            ##        ###                    ###         #   \r\n"
						+ "              ##        ##           ##          ###                ###           #   \r\n"
						+ "               ###        ##         ##            ###            ###             #   \r\n"
						+ "                 ####      ####      ##            #####        #####             #   \r\n"
						+ "                    ###########      ##          ###   ###    ###    ###          #   \r\n"
						+ "                                     ##        ###       ######        ##         #   \r\n"
						+ "                                     ##      ###                        ###       #   \r\n"
						+ "                                     ##    ###                            ###     #   \r\n"
						+ "                                     ##  ###                                ###   #   \r\n"
						+ "                                     ## ##                                    ##  #   \r\n"
						+ "                                     ####                                      ####   \r\n"
						+ "                                     ##############################################   ");

				break;
			case 5:
				break;
			default:
				System.out.println("잘못된 메뉴입니다");

			}

		} while (menu != 5);
		{
			System.out.println("종료");
		}

		sc.close();

	}

}