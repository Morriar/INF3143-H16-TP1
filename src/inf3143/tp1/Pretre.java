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

// Métier capable de soigner d'autres personnages.
public class Pretre extends Metier {

	// Augmente la vie de la `cible` de `mana` points.
	// Diminue la mana du `pretre` de `mana` points.
	public void soigner(Personnage pretre, Personnage cible, Integer mana) {
		pretre.mana -= mana;
		cible.vie += mana;
	}
}