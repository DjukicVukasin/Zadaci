package test;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Test Java Prvi zadatak Napisati program na programskom jeziku Java koji sluzi
		 * kao kviz za pogadjanje zemalja iz kojih dolaze teniseri. Korisnik moze da
		 * odgovara sve dok ne izabere opciju za izlaz. Korisniku se na standardni izlaz
		 * ispisuje sledecui meni: 1. Djokovic 2. Nadal 3. Federer 4. Izlaz
		 * 
		 * Korisnik bira redni broj tesnisera za koga ce pogadjati zemlju porekla. Nakon
		 * toga mu se ispisuje poruka sa pitanjem. Npr. ukoliko je korisnik izablao
		 * opciju jedan ispisuje se poruka: "Iz koje zemlje dolazi Djokovic?". Ukoliko
		 * korisnik unese tacan odgovor ispisuje se poruka "Tacno!". Ukoliko korisnik
		 * unese netacan odgovor ispisuje se poruka "Netacno!". Nakon toga opet se
		 * ispisuje isti meni sa istim funkcionalnostima. Ukoliko korisnik izabere
		 * opciju 4 izlazi se iz programa. Ukoliko korisnik unese neki nevalidan broj
		 * kao opciju ponovo ispisati meni. Prilikom provere tacnosti odgovora ne treba
		 * voditi racuna o velikim i malim slovima. Tacni odgovori su: Djokovic -
		 * Srbija, Nadal - Spanija, Federer - Svajcarska.
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1. Djokovic");
			System.out.println("2. Nadal");
			System.out.println("3. Federer");
			System.out.println("4. Izlaz");

			int opcija = sc.nextInt();

			if (opcija == 4) {

				System.out.println("dovidjenja");
				break;

			}

			else {

				switch (opcija) {

				case 1:

					System.out.println("Iz koje zemlje dolazi Djokovic?");
					Scanner sc2 = new Scanner(System.in);
					String unosZemlja1 = sc2.nextLine();
					String zemlja1 = "Srbija";

					if (!zemlja1.equalsIgnoreCase(unosZemlja1)) {

						System.out.println("netacno!");
						break;

					} else {

						System.out.println("tacno!");
						break;

					}

				case 2:
					System.out.println("Iz koje zemlje dolazi Nadal?");
					String zemlja2 = "Spanija";
					Scanner sc3 = new Scanner(System.in);
					String unosZemlja2 = sc3.nextLine();

					if (!zemlja2.equalsIgnoreCase(unosZemlja2)) {

						System.out.println("netacno!");
						break;

					} else {

						System.out.println("tacno!");
						break;

					}

				case 3:
					System.out.println("Iz koje zemlje dolazi Federer?");
					String zemlja3 = "Svajcarska";
					Scanner sc4 = new Scanner(System.in);
					String unosZemlja3 = sc4.nextLine();

					if (!zemlja3.equalsIgnoreCase(unosZemlja3)) {

						System.out.println("netacno!");
						break;

					} else {

						System.out.println("tacno!");
						break;

					}

				case 4:

					System.out.println("dovidjenja");
					System.out.println();
					break;

				default:
					System.out.println("opcija ne postoji");
					break;

				}

			}

		}

	}

}
