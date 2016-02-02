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

// Métier capable de lancer des boules de feu sur d'autres personnages.
public class Mage extends Metier {

	// Diminue la vue de la `cible` de `mana` points.
	// Diminue la mana du `mage` de `mana` points.
	public void lancerSort(Personnage mage, Personnage cible, Integer mana) {
		mage.mana -= mana;
		cible.vie -= mana;
	}
}