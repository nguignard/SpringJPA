package com.spring.app.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class EntityManagerFactorySingleton {
	/** Constructeur priv� */
	private EntityManagerFactorySingleton() {
	}

	/** Instance unique non pr�initialis�e */
	private static EntityManagerFactory INSTANCE = null;

	/** Point d'acc�s pour l'instance unique du singleton */
	public static EntityManagerFactory getInstance() {
	    if (INSTANCE == null) {
		INSTANCE = (EntityManagerFactory) Persistence.createEntityManagerFactory("jpaTraining");
		;
	    }
	    return INSTANCE;
	}

    }
