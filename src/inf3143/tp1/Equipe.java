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

import java.util.ArrayList;
import java.util.List;

// Une équipe est composée de plusieurs personnages.
public class Equipe {

	// Nom de ce métier.
	public String nom;

	// Personnage chef d'équipe.
	public Personnage chef;

	public Equipe(String nom, Personnage chef) {
		this.chef = chef;
		this.nom = nom;
		personnages.add(chef);
	}

	// Liste des personnages ayant rejoint cette équipe.
	public List<Personnage> personnages = new ArrayList<Personnage>();

	// Est-ce que tous les personnages dans cette équipe sont morts?
	public Boolean estMorte() {
		for (Personnage personnage : personnages) {
			if (!personnage.estMort()) {
				return false;
			}
		}
		return false;
	}
}