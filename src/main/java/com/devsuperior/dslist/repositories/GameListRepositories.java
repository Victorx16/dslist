// CAMADA DE ACESSO A DADOS, ONDE FAZ AS CONSULTAS E MANIPULAÇÕES.

package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepositories extends JpaRepository <GameList, Long> {

}
