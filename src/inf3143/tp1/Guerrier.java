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

// Métier spécialisé dans l'offensive armée.
public class Guerrier extends Metier {

	// Augmente la force du `guerrier` de `force` points.
	// Diminue la mana du `guerrier` de `force` points.
	public void berserk(Personnage guerrier, Integer force) {
		guerrier.mana -= force;
		guerrier.force += force;
	}
}