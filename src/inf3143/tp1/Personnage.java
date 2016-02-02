/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inf3143.tp1;

// Un personnage représente une entité vivante du jeu qui peut attaquer les autres personnages.
public class Personnage {

	// Nom du personnage.
	public String nom;

	// Points de vie du personnage (pour mesurer la santé du personnage).
	public Integer vie;

	// Points de force du personnage (pour mesurer les dommages infligés par un
	// personnage).
	public Integer force;

	// Points de mana (utiles pour lancer des sorts).
	public Integer mana;

	// Métier occupé par le personnage (pour les capacités spéciales).
	public Metier metier;

	public Personnage(String nom, Integer vie, Integer force, Integer mana,
			Metier metier) {
		this.nom = nom;
		this.vie = vie;
		this.force = force;
		this.mana = mana;
		this.metier = metier;
	}

	// Arme équipée par le personnage (s'il en a une).
	public Arme arme = null;

	// Équipe à laquelle appartient ce joueur.
	public Equipe equipe = null;

	// Vérifie si ce personnage est mort (vie <= 0).
	public Boolean estMort() {
		return vie <= 0;
	}

	// Blesse ce personnage de `dommages` points de dommages.
	public void blesser(Integer dommages) {
		vie -= dommages;
	}

	// Attaque un autre personnage.
	public void attaquer(Personnage personnage) {
		Integer dommages = force + arme.getDommages();
		personnage.blesser(dommages);
	}

	// Prendre une arme en main.
	public void equiperArme(Arme arme) {
		this.arme = arme;
		arme.personnage = this;
	}
}