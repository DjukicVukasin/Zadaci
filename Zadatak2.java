package test;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna razliku izmedju visine najviseg i najnizeg
		 * igraca kosarkaskog tima kao i prosecnu visinu igraca. Korisnik na standardni
		 * ulaz unosi visinu svih pet igraca kosarkskog tima. Visina je izrazena u
		 * metrima. Po zavrsetku unosa ispisuje se prosecna visina clana ekipe, visina
		 * najviseg igraca, visina najnizeg igraca i razlika u visini ta dva igraca.
		 * Ukoliko korisnik unese nevalidnu vrednost kao visinu ispisati poruku o gresci
		 * i omoguciti mu da ponovi unos. Smatrati da ne postoji kosarkas visi od 2,5
		 * metara.
		 * 
		 * 
		 * 
		 */

		/*
		 * 
		 * else {
		 * 
		 * System.out.println("pogresan unos, visina mora biti ispod 2.5m"); break;
		 * 
		 * }
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		double visina;
		double zbirVisina = 0;
		double maxVisina = 0;
		double minVisina = 2.5;

		for (int brojac = 1; brojac <= 5; ++brojac) {

			System.out.println("unesi visinu igraca u metrima");
			visina = sc.nextDouble();

			if (visina <= 2.5) {

				zbirVisina = zbirVisina + visina;
				

				if (maxVisina < visina) {

					maxVisina = visina;

				}

				if (minVisina > visina) {

					minVisina = visina;

				}

			} else {

				System.out.println("pogresan unos, visina mora biti ispod 2.5m");
				continue;

			}

		}

		double r = maxVisina - minVisina;
		double p = zbirVisina/5;

		System.out.println("najvisi igrac ima " + maxVisina + "m");
		System.out.println("najnizi igrac ima " + minVisina + "m");
		System.out.println("razlika izmedju najviseg i najnizeg je " + r + "m");
		System.out.println("prosecna visina je " + p + "m");
	}

}
